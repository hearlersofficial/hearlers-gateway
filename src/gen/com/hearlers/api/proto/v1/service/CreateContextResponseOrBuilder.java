// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel_prompt.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

public interface CreateContextResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.CreateContextResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.hearlers.v1.model.Context context = 1 [json_name = "context"];</code>
   * @return Whether the context field is set.
   */
  boolean hasContext();
  /**
   * <code>.com.hearlers.v1.model.Context context = 1 [json_name = "context"];</code>
   * @return The context.
   */
  com.hearlers.api.proto.v1.model.Context getContext();
  /**
   * <code>.com.hearlers.v1.model.Context context = 1 [json_name = "context"];</code>
   */
  com.hearlers.api.proto.v1.model.ContextOrBuilder getContextOrBuilder();
}
