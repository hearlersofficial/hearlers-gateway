// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

/**
 * Protobuf type {@code com.hearlers.v1.service.FindCounselorByIdResponse}
 */
public final class FindCounselorByIdResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.hearlers.v1.service.FindCounselorByIdResponse)
    FindCounselorByIdResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      FindCounselorByIdResponse.class.getName());
  }
  // Use FindCounselorByIdResponse.newBuilder() to construct.
  private FindCounselorByIdResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private FindCounselorByIdResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindCounselorByIdResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindCounselorByIdResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hearlers.api.proto.v1.service.FindCounselorByIdResponse.class, com.hearlers.api.proto.v1.service.FindCounselorByIdResponse.Builder.class);
  }

  private int bitField0_;
  public static final int COUNSELOR_FIELD_NUMBER = 1;
  private com.hearlers.api.proto.v1.model.Counselor counselor_;
  /**
   * <code>optional .com.hearlers.v1.model.Counselor counselor = 1 [json_name = "counselor"];</code>
   * @return Whether the counselor field is set.
   */
  @java.lang.Override
  public boolean hasCounselor() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .com.hearlers.v1.model.Counselor counselor = 1 [json_name = "counselor"];</code>
   * @return The counselor.
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.Counselor getCounselor() {
    return counselor_ == null ? com.hearlers.api.proto.v1.model.Counselor.getDefaultInstance() : counselor_;
  }
  /**
   * <code>optional .com.hearlers.v1.model.Counselor counselor = 1 [json_name = "counselor"];</code>
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.CounselorOrBuilder getCounselorOrBuilder() {
    return counselor_ == null ? com.hearlers.api.proto.v1.model.Counselor.getDefaultInstance() : counselor_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getCounselor());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCounselor());
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
    if (!(obj instanceof com.hearlers.api.proto.v1.service.FindCounselorByIdResponse)) {
      return super.equals(obj);
    }
    com.hearlers.api.proto.v1.service.FindCounselorByIdResponse other = (com.hearlers.api.proto.v1.service.FindCounselorByIdResponse) obj;

    if (hasCounselor() != other.hasCounselor()) return false;
    if (hasCounselor()) {
      if (!getCounselor()
          .equals(other.getCounselor())) return false;
    }
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
    if (hasCounselor()) {
      hash = (37 * hash) + COUNSELOR_FIELD_NUMBER;
      hash = (53 * hash) + getCounselor().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hearlers.api.proto.v1.service.FindCounselorByIdResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindCounselorByIdResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindCounselorByIdResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindCounselorByIdResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindCounselorByIdResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindCounselorByIdResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindCounselorByIdResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.FindCounselorByIdResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.hearlers.api.proto.v1.service.FindCounselorByIdResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.hearlers.api.proto.v1.service.FindCounselorByIdResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindCounselorByIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.FindCounselorByIdResponse parseFrom(
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
  public static Builder newBuilder(com.hearlers.api.proto.v1.service.FindCounselorByIdResponse prototype) {
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
   * Protobuf type {@code com.hearlers.v1.service.FindCounselorByIdResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hearlers.v1.service.FindCounselorByIdResponse)
      com.hearlers.api.proto.v1.service.FindCounselorByIdResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindCounselorByIdResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindCounselorByIdResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hearlers.api.proto.v1.service.FindCounselorByIdResponse.class, com.hearlers.api.proto.v1.service.FindCounselorByIdResponse.Builder.class);
    }

    // Construct using com.hearlers.api.proto.v1.service.FindCounselorByIdResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getCounselorFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      counselor_ = null;
      if (counselorBuilder_ != null) {
        counselorBuilder_.dispose();
        counselorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindCounselorByIdResponse_descriptor;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindCounselorByIdResponse getDefaultInstanceForType() {
      return com.hearlers.api.proto.v1.service.FindCounselorByIdResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindCounselorByIdResponse build() {
      com.hearlers.api.proto.v1.service.FindCounselorByIdResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindCounselorByIdResponse buildPartial() {
      com.hearlers.api.proto.v1.service.FindCounselorByIdResponse result = new com.hearlers.api.proto.v1.service.FindCounselorByIdResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.hearlers.api.proto.v1.service.FindCounselorByIdResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.counselor_ = counselorBuilder_ == null
            ? counselor_
            : counselorBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hearlers.api.proto.v1.service.FindCounselorByIdResponse) {
        return mergeFrom((com.hearlers.api.proto.v1.service.FindCounselorByIdResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hearlers.api.proto.v1.service.FindCounselorByIdResponse other) {
      if (other == com.hearlers.api.proto.v1.service.FindCounselorByIdResponse.getDefaultInstance()) return this;
      if (other.hasCounselor()) {
        mergeCounselor(other.getCounselor());
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
              input.readMessage(
                  getCounselorFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private com.hearlers.api.proto.v1.model.Counselor counselor_;
    private com.google.protobuf.SingleFieldBuilder<
        com.hearlers.api.proto.v1.model.Counselor, com.hearlers.api.proto.v1.model.Counselor.Builder, com.hearlers.api.proto.v1.model.CounselorOrBuilder> counselorBuilder_;
    /**
     * <code>optional .com.hearlers.v1.model.Counselor counselor = 1 [json_name = "counselor"];</code>
     * @return Whether the counselor field is set.
     */
    public boolean hasCounselor() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .com.hearlers.v1.model.Counselor counselor = 1 [json_name = "counselor"];</code>
     * @return The counselor.
     */
    public com.hearlers.api.proto.v1.model.Counselor getCounselor() {
      if (counselorBuilder_ == null) {
        return counselor_ == null ? com.hearlers.api.proto.v1.model.Counselor.getDefaultInstance() : counselor_;
      } else {
        return counselorBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .com.hearlers.v1.model.Counselor counselor = 1 [json_name = "counselor"];</code>
     */
    public Builder setCounselor(com.hearlers.api.proto.v1.model.Counselor value) {
      if (counselorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        counselor_ = value;
      } else {
        counselorBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .com.hearlers.v1.model.Counselor counselor = 1 [json_name = "counselor"];</code>
     */
    public Builder setCounselor(
        com.hearlers.api.proto.v1.model.Counselor.Builder builderForValue) {
      if (counselorBuilder_ == null) {
        counselor_ = builderForValue.build();
      } else {
        counselorBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .com.hearlers.v1.model.Counselor counselor = 1 [json_name = "counselor"];</code>
     */
    public Builder mergeCounselor(com.hearlers.api.proto.v1.model.Counselor value) {
      if (counselorBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          counselor_ != null &&
          counselor_ != com.hearlers.api.proto.v1.model.Counselor.getDefaultInstance()) {
          getCounselorBuilder().mergeFrom(value);
        } else {
          counselor_ = value;
        }
      } else {
        counselorBuilder_.mergeFrom(value);
      }
      if (counselor_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>optional .com.hearlers.v1.model.Counselor counselor = 1 [json_name = "counselor"];</code>
     */
    public Builder clearCounselor() {
      bitField0_ = (bitField0_ & ~0x00000001);
      counselor_ = null;
      if (counselorBuilder_ != null) {
        counselorBuilder_.dispose();
        counselorBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .com.hearlers.v1.model.Counselor counselor = 1 [json_name = "counselor"];</code>
     */
    public com.hearlers.api.proto.v1.model.Counselor.Builder getCounselorBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCounselorFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .com.hearlers.v1.model.Counselor counselor = 1 [json_name = "counselor"];</code>
     */
    public com.hearlers.api.proto.v1.model.CounselorOrBuilder getCounselorOrBuilder() {
      if (counselorBuilder_ != null) {
        return counselorBuilder_.getMessageOrBuilder();
      } else {
        return counselor_ == null ?
            com.hearlers.api.proto.v1.model.Counselor.getDefaultInstance() : counselor_;
      }
    }
    /**
     * <code>optional .com.hearlers.v1.model.Counselor counselor = 1 [json_name = "counselor"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.hearlers.api.proto.v1.model.Counselor, com.hearlers.api.proto.v1.model.Counselor.Builder, com.hearlers.api.proto.v1.model.CounselorOrBuilder> 
        getCounselorFieldBuilder() {
      if (counselorBuilder_ == null) {
        counselorBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.hearlers.api.proto.v1.model.Counselor, com.hearlers.api.proto.v1.model.Counselor.Builder, com.hearlers.api.proto.v1.model.CounselorOrBuilder>(
                getCounselor(),
                getParentForChildren(),
                isClean());
        counselor_ = null;
      }
      return counselorBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:com.hearlers.v1.service.FindCounselorByIdResponse)
  }

  // @@protoc_insertion_point(class_scope:com.hearlers.v1.service.FindCounselorByIdResponse)
  private static final com.hearlers.api.proto.v1.service.FindCounselorByIdResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hearlers.api.proto.v1.service.FindCounselorByIdResponse();
  }

  public static com.hearlers.api.proto.v1.service.FindCounselorByIdResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FindCounselorByIdResponse>
      PARSER = new com.google.protobuf.AbstractParser<FindCounselorByIdResponse>() {
    @java.lang.Override
    public FindCounselorByIdResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<FindCounselorByIdResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FindCounselorByIdResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hearlers.api.proto.v1.service.FindCounselorByIdResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

