// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/model/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.model;

public interface CounselOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.model.Counsel)
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
   * <code>string counselor_id = 2 [json_name = "counselorId"];</code>
   * @return The counselorId.
   */
  java.lang.String getCounselorId();
  /**
   * <code>string counselor_id = 2 [json_name = "counselorId"];</code>
   * @return The bytes for counselorId.
   */
  com.google.protobuf.ByteString
      getCounselorIdBytes();

  /**
   * <code>string user_id = 3 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 3 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>optional string last_message = 4 [json_name = "lastMessage"];</code>
   * @return Whether the lastMessage field is set.
   */
  boolean hasLastMessage();
  /**
   * <code>optional string last_message = 4 [json_name = "lastMessage"];</code>
   * @return The lastMessage.
   */
  java.lang.String getLastMessage();
  /**
   * <code>optional string last_message = 4 [json_name = "lastMessage"];</code>
   * @return The bytes for lastMessage.
   */
  com.google.protobuf.ByteString
      getLastMessageBytes();

  /**
   * <code>optional string last_chated_at = 5 [json_name = "lastChatedAt"];</code>
   * @return Whether the lastChatedAt field is set.
   */
  boolean hasLastChatedAt();
  /**
   * <code>optional string last_chated_at = 5 [json_name = "lastChatedAt"];</code>
   * @return The lastChatedAt.
   */
  java.lang.String getLastChatedAt();
  /**
   * <code>optional string last_chated_at = 5 [json_name = "lastChatedAt"];</code>
   * @return The bytes for lastChatedAt.
   */
  com.google.protobuf.ByteString
      getLastChatedAtBytes();

  /**
   * <code>string prompt_version_id = 6 [json_name = "promptVersionId"];</code>
   * @return The promptVersionId.
   */
  java.lang.String getPromptVersionId();
  /**
   * <code>string prompt_version_id = 6 [json_name = "promptVersionId"];</code>
   * @return The bytes for promptVersionId.
   */
  com.google.protobuf.ByteString
      getPromptVersionIdBytes();

  /**
   * <code>string counsel_technique_id = 7 [json_name = "counselTechniqueId"];</code>
   * @return The counselTechniqueId.
   */
  java.lang.String getCounselTechniqueId();
  /**
   * <code>string counsel_technique_id = 7 [json_name = "counselTechniqueId"];</code>
   * @return The bytes for counselTechniqueId.
   */
  com.google.protobuf.ByteString
      getCounselTechniqueIdBytes();

  /**
   * <code>string counselor_user_relationship_id = 8 [json_name = "counselorUserRelationshipId"];</code>
   * @return The counselorUserRelationshipId.
   */
  java.lang.String getCounselorUserRelationshipId();
  /**
   * <code>string counselor_user_relationship_id = 8 [json_name = "counselorUserRelationshipId"];</code>
   * @return The bytes for counselorUserRelationshipId.
   */
  com.google.protobuf.ByteString
      getCounselorUserRelationshipIdBytes();

  /**
   * <pre>
   * ISO 8601 (2024-12-29T12:34:56.000Z)
   * </pre>
   *
   * <code>string created_at = 9 [json_name = "createdAt"];</code>
   * @return The createdAt.
   */
  java.lang.String getCreatedAt();
  /**
   * <pre>
   * ISO 8601 (2024-12-29T12:34:56.000Z)
   * </pre>
   *
   * <code>string created_at = 9 [json_name = "createdAt"];</code>
   * @return The bytes for createdAt.
   */
  com.google.protobuf.ByteString
      getCreatedAtBytes();

  /**
   * <pre>
   * ISO 8601 (2024-12-29T12:34:56.000Z)
   * </pre>
   *
   * <code>string updated_at = 10 [json_name = "updatedAt"];</code>
   * @return The updatedAt.
   */
  java.lang.String getUpdatedAt();
  /**
   * <pre>
   * ISO 8601 (2024-12-29T12:34:56.000Z)
   * </pre>
   *
   * <code>string updated_at = 10 [json_name = "updatedAt"];</code>
   * @return The bytes for updatedAt.
   */
  com.google.protobuf.ByteString
      getUpdatedAtBytes();

  /**
   * <pre>
   * ISO 8601 (2024-12-29T12:34:56.000Z)
   * </pre>
   *
   * <code>optional string deleted_at = 11 [json_name = "deletedAt"];</code>
   * @return Whether the deletedAt field is set.
   */
  boolean hasDeletedAt();
  /**
   * <pre>
   * ISO 8601 (2024-12-29T12:34:56.000Z)
   * </pre>
   *
   * <code>optional string deleted_at = 11 [json_name = "deletedAt"];</code>
   * @return The deletedAt.
   */
  java.lang.String getDeletedAt();
  /**
   * <pre>
   * ISO 8601 (2024-12-29T12:34:56.000Z)
   * </pre>
   *
   * <code>optional string deleted_at = 11 [json_name = "deletedAt"];</code>
   * @return The bytes for deletedAt.
   */
  com.google.protobuf.ByteString
      getDeletedAtBytes();
}
