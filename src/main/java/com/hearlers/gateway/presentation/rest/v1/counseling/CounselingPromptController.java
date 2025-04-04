package com.hearlers.gateway.presentation.rest.v1.counseling;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hearlers.gateway.application.counseling.CounselingService;
import com.hearlers.gateway.shared.presentation.ResponseDto;
import com.hearlers.gateway.shared.presentation.ResponseDtoUtil;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping()
@RequiredArgsConstructor
@Tag(name = "상담 프롬프트", description = "상담 프롬프트 관련 API")
public class CounselingPromptController {
    private final CounselingService counselingService;
    private final CounselingPromptDtoMapper counselingPromptDtoMapper;

    @Operation(summary = "Tone 목록 조회", description = "Tone 목록을 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Tone 목록 조회 성공"),
            @ApiResponse(responseCode = "400", description = "Tone 목록 조회 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/admin/tones")
    public ResponseEntity<ResponseDto.Success<CounselingPromptDto.GetTonesResponseDto>> getTones(
            @Valid CounselingPromptDto.GetTonesRequestDto request) {
        var findTonesRequest = counselingPromptDtoMapper.ofTones(request);
        var tones = counselingService.findTones(findTonesRequest);
        var response = counselingPromptDtoMapper.ofTones(tones);
        
        return ResponseDtoUtil.okResponse(response, "Tone 목록 조회 성공");
    }

    @Operation(summary = "Tone 조회", description = "ID로 Tone을 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Tone 조회 성공"),
            @ApiResponse(responseCode = "400", description = "Tone 조회 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "404", description = "Tone을 찾을 수 없음", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/admin/tones/{toneId}")
    public ResponseEntity<ResponseDto.Success<CounselingPromptDto.GetToneByIdResponseDto>> getTone(
            @PathVariable String toneId) {
        var findToneByIdRequest = counselingPromptDtoMapper.ofTone(toneId);
        var tone = counselingService.findToneById(findToneByIdRequest);
        var response = counselingPromptDtoMapper.ofToneSingle(tone);
        
        return ResponseDtoUtil.okResponse(response, "Tone 조회 성공");
    }

