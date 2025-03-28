package com.hearlers.gateway.presentation.rest.v1.auth;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hearlers.api.proto.v1.model.AuthChannel;
import com.hearlers.api.proto.v1.model.AuthUser;
import com.hearlers.api.proto.v1.service.InitializeUserRequest;
import com.hearlers.api.proto.v1.service.InitializeUserResponse;
import com.hearlers.api.proto.v1.service.SaveRefreshTokenRequest;
import com.hearlers.api.proto.v1.service.SaveRefreshTokenResponse;
import com.hearlers.gateway.application.auth.AuthService;
import com.hearlers.gateway.application.utils.service.UtilService;
import com.hearlers.gateway.application.utils.useCases.CreateCookieUseCase.dto.CreateCookieRequestDto;
import com.hearlers.gateway.application.utils.useCases.CreateCookieUseCase.dto.CreateCookieResponseDto;
import com.hearlers.gateway.config.KakaoProperties;
import com.hearlers.gateway.presentation.rest.v1.auth.dto.CreateTokenRequestDto;
import com.hearlers.gateway.shared.guard.dto.TokenDto;
import com.hearlers.gateway.shared.guard.security.JwtUtil;
import com.hearlers.gateway.shared.presentation.ResponseDto;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirements;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("auth")
@RequiredArgsConstructor
@Tag(name = "AuthController", description = "로그인, 회원가입, 토큰 발급 등 인증 관련 API")
public class AuthController {
    private final KakaoProperties kakaoProperties;
    private final AuthService authService;
    private final JwtUtil jwtUtil;
    private final UtilService utilService;

    private static final int ACCESS_TOKEN_MAX_AGE = 60 * 60; // 1시간
    private static final int REFRESH_TOKEN_MAX_AGE = 60 * 60 * 24 * 7; // 7일


    @Operation(summary = "비로그인 유저 생성", description = "비로그인 유저를 생성하고, accessToken 발급")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "비로그인 유저 생성 성공, 쿠키에 accessToken과 accessTokenExpiresAt 저장"),
            @ApiResponse(responseCode = "400", description = "비로그인 유저 생성 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PostMapping("/v1/initiate")
    public ResponseEntity<ResponseDto.Success<TokenDto>> createUser(HttpServletResponse response) {
        InitializeUserResponse initializeUserResponse = authService.initializeUser(
                InitializeUserRequest.newBuilder().build());

        CreateTokenRequestDto dto = new CreateTokenRequestDto(initializeUserResponse.getUser().getId(),
                initializeUserResponse.getAuthUser().getAuthChannel());

        TokenDto token = jwtUtil.returnToken(dto, false);

        // 발급받은 accessToken 쿠키에 저장
        addCookieToResponse(response, token.getAccessToken(), "accessToken", ACCESS_TOKEN_MAX_AGE);

        String accessTokenExpiresAt = java.time.ZonedDateTime.now()
                .plusSeconds(ACCESS_TOKEN_MAX_AGE)
                .toInstant()
                .toString();

        addCookieToResponse(response, accessTokenExpiresAt, "accessTokenExpiresAt", ACCESS_TOKEN_MAX_AGE);

        ResponseDto.Success<TokenDto> responseDto = ResponseDto.Success.<TokenDto>builder()
                .message("비로그인 유저 생성 성공")
                .data(token)
                .build();
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(responseDto);
    }

    @SecurityRequirements
    @Operation(summary = "카카오 로그인", description = "카카오 로그인을 위한 인증 코드 요청, 카카오로 리다이렉트")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "302", description = "카카오로 리다이렉트"),
            @ApiResponse(responseCode = "400", description = "카카오 로그인 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/login/kakao")
    public void kakao(@RequestAttribute("userId") String userId, HttpServletResponse response) throws IOException {
        StringBuffer url = new StringBuffer();
        url.append("https://kauth.kakao.com/oauth/authorize?");
        url.append("client_id=").append(kakaoProperties.getClientId());
        url.append("&redirect_uri=").append(kakaoProperties.getRedirectUri());
        url.append("&response_type=code");
        url.append("&state=").append(userId);
        response.sendRedirect(url.toString());
    }

    @Operation(summary = "카카오 로그인", description = "카카오 로그인을 통해 받은 인증코드 바탕으로 액세스토큰과 리프레시토큰 발급 후 쿠키에 저장")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "302", description = "카카오 로그인 유저 생성 성공, 쿠키에 accessToken과 accessTokenExpiresAt, refreshToken과 refreshTokenExpiresAt 저장"),
            @ApiResponse(responseCode = "400", description = "카카오 로그인 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/callback/kakao")
    public void kakaoCallback(@RequestParam("code") String code, @RequestParam("state") String state,
                              HttpServletResponse response) throws IOException {

        AuthUser authUser = authService.kakaoLogin(code, state);
        AuthChannel authChannel = authUser.getAuthChannel();

        TokenDto token = jwtUtil.returnToken(new CreateTokenRequestDto(state, authChannel), true);
        SaveRefreshTokenRequest saveRefreshTokenRequest = SaveRefreshTokenRequest.newBuilder()
                .setUserId(authUser.getId())
                .setToken(token.getRefreshToken())
                .setExpiresAt(token.getRefreshTokenExpiresAt().toString())
                .build();

        SaveRefreshTokenResponse saveRefreshTokenResponse = authService.saveRefreshToken(saveRefreshTokenRequest);

        // gRPC 호출 자체는 성공했지만 false 반환 -> 비즈니스 로직 실패
        if (!saveRefreshTokenResponse.getSuccess()) {
            throw new RuntimeException("RefreshToken 저장 실패");
        }

        // 발급받은 accessToken 쿠키에 저장
        addCookieToResponse(response, token.getAccessToken(), "accessToken", ACCESS_TOKEN_MAX_AGE);

        String accessTokenExpiresAt = java.time.ZonedDateTime.now()
                .plusSeconds(ACCESS_TOKEN_MAX_AGE)
                .toInstant()
                .toString();

        addCookieToResponse(response, accessTokenExpiresAt, "accessTokenExpiresAt", ACCESS_TOKEN_MAX_AGE);

        // 발급받은 refreshToken 쿠키에 저장
        addCookieToResponse(response, token.getRefreshToken(), "refreshToken", REFRESH_TOKEN_MAX_AGE);

        String refreshTokenExpiresAt = java.time.ZonedDateTime.now()
                .plusSeconds(REFRESH_TOKEN_MAX_AGE)
                .toInstant()
                .toString();
        addCookieToResponse(response, refreshTokenExpiresAt, "refreshTokenExpiresAt", REFRESH_TOKEN_MAX_AGE);

        response.sendRedirect("/");
    }


    @Operation(summary = "액세스 토큰 재발급", description = "리프레시 토큰으로 액세스 토큰 재발급")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "액세스 토큰 재발급 성공, 쿠키에 accessToken과 accessTokenExpiresAt 저장"),
            @ApiResponse(responseCode = "400", description = "카카오 로그인 실패", content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PostMapping("/v1/refresh")
    public void refreshToken(HttpServletRequest request) {
        // TODO : refreshToken을 바탕으로 새로운 accessToken 발급
    }

    private void addCookieToResponse(HttpServletResponse response, String token, String name, int maxAge) {
        CreateCookieRequestDto createCookieRequestDto = CreateCookieRequestDto.builder()
                .token(token)
                .name(name)
                .maxAge(maxAge)
                .httpOnly(true)
                .path("/")
                .build();

        CreateCookieResponseDto createCookieResponseDto = utilService.createCookie(createCookieRequestDto);
        response.addCookie(createCookieResponseDto.getCookie());
    }

}
