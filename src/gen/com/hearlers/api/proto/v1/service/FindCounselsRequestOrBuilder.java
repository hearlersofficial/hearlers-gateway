// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

public interface FindCounselsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.FindCounselsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string user_id = 1 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>optional string counselor_id = 2 [json_name = "counselorId"];</code>
   * @return Whether the counselorId field is set.
   */
  boolean hasCounselorId();
  /**
   * <code>optional string counselor_id = 2 [json_name = "counselorId"];</code>
   * @return The counselorId.
   */
  java.lang.String getCounselorId();
  /**
   * <code>optional string counselor_id = 2 [json_name = "counselorId"];</code>
   * @return The bytes for counselorId.
   */
  com.google.protobuf.ByteString
      getCounselorIdBytes();
}
