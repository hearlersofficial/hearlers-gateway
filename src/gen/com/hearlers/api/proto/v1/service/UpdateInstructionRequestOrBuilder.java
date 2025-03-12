// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

public interface UpdateInstructionRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.UpdateInstructionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string instruction_id = 1 [json_name = "instructionId"];</code>
   * @return The instructionId.
   */
  java.lang.String getInstructionId();
  /**
   * <code>string instruction_id = 1 [json_name = "instructionId"];</code>
   * @return The bytes for instructionId.
   */
  com.google.protobuf.ByteString
      getInstructionIdBytes();

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
   * <code>optional string initial_sentence = 3 [json_name = "initialSentence"];</code>
   * @return Whether the initialSentence field is set.
   */
  boolean hasInitialSentence();
  /**
   * <code>optional string initial_sentence = 3 [json_name = "initialSentence"];</code>
   * @return The initialSentence.
   */
  java.lang.String getInitialSentence();
  /**
   * <code>optional string initial_sentence = 3 [json_name = "initialSentence"];</code>
   * @return The bytes for initialSentence.
   */
  com.google.protobuf.ByteString
      getInitialSentenceBytes();

  /**
   * <code>bool has_initial_sentence = 4 [json_name = "hasInitialSentence"];</code>
   * @return The hasInitialSentence.
   */
  boolean getHasInitialSentence();

  /**
   * <code>repeated string instruction_item_ids = 5 [json_name = "instructionItemIds"];</code>
   * @return A list containing the instructionItemIds.
   */
  java.util.List<java.lang.String>
      getInstructionItemIdsList();
  /**
   * <code>repeated string instruction_item_ids = 5 [json_name = "instructionItemIds"];</code>
   * @return The count of instructionItemIds.
   */
  int getInstructionItemIdsCount();
  /**
   * <code>repeated string instruction_item_ids = 5 [json_name = "instructionItemIds"];</code>
   * @param index The index of the element to return.
   * @return The instructionItemIds at the given index.
   */
  java.lang.String getInstructionItemIds(int index);
  /**
   * <code>repeated string instruction_item_ids = 5 [json_name = "instructionItemIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the instructionItemIds at the given index.
   */
  com.google.protobuf.ByteString
      getInstructionItemIdsBytes(int index);

  /**
   * <code>bool has_instruction_item_ids = 6 [json_name = "hasInstructionItemIds"];</code>
   * @return The hasInstructionItemIds.
   */
  boolean getHasInstructionItemIds();
}
