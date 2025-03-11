// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/model/auth_user.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.model;

public interface AuthUserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.model.AuthUser)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <code>string user_id = 2 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 2 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>.com.hearlers.v1.model.AuthChannel auth_channel = 3 [json_name = "authChannel"];</code>
   * @return The enum numeric value on the wire for authChannel.
   */
  int getAuthChannelValue();
  /**
   * <code>.com.hearlers.v1.model.AuthChannel auth_channel = 3 [json_name = "authChannel"];</code>
   * @return The authChannel.
   */
  com.hearlers.api.proto.v1.model.AuthChannel getAuthChannel();

  /**
   * <code>.com.hearlers.v1.model.OAuthChannelInfo oauth_channel_info = 4 [json_name = "oauthChannelInfo"];</code>
   * @return Whether the oauthChannelInfo field is set.
   */
  boolean hasOauthChannelInfo();
  /**
   * <code>.com.hearlers.v1.model.OAuthChannelInfo oauth_channel_info = 4 [json_name = "oauthChannelInfo"];</code>
   * @return The oauthChannelInfo.
   */
  com.hearlers.api.proto.v1.model.OAuthChannelInfo getOauthChannelInfo();
  /**
   * <code>.com.hearlers.v1.model.OAuthChannelInfo oauth_channel_info = 4 [json_name = "oauthChannelInfo"];</code>
   */
  com.hearlers.api.proto.v1.model.OAuthChannelInfoOrBuilder getOauthChannelInfoOrBuilder();

  /**
   * <code>repeated .com.hearlers.v1.model.RefreshToken refresh_tokens = 5 [json_name = "refreshTokens"];</code>
   */
  java.util.List<com.hearlers.api.proto.v1.model.RefreshToken> 
      getRefreshTokensList();
  /**
   * <code>repeated .com.hearlers.v1.model.RefreshToken refresh_tokens = 5 [json_name = "refreshTokens"];</code>
   */
  com.hearlers.api.proto.v1.model.RefreshToken getRefreshTokens(int index);
  /**
   * <code>repeated .com.hearlers.v1.model.RefreshToken refresh_tokens = 5 [json_name = "refreshTokens"];</code>
   */
  int getRefreshTokensCount();
  /**
   * <code>repeated .com.hearlers.v1.model.RefreshToken refresh_tokens = 5 [json_name = "refreshTokens"];</code>
   */
  java.util.List<? extends com.hearlers.api.proto.v1.model.RefreshTokenOrBuilder> 
      getRefreshTokensOrBuilderList();
  /**
   * <code>repeated .com.hearlers.v1.model.RefreshToken refresh_tokens = 5 [json_name = "refreshTokens"];</code>
   */
  com.hearlers.api.proto.v1.model.RefreshTokenOrBuilder getRefreshTokensOrBuilder(
      int index);

  /**
   * <code>.com.hearlers.v1.model.Authority authority = 6 [json_name = "authority"];</code>
   * @return The enum numeric value on the wire for authority.
   */
  int getAuthorityValue();
  /**
   * <code>.com.hearlers.v1.model.Authority authority = 6 [json_name = "authority"];</code>
   * @return The authority.
   */
  com.hearlers.api.proto.v1.model.Authority getAuthority();

  /**
   * <pre>
   * ISO 8601 (2024-12-29T12:34:56.000Z)
   * </pre>
   *
   * <code>string last_login_at = 7 [json_name = "lastLoginAt"];</code>
   * @return The lastLoginAt.
   */
  java.lang.String getLastLoginAt();
  /**
   * <pre>
   * ISO 8601 (2024-12-29T12:34:56.000Z)
   * </pre>
   *
   * <code>string last_login_at = 7 [json_name = "lastLoginAt"];</code>
   * @return The bytes for lastLoginAt.
   */
  com.google.protobuf.ByteString
      getLastLoginAtBytes();

  /**
   * <pre>
   * ISO 8601 (2024-12-29T12:34:56.000Z)
   * </pre>
   *
   * <code>string created_at = 8 [json_name = "createdAt"];</code>
   * @return The createdAt.
   */
  java.lang.String getCreatedAt();
  /**
   * <pre>
   * ISO 8601 (2024-12-29T12:34:56.000Z)
   * </pre>
   *
   * <code>string created_at = 8 [json_name = "createdAt"];</code>
   * @return The bytes for createdAt.
   */
  com.google.protobuf.ByteString
      getCreatedAtBytes();

  /**
   * <pre>
   * ISO 8601 (2024-12-29T12:34:56.000Z)
   * </pre>
   *
   * <code>string updated_at = 9 [json_name = "updatedAt"];</code>
   * @return The updatedAt.
   */
  java.lang.String getUpdatedAt();
  /**
   * <pre>
   * ISO 8601 (2024-12-29T12:34:56.000Z)
   * </pre>
   *
   * <code>string updated_at = 9 [json_name = "updatedAt"];</code>
   * @return The bytes for updatedAt.
   */
  com.google.protobuf.ByteString
      getUpdatedAtBytes();

  /**
   * <pre>
   * ISO 8601 (2024-12-29T12:34:56.000Z)
   * </pre>
   *
   * <code>optional string deleted_at = 10 [json_name = "deletedAt"];</code>
   * @return Whether the deletedAt field is set.
   */
  boolean hasDeletedAt();
  /**
   * <pre>
   * ISO 8601 (2024-12-29T12:34:56.000Z)
   * </pre>
   *
   * <code>optional string deleted_at = 10 [json_name = "deletedAt"];</code>
   * @return The deletedAt.
   */
  java.lang.String getDeletedAt();
  /**
   * <pre>
   * ISO 8601 (2024-12-29T12:34:56.000Z)
   * </pre>
   *
   * <code>optional string deleted_at = 10 [json_name = "deletedAt"];</code>
   * @return The bytes for deletedAt.
   */
  com.google.protobuf.ByteString
      getDeletedAtBytes();
}
