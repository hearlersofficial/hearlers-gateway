// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel_prompt.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

public interface UpdateTonePromptResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.UpdateTonePromptResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .com.hearlers.v1.model.TonePrompt tone_prompt = 1 [json_name = "tonePrompt"];</code>
   * @return Whether the tonePrompt field is set.
   */
  boolean hasTonePrompt();
  /**
   * <code>optional .com.hearlers.v1.model.TonePrompt tone_prompt = 1 [json_name = "tonePrompt"];</code>
   * @return The tonePrompt.
   */
  com.hearlers.api.proto.v1.model.TonePrompt getTonePrompt();
  /**
   * <code>optional .com.hearlers.v1.model.TonePrompt tone_prompt = 1 [json_name = "tonePrompt"];</code>
   */
  com.hearlers.api.proto.v1.model.TonePromptOrBuilder getTonePromptOrBuilder();
}
