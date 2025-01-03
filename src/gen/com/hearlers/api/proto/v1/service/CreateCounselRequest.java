// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

/**
 * Protobuf type {@code com.hearlers.v1.service.CreateCounselRequest}
 */
public final class CreateCounselRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.hearlers.v1.service.CreateCounselRequest)
    CreateCounselRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      CreateCounselRequest.class.getName());
  }
  // Use CreateCounselRequest.newBuilder() to construct.
  private CreateCounselRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CreateCounselRequest() {
    introMessage_ = "";
    responseMessage_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_CreateCounselRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_CreateCounselRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hearlers.api.proto.v1.service.CreateCounselRequest.class, com.hearlers.api.proto.v1.service.CreateCounselRequest.Builder.class);
  }

  public static final int USER_ID_FIELD_NUMBER = 1;
  private int userId_ = 0;
  /**
   * <code>int32 user_id = 1 [json_name = "userId"];</code>
   * @return The userId.
   */
  @java.lang.Override
  public int getUserId() {
    return userId_;
  }

  public static final int COUNSELOR_ID_FIELD_NUMBER = 2;
  private int counselorId_ = 0;
  /**
   * <code>int32 counselor_id = 2 [json_name = "counselorId"];</code>
   * @return The counselorId.
   */
  @java.lang.Override
  public int getCounselorId() {
    return counselorId_;
  }

  public static final int INTRO_MESSAGE_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object introMessage_ = "";
  /**
   * <code>string intro_message = 3 [json_name = "introMessage"];</code>
   * @return The introMessage.
   */
  @java.lang.Override
  public java.lang.String getIntroMessage() {
    java.lang.Object ref = introMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      introMessage_ = s;
      return s;
    }
  }
  /**
   * <code>string intro_message = 3 [json_name = "introMessage"];</code>
   * @return The bytes for introMessage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIntroMessageBytes() {
    java.lang.Object ref = introMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      introMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESPONSE_MESSAGE_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object responseMessage_ = "";
  /**
   * <code>string response_message = 4 [json_name = "responseMessage"];</code>
   * @return The responseMessage.
   */
  @java.lang.Override
  public java.lang.String getResponseMessage() {
    java.lang.Object ref = responseMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      responseMessage_ = s;
      return s;
    }
  }
  /**
   * <code>string response_message = 4 [json_name = "responseMessage"];</code>
   * @return The bytes for responseMessage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getResponseMessageBytes() {
    java.lang.Object ref = responseMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      responseMessage_ = b;
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
    if (userId_ != 0) {
      output.writeInt32(1, userId_);
    }
    if (counselorId_ != 0) {
      output.writeInt32(2, counselorId_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(introMessage_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, introMessage_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(responseMessage_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 4, responseMessage_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (userId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, userId_);
    }
    if (counselorId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, counselorId_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(introMessage_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, introMessage_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(responseMessage_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(4, responseMessage_);
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
    if (!(obj instanceof com.hearlers.api.proto.v1.service.CreateCounselRequest)) {
      return super.equals(obj);
    }
    com.hearlers.api.proto.v1.service.CreateCounselRequest other = (com.hearlers.api.proto.v1.service.CreateCounselRequest) obj;

    if (getUserId()
        != other.getUserId()) return false;
    if (getCounselorId()
        != other.getCounselorId()) return false;
    if (!getIntroMessage()
        .equals(other.getIntroMessage())) return false;
    if (!getResponseMessage()
        .equals(other.getResponseMessage())) return false;
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
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId();
    hash = (37 * hash) + COUNSELOR_ID_FIELD_NUMBER;
    hash = (53 * hash) + getCounselorId();
    hash = (37 * hash) + INTRO_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getIntroMessage().hashCode();
    hash = (37 * hash) + RESPONSE_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getResponseMessage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hearlers.api.proto.v1.service.CreateCounselRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.hearlers.api.proto.v1.service.CreateCounselRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.hearlers.api.proto.v1.service.CreateCounselRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselRequest parseFrom(
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
  public static Builder newBuilder(com.hearlers.api.proto.v1.service.CreateCounselRequest prototype) {
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
   * Protobuf type {@code com.hearlers.v1.service.CreateCounselRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hearlers.v1.service.CreateCounselRequest)
      com.hearlers.api.proto.v1.service.CreateCounselRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_CreateCounselRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_CreateCounselRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hearlers.api.proto.v1.service.CreateCounselRequest.class, com.hearlers.api.proto.v1.service.CreateCounselRequest.Builder.class);
    }

    // Construct using com.hearlers.api.proto.v1.service.CreateCounselRequest.newBuilder()
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
      userId_ = 0;
      counselorId_ = 0;
      introMessage_ = "";
      responseMessage_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_CreateCounselRequest_descriptor;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.CreateCounselRequest getDefaultInstanceForType() {
      return com.hearlers.api.proto.v1.service.CreateCounselRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.CreateCounselRequest build() {
      com.hearlers.api.proto.v1.service.CreateCounselRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.CreateCounselRequest buildPartial() {
      com.hearlers.api.proto.v1.service.CreateCounselRequest result = new com.hearlers.api.proto.v1.service.CreateCounselRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.hearlers.api.proto.v1.service.CreateCounselRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.userId_ = userId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.counselorId_ = counselorId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.introMessage_ = introMessage_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.responseMessage_ = responseMessage_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hearlers.api.proto.v1.service.CreateCounselRequest) {
        return mergeFrom((com.hearlers.api.proto.v1.service.CreateCounselRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hearlers.api.proto.v1.service.CreateCounselRequest other) {
      if (other == com.hearlers.api.proto.v1.service.CreateCounselRequest.getDefaultInstance()) return this;
      if (other.getUserId() != 0) {
        setUserId(other.getUserId());
      }
      if (other.getCounselorId() != 0) {
        setCounselorId(other.getCounselorId());
      }
      if (!other.getIntroMessage().isEmpty()) {
        introMessage_ = other.introMessage_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getResponseMessage().isEmpty()) {
        responseMessage_ = other.responseMessage_;
        bitField0_ |= 0x00000008;
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
            case 8: {
              userId_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              counselorId_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              introMessage_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              responseMessage_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private int userId_ ;
    /**
     * <code>int32 user_id = 1 [json_name = "userId"];</code>
     * @return The userId.
     */
    @java.lang.Override
    public int getUserId() {
      return userId_;
    }
    /**
     * <code>int32 user_id = 1 [json_name = "userId"];</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(int value) {

      userId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 user_id = 1 [json_name = "userId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      userId_ = 0;
      onChanged();
      return this;
    }

    private int counselorId_ ;
    /**
     * <code>int32 counselor_id = 2 [json_name = "counselorId"];</code>
     * @return The counselorId.
     */
    @java.lang.Override
    public int getCounselorId() {
      return counselorId_;
    }
    /**
     * <code>int32 counselor_id = 2 [json_name = "counselorId"];</code>
     * @param value The counselorId to set.
     * @return This builder for chaining.
     */
    public Builder setCounselorId(int value) {

      counselorId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 counselor_id = 2 [json_name = "counselorId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCounselorId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      counselorId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object introMessage_ = "";
    /**
     * <code>string intro_message = 3 [json_name = "introMessage"];</code>
     * @return The introMessage.
     */
    public java.lang.String getIntroMessage() {
      java.lang.Object ref = introMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        introMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string intro_message = 3 [json_name = "introMessage"];</code>
     * @return The bytes for introMessage.
     */
    public com.google.protobuf.ByteString
        getIntroMessageBytes() {
      java.lang.Object ref = introMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        introMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string intro_message = 3 [json_name = "introMessage"];</code>
     * @param value The introMessage to set.
     * @return This builder for chaining.
     */
    public Builder setIntroMessage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      introMessage_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string intro_message = 3 [json_name = "introMessage"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIntroMessage() {
      introMessage_ = getDefaultInstance().getIntroMessage();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string intro_message = 3 [json_name = "introMessage"];</code>
     * @param value The bytes for introMessage to set.
     * @return This builder for chaining.
     */
    public Builder setIntroMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      introMessage_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object responseMessage_ = "";
    /**
     * <code>string response_message = 4 [json_name = "responseMessage"];</code>
     * @return The responseMessage.
     */
    public java.lang.String getResponseMessage() {
      java.lang.Object ref = responseMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        responseMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string response_message = 4 [json_name = "responseMessage"];</code>
     * @return The bytes for responseMessage.
     */
    public com.google.protobuf.ByteString
        getResponseMessageBytes() {
      java.lang.Object ref = responseMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        responseMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string response_message = 4 [json_name = "responseMessage"];</code>
     * @param value The responseMessage to set.
     * @return This builder for chaining.
     */
    public Builder setResponseMessage(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      responseMessage_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string response_message = 4 [json_name = "responseMessage"];</code>
     * @return This builder for chaining.
     */
    public Builder clearResponseMessage() {
      responseMessage_ = getDefaultInstance().getResponseMessage();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string response_message = 4 [json_name = "responseMessage"];</code>
     * @param value The bytes for responseMessage to set.
     * @return This builder for chaining.
     */
    public Builder setResponseMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      responseMessage_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:com.hearlers.v1.service.CreateCounselRequest)
  }

  // @@protoc_insertion_point(class_scope:com.hearlers.v1.service.CreateCounselRequest)
  private static final com.hearlers.api.proto.v1.service.CreateCounselRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hearlers.api.proto.v1.service.CreateCounselRequest();
  }

  public static com.hearlers.api.proto.v1.service.CreateCounselRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCounselRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateCounselRequest>() {
    @java.lang.Override
    public CreateCounselRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateCounselRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCounselRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hearlers.api.proto.v1.service.CreateCounselRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

