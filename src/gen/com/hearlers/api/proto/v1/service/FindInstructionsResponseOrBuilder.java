// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel_prompt.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

public interface FindInstructionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.FindInstructionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.hearlers.v1.model.Instruction instructions = 1 [json_name = "instructions"];</code>
   */
  java.util.List<com.hearlers.api.proto.v1.model.Instruction> 
      getInstructionsList();
  /**
   * <code>repeated .com.hearlers.v1.model.Instruction instructions = 1 [json_name = "instructions"];</code>
   */
  com.hearlers.api.proto.v1.model.Instruction getInstructions(int index);
  /**
   * <code>repeated .com.hearlers.v1.model.Instruction instructions = 1 [json_name = "instructions"];</code>
   */
  int getInstructionsCount();
  /**
   * <code>repeated .com.hearlers.v1.model.Instruction instructions = 1 [json_name = "instructions"];</code>
   */
  java.util.List<? extends com.hearlers.api.proto.v1.model.InstructionOrBuilder> 
      getInstructionsOrBuilderList();
  /**
   * <code>repeated .com.hearlers.v1.model.Instruction instructions = 1 [json_name = "instructions"];</code>
   */
  com.hearlers.api.proto.v1.model.InstructionOrBuilder getInstructionsOrBuilder(
      int index);
}
