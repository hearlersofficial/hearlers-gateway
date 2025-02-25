// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/message/user.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.message;

/**
 * <pre>
 * topic: user.updated
 * </pre>
 *
 * Protobuf type {@code com.hearlers.v1.message.UserUpdatedPayload}
 */
public final class UserUpdatedPayload extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.hearlers.v1.message.UserUpdatedPayload)
    UserUpdatedPayloadOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      UserUpdatedPayload.class.getName());
  }
  // Use UserUpdatedPayload.newBuilder() to construct.
  private UserUpdatedPayload(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UserUpdatedPayload() {
    userId_ = "";
    authChannel_ = 0;
    occurredAt_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hearlers.api.proto.v1.message.User.internal_static_com_hearlers_v1_message_UserUpdatedPayload_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hearlers.api.proto.v1.message.User.internal_static_com_hearlers_v1_message_UserUpdatedPayload_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hearlers.api.proto.v1.message.UserUpdatedPayload.class, com.hearlers.api.proto.v1.message.UserUpdatedPayload.Builder.class);
  }

  public static final int USER_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object userId_ = "";
  /**
   * <code>string user_id = 1 [json_name = "userId"];</code>
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
   * <code>string user_id = 1 [json_name = "userId"];</code>
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

  public static final int AUTH_CHANNEL_FIELD_NUMBER = 2;
  private int authChannel_ = 0;
  /**
   * <code>.com.hearlers.v1.model.AuthChannel auth_channel = 2 [json_name = "authChannel"];</code>
   * @return The enum numeric value on the wire for authChannel.
   */
  @java.lang.Override public int getAuthChannelValue() {
    return authChannel_;
  }
  /**
   * <code>.com.hearlers.v1.model.AuthChannel auth_channel = 2 [json_name = "authChannel"];</code>
   * @return The authChannel.
   */
  @java.lang.Override public com.hearlers.api.proto.v1.model.AuthChannel getAuthChannel() {
    com.hearlers.api.proto.v1.model.AuthChannel result = com.hearlers.api.proto.v1.model.AuthChannel.forNumber(authChannel_);
    return result == null ? com.hearlers.api.proto.v1.model.AuthChannel.UNRECOGNIZED : result;
  }

  public static final int OCCURRED_AT_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object occurredAt_ = "";
  /**
   * <pre>
   * YYYY-MM-DD HH:mm:ss (2024-12-29 12:34:56)
   * </pre>
   *
   * <code>string occurred_at = 3 [json_name = "occurredAt"];</code>
   * @return The occurredAt.
   */
  @java.lang.Override
  public java.lang.String getOccurredAt() {
    java.lang.Object ref = occurredAt_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      occurredAt_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * YYYY-MM-DD HH:mm:ss (2024-12-29 12:34:56)
   * </pre>
   *
   * <code>string occurred_at = 3 [json_name = "occurredAt"];</code>
   * @return The bytes for occurredAt.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOccurredAtBytes() {
    java.lang.Object ref = occurredAt_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      occurredAt_ = b;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(userId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, userId_);
    }
    if (authChannel_ != com.hearlers.api.proto.v1.model.AuthChannel.AUTH_CHANNEL_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, authChannel_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(occurredAt_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, occurredAt_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(userId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, userId_);
    }
    if (authChannel_ != com.hearlers.api.proto.v1.model.AuthChannel.AUTH_CHANNEL_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, authChannel_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(occurredAt_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, occurredAt_);
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
    if (!(obj instanceof com.hearlers.api.proto.v1.message.UserUpdatedPayload)) {
      return super.equals(obj);
    }
    com.hearlers.api.proto.v1.message.UserUpdatedPayload other = (com.hearlers.api.proto.v1.message.UserUpdatedPayload) obj;

    if (!getUserId()
        .equals(other.getUserId())) return false;
    if (authChannel_ != other.authChannel_) return false;
    if (!getOccurredAt()
        .equals(other.getOccurredAt())) return false;
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
    hash = (53 * hash) + getUserId().hashCode();
    hash = (37 * hash) + AUTH_CHANNEL_FIELD_NUMBER;
    hash = (53 * hash) + authChannel_;
    hash = (37 * hash) + OCCURRED_AT_FIELD_NUMBER;
    hash = (53 * hash) + getOccurredAt().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hearlers.api.proto.v1.message.UserUpdatedPayload parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.message.UserUpdatedPayload parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.message.UserUpdatedPayload parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.message.UserUpdatedPayload parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.message.UserUpdatedPayload parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.message.UserUpdatedPayload parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.message.UserUpdatedPayload parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.message.UserUpdatedPayload parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.hearlers.api.proto.v1.message.UserUpdatedPayload parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.hearlers.api.proto.v1.message.UserUpdatedPayload parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.message.UserUpdatedPayload parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.message.UserUpdatedPayload parseFrom(
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
  public static Builder newBuilder(com.hearlers.api.proto.v1.message.UserUpdatedPayload prototype) {
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
   * topic: user.updated
   * </pre>
   *
   * Protobuf type {@code com.hearlers.v1.message.UserUpdatedPayload}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hearlers.v1.message.UserUpdatedPayload)
      com.hearlers.api.proto.v1.message.UserUpdatedPayloadOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hearlers.api.proto.v1.message.User.internal_static_com_hearlers_v1_message_UserUpdatedPayload_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hearlers.api.proto.v1.message.User.internal_static_com_hearlers_v1_message_UserUpdatedPayload_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hearlers.api.proto.v1.message.UserUpdatedPayload.class, com.hearlers.api.proto.v1.message.UserUpdatedPayload.Builder.class);
    }

    // Construct using com.hearlers.api.proto.v1.message.UserUpdatedPayload.newBuilder()
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
      userId_ = "";
      authChannel_ = 0;
      occurredAt_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hearlers.api.proto.v1.message.User.internal_static_com_hearlers_v1_message_UserUpdatedPayload_descriptor;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.message.UserUpdatedPayload getDefaultInstanceForType() {
      return com.hearlers.api.proto.v1.message.UserUpdatedPayload.getDefaultInstance();
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.message.UserUpdatedPayload build() {
      com.hearlers.api.proto.v1.message.UserUpdatedPayload result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.message.UserUpdatedPayload buildPartial() {
      com.hearlers.api.proto.v1.message.UserUpdatedPayload result = new com.hearlers.api.proto.v1.message.UserUpdatedPayload(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.hearlers.api.proto.v1.message.UserUpdatedPayload result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.userId_ = userId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.authChannel_ = authChannel_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.occurredAt_ = occurredAt_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hearlers.api.proto.v1.message.UserUpdatedPayload) {
        return mergeFrom((com.hearlers.api.proto.v1.message.UserUpdatedPayload)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hearlers.api.proto.v1.message.UserUpdatedPayload other) {
      if (other == com.hearlers.api.proto.v1.message.UserUpdatedPayload.getDefaultInstance()) return this;
      if (!other.getUserId().isEmpty()) {
        userId_ = other.userId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.authChannel_ != 0) {
        setAuthChannelValue(other.getAuthChannelValue());
      }
      if (!other.getOccurredAt().isEmpty()) {
        occurredAt_ = other.occurredAt_;
        bitField0_ |= 0x00000004;
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
              userId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              authChannel_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              occurredAt_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object userId_ = "";
    /**
     * <code>string user_id = 1 [json_name = "userId"];</code>
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
     * <code>string user_id = 1 [json_name = "userId"];</code>
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
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      userId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      userId_ = getDefaultInstance().getUserId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string user_id = 1 [json_name = "userId"];</code>
     * @param value The bytes for userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      userId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int authChannel_ = 0;
    /**
     * <code>.com.hearlers.v1.model.AuthChannel auth_channel = 2 [json_name = "authChannel"];</code>
     * @return The enum numeric value on the wire for authChannel.
     */
    @java.lang.Override public int getAuthChannelValue() {
      return authChannel_;
    }
    /**
     * <code>.com.hearlers.v1.model.AuthChannel auth_channel = 2 [json_name = "authChannel"];</code>
     * @param value The enum numeric value on the wire for authChannel to set.
     * @return This builder for chaining.
     */
    public Builder setAuthChannelValue(int value) {
      authChannel_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.AuthChannel auth_channel = 2 [json_name = "authChannel"];</code>
     * @return The authChannel.
     */
    @java.lang.Override
    public com.hearlers.api.proto.v1.model.AuthChannel getAuthChannel() {
      com.hearlers.api.proto.v1.model.AuthChannel result = com.hearlers.api.proto.v1.model.AuthChannel.forNumber(authChannel_);
      return result == null ? com.hearlers.api.proto.v1.model.AuthChannel.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.hearlers.v1.model.AuthChannel auth_channel = 2 [json_name = "authChannel"];</code>
     * @param value The authChannel to set.
     * @return This builder for chaining.
     */
    public Builder setAuthChannel(com.hearlers.api.proto.v1.model.AuthChannel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      authChannel_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.AuthChannel auth_channel = 2 [json_name = "authChannel"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAuthChannel() {
      bitField0_ = (bitField0_ & ~0x00000002);
      authChannel_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object occurredAt_ = "";
    /**
     * <pre>
     * YYYY-MM-DD HH:mm:ss (2024-12-29 12:34:56)
     * </pre>
     *
     * <code>string occurred_at = 3 [json_name = "occurredAt"];</code>
     * @return The occurredAt.
     */
    public java.lang.String getOccurredAt() {
      java.lang.Object ref = occurredAt_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        occurredAt_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * YYYY-MM-DD HH:mm:ss (2024-12-29 12:34:56)
     * </pre>
     *
     * <code>string occurred_at = 3 [json_name = "occurredAt"];</code>
     * @return The bytes for occurredAt.
     */
    public com.google.protobuf.ByteString
        getOccurredAtBytes() {
      java.lang.Object ref = occurredAt_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        occurredAt_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * YYYY-MM-DD HH:mm:ss (2024-12-29 12:34:56)
     * </pre>
     *
     * <code>string occurred_at = 3 [json_name = "occurredAt"];</code>
     * @param value The occurredAt to set.
     * @return This builder for chaining.
     */
    public Builder setOccurredAt(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      occurredAt_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * YYYY-MM-DD HH:mm:ss (2024-12-29 12:34:56)
     * </pre>
     *
     * <code>string occurred_at = 3 [json_name = "occurredAt"];</code>
     * @return This builder for chaining.
     */
    public Builder clearOccurredAt() {
      occurredAt_ = getDefaultInstance().getOccurredAt();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * YYYY-MM-DD HH:mm:ss (2024-12-29 12:34:56)
     * </pre>
     *
     * <code>string occurred_at = 3 [json_name = "occurredAt"];</code>
     * @param value The bytes for occurredAt to set.
     * @return This builder for chaining.
     */
    public Builder setOccurredAtBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      occurredAt_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:com.hearlers.v1.message.UserUpdatedPayload)
  }

  // @@protoc_insertion_point(class_scope:com.hearlers.v1.message.UserUpdatedPayload)
  private static final com.hearlers.api.proto.v1.message.UserUpdatedPayload DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hearlers.api.proto.v1.message.UserUpdatedPayload();
  }

  public static com.hearlers.api.proto.v1.message.UserUpdatedPayload getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserUpdatedPayload>
      PARSER = new com.google.protobuf.AbstractParser<UserUpdatedPayload>() {
    @java.lang.Override
    public UserUpdatedPayload parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserUpdatedPayload> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserUpdatedPayload> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hearlers.api.proto.v1.message.UserUpdatedPayload getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

