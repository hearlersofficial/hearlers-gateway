// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/common/pagination.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.common;

public interface PaginationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.common.Pagination)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.hearlers.v1.common.SortOrder sort_order = 1 [json_name = "sortOrder"];</code>
   * @return The enum numeric value on the wire for sortOrder.
   */
  int getSortOrderValue();
  /**
   * <code>.com.hearlers.v1.common.SortOrder sort_order = 1 [json_name = "sortOrder"];</code>
   * @return The sortOrder.
   */
  com.hearlers.api.proto.v1.common.SortOrder getSortOrder();

  /**
   * <code>string since = 2 [json_name = "since"];</code>
   * @return The since.
   */
  java.lang.String getSince();
  /**
   * <code>string since = 2 [json_name = "since"];</code>
   * @return The bytes for since.
   */
  com.google.protobuf.ByteString
      getSinceBytes();

  /**
   * <code>int32 limit = 3 [json_name = "limit"];</code>
   * @return The limit.
   */
  int getLimit();
}
