// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

public interface FindCounselorsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.FindCounselorsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.hearlers.v1.model.Counselor counselors = 1 [json_name = "counselors"];</code>
   */
  java.util.List<com.hearlers.api.proto.v1.model.Counselor> 
      getCounselorsList();
  /**
   * <code>repeated .com.hearlers.v1.model.Counselor counselors = 1 [json_name = "counselors"];</code>
   */
  com.hearlers.api.proto.v1.model.Counselor getCounselors(int index);
  /**
   * <code>repeated .com.hearlers.v1.model.Counselor counselors = 1 [json_name = "counselors"];</code>
   */
  int getCounselorsCount();
  /**
   * <code>repeated .com.hearlers.v1.model.Counselor counselors = 1 [json_name = "counselors"];</code>
   */
  java.util.List<? extends com.hearlers.api.proto.v1.model.CounselorOrBuilder> 
      getCounselorsOrBuilderList();
  /**
   * <code>repeated .com.hearlers.v1.model.Counselor counselors = 1 [json_name = "counselors"];</code>
   */
  com.hearlers.api.proto.v1.model.CounselorOrBuilder getCounselorsOrBuilder(
      int index);
}
