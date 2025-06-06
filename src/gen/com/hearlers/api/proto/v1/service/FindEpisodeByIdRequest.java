// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counselor.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

/**
 * Protobuf type {@code com.hearlers.v1.service.FindEpisodeByIdRequest}
 */
public final class FindEpisodeByIdRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.hearlers.v1.service.FindEpisodeByIdRequest)
    FindEpisodeByIdRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      FindEpisodeByIdRequest.class.getName());
  }
  // Use FindEpisodeByIdRequest.newBuilder() to construct.
  private FindEpisodeByIdRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private FindEpisodeByIdRequest() {
    episodeId_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hearlers.api.proto.v1.service.Counselor.internal_static_com_hearlers_v1_service_FindEpisodeByIdRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hearlers.api.proto.v1.service.Counselor.internal_static_com_hearlers_v1_service_FindEpisodeByIdRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest.class, com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest.Builder.class);
  }

  public static final int EPISODE_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object episodeId_ = "";
  /**
   * <code>string episode_id = 1 [json_name = "episodeId"];</code>
   * @return The episodeId.
   */
  @java.lang.Override
  public java.lang.String getEpisodeId() {
    java.lang.Object ref = episodeId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      episodeId_ = s;
      return s;
    }
  }
  /**
   * <code>string episode_id = 1 [json_name = "episodeId"];</code>
   * @return The bytes for episodeId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getEpisodeIdBytes() {
    java.lang.Object ref = episodeId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      episodeId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int WITH_TEMPORARY_FIELD_NUMBER = 2;
  private boolean withTemporary_ = false;
  /**
   * <code>bool with_temporary = 2 [json_name = "withTemporary"];</code>
   * @return The withTemporary.
   */
  @java.lang.Override
  public boolean getWithTemporary() {
    return withTemporary_;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(episodeId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, episodeId_);
    }
    if (withTemporary_ != false) {
      output.writeBool(2, withTemporary_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(episodeId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, episodeId_);
    }
    if (withTemporary_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, withTemporary_);
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
    if (!(obj instanceof com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest)) {
      return super.equals(obj);
    }
    com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest other = (com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest) obj;

    if (!getEpisodeId()
        .equals(other.getEpisodeId())) return false;
    if (getWithTemporary()
        != other.getWithTemporary()) return false;
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
    hash = (37 * hash) + EPISODE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEpisodeId().hashCode();
    hash = (37 * hash) + WITH_TEMPORARY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getWithTemporary());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest parseFrom(
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
  public static Builder newBuilder(com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest prototype) {
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
   * Protobuf type {@code com.hearlers.v1.service.FindEpisodeByIdRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hearlers.v1.service.FindEpisodeByIdRequest)
      com.hearlers.api.proto.v1.service.FindEpisodeByIdRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hearlers.api.proto.v1.service.Counselor.internal_static_com_hearlers_v1_service_FindEpisodeByIdRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hearlers.api.proto.v1.service.Counselor.internal_static_com_hearlers_v1_service_FindEpisodeByIdRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest.class, com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest.Builder.class);
    }

    // Construct using com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest.newBuilder()
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
      episodeId_ = "";
      withTemporary_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hearlers.api.proto.v1.service.Counselor.internal_static_com_hearlers_v1_service_FindEpisodeByIdRequest_descriptor;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest getDefaultInstanceForType() {
      return com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest build() {
      com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest buildPartial() {
      com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest result = new com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.episodeId_ = episodeId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.withTemporary_ = withTemporary_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest) {
        return mergeFrom((com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest other) {
      if (other == com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest.getDefaultInstance()) return this;
      if (!other.getEpisodeId().isEmpty()) {
        episodeId_ = other.episodeId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getWithTemporary() != false) {
        setWithTemporary(other.getWithTemporary());
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
              episodeId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              withTemporary_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private java.lang.Object episodeId_ = "";
    /**
     * <code>string episode_id = 1 [json_name = "episodeId"];</code>
     * @return The episodeId.
     */
    public java.lang.String getEpisodeId() {
      java.lang.Object ref = episodeId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        episodeId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string episode_id = 1 [json_name = "episodeId"];</code>
     * @return The bytes for episodeId.
     */
    public com.google.protobuf.ByteString
        getEpisodeIdBytes() {
      java.lang.Object ref = episodeId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        episodeId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string episode_id = 1 [json_name = "episodeId"];</code>
     * @param value The episodeId to set.
     * @return This builder for chaining.
     */
    public Builder setEpisodeId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      episodeId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string episode_id = 1 [json_name = "episodeId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEpisodeId() {
      episodeId_ = getDefaultInstance().getEpisodeId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string episode_id = 1 [json_name = "episodeId"];</code>
     * @param value The bytes for episodeId to set.
     * @return This builder for chaining.
     */
    public Builder setEpisodeIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      episodeId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean withTemporary_ ;
    /**
     * <code>bool with_temporary = 2 [json_name = "withTemporary"];</code>
     * @return The withTemporary.
     */
    @java.lang.Override
    public boolean getWithTemporary() {
      return withTemporary_;
    }
    /**
     * <code>bool with_temporary = 2 [json_name = "withTemporary"];</code>
     * @param value The withTemporary to set.
     * @return This builder for chaining.
     */
    public Builder setWithTemporary(boolean value) {

      withTemporary_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bool with_temporary = 2 [json_name = "withTemporary"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWithTemporary() {
      bitField0_ = (bitField0_ & ~0x00000002);
      withTemporary_ = false;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:com.hearlers.v1.service.FindEpisodeByIdRequest)
  }

  // @@protoc_insertion_point(class_scope:com.hearlers.v1.service.FindEpisodeByIdRequest)
  private static final com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest();
  }

  public static com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FindEpisodeByIdRequest>
      PARSER = new com.google.protobuf.AbstractParser<FindEpisodeByIdRequest>() {
    @java.lang.Override
    public FindEpisodeByIdRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<FindEpisodeByIdRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FindEpisodeByIdRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hearlers.api.proto.v1.service.FindEpisodeByIdRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

