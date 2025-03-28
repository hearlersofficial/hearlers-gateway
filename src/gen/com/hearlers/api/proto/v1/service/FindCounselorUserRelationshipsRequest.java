// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

/**
 * <pre>
 * 상담사와 유저의 관계
 * </pre>
 *
 * Protobuf type {@code com.hearlers.v1.service.FindCounselorUserRelationshipsRequest}
 */
public final class FindCounselorUserRelationshipsRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.hearlers.v1.service.FindCounselorUserRelationshipsRequest)
    FindCounselorUserRelationshipsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      FindCounselorUserRelationshipsRequest.class.getName());
  }
  // Use FindCounselorUserRelationshipsRequest.newBuilder() to construct.
  private FindCounselorUserRelationshipsRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private FindCounselorUserRelationshipsRequest() {
    counselorId_ = "";
    userId_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindCounselorUserRelationshipsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindCounselorUserRelationshipsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest.class, com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest.Builder.class);
  }

  public static final int COUNSELOR_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object counselorId_ = "";
  /**
   * <code>string counselor_id = 1 [json_name = "counselorId"];</code>
   * @return The counselorId.
   */
  @java.lang.Override
  public java.lang.String getCounselorId() {
    java.lang.Object ref = counselorId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      counselorId_ = s;
      return s;
    }
  }
  /**
   * <code>string counselor_id = 1 [json_name = "counselorId"];</code>
   * @return The bytes for counselorId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCounselorIdBytes() {
    java.lang.Object ref = counselorId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      counselorId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object userId_ = "";
  /**
   * <code>string user_id = 2 [json_name = "userId"];</code>
   * @return The userId.
   */
  @java.lang.Override
  public java.lang.String getUserId() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userId_ = s;
      return s;
    }
  }
  /**
   * <code>string user_id = 2 [json_name = "userId"];</code>
   * @return The bytes for userId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserIdBytes() {
    java.lang.Object ref = userId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(counselorId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, counselorId_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(userId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, userId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(counselorId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, counselorId_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(userId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, userId_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest)) {
      return super.equals(obj);
    }
    com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest other = (com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest) obj;

    if (!getCounselorId()
        .equals(other.getCounselorId())) return false;
    if (!getUserId()
        .equals(other.getUserId())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + COUNSELOR_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCounselorId().hashCode();
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * 상담사와 유저의 관계
   * </pre>
   *
   * Protobuf type {@code com.hearlers.v1.service.FindCounselorUserRelationshipsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hearlers.v1.service.FindCounselorUserRelationshipsRequest)
      com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindCounselorUserRelationshipsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindCounselorUserRelationshipsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest.class, com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest.Builder.class);
    }

    // Construct using com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      counselorId_ = "";
      userId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindCounselorUserRelationshipsRequest_descriptor;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest getDefaultInstanceForType() {
      return com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest build() {
      com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest buildPartial() {
      com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest result = new com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.counselorId_ = counselorId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.userId_ = userId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest) {
        return mergeFrom((com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest other) {
      if (other == com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest.getDefaultInstance()) return this;
      if (!other.getCounselorId().isEmpty()) {
        counselorId_ = other.counselorId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              counselorId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              userId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object counselorId_ = "";
    /**
     * <code>string counselor_id = 1 [json_name = "counselorId"];</code>
     * @return The counselorId.
     */
    public java.lang.String getCounselorId() {
      java.lang.Object ref = counselorId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        counselorId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string counselor_id = 1 [json_name = "counselorId"];</code>
     * @return The bytes for counselorId.
     */
    public com.google.protobuf.ByteString
        getCounselorIdBytes() {
      java.lang.Object ref = counselorId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        counselorId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string counselor_id = 1 [json_name = "counselorId"];</code>
     * @param value The counselorId to set.
     * @return This builder for chaining.
     */
    public Builder setCounselorId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      counselorId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string counselor_id = 1 [json_name = "counselorId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCounselorId() {
      counselorId_ = getDefaultInstance().getCounselorId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string counselor_id = 1 [json_name = "counselorId"];</code>
     * @param value The bytes for counselorId to set.
     * @return This builder for chaining.
     */
    public Builder setCounselorIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      counselorId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object userId_ = "";
    /**
     * <code>string user_id = 2 [json_name = "userId"];</code>
     * @return The userId.
     */
    public java.lang.String getUserId() {
      java.lang.Object ref = userId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user_id = 2 [json_name = "userId"];</code>
     * @return The bytes for userId.
     */
    public com.google.protobuf.ByteString
        getUserIdBytes() {
      java.lang.Object ref = userId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user_id = 2 [json_name = "userId"];</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      userId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 2 [json_name = "userId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      userId_ = getDefaultInstance().getUserId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 2 [json_name = "userId"];</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      userId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:com.hearlers.v1.service.FindCounselorUserRelationshipsRequest)
  }

  // @@protoc_insertion_point(class_scope:com.hearlers.v1.service.FindCounselorUserRelationshipsRequest)
  private static final com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest();
  }

  public static com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FindCounselorUserRelationshipsRequest>
      PARSER = new com.google.protobuf.AbstractParser<FindCounselorUserRelationshipsRequest>() {
    @java.lang.Override
    public FindCounselorUserRelationshipsRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<FindCounselorUserRelationshipsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FindCounselorUserRelationshipsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hearlers.api.proto.v1.service.FindCounselorUserRelationshipsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

