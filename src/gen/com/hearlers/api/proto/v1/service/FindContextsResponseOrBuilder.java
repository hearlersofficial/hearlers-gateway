// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

public interface FindContextsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.FindContextsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .com.hearlers.v1.model.Context contexts = 1 [json_name = "contexts"];</code>
   */
  java.util.List<com.hearlers.api.proto.v1.model.Context> 
      getContextsList();
  /**
   * <code>repeated .com.hearlers.v1.model.Context contexts = 1 [json_name = "contexts"];</code>
   */
  com.hearlers.api.proto.v1.model.Context getContexts(int index);
  /**
   * <code>repeated .com.hearlers.v1.model.Context contexts = 1 [json_name = "contexts"];</code>
   */
  int getContextsCount();
  /**
   * <code>repeated .com.hearlers.v1.model.Context contexts = 1 [json_name = "contexts"];</code>
   */
  java.util.List<? extends com.hearlers.api.proto.v1.model.ContextOrBuilder> 
      getContextsOrBuilderList();
  /**
   * <code>repeated .com.hearlers.v1.model.Context contexts = 1 [json_name = "contexts"];</code>
   */
  com.hearlers.api.proto.v1.model.ContextOrBuilder getContextsOrBuilder(
      int index);
}