    @Operation(summary = "Tone 생성", description = "새로운 Tone을 생성합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Tone 생성 성공"),
            @ApiResponse(responseCode = "400", description = "Tone 생성 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PostMapping("/v1/admin/tones")
    public ResponseEntity<ResponseDto.Success<CounselingPromptDto.CreateToneResponseDto>> createTone(
            @Valid @RequestBody CounselingPromptDto.CreateToneRequestDto request) {
        var createToneRequest = counselingPromptDtoMapper.of(request);
        var createdTone = counselingService.createTone(createToneRequest);
        var response = counselingPromptDtoMapper.ofCreate(createdTone);
        
        return ResponseDtoUtil.createdResponse(response, "Tone 생성 성공");
    }

    @Operation(summary = "Tone 업데이트", description = "기존 Tone을 업데이트합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Tone 업데이트 성공"),
            @ApiResponse(responseCode = "400", description = "Tone 업데이트 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "404", description = "Tone을 찾을 수 없음", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PutMapping("/v1/admin/tones/{toneId}")
    public ResponseEntity<ResponseDto.Success<CounselingPromptDto.UpdateToneResponseDto>> updateTone(
            @PathVariable String toneId,
            @Valid @RequestBody CounselingPromptDto.UpdateToneRequestDto request) {
        
        var updateToneRequest = counselingPromptDtoMapper.of(request, toneId);
        var updatedTone = counselingService.updateTone(updateToneRequest);
        var response = counselingPromptDtoMapper.ofToneUpdate(updatedTone);
        
        return ResponseDtoUtil.okResponse(response, "Tone 업데이트 성공");
    }


    @Operation(summary = "CounselTechnique 목록 조회", description = "CounselTechnique 목록을 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "CounselTechnique 목록 조회 성공"),
            @ApiResponse(responseCode = "400", description = "CounselTechnique 목록 조회 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/admin/counsel-techniques")
    public ResponseEntity<ResponseDto.Success<CounselingPromptDto.GetCounselTechniquesResponseDto>> getCounselTechniques(
            @Valid CounselingPromptDto.GetCounselTechniquesRequestDto request) {
        var findCounselTechniquesRequest = counselingPromptDtoMapper.ofCounselTechniques(request);
        var counselTechniques = counselingService.findCounselTechniques(findCounselTechniquesRequest);
        var response = counselingPromptDtoMapper.ofCounselTechniques(counselTechniques);
        
        return ResponseDtoUtil.okResponse(response, "CounselTechnique 목록 조회 성공");
    }

    @Operation(summary = "CounselTechnique 조회", description = "ID로 CounselTechnique를 조회합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "CounselTechnique 조회 성공"),
            @ApiResponse(responseCode = "400", description = "CounselTechnique 조회 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "404", description = "CounselTechnique를 찾을 수 없음", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @GetMapping("/v1/admin/counsel-techniques/{counselTechniqueId}")
    public ResponseEntity<ResponseDto.Success<CounselingPromptDto.GetCounselTechniqueByIdResponseDto>> getCounselTechnique(
            @PathVariable String counselTechniqueId) {
        var findCounselTechniqueByIdRequest = counselingPromptDtoMapper.ofCounselTechniqueId(counselTechniqueId);
        var counselTechnique = counselingService.findCounselTechniqueById(findCounselTechniqueByIdRequest);
        var response = counselingPromptDtoMapper.ofCounselTechniqueById(counselTechnique);
        
        return ResponseDtoUtil.okResponse(response, "CounselTechnique 조회 성공");
    }

    @Operation(summary = "CounselTechnique 생성", description = "새로운 CounselTechnique를 생성합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "CounselTechnique 생성 성공"),
            @ApiResponse(responseCode = "400", description = "CounselTechnique 생성 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PostMapping("/v1/admin/counsel-techniques")
    public ResponseEntity<ResponseDto.Success<CounselingPromptDto.CreateCounselTechniqueResponseDto>> createCounselTechnique(
            @Valid @RequestBody CounselingPromptDto.CreateCounselTechniqueRequestDto request) {
        var createCounselTechniqueRequest = counselingPromptDtoMapper.ofCounselTechnique(request);
        var createdCounselTechnique = counselingService.createCounselTechnique(createCounselTechniqueRequest);
        var response = counselingPromptDtoMapper.ofCounselTechniqueCreate(createdCounselTechnique);
        
        return ResponseDtoUtil.createdResponse(response, "CounselTechnique 생성 성공");
    }

    @Operation(summary = "CounselTechnique 업데이트", description = "기존 CounselTechnique를 업데이트합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "CounselTechnique 업데이트 성공"),
            @ApiResponse(responseCode = "400", description = "CounselTechnique 업데이트 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class))),
            @ApiResponse(responseCode = "404", description = "CounselTechnique를 찾을 수 없음", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    
    @PutMapping("/v1/admin/counsel-techniques/{counselTechniqueId}")
    public ResponseEntity<ResponseDto.Success<CounselingPromptDto.UpdateCounselTechniqueResponseDto>> updateCounselTechnique(
            @PathVariable String counselTechniqueId,
            @Valid @RequestBody CounselingPromptDto.UpdateCounselTechniqueRequestDto request) {
        
        var updateCounselTechniqueRequest = counselingPromptDtoMapper.ofCounselTechniqueUpdate(request, counselTechniqueId);
        var updatedCounselTechnique = counselingService.updateCounselTechnique(updateCounselTechniqueRequest);
        var response = counselingPromptDtoMapper.ofCounselTechniqueUpdate(updatedCounselTechnique);
        
        return ResponseDtoUtil.okResponse(response, "CounselTechnique 업데이트 성공");
    }
    
    @Operation(summary = "CounselTechnique 시퀀스 저장", description = "CounselTechnique 시퀀스를 저장합니다.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "CounselTechnique 시퀀스 저장 성공"),
            @ApiResponse(responseCode = "400", description = "CounselTechnique 시퀀스 저장 실패", 
                    content = @Content(schema = @Schema(implementation = ResponseDto.Error.class)))
    })
    @PostMapping("/v1/admin/counsel-techniques/sequence")
    public ResponseEntity<ResponseDto.Success<CounselingPromptDto.SaveCounselTechniqueSequenceResponseDto>> saveCounselTechniqueSequence(
            @Valid @RequestBody CounselingPromptDto.SaveCounselTechniqueSequenceRequestDto request) {
        
        var saveCounselTechniqueSequenceRequest = counselingPromptDtoMapper.ofCounselTechniqueSequence(request);
        var updatedCounselTechniques = counselingService.saveCounselTechniqueSequence(saveCounselTechniqueSequenceRequest);
        var response = counselingPromptDtoMapper.ofCounselTechniqueSequence(updatedCounselTechniques);
        
        return ResponseDtoUtil.okResponse(response, "CounselTechnique 시퀀스 저장 성공");
    }
}
