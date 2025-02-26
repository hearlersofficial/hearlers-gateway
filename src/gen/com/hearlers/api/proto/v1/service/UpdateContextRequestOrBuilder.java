// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

public interface UpdateContextRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.UpdateContextRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string context_id = 1 [json_name = "contextId"];</code>
   * @return The contextId.
   */
  java.lang.String getContextId();
  /**
   * <code>string context_id = 1 [json_name = "contextId"];</code>
   * @return The bytes for contextId.
   */
  com.google.protobuf.ByteString
      getContextIdBytes();

  /**
   * <code>optional string name = 2 [json_name = "name"];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <code>optional string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string body = 3 [json_name = "body"];</code>
   * @return Whether the body field is set.
   */
  boolean hasBody();
  /**
   * <code>optional string body = 3 [json_name = "body"];</code>
   * @return The body.
   */
  java.lang.String getBody();
  /**
   * <code>optional string body = 3 [json_name = "body"];</code>
   * @return The bytes for body.
   */
  com.google.protobuf.ByteString
      getBodyBytes();

  /**
   * <code>repeated string placeholders = 4 [json_name = "placeholders"];</code>
   * @return A list containing the placeholders.
   */
  java.util.List<java.lang.String>
      getPlaceholdersList();
  /**
   * <code>repeated string placeholders = 4 [json_name = "placeholders"];</code>
   * @return The count of placeholders.
   */
  int getPlaceholdersCount();
  /**
   * <code>repeated string placeholders = 4 [json_name = "placeholders"];</code>
   * @param index The index of the element to return.
   * @return The placeholders at the given index.
   */
  java.lang.String getPlaceholders(int index);
  /**
   * <code>repeated string placeholders = 4 [json_name = "placeholders"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the placeholders at the given index.
   */
  com.google.protobuf.ByteString
      getPlaceholdersBytes(int index);
}
