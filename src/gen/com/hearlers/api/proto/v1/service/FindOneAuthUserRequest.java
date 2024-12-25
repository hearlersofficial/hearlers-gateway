// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: v1/service/user.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

/**
 * <pre>
 * findOneAuthUser
 * </pre>
 *
 * Protobuf type {@code com.hearlers.v1.service.FindOneAuthUserRequest}
 */
public final class FindOneAuthUserRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.hearlers.v1.service.FindOneAuthUserRequest)
    FindOneAuthUserRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      FindOneAuthUserRequest.class.getName());
  }
  // Use FindOneAuthUserRequest.newBuilder() to construct.
  private FindOneAuthUserRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private FindOneAuthUserRequest() {
    authChannel_ = 0;
    uniqueId_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hearlers.api.proto.v1.service.User.internal_static_com_hearlers_v1_service_FindOneAuthUserRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hearlers.api.proto.v1.service.User.internal_static_com_hearlers_v1_service_FindOneAuthUserRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hearlers.api.proto.v1.service.FindOneAuthUserRequest.class, com.hearlers.api.proto.v1.service.FindOneAuthUserRequest.Builder.class);
  }

  private int bitField0_;
  public static final int AUTH_USER_ID_FIELD_NUMBER = 1;
  private int authUserId_ = 0;
  /**
   * <code>optional int32 auth_user_id = 1 [json_name = "authUserId"];</code>
   * @return Whether the authUserId field is set.
   */
  @java.lang.Override
  public boolean hasAuthUserId() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int32 auth_user_id = 1 [json_name = "authUserId"];</code>
   * @return The authUserId.
   */
  @java.lang.Override
  public int getAuthUserId() {
    return authUserId_;
  }

  public static final int USER_ID_FIELD_NUMBER = 2;
  private int userId_ = 0;
  /**
   * <code>optional int32 user_id = 2 [json_name = "userId"];</code>
   * @return Whether the userId field is set.
   */
  @java.lang.Override
  public boolean hasUserId() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional int32 user_id = 2 [json_name = "userId"];</code>
   * @return The userId.
   */
  @java.lang.Override
  public int getUserId() {
    return userId_;
  }

  public static final int AUTH_CHANNEL_FIELD_NUMBER = 3;
  private int authChannel_ = 0;
  /**
   * <code>optional .com.hearlers.v1.model.AuthChannel auth_channel = 3 [json_name = "authChannel"];</code>
   * @return Whether the authChannel field is set.
   */
  @java.lang.Override public boolean hasAuthChannel() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional .com.hearlers.v1.model.AuthChannel auth_channel = 3 [json_name = "authChannel"];</code>
   * @return The enum numeric value on the wire for authChannel.
   */
  @java.lang.Override public int getAuthChannelValue() {
    return authChannel_;
  }
  /**
   * <code>optional .com.hearlers.v1.model.AuthChannel auth_channel = 3 [json_name = "authChannel"];</code>
   * @return The authChannel.
   */
  @java.lang.Override public com.hearlers.api.proto.v1.model.AuthChannel getAuthChannel() {
    com.hearlers.api.proto.v1.model.AuthChannel result = com.hearlers.api.proto.v1.model.AuthChannel.forNumber(authChannel_);
    return result == null ? com.hearlers.api.proto.v1.model.AuthChannel.UNRECOGNIZED : result;
  }

  public static final int UNIQUE_ID_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object uniqueId_ = "";
  /**
   * <code>optional string unique_id = 4 [json_name = "uniqueId"];</code>
   * @return Whether the uniqueId field is set.
   */
  @java.lang.Override
  public boolean hasUniqueId() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>optional string unique_id = 4 [json_name = "uniqueId"];</code>
   * @return The uniqueId.
   */
  @java.lang.Override
  public java.lang.String getUniqueId() {
    java.lang.Object ref = uniqueId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uniqueId_ = s;
      return s;
    }
  }
  /**
   * <code>optional string unique_id = 4 [json_name = "uniqueId"];</code>
   * @return The bytes for uniqueId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUniqueIdBytes() {
    java.lang.Object ref = uniqueId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uniqueId_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(1, authUserId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(2, userId_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeEnum(3, authChannel_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 4, uniqueId_);
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
        .computeInt32Size(1, authUserId_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, userId_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, authChannel_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(4, uniqueId_);
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
    if (!(obj instanceof com.hearlers.api.proto.v1.service.FindOneAuthUserRequest)) {
      return super.equals(obj);
    }
    com.hearlers.api.proto.v1.service.FindOneAuthUserRequest other = (com.hearlers.api.proto.v1.service.FindOneAuthUserRequest) obj;

    if (hasAuthUserId() != other.hasAuthUserId()) return false;
    if (hasAuthUserId()) {
      if (getAuthUserId()
          != other.getAuthUserId()) return false;
    }
    if (hasUserId() != other.hasUserId()) return false;
    if (hasUserId()) {
      if (getUserId()
          != other.getUserId()) return false;
    }
    if (hasAuthChannel() != other.hasAuthChannel()) return false;
    if (hasAuthChannel()) {
      if (authChannel_ != other.authChannel_) return false;
    }
    if (hasUniqueId() != other.hasUniqueId()) return false;
    if (hasUniqueId()) {
      if (!getUniqueId()
          .equals(other.getUniqueId())) return false;
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
    if (hasAuthUserId()) {
      hash = (37 * hash) + AUTH_USER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getAuthUserId();
    }
    if (hasUserId()) {
      hash = (37 * hash) + USER_ID_FIELD_NUMBER;
      hash = (53 * hash) + getUserId();
    }
    if (hasAuthChannel()) {
      hash = (37 * hash) + AUTH_CHANNEL_FIELD_NUMBER;
      hash = (53 * hash) + authChannel_;
    }
    if (hasUniqueId()) {
      hash = (37 * hash) + UNIQUE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getUniqueId().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hearlers.api.proto.v1.service.FindOneAuthUserRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindOneAuthUserRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindOneAuthUserRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindOneAuthUserRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindOneAuthUserRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindOneAuthUserRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindOneAuthUserRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.FindOneAuthUserRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.hearlers.api.proto.v1.service.FindOneAuthUserRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.hearlers.api.proto.v1.service.FindOneAuthUserRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindOneAuthUserRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.FindOneAuthUserRequest parseFrom(
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
  public static Builder newBuilder(com.hearlers.api.proto.v1.service.FindOneAuthUserRequest prototype) {
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
   * findOneAuthUser
   * </pre>
   *
   * Protobuf type {@code com.hearlers.v1.service.FindOneAuthUserRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hearlers.v1.service.FindOneAuthUserRequest)
      com.hearlers.api.proto.v1.service.FindOneAuthUserRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hearlers.api.proto.v1.service.User.internal_static_com_hearlers_v1_service_FindOneAuthUserRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hearlers.api.proto.v1.service.User.internal_static_com_hearlers_v1_service_FindOneAuthUserRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hearlers.api.proto.v1.service.FindOneAuthUserRequest.class, com.hearlers.api.proto.v1.service.FindOneAuthUserRequest.Builder.class);
    }

    // Construct using com.hearlers.api.proto.v1.service.FindOneAuthUserRequest.newBuilder()
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
      authUserId_ = 0;
      userId_ = 0;
      authChannel_ = 0;
      uniqueId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hearlers.api.proto.v1.service.User.internal_static_com_hearlers_v1_service_FindOneAuthUserRequest_descriptor;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindOneAuthUserRequest getDefaultInstanceForType() {
      return com.hearlers.api.proto.v1.service.FindOneAuthUserRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindOneAuthUserRequest build() {
      com.hearlers.api.proto.v1.service.FindOneAuthUserRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindOneAuthUserRequest buildPartial() {
      com.hearlers.api.proto.v1.service.FindOneAuthUserRequest result = new com.hearlers.api.proto.v1.service.FindOneAuthUserRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.hearlers.api.proto.v1.service.FindOneAuthUserRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.authUserId_ = authUserId_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.userId_ = userId_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.authChannel_ = authChannel_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.uniqueId_ = uniqueId_;
        to_bitField0_ |= 0x00000008;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hearlers.api.proto.v1.service.FindOneAuthUserRequest) {
        return mergeFrom((com.hearlers.api.proto.v1.service.FindOneAuthUserRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hearlers.api.proto.v1.service.FindOneAuthUserRequest other) {
      if (other == com.hearlers.api.proto.v1.service.FindOneAuthUserRequest.getDefaultInstance()) return this;
      if (other.hasAuthUserId()) {
        setAuthUserId(other.getAuthUserId());
      }
      if (other.hasUserId()) {
        setUserId(other.getUserId());
      }
      if (other.hasAuthChannel()) {
        setAuthChannel(other.getAuthChannel());
      }
      if (other.hasUniqueId()) {
        uniqueId_ = other.uniqueId_;
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
              authUserId_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              userId_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              authChannel_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              uniqueId_ = input.readStringRequireUtf8();
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

    private int authUserId_ ;
    /**
     * <code>optional int32 auth_user_id = 1 [json_name = "authUserId"];</code>
     * @return Whether the authUserId field is set.
     */
    @java.lang.Override
    public boolean hasAuthUserId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int32 auth_user_id = 1 [json_name = "authUserId"];</code>
     * @return The authUserId.
     */
    @java.lang.Override
    public int getAuthUserId() {
      return authUserId_;
    }
    /**
     * <code>optional int32 auth_user_id = 1 [json_name = "authUserId"];</code>
     * @param value The authUserId to set.
     * @return This builder for chaining.
     */
    public Builder setAuthUserId(int value) {

      authUserId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 auth_user_id = 1 [json_name = "authUserId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAuthUserId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      authUserId_ = 0;
      onChanged();
      return this;
    }

    private int userId_ ;
    /**
     * <code>optional int32 user_id = 2 [json_name = "userId"];</code>
     * @return Whether the userId field is set.
     */
    @java.lang.Override
    public boolean hasUserId() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int32 user_id = 2 [json_name = "userId"];</code>
     * @return The userId.
     */
    @java.lang.Override
    public int getUserId() {
      return userId_;
    }
    /**
     * <code>optional int32 user_id = 2 [json_name = "userId"];</code>
     * @param value The userId to set.
     * @return This builder for chaining.
     */
    public Builder setUserId(int value) {

      userId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional int32 user_id = 2 [json_name = "userId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      userId_ = 0;
      onChanged();
      return this;
    }

    private int authChannel_ = 0;
    /**
     * <code>optional .com.hearlers.v1.model.AuthChannel auth_channel = 3 [json_name = "authChannel"];</code>
     * @return Whether the authChannel field is set.
     */
    @java.lang.Override public boolean hasAuthChannel() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional .com.hearlers.v1.model.AuthChannel auth_channel = 3 [json_name = "authChannel"];</code>
     * @return The enum numeric value on the wire for authChannel.
     */
    @java.lang.Override public int getAuthChannelValue() {
      return authChannel_;
    }
    /**
     * <code>optional .com.hearlers.v1.model.AuthChannel auth_channel = 3 [json_name = "authChannel"];</code>
     * @param value The enum numeric value on the wire for authChannel to set.
     * @return This builder for chaining.
     */
    public Builder setAuthChannelValue(int value) {
      authChannel_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional .com.hearlers.v1.model.AuthChannel auth_channel = 3 [json_name = "authChannel"];</code>
     * @return The authChannel.
     */
    @java.lang.Override
    public com.hearlers.api.proto.v1.model.AuthChannel getAuthChannel() {
      com.hearlers.api.proto.v1.model.AuthChannel result = com.hearlers.api.proto.v1.model.AuthChannel.forNumber(authChannel_);
      return result == null ? com.hearlers.api.proto.v1.model.AuthChannel.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .com.hearlers.v1.model.AuthChannel auth_channel = 3 [json_name = "authChannel"];</code>
     * @param value The authChannel to set.
     * @return This builder for chaining.
     */
    public Builder setAuthChannel(com.hearlers.api.proto.v1.model.AuthChannel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      authChannel_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .com.hearlers.v1.model.AuthChannel auth_channel = 3 [json_name = "authChannel"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAuthChannel() {
      bitField0_ = (bitField0_ & ~0x00000004);
      authChannel_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object uniqueId_ = "";
    /**
     * <code>optional string unique_id = 4 [json_name = "uniqueId"];</code>
     * @return Whether the uniqueId field is set.
     */
    public boolean hasUniqueId() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional string unique_id = 4 [json_name = "uniqueId"];</code>
     * @return The uniqueId.
     */
    public java.lang.String getUniqueId() {
      java.lang.Object ref = uniqueId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uniqueId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string unique_id = 4 [json_name = "uniqueId"];</code>
     * @return The bytes for uniqueId.
     */
    public com.google.protobuf.ByteString
        getUniqueIdBytes() {
      java.lang.Object ref = uniqueId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uniqueId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string unique_id = 4 [json_name = "uniqueId"];</code>
     * @param value The uniqueId to set.
     * @return This builder for chaining.
     */
    public Builder setUniqueId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      uniqueId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>optional string unique_id = 4 [json_name = "uniqueId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUniqueId() {
      uniqueId_ = getDefaultInstance().getUniqueId();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>optional string unique_id = 4 [json_name = "uniqueId"];</code>
     * @param value The bytes for uniqueId to set.
     * @return This builder for chaining.
     */
    public Builder setUniqueIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      uniqueId_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:com.hearlers.v1.service.FindOneAuthUserRequest)
  }

  // @@protoc_insertion_point(class_scope:com.hearlers.v1.service.FindOneAuthUserRequest)
  private static final com.hearlers.api.proto.v1.service.FindOneAuthUserRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hearlers.api.proto.v1.service.FindOneAuthUserRequest();
  }

  public static com.hearlers.api.proto.v1.service.FindOneAuthUserRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FindOneAuthUserRequest>
      PARSER = new com.google.protobuf.AbstractParser<FindOneAuthUserRequest>() {
    @java.lang.Override
    public FindOneAuthUserRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<FindOneAuthUserRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FindOneAuthUserRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hearlers.api.proto.v1.service.FindOneAuthUserRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
