// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: v1/service/user.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

public interface FindManyUserRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.FindManyUserRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.hearlers.v1.common.Pagination pagination = 1 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  boolean hasPagination();
  /**
   * <code>.com.hearlers.v1.common.Pagination pagination = 1 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  com.hearlers.api.proto.v1.common.Pagination getPagination();
  /**
   * <code>.com.hearlers.v1.common.Pagination pagination = 1 [json_name = "pagination"];</code>
   */
  com.hearlers.api.proto.v1.common.PaginationOrBuilder getPaginationOrBuilder();
}