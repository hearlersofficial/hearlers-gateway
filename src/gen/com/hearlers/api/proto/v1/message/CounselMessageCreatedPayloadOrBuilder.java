// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: v1/message/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.message;

public interface CounselMessageCreatedPayloadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.message.CounselMessageCreatedPayload)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 counsel_id = 1 [json_name = "counselId"];</code>
   * @return The counselId.
   */
  int getCounselId();

  /**
   * <code>string message = 2 [json_name = "message"];</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2 [json_name = "message"];</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>bool is_user_message = 3 [json_name = "isUserMessage"];</code>
   * @return The isUserMessage.
   */
  boolean getIsUserMessage();

  /**
   * <code>.google.protobuf.Timestamp occurred_at = 4 [json_name = "occurredAt"];</code>
   * @return Whether the occurredAt field is set.
   */
  boolean hasOccurredAt();
  /**
   * <code>.google.protobuf.Timestamp occurred_at = 4 [json_name = "occurredAt"];</code>
   * @return The occurredAt.
   */
  com.google.protobuf.Timestamp getOccurredAt();
  /**
   * <code>.google.protobuf.Timestamp occurred_at = 4 [json_name = "occurredAt"];</code>
   */
  com.google.protobuf.TimestampOrBuilder getOccurredAtOrBuilder();
}