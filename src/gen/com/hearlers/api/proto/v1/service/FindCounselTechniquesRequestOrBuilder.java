// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel_prompt.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

public interface FindCounselTechniquesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.FindCounselTechniquesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string name = 1 [json_name = "name"];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <code>optional string name = 1 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 1 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string tone_id = 2 [json_name = "toneId"];</code>
   * @return Whether the toneId field is set.
   */
  boolean hasToneId();
  /**
   * <code>optional string tone_id = 2 [json_name = "toneId"];</code>
   * @return The toneId.
   */
  java.lang.String getToneId();
  /**
   * <code>optional string tone_id = 2 [json_name = "toneId"];</code>
   * @return The bytes for toneId.
   */
  com.google.protobuf.ByteString
      getToneIdBytes();
}
