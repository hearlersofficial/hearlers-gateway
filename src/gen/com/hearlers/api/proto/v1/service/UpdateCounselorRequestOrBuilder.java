// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counselor.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

public interface UpdateCounselorRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.UpdateCounselorRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string counselor_id = 1 [json_name = "counselorId"];</code>
   * @return The counselorId.
   */
  java.lang.String getCounselorId();
  /**
   * <code>string counselor_id = 1 [json_name = "counselorId"];</code>
   * @return The bytes for counselorId.
   */
  com.google.protobuf.ByteString
      getCounselorIdBytes();

  /**
   * <code>optional string tone_id = 2 [json_name = "toneId"];</code>
   * @return Whether the toneId field is set.
   */
  boolean hasToneId();
  /**
   * <code>optional string tone_id = 2 [json_name = "toneId"];</code>
   * @return The toneId.
   */
  java.lang.String getToneId();
  /**
   * <code>optional string tone_id = 2 [json_name = "toneId"];</code>
   * @return The bytes for toneId.
   */
  com.google.protobuf.ByteString
      getToneIdBytes();

  /**
   * <code>optional string name = 3 [json_name = "name"];</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <code>optional string name = 3 [json_name = "name"];</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>optional string name = 3 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>optional string description = 4 [json_name = "description"];</code>
   * @return Whether the description field is set.
   */
  boolean hasDescription();
  /**
   * <code>optional string description = 4 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>optional string description = 4 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>optional .com.hearlers.v1.model.CounselorGender counselor_gender = 5 [json_name = "counselorGender"];</code>
   * @return Whether the counselorGender field is set.
   */
  boolean hasCounselorGender();
  /**
   * <code>optional .com.hearlers.v1.model.CounselorGender counselor_gender = 5 [json_name = "counselorGender"];</code>
   * @return The enum numeric value on the wire for counselorGender.
   */
  int getCounselorGenderValue();
  /**
   * <code>optional .com.hearlers.v1.model.CounselorGender counselor_gender = 5 [json_name = "counselorGender"];</code>
   * @return The counselorGender.
   */
  com.hearlers.api.proto.v1.model.CounselorGender getCounselorGender();
}
