// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

public interface FindInstructionItemByIdResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.FindInstructionItemByIdResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .com.hearlers.v1.model.InstructionItem instruction_item = 1 [json_name = "instructionItem"];</code>
   * @return Whether the instructionItem field is set.
   */
  boolean hasInstructionItem();
  /**
   * <code>optional .com.hearlers.v1.model.InstructionItem instruction_item = 1 [json_name = "instructionItem"];</code>
   * @return The instructionItem.
   */
  com.hearlers.api.proto.v1.model.InstructionItem getInstructionItem();
  /**
   * <code>optional .com.hearlers.v1.model.InstructionItem instruction_item = 1 [json_name = "instructionItem"];</code>
   */
  com.hearlers.api.proto.v1.model.InstructionItemOrBuilder getInstructionItemOrBuilder();
}
