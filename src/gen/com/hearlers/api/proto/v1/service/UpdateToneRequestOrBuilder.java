// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counselor.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

public interface UpdateToneRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.UpdateToneRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string tone_id = 1 [json_name = "toneId"];</code>
   * @return The toneId.
   */
  java.lang.String getToneId();
  /**
   * <code>string tone_id = 1 [json_name = "toneId"];</code>
   * @return The bytes for toneId.
   */
  com.google.protobuf.ByteString
      getToneIdBytes();

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
   * <code>optional string description = 3 [json_name = "description"];</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <code>optional string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>optional string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}
