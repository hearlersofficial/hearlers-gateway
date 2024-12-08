// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: v1/service/user.proto
// Protobuf Java Version: 4.29.0

package com.com.hearlers.v1.service;

/**
 * <pre>
 * createActivity
 * </pre>
 *
 * Protobuf type {@code com.hearlers.v1.service.CreateActivityRequest}
 */
public final class CreateActivityRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.hearlers.v1.service.CreateActivityRequest)
    CreateActivityRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 0,
      /* suffix= */ "",
      CreateActivityRequest.class.getName());
  }
  // Use CreateActivityRequest.newBuilder() to construct.
  private CreateActivityRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CreateActivityRequest() {
    activityType_ = 0;
    platform_ = 0;
    ipAddress_ = "";
    userAgent_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.com.hearlers.v1.service.UserProto.internal_static_com_hearlers_v1_service_CreateActivityRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.com.hearlers.v1.service.UserProto.internal_static_com_hearlers_v1_service_CreateActivityRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.com.hearlers.v1.service.CreateActivityRequest.class, com.com.hearlers.v1.service.CreateActivityRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ACTIVITY_TYPE_FIELD_NUMBER = 1;
  private int activityType_ = 0;
  /**
   * <code>.com.hearlers.v1.model.ActivityType activity_type = 1 [json_name = "activityType"];</code>
   * @return The enum numeric value on the wire for activityType.
   */
  @java.lang.Override public int getActivityTypeValue() {
    return activityType_;
  }
  /**
   * <code>.com.hearlers.v1.model.ActivityType activity_type = 1 [json_name = "activityType"];</code>
   * @return The activityType.
   */
  @java.lang.Override public com.com.hearlers.v1.model.ActivityType getActivityType() {
    com.com.hearlers.v1.model.ActivityType result = com.com.hearlers.v1.model.ActivityType.forNumber(activityType_);
    return result == null ? com.com.hearlers.v1.model.ActivityType.UNRECOGNIZED : result;
  }

  public static final int ACTIVITY_DATA_FIELD_NUMBER = 2;
  private com.google.protobuf.Struct activityData_;
  /**
   * <code>.google.protobuf.Struct activity_data = 2 [json_name = "activityData"];</code>
   * @return Whether the activityData field is set.
   */
  @java.lang.Override
  public boolean hasActivityData() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.google.protobuf.Struct activity_data = 2 [json_name = "activityData"];</code>
   * @return The activityData.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getActivityData() {
    return activityData_ == null ? com.google.protobuf.Struct.getDefaultInstance() : activityData_;
  }
  /**
   * <code>.google.protobuf.Struct activity_data = 2 [json_name = "activityData"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getActivityDataOrBuilder() {
    return activityData_ == null ? com.google.protobuf.Struct.getDefaultInstance() : activityData_;
  }

  public static final int PLATFORM_FIELD_NUMBER = 3;
  private int platform_ = 0;
  /**
   * <code>.com.hearlers.v1.model.DevicePlatform platform = 3 [json_name = "platform"];</code>
   * @return The enum numeric value on the wire for platform.
   */
  @java.lang.Override public int getPlatformValue() {
    return platform_;
  }
  /**
   * <code>.com.hearlers.v1.model.DevicePlatform platform = 3 [json_name = "platform"];</code>
   * @return The platform.
   */
  @java.lang.Override public com.com.hearlers.v1.model.DevicePlatform getPlatform() {
    com.com.hearlers.v1.model.DevicePlatform result = com.com.hearlers.v1.model.DevicePlatform.forNumber(platform_);
    return result == null ? com.com.hearlers.v1.model.DevicePlatform.UNRECOGNIZED : result;
  }

  public static final int IP_ADDRESS_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object ipAddress_ = "";
  /**
   * <code>string ip_address = 4 [json_name = "ipAddress"];</code>
   * @return The ipAddress.
   */
  @java.lang.Override
  public java.lang.String getIpAddress() {
    java.lang.Object ref = ipAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ipAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string ip_address = 4 [json_name = "ipAddress"];</code>
   * @return The bytes for ipAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIpAddressBytes() {
    java.lang.Object ref = ipAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ipAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int USER_AGENT_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object userAgent_ = "";
  /**
   * <code>string user_agent = 5 [json_name = "userAgent"];</code>
   * @return The userAgent.
   */
  @java.lang.Override
  public java.lang.String getUserAgent() {
    java.lang.Object ref = userAgent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userAgent_ = s;
      return s;
    }
  }
  /**
   * <code>string user_agent = 5 [json_name = "userAgent"];</code>
   * @return The bytes for userAgent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUserAgentBytes() {
    java.lang.Object ref = userAgent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userAgent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DURATION_SECONDS_FIELD_NUMBER = 6;
  private int durationSeconds_ = 0;
  /**
   * <code>int32 duration_seconds = 6 [json_name = "durationSeconds"];</code>
   * @return The durationSeconds.
   */
  @java.lang.Override
  public int getDurationSeconds() {
    return durationSeconds_;
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
    if (activityType_ != com.com.hearlers.v1.model.ActivityType.ACTIVITY_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, activityType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getActivityData());
    }
    if (platform_ != com.com.hearlers.v1.model.DevicePlatform.DEVICE_PLATFORM_UNSPECIFIED.getNumber()) {
      output.writeEnum(3, platform_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(ipAddress_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 4, ipAddress_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(userAgent_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 5, userAgent_);
    }
    if (durationSeconds_ != 0) {
      output.writeInt32(6, durationSeconds_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (activityType_ != com.com.hearlers.v1.model.ActivityType.ACTIVITY_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, activityType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getActivityData());
    }
    if (platform_ != com.com.hearlers.v1.model.DevicePlatform.DEVICE_PLATFORM_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, platform_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(ipAddress_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(4, ipAddress_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(userAgent_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(5, userAgent_);
    }
    if (durationSeconds_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, durationSeconds_);
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
    if (!(obj instanceof com.com.hearlers.v1.service.CreateActivityRequest)) {
      return super.equals(obj);
    }
    com.com.hearlers.v1.service.CreateActivityRequest other = (com.com.hearlers.v1.service.CreateActivityRequest) obj;

    if (activityType_ != other.activityType_) return false;
    if (hasActivityData() != other.hasActivityData()) return false;
    if (hasActivityData()) {
      if (!getActivityData()
          .equals(other.getActivityData())) return false;
    }
    if (platform_ != other.platform_) return false;
    if (!getIpAddress()
        .equals(other.getIpAddress())) return false;
    if (!getUserAgent()
        .equals(other.getUserAgent())) return false;
    if (getDurationSeconds()
        != other.getDurationSeconds()) return false;
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
    hash = (37 * hash) + ACTIVITY_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + activityType_;
    if (hasActivityData()) {
      hash = (37 * hash) + ACTIVITY_DATA_FIELD_NUMBER;
      hash = (53 * hash) + getActivityData().hashCode();
    }
    hash = (37 * hash) + PLATFORM_FIELD_NUMBER;
    hash = (53 * hash) + platform_;
    hash = (37 * hash) + IP_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getIpAddress().hashCode();
    hash = (37 * hash) + USER_AGENT_FIELD_NUMBER;
    hash = (53 * hash) + getUserAgent().hashCode();
    hash = (37 * hash) + DURATION_SECONDS_FIELD_NUMBER;
    hash = (53 * hash) + getDurationSeconds();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.com.hearlers.v1.service.CreateActivityRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.com.hearlers.v1.service.CreateActivityRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.com.hearlers.v1.service.CreateActivityRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.com.hearlers.v1.service.CreateActivityRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.com.hearlers.v1.service.CreateActivityRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.com.hearlers.v1.service.CreateActivityRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.com.hearlers.v1.service.CreateActivityRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.com.hearlers.v1.service.CreateActivityRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.com.hearlers.v1.service.CreateActivityRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.com.hearlers.v1.service.CreateActivityRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.com.hearlers.v1.service.CreateActivityRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.com.hearlers.v1.service.CreateActivityRequest parseFrom(
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
  public static Builder newBuilder(com.com.hearlers.v1.service.CreateActivityRequest prototype) {
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
   * createActivity
   * </pre>
   *
   * Protobuf type {@code com.hearlers.v1.service.CreateActivityRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hearlers.v1.service.CreateActivityRequest)
      com.com.hearlers.v1.service.CreateActivityRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.com.hearlers.v1.service.UserProto.internal_static_com_hearlers_v1_service_CreateActivityRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.com.hearlers.v1.service.UserProto.internal_static_com_hearlers_v1_service_CreateActivityRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.com.hearlers.v1.service.CreateActivityRequest.class, com.com.hearlers.v1.service.CreateActivityRequest.Builder.class);
    }

    // Construct using com.com.hearlers.v1.service.CreateActivityRequest.newBuilder()
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
        getActivityDataFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      activityType_ = 0;
      activityData_ = null;
      if (activityDataBuilder_ != null) {
        activityDataBuilder_.dispose();
        activityDataBuilder_ = null;
      }
      platform_ = 0;
      ipAddress_ = "";
      userAgent_ = "";
      durationSeconds_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.com.hearlers.v1.service.UserProto.internal_static_com_hearlers_v1_service_CreateActivityRequest_descriptor;
    }

    @java.lang.Override
    public com.com.hearlers.v1.service.CreateActivityRequest getDefaultInstanceForType() {
      return com.com.hearlers.v1.service.CreateActivityRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.com.hearlers.v1.service.CreateActivityRequest build() {
      com.com.hearlers.v1.service.CreateActivityRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.com.hearlers.v1.service.CreateActivityRequest buildPartial() {
      com.com.hearlers.v1.service.CreateActivityRequest result = new com.com.hearlers.v1.service.CreateActivityRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.com.hearlers.v1.service.CreateActivityRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.activityType_ = activityType_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.activityData_ = activityDataBuilder_ == null
            ? activityData_
            : activityDataBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.platform_ = platform_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.ipAddress_ = ipAddress_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.userAgent_ = userAgent_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.durationSeconds_ = durationSeconds_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.com.hearlers.v1.service.CreateActivityRequest) {
        return mergeFrom((com.com.hearlers.v1.service.CreateActivityRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.com.hearlers.v1.service.CreateActivityRequest other) {
      if (other == com.com.hearlers.v1.service.CreateActivityRequest.getDefaultInstance()) return this;
      if (other.activityType_ != 0) {
        setActivityTypeValue(other.getActivityTypeValue());
      }
      if (other.hasActivityData()) {
        mergeActivityData(other.getActivityData());
      }
      if (other.platform_ != 0) {
        setPlatformValue(other.getPlatformValue());
      }
      if (!other.getIpAddress().isEmpty()) {
        ipAddress_ = other.ipAddress_;
        bitField0_ |= 0x00000008;
        onChanged();
      }
      if (!other.getUserAgent().isEmpty()) {
        userAgent_ = other.userAgent_;
        bitField0_ |= 0x00000010;
        onChanged();
      }
      if (other.getDurationSeconds() != 0) {
        setDurationSeconds(other.getDurationSeconds());
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
              activityType_ = input.readEnum();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getActivityDataFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              platform_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 34: {
              ipAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 42: {
              userAgent_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 48: {
              durationSeconds_ = input.readInt32();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
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

    private int activityType_ = 0;
    /**
     * <code>.com.hearlers.v1.model.ActivityType activity_type = 1 [json_name = "activityType"];</code>
     * @return The enum numeric value on the wire for activityType.
     */
    @java.lang.Override public int getActivityTypeValue() {
      return activityType_;
    }
    /**
     * <code>.com.hearlers.v1.model.ActivityType activity_type = 1 [json_name = "activityType"];</code>
     * @param value The enum numeric value on the wire for activityType to set.
     * @return This builder for chaining.
     */
    public Builder setActivityTypeValue(int value) {
      activityType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.ActivityType activity_type = 1 [json_name = "activityType"];</code>
     * @return The activityType.
     */
    @java.lang.Override
    public com.com.hearlers.v1.model.ActivityType getActivityType() {
      com.com.hearlers.v1.model.ActivityType result = com.com.hearlers.v1.model.ActivityType.forNumber(activityType_);
      return result == null ? com.com.hearlers.v1.model.ActivityType.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.hearlers.v1.model.ActivityType activity_type = 1 [json_name = "activityType"];</code>
     * @param value The activityType to set.
     * @return This builder for chaining.
     */
    public Builder setActivityType(com.com.hearlers.v1.model.ActivityType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      activityType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.ActivityType activity_type = 1 [json_name = "activityType"];</code>
     * @return This builder for chaining.
     */
    public Builder clearActivityType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      activityType_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.Struct activityData_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> activityDataBuilder_;
    /**
     * <code>.google.protobuf.Struct activity_data = 2 [json_name = "activityData"];</code>
     * @return Whether the activityData field is set.
     */
    public boolean hasActivityData() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.google.protobuf.Struct activity_data = 2 [json_name = "activityData"];</code>
     * @return The activityData.
     */
    public com.google.protobuf.Struct getActivityData() {
      if (activityDataBuilder_ == null) {
        return activityData_ == null ? com.google.protobuf.Struct.getDefaultInstance() : activityData_;
      } else {
        return activityDataBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.Struct activity_data = 2 [json_name = "activityData"];</code>
     */
    public Builder setActivityData(com.google.protobuf.Struct value) {
      if (activityDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        activityData_ = value;
      } else {
        activityDataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Struct activity_data = 2 [json_name = "activityData"];</code>
     */
    public Builder setActivityData(
        com.google.protobuf.Struct.Builder builderForValue) {
      if (activityDataBuilder_ == null) {
        activityData_ = builderForValue.build();
      } else {
        activityDataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Struct activity_data = 2 [json_name = "activityData"];</code>
     */
    public Builder mergeActivityData(com.google.protobuf.Struct value) {
      if (activityDataBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          activityData_ != null &&
          activityData_ != com.google.protobuf.Struct.getDefaultInstance()) {
          getActivityDataBuilder().mergeFrom(value);
        } else {
          activityData_ = value;
        }
      } else {
        activityDataBuilder_.mergeFrom(value);
      }
      if (activityData_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.google.protobuf.Struct activity_data = 2 [json_name = "activityData"];</code>
     */
    public Builder clearActivityData() {
      bitField0_ = (bitField0_ & ~0x00000002);
      activityData_ = null;
      if (activityDataBuilder_ != null) {
        activityDataBuilder_.dispose();
        activityDataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.Struct activity_data = 2 [json_name = "activityData"];</code>
     */
    public com.google.protobuf.Struct.Builder getActivityDataBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getActivityDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.Struct activity_data = 2 [json_name = "activityData"];</code>
     */
    public com.google.protobuf.StructOrBuilder getActivityDataOrBuilder() {
      if (activityDataBuilder_ != null) {
        return activityDataBuilder_.getMessageOrBuilder();
      } else {
        return activityData_ == null ?
            com.google.protobuf.Struct.getDefaultInstance() : activityData_;
      }
    }
    /**
     * <code>.google.protobuf.Struct activity_data = 2 [json_name = "activityData"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder> 
        getActivityDataFieldBuilder() {
      if (activityDataBuilder_ == null) {
        activityDataBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.Struct, com.google.protobuf.Struct.Builder, com.google.protobuf.StructOrBuilder>(
                getActivityData(),
                getParentForChildren(),
                isClean());
        activityData_ = null;
      }
      return activityDataBuilder_;
    }

    private int platform_ = 0;
    /**
     * <code>.com.hearlers.v1.model.DevicePlatform platform = 3 [json_name = "platform"];</code>
     * @return The enum numeric value on the wire for platform.
     */
    @java.lang.Override public int getPlatformValue() {
      return platform_;
    }
    /**
     * <code>.com.hearlers.v1.model.DevicePlatform platform = 3 [json_name = "platform"];</code>
     * @param value The enum numeric value on the wire for platform to set.
     * @return This builder for chaining.
     */
    public Builder setPlatformValue(int value) {
      platform_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.DevicePlatform platform = 3 [json_name = "platform"];</code>
     * @return The platform.
     */
    @java.lang.Override
    public com.com.hearlers.v1.model.DevicePlatform getPlatform() {
      com.com.hearlers.v1.model.DevicePlatform result = com.com.hearlers.v1.model.DevicePlatform.forNumber(platform_);
      return result == null ? com.com.hearlers.v1.model.DevicePlatform.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.hearlers.v1.model.DevicePlatform platform = 3 [json_name = "platform"];</code>
     * @param value The platform to set.
     * @return This builder for chaining.
     */
    public Builder setPlatform(com.com.hearlers.v1.model.DevicePlatform value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      platform_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.DevicePlatform platform = 3 [json_name = "platform"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPlatform() {
      bitField0_ = (bitField0_ & ~0x00000004);
      platform_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object ipAddress_ = "";
    /**
     * <code>string ip_address = 4 [json_name = "ipAddress"];</code>
     * @return The ipAddress.
     */
    public java.lang.String getIpAddress() {
      java.lang.Object ref = ipAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ipAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ip_address = 4 [json_name = "ipAddress"];</code>
     * @return The bytes for ipAddress.
     */
    public com.google.protobuf.ByteString
        getIpAddressBytes() {
      java.lang.Object ref = ipAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ipAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ip_address = 4 [json_name = "ipAddress"];</code>
     * @param value The ipAddress to set.
     * @return This builder for chaining.
     */
    public Builder setIpAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ipAddress_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>string ip_address = 4 [json_name = "ipAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIpAddress() {
      ipAddress_ = getDefaultInstance().getIpAddress();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <code>string ip_address = 4 [json_name = "ipAddress"];</code>
     * @param value The bytes for ipAddress to set.
     * @return This builder for chaining.
     */
    public Builder setIpAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ipAddress_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    private java.lang.Object userAgent_ = "";
    /**
     * <code>string user_agent = 5 [json_name = "userAgent"];</code>
     * @return The userAgent.
     */
    public java.lang.String getUserAgent() {
      java.lang.Object ref = userAgent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userAgent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user_agent = 5 [json_name = "userAgent"];</code>
     * @return The bytes for userAgent.
     */
    public com.google.protobuf.ByteString
        getUserAgentBytes() {
      java.lang.Object ref = userAgent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userAgent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user_agent = 5 [json_name = "userAgent"];</code>
     * @param value The userAgent to set.
     * @return This builder for chaining.
     */
    public Builder setUserAgent(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      userAgent_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string user_agent = 5 [json_name = "userAgent"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUserAgent() {
      userAgent_ = getDefaultInstance().getUserAgent();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string user_agent = 5 [json_name = "userAgent"];</code>
     * @param value The bytes for userAgent to set.
     * @return This builder for chaining.
     */
    public Builder setUserAgentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      userAgent_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    private int durationSeconds_ ;
    /**
     * <code>int32 duration_seconds = 6 [json_name = "durationSeconds"];</code>
     * @return The durationSeconds.
     */
    @java.lang.Override
    public int getDurationSeconds() {
      return durationSeconds_;
    }
    /**
     * <code>int32 duration_seconds = 6 [json_name = "durationSeconds"];</code>
     * @param value The durationSeconds to set.
     * @return This builder for chaining.
     */
    public Builder setDurationSeconds(int value) {

      durationSeconds_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>int32 duration_seconds = 6 [json_name = "durationSeconds"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDurationSeconds() {
      bitField0_ = (bitField0_ & ~0x00000020);
      durationSeconds_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:com.hearlers.v1.service.CreateActivityRequest)
  }

  // @@protoc_insertion_point(class_scope:com.hearlers.v1.service.CreateActivityRequest)
  private static final com.com.hearlers.v1.service.CreateActivityRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.com.hearlers.v1.service.CreateActivityRequest();
  }

  public static com.com.hearlers.v1.service.CreateActivityRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateActivityRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateActivityRequest>() {
    @java.lang.Override
    public CreateActivityRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateActivityRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateActivityRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.com.hearlers.v1.service.CreateActivityRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
