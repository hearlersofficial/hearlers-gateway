// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

public interface GetCounselorListResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.GetCounselorListResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.hearlers.v1.model.Counselor counselor_list = 1 [json_name = "counselorList"];</code>
   */
  java.util.List<com.hearlers.api.proto.v1.model.Counselor> 
      getCounselorListList();
  /**
   * <code>repeated .com.hearlers.v1.model.Counselor counselor_list = 1 [json_name = "counselorList"];</code>
   */
  com.hearlers.api.proto.v1.model.Counselor getCounselorList(int index);
  /**
   * <code>repeated .com.hearlers.v1.model.Counselor counselor_list = 1 [json_name = "counselorList"];</code>
   */
  int getCounselorListCount();
  /**
   * <code>repeated .com.hearlers.v1.model.Counselor counselor_list = 1 [json_name = "counselorList"];</code>
   */
  java.util.List<? extends com.hearlers.api.proto.v1.model.CounselorOrBuilder> 
      getCounselorListOrBuilderList();
  /**
   * <code>repeated .com.hearlers.v1.model.Counselor counselor_list = 1 [json_name = "counselorList"];</code>
   */
  com.hearlers.api.proto.v1.model.CounselorOrBuilder getCounselorListOrBuilder(
      int index);
}
