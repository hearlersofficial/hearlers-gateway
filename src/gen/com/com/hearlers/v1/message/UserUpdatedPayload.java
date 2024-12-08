// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: v1/message/user.proto
// Protobuf Java Version: 4.29.0

package com.com.hearlers.v1.message;

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
      /* patch= */ 0,
      /* suffix= */ "",
      UserUpdatedPayload.class.getName());
  }
  // Use UserUpdatedPayload.newBuilder() to construct.
  private UserUpdatedPayload(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private UserUpdatedPayload() {
    authChannel_ = 0;
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.com.hearlers.v1.message.UserProto.internal_static_com_hearlers_v1_message_UserUpdatedPayload_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.com.hearlers.v1.message.UserProto.internal_static_com_hearlers_v1_message_UserUpdatedPayload_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.com.hearlers.v1.message.UserUpdatedPayload.class, com.com.hearlers.v1.message.UserUpdatedPayload.Builder.class);
  }

  private int bitField0_;
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
  @java.lang.Override public com.com.hearlers.v1.model.AuthChannel getAuthChannel() {
    com.com.hearlers.v1.model.AuthChannel result = com.com.hearlers.v1.model.AuthChannel.forNumber(authChannel_);
    return result == null ? com.com.hearlers.v1.model.AuthChannel.UNRECOGNIZED : result;
  }

  public static final int OCCURRED_AT_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp occurredAt_;
  /**
   * <code>.google.protobuf.Timestamp occurred_at = 3 [json_name = "occurredAt"];</code>
   * @return Whether the occurredAt field is set.
   */
  @java.lang.Override
  public boolean hasOccurredAt() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.google.protobuf.Timestamp occurred_at = 3 [json_name = "occurredAt"];</code>
   * @return The occurredAt.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getOccurredAt() {
    return occurredAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : occurredAt_;
  }
  /**
   * <code>.google.protobuf.Timestamp occurred_at = 3 [json_name = "occurredAt"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getOccurredAtOrBuilder() {
    return occurredAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : occurredAt_;
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
    if (authChannel_ != com.com.hearlers.v1.model.AuthChannel.AUTH_CHANNEL_UNSPECIFIED.getNumber()) {
      output.writeEnum(2, authChannel_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getOccurredAt());
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
    if (authChannel_ != com.com.hearlers.v1.model.AuthChannel.AUTH_CHANNEL_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, authChannel_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getOccurredAt());
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
    if (!(obj instanceof com.com.hearlers.v1.message.UserUpdatedPayload)) {
      return super.equals(obj);
    }
    com.com.hearlers.v1.message.UserUpdatedPayload other = (com.com.hearlers.v1.message.UserUpdatedPayload) obj;

    if (getUserId()
        != other.getUserId()) return false;
    if (authChannel_ != other.authChannel_) return false;
    if (hasOccurredAt() != other.hasOccurredAt()) return false;
    if (hasOccurredAt()) {
      if (!getOccurredAt()
          .equals(other.getOccurredAt())) return false;
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
    hash = (37 * hash) + USER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getUserId();
    hash = (37 * hash) + AUTH_CHANNEL_FIELD_NUMBER;
    hash = (53 * hash) + authChannel_;
    if (hasOccurredAt()) {
      hash = (37 * hash) + OCCURRED_AT_FIELD_NUMBER;
      hash = (53 * hash) + getOccurredAt().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.com.hearlers.v1.message.UserUpdatedPayload parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.com.hearlers.v1.message.UserUpdatedPayload parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.com.hearlers.v1.message.UserUpdatedPayload parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.com.hearlers.v1.message.UserUpdatedPayload parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.com.hearlers.v1.message.UserUpdatedPayload parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.com.hearlers.v1.message.UserUpdatedPayload parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.com.hearlers.v1.message.UserUpdatedPayload parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.com.hearlers.v1.message.UserUpdatedPayload parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.com.hearlers.v1.message.UserUpdatedPayload parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.com.hearlers.v1.message.UserUpdatedPayload parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.com.hearlers.v1.message.UserUpdatedPayload parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.com.hearlers.v1.message.UserUpdatedPayload parseFrom(
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
  public static Builder newBuilder(com.com.hearlers.v1.message.UserUpdatedPayload prototype) {
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
      com.com.hearlers.v1.message.UserUpdatedPayloadOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.com.hearlers.v1.message.UserProto.internal_static_com_hearlers_v1_message_UserUpdatedPayload_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.com.hearlers.v1.message.UserProto.internal_static_com_hearlers_v1_message_UserUpdatedPayload_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.com.hearlers.v1.message.UserUpdatedPayload.class, com.com.hearlers.v1.message.UserUpdatedPayload.Builder.class);
    }

    // Construct using com.com.hearlers.v1.message.UserUpdatedPayload.newBuilder()
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
        getOccurredAtFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      userId_ = 0;
      authChannel_ = 0;
      occurredAt_ = null;
      if (occurredAtBuilder_ != null) {
        occurredAtBuilder_.dispose();
        occurredAtBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.com.hearlers.v1.message.UserProto.internal_static_com_hearlers_v1_message_UserUpdatedPayload_descriptor;
    }

    @java.lang.Override
    public com.com.hearlers.v1.message.UserUpdatedPayload getDefaultInstanceForType() {
      return com.com.hearlers.v1.message.UserUpdatedPayload.getDefaultInstance();
    }

    @java.lang.Override
    public com.com.hearlers.v1.message.UserUpdatedPayload build() {
      com.com.hearlers.v1.message.UserUpdatedPayload result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.com.hearlers.v1.message.UserUpdatedPayload buildPartial() {
      com.com.hearlers.v1.message.UserUpdatedPayload result = new com.com.hearlers.v1.message.UserUpdatedPayload(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.com.hearlers.v1.message.UserUpdatedPayload result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.userId_ = userId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.authChannel_ = authChannel_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.occurredAt_ = occurredAtBuilder_ == null
            ? occurredAt_
            : occurredAtBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.com.hearlers.v1.message.UserUpdatedPayload) {
        return mergeFrom((com.com.hearlers.v1.message.UserUpdatedPayload)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.com.hearlers.v1.message.UserUpdatedPayload other) {
      if (other == com.com.hearlers.v1.message.UserUpdatedPayload.getDefaultInstance()) return this;
      if (other.getUserId() != 0) {
        setUserId(other.getUserId());
      }
      if (other.authChannel_ != 0) {
        setAuthChannelValue(other.getAuthChannelValue());
      }
      if (other.hasOccurredAt()) {
        mergeOccurredAt(other.getOccurredAt());
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
              authChannel_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getOccurredAtFieldBuilder().getBuilder(),
                  extensionRegistry);
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
    public com.com.hearlers.v1.model.AuthChannel getAuthChannel() {
      com.com.hearlers.v1.model.AuthChannel result = com.com.hearlers.v1.model.AuthChannel.forNumber(authChannel_);
      return result == null ? com.com.hearlers.v1.model.AuthChannel.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.hearlers.v1.model.AuthChannel auth_channel = 2 [json_name = "authChannel"];</code>
     * @param value The authChannel to set.
     * @return This builder for chaining.
     */
    public Builder setAuthChannel(com.com.hearlers.v1.model.AuthChannel value) {
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

    private com.google.protobuf.Timestamp occurredAt_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> occurredAtBuilder_;
    /**
     * <code>.google.protobuf.Timestamp occurred_at = 3 [json_name = "occurredAt"];</code>
     * @return Whether the occurredAt field is set.
     */
    public boolean hasOccurredAt() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.google.protobuf.Timestamp occurred_at = 3 [json_name = "occurredAt"];</code>
     * @return The occurredAt.
     */
    public com.google.protobuf.Timestamp getOccurredAt() {
      if (occurredAtBuilder_ == null) {
        return occurredAt_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : occurredAt_;
      } else {
        return occurredAtBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Timestamp occurred_at = 3 [json_name = "occurredAt"];</code>
     */
    public Builder setOccurredAt(com.google.protobuf.Timestamp value) {
      if (occurredAtBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        occurredAt_ = value;
      } else {
        occurredAtBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp occurred_at = 3 [json_name = "occurredAt"];</code>
     */
    public Builder setOccurredAt(
        com.google.protobuf.Timestamp.Builder builderForValue) {
      if (occurredAtBuilder_ == null) {
        occurredAt_ = builderForValue.build();
      } else {
        occurredAtBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp occurred_at = 3 [json_name = "occurredAt"];</code>
     */
    public Builder mergeOccurredAt(com.google.protobuf.Timestamp value) {
      if (occurredAtBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          occurredAt_ != null &&
          occurredAt_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getOccurredAtBuilder().mergeFrom(value);
        } else {
          occurredAt_ = value;
        }
      } else {
        occurredAtBuilder_.mergeFrom(value);
      }
      if (occurredAt_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp occurred_at = 3 [json_name = "occurredAt"];</code>
     */
    public Builder clearOccurredAt() {
      bitField0_ = (bitField0_ & ~0x00000004);
      occurredAt_ = null;
      if (occurredAtBuilder_ != null) {
        occurredAtBuilder_.dispose();
        occurredAtBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Timestamp occurred_at = 3 [json_name = "occurredAt"];</code>
     */
    public com.google.protobuf.Timestamp.Builder getOccurredAtBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getOccurredAtFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Timestamp occurred_at = 3 [json_name = "occurredAt"];</code>
     */
    public com.google.protobuf.TimestampOrBuilder getOccurredAtOrBuilder() {
      if (occurredAtBuilder_ != null) {
        return occurredAtBuilder_.getMessageOrBuilder();
      } else {
        return occurredAt_ == null ?
            com.google.protobuf.Timestamp.getDefaultInstance() : occurredAt_;
      }
    }
    /**
     * <code>.google.protobuf.Timestamp occurred_at = 3 [json_name = "occurredAt"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
        getOccurredAtFieldBuilder() {
      if (occurredAtBuilder_ == null) {
        occurredAtBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                getOccurredAt(),
                getParentForChildren(),
                isClean());
        occurredAt_ = null;
      }
      return occurredAtBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:com.hearlers.v1.message.UserUpdatedPayload)
  }

  // @@protoc_insertion_point(class_scope:com.hearlers.v1.message.UserUpdatedPayload)
  private static final com.com.hearlers.v1.message.UserUpdatedPayload DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.com.hearlers.v1.message.UserUpdatedPayload();
  }

  public static com.com.hearlers.v1.message.UserUpdatedPayload getDefaultInstance() {
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
  public com.com.hearlers.v1.message.UserUpdatedPayload getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
