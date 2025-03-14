// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/user.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

/**
 * Protobuf type {@code com.hearlers.v1.service.InitializeUserResponse}
 */
public final class InitializeUserResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.hearlers.v1.service.InitializeUserResponse)
    InitializeUserResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      InitializeUserResponse.class.getName());
  }
  // Use InitializeUserResponse.newBuilder() to construct.
  private InitializeUserResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private InitializeUserResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hearlers.api.proto.v1.service.User.internal_static_com_hearlers_v1_service_InitializeUserResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hearlers.api.proto.v1.service.User.internal_static_com_hearlers_v1_service_InitializeUserResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hearlers.api.proto.v1.service.InitializeUserResponse.class, com.hearlers.api.proto.v1.service.InitializeUserResponse.Builder.class);
  }

  private int bitField0_;
  public static final int USER_FIELD_NUMBER = 1;
  private com.hearlers.api.proto.v1.model.User user_;
  /**
   * <code>.com.hearlers.v1.model.User user = 1 [json_name = "user"];</code>
   * @return Whether the user field is set.
   */
  @java.lang.Override
  public boolean hasUser() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.com.hearlers.v1.model.User user = 1 [json_name = "user"];</code>
   * @return The user.
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.User getUser() {
    return user_ == null ? com.hearlers.api.proto.v1.model.User.getDefaultInstance() : user_;
  }
  /**
   * <code>.com.hearlers.v1.model.User user = 1 [json_name = "user"];</code>
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.UserOrBuilder getUserOrBuilder() {
    return user_ == null ? com.hearlers.api.proto.v1.model.User.getDefaultInstance() : user_;
  }

  public static final int AUTH_USER_FIELD_NUMBER = 2;
  private com.hearlers.api.proto.v1.model.AuthUser authUser_;
  /**
   * <code>.com.hearlers.v1.model.AuthUser auth_user = 2 [json_name = "authUser"];</code>
   * @return Whether the authUser field is set.
   */
  @java.lang.Override
  public boolean hasAuthUser() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.com.hearlers.v1.model.AuthUser auth_user = 2 [json_name = "authUser"];</code>
   * @return The authUser.
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.AuthUser getAuthUser() {
    return authUser_ == null ? com.hearlers.api.proto.v1.model.AuthUser.getDefaultInstance() : authUser_;
  }
  /**
   * <code>.com.hearlers.v1.model.AuthUser auth_user = 2 [json_name = "authUser"];</code>
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.AuthUserOrBuilder getAuthUserOrBuilder() {
    return authUser_ == null ? com.hearlers.api.proto.v1.model.AuthUser.getDefaultInstance() : authUser_;
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
      output.writeMessage(1, getUser());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getAuthUser());
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
        .computeMessageSize(1, getUser());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getAuthUser());
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
    if (!(obj instanceof com.hearlers.api.proto.v1.service.InitializeUserResponse)) {
      return super.equals(obj);
    }
    com.hearlers.api.proto.v1.service.InitializeUserResponse other = (com.hearlers.api.proto.v1.service.InitializeUserResponse) obj;

    if (hasUser() != other.hasUser()) return false;
    if (hasUser()) {
      if (!getUser()
          .equals(other.getUser())) return false;
    }
    if (hasAuthUser() != other.hasAuthUser()) return false;
    if (hasAuthUser()) {
      if (!getAuthUser()
          .equals(other.getAuthUser())) return false;
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
    if (hasUser()) {
      hash = (37 * hash) + USER_FIELD_NUMBER;
      hash = (53 * hash) + getUser().hashCode();
    }
    if (hasAuthUser()) {
      hash = (37 * hash) + AUTH_USER_FIELD_NUMBER;
      hash = (53 * hash) + getAuthUser().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hearlers.api.proto.v1.service.InitializeUserResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.InitializeUserResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.InitializeUserResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.InitializeUserResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.InitializeUserResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.InitializeUserResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.InitializeUserResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.InitializeUserResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.hearlers.api.proto.v1.service.InitializeUserResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.hearlers.api.proto.v1.service.InitializeUserResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.InitializeUserResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.InitializeUserResponse parseFrom(
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
  public static Builder newBuilder(com.hearlers.api.proto.v1.service.InitializeUserResponse prototype) {
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
   * Protobuf type {@code com.hearlers.v1.service.InitializeUserResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hearlers.v1.service.InitializeUserResponse)
      com.hearlers.api.proto.v1.service.InitializeUserResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hearlers.api.proto.v1.service.User.internal_static_com_hearlers_v1_service_InitializeUserResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hearlers.api.proto.v1.service.User.internal_static_com_hearlers_v1_service_InitializeUserResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hearlers.api.proto.v1.service.InitializeUserResponse.class, com.hearlers.api.proto.v1.service.InitializeUserResponse.Builder.class);
    }

    // Construct using com.hearlers.api.proto.v1.service.InitializeUserResponse.newBuilder()
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
        getUserFieldBuilder();
        getAuthUserFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      user_ = null;
      if (userBuilder_ != null) {
        userBuilder_.dispose();
        userBuilder_ = null;
      }
      authUser_ = null;
      if (authUserBuilder_ != null) {
        authUserBuilder_.dispose();
        authUserBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hearlers.api.proto.v1.service.User.internal_static_com_hearlers_v1_service_InitializeUserResponse_descriptor;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.InitializeUserResponse getDefaultInstanceForType() {
      return com.hearlers.api.proto.v1.service.InitializeUserResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.InitializeUserResponse build() {
      com.hearlers.api.proto.v1.service.InitializeUserResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.InitializeUserResponse buildPartial() {
      com.hearlers.api.proto.v1.service.InitializeUserResponse result = new com.hearlers.api.proto.v1.service.InitializeUserResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.hearlers.api.proto.v1.service.InitializeUserResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.user_ = userBuilder_ == null
            ? user_
            : userBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.authUser_ = authUserBuilder_ == null
            ? authUser_
            : authUserBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hearlers.api.proto.v1.service.InitializeUserResponse) {
        return mergeFrom((com.hearlers.api.proto.v1.service.InitializeUserResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hearlers.api.proto.v1.service.InitializeUserResponse other) {
      if (other == com.hearlers.api.proto.v1.service.InitializeUserResponse.getDefaultInstance()) return this;
      if (other.hasUser()) {
        mergeUser(other.getUser());
      }
      if (other.hasAuthUser()) {
        mergeAuthUser(other.getAuthUser());
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
                  getUserFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getAuthUserFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private com.hearlers.api.proto.v1.model.User user_;
    private com.google.protobuf.SingleFieldBuilder<
        com.hearlers.api.proto.v1.model.User, com.hearlers.api.proto.v1.model.User.Builder, com.hearlers.api.proto.v1.model.UserOrBuilder> userBuilder_;
    /**
     * <code>.com.hearlers.v1.model.User user = 1 [json_name = "user"];</code>
     * @return Whether the user field is set.
     */
    public boolean hasUser() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.com.hearlers.v1.model.User user = 1 [json_name = "user"];</code>
     * @return The user.
     */
    public com.hearlers.api.proto.v1.model.User getUser() {
      if (userBuilder_ == null) {
        return user_ == null ? com.hearlers.api.proto.v1.model.User.getDefaultInstance() : user_;
      } else {
        return userBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.hearlers.v1.model.User user = 1 [json_name = "user"];</code>
     */
    public Builder setUser(com.hearlers.api.proto.v1.model.User value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        user_ = value;
      } else {
        userBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.User user = 1 [json_name = "user"];</code>
     */
    public Builder setUser(
        com.hearlers.api.proto.v1.model.User.Builder builderForValue) {
      if (userBuilder_ == null) {
        user_ = builderForValue.build();
      } else {
        userBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.User user = 1 [json_name = "user"];</code>
     */
    public Builder mergeUser(com.hearlers.api.proto.v1.model.User value) {
      if (userBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          user_ != null &&
          user_ != com.hearlers.api.proto.v1.model.User.getDefaultInstance()) {
          getUserBuilder().mergeFrom(value);
        } else {
          user_ = value;
        }
      } else {
        userBuilder_.mergeFrom(value);
      }
      if (user_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.User user = 1 [json_name = "user"];</code>
     */
    public Builder clearUser() {
      bitField0_ = (bitField0_ & ~0x00000001);
      user_ = null;
      if (userBuilder_ != null) {
        userBuilder_.dispose();
        userBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.User user = 1 [json_name = "user"];</code>
     */
    public com.hearlers.api.proto.v1.model.User.Builder getUserBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getUserFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.hearlers.v1.model.User user = 1 [json_name = "user"];</code>
     */
    public com.hearlers.api.proto.v1.model.UserOrBuilder getUserOrBuilder() {
      if (userBuilder_ != null) {
        return userBuilder_.getMessageOrBuilder();
      } else {
        return user_ == null ?
            com.hearlers.api.proto.v1.model.User.getDefaultInstance() : user_;
      }
    }
    /**
     * <code>.com.hearlers.v1.model.User user = 1 [json_name = "user"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.hearlers.api.proto.v1.model.User, com.hearlers.api.proto.v1.model.User.Builder, com.hearlers.api.proto.v1.model.UserOrBuilder> 
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        userBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.hearlers.api.proto.v1.model.User, com.hearlers.api.proto.v1.model.User.Builder, com.hearlers.api.proto.v1.model.UserOrBuilder>(
                getUser(),
                getParentForChildren(),
                isClean());
        user_ = null;
      }
      return userBuilder_;
    }

    private com.hearlers.api.proto.v1.model.AuthUser authUser_;
    private com.google.protobuf.SingleFieldBuilder<
        com.hearlers.api.proto.v1.model.AuthUser, com.hearlers.api.proto.v1.model.AuthUser.Builder, com.hearlers.api.proto.v1.model.AuthUserOrBuilder> authUserBuilder_;
    /**
     * <code>.com.hearlers.v1.model.AuthUser auth_user = 2 [json_name = "authUser"];</code>
     * @return Whether the authUser field is set.
     */
    public boolean hasAuthUser() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.com.hearlers.v1.model.AuthUser auth_user = 2 [json_name = "authUser"];</code>
     * @return The authUser.
     */
    public com.hearlers.api.proto.v1.model.AuthUser getAuthUser() {
      if (authUserBuilder_ == null) {
        return authUser_ == null ? com.hearlers.api.proto.v1.model.AuthUser.getDefaultInstance() : authUser_;
      } else {
        return authUserBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.hearlers.v1.model.AuthUser auth_user = 2 [json_name = "authUser"];</code>
     */
    public Builder setAuthUser(com.hearlers.api.proto.v1.model.AuthUser value) {
      if (authUserBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        authUser_ = value;
      } else {
        authUserBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.AuthUser auth_user = 2 [json_name = "authUser"];</code>
     */
    public Builder setAuthUser(
        com.hearlers.api.proto.v1.model.AuthUser.Builder builderForValue) {
      if (authUserBuilder_ == null) {
        authUser_ = builderForValue.build();
      } else {
        authUserBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.AuthUser auth_user = 2 [json_name = "authUser"];</code>
     */
    public Builder mergeAuthUser(com.hearlers.api.proto.v1.model.AuthUser value) {
      if (authUserBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          authUser_ != null &&
          authUser_ != com.hearlers.api.proto.v1.model.AuthUser.getDefaultInstance()) {
          getAuthUserBuilder().mergeFrom(value);
        } else {
          authUser_ = value;
        }
      } else {
        authUserBuilder_.mergeFrom(value);
      }
      if (authUser_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.AuthUser auth_user = 2 [json_name = "authUser"];</code>
     */
    public Builder clearAuthUser() {
      bitField0_ = (bitField0_ & ~0x00000002);
      authUser_ = null;
      if (authUserBuilder_ != null) {
        authUserBuilder_.dispose();
        authUserBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.AuthUser auth_user = 2 [json_name = "authUser"];</code>
     */
    public com.hearlers.api.proto.v1.model.AuthUser.Builder getAuthUserBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAuthUserFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.hearlers.v1.model.AuthUser auth_user = 2 [json_name = "authUser"];</code>
     */
    public com.hearlers.api.proto.v1.model.AuthUserOrBuilder getAuthUserOrBuilder() {
      if (authUserBuilder_ != null) {
        return authUserBuilder_.getMessageOrBuilder();
      } else {
        return authUser_ == null ?
            com.hearlers.api.proto.v1.model.AuthUser.getDefaultInstance() : authUser_;
      }
    }
    /**
     * <code>.com.hearlers.v1.model.AuthUser auth_user = 2 [json_name = "authUser"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.hearlers.api.proto.v1.model.AuthUser, com.hearlers.api.proto.v1.model.AuthUser.Builder, com.hearlers.api.proto.v1.model.AuthUserOrBuilder> 
        getAuthUserFieldBuilder() {
      if (authUserBuilder_ == null) {
        authUserBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.hearlers.api.proto.v1.model.AuthUser, com.hearlers.api.proto.v1.model.AuthUser.Builder, com.hearlers.api.proto.v1.model.AuthUserOrBuilder>(
                getAuthUser(),
                getParentForChildren(),
                isClean());
        authUser_ = null;
      }
      return authUserBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:com.hearlers.v1.service.InitializeUserResponse)
  }

  // @@protoc_insertion_point(class_scope:com.hearlers.v1.service.InitializeUserResponse)
  private static final com.hearlers.api.proto.v1.service.InitializeUserResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hearlers.api.proto.v1.service.InitializeUserResponse();
  }

  public static com.hearlers.api.proto.v1.service.InitializeUserResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InitializeUserResponse>
      PARSER = new com.google.protobuf.AbstractParser<InitializeUserResponse>() {
    @java.lang.Override
    public InitializeUserResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<InitializeUserResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InitializeUserResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hearlers.api.proto.v1.service.InitializeUserResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

