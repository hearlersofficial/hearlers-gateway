// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: v1/message/counsel.proto
// Protobuf Java Version: 4.29.0

package com.com.hearlers.v1.message;

public interface CounselCreatedPayloadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.message.CounselCreatedPayload)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 counsel_id = 1 [json_name = "counselId"];</code>
   * @return The counselId.
   */
  int getCounselId();

  /**
   * <code>int32 user_id = 2 [json_name = "userId"];</code>
   * @return The userId.
   */
  int getUserId();

  /**
   * <code>.com.hearlers.v1.model.CounselorType counselor_type = 3 [json_name = "counselorType"];</code>
   * @return The enum numeric value on the wire for counselorType.
   */
  int getCounselorTypeValue();
  /**
   * <code>.com.hearlers.v1.model.CounselorType counselor_type = 3 [json_name = "counselorType"];</code>
   * @return The counselorType.
   */
  com.com.hearlers.v1.model.CounselorType getCounselorType();

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
