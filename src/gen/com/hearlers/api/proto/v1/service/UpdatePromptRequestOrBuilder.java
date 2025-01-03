// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

public interface UpdatePromptRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.UpdatePromptRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 prompt_id = 1 [json_name = "promptId"];</code>
   * @return The promptId.
   */
  int getPromptId();

  /**
   * <code>string persona = 2 [json_name = "persona"];</code>
   * @return The persona.
   */
  java.lang.String getPersona();
  /**
   * <code>string persona = 2 [json_name = "persona"];</code>
   * @return The bytes for persona.
   */
  com.google.protobuf.ByteString
      getPersonaBytes();

  /**
   * <code>string context = 3 [json_name = "context"];</code>
   * @return The context.
   */
  java.lang.String getContext();
  /**
   * <code>string context = 3 [json_name = "context"];</code>
   * @return The bytes for context.
   */
  com.google.protobuf.ByteString
      getContextBytes();

  /**
   * <code>string instruction = 4 [json_name = "instruction"];</code>
   * @return The instruction.
   */
  java.lang.String getInstruction();
  /**
   * <code>string instruction = 4 [json_name = "instruction"];</code>
   * @return The bytes for instruction.
   */
  com.google.protobuf.ByteString
      getInstructionBytes();

  /**
   * <code>string tone = 5 [json_name = "tone"];</code>
   * @return The tone.
   */
  java.lang.String getTone();
  /**
   * <code>string tone = 5 [json_name = "tone"];</code>
   * @return The bytes for tone.
   */
  com.google.protobuf.ByteString
      getToneBytes();

  /**
   * <code>string additional_prompt = 6 [json_name = "additionalPrompt"];</code>
   * @return The additionalPrompt.
   */
  java.lang.String getAdditionalPrompt();
  /**
   * <code>string additional_prompt = 6 [json_name = "additionalPrompt"];</code>
   * @return The bytes for additionalPrompt.
   */
  com.google.protobuf.ByteString
      getAdditionalPromptBytes();

  /**
   * <code>string description = 7 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 7 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string version = 8 [json_name = "version"];</code>
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   * <code>string version = 8 [json_name = "version"];</code>
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString
      getVersionBytes();
}
