// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/model/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.model;

public interface InstructionItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.model.InstructionItem)
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
   * <code>string body = 2 [json_name = "body"];</code>
   * @return The body.
   */
  java.lang.String getBody();
  /**
   * <code>string body = 2 [json_name = "body"];</code>
   * @return The bytes for body.
   */
  com.google.protobuf.ByteString
      getBodyBytes();

  /**
   * <pre>
   * YYYY-MM-DD HH:mm:ss (2024-12-29 12:34:56)
   * </pre>
   *
   * <code>string created_at = 3 [json_name = "createdAt"];</code>
   * @return The createdAt.
   */
  java.lang.String getCreatedAt();
  /**
   * <pre>
   * YYYY-MM-DD HH:mm:ss (2024-12-29 12:34:56)
   * </pre>
   *
   * <code>string created_at = 3 [json_name = "createdAt"];</code>
   * @return The bytes for createdAt.
   */
  com.google.protobuf.ByteString
      getCreatedAtBytes();

  /**
   * <pre>
   * YYYY-MM-DD HH:mm:ss (2024-12-29 12:34:56)
   * </pre>
   *
   * <code>string updated_at = 4 [json_name = "updatedAt"];</code>
   * @return The updatedAt.
   */
  java.lang.String getUpdatedAt();
  /**
   * <pre>
   * YYYY-MM-DD HH:mm:ss (2024-12-29 12:34:56)
   * </pre>
   *
   * <code>string updated_at = 4 [json_name = "updatedAt"];</code>
   * @return The bytes for updatedAt.
   */
  com.google.protobuf.ByteString
      getUpdatedAtBytes();

  /**
   * <pre>
   * YYYY-MM-DD HH:mm:ss (2024-12-29 12:34:56)
   * </pre>
   *
   * <code>string deleted_at = 5 [json_name = "deletedAt"];</code>
   * @return The deletedAt.
   */
  java.lang.String getDeletedAt();
  /**
   * <pre>
   * YYYY-MM-DD HH:mm:ss (2024-12-29 12:34:56)
   * </pre>
   *
   * <code>string deleted_at = 5 [json_name = "deletedAt"];</code>
   * @return The bytes for deletedAt.
   */
  com.google.protobuf.ByteString
      getDeletedAtBytes();
}
