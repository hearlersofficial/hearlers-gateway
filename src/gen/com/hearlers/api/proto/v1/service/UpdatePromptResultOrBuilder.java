// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

public interface UpdatePromptResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.UpdatePromptResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.hearlers.v1.model.CounselPrompt prompt = 1 [json_name = "prompt"];</code>
   * @return Whether the prompt field is set.
   */
  boolean hasPrompt();
  /**
   * <code>.com.hearlers.v1.model.CounselPrompt prompt = 1 [json_name = "prompt"];</code>
   * @return The prompt.
   */
  com.hearlers.api.proto.v1.model.CounselPrompt getPrompt();
  /**
   * <code>.com.hearlers.v1.model.CounselPrompt prompt = 1 [json_name = "prompt"];</code>
   */
  com.hearlers.api.proto.v1.model.CounselPromptOrBuilder getPromptOrBuilder();
}
