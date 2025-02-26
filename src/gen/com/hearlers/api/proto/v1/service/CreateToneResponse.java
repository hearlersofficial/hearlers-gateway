// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

/**
 * Protobuf type {@code com.hearlers.v1.service.CreateToneResponse}
 */
public final class CreateToneResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.hearlers.v1.service.CreateToneResponse)
    CreateToneResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      CreateToneResponse.class.getName());
  }
  // Use CreateToneResponse.newBuilder() to construct.
  private CreateToneResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CreateToneResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_CreateToneResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_CreateToneResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hearlers.api.proto.v1.service.CreateToneResponse.class, com.hearlers.api.proto.v1.service.CreateToneResponse.Builder.class);
  }

  private int bitField0_;
  public static final int TONE_FIELD_NUMBER = 1;
  private com.hearlers.api.proto.v1.model.Tone tone_;
  /**
   * <code>.com.hearlers.v1.model.Tone tone = 1 [json_name = "tone"];</code>
   * @return Whether the tone field is set.
   */
  @java.lang.Override
  public boolean hasTone() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.com.hearlers.v1.model.Tone tone = 1 [json_name = "tone"];</code>
   * @return The tone.
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.Tone getTone() {
    return tone_ == null ? com.hearlers.api.proto.v1.model.Tone.getDefaultInstance() : tone_;
  }
  /**
   * <code>.com.hearlers.v1.model.Tone tone = 1 [json_name = "tone"];</code>
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.ToneOrBuilder getToneOrBuilder() {
    return tone_ == null ? com.hearlers.api.proto.v1.model.Tone.getDefaultInstance() : tone_;
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
      output.writeMessage(1, getTone());
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
        .computeMessageSize(1, getTone());
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
    if (!(obj instanceof com.hearlers.api.proto.v1.service.CreateToneResponse)) {
      return super.equals(obj);
    }
    com.hearlers.api.proto.v1.service.CreateToneResponse other = (com.hearlers.api.proto.v1.service.CreateToneResponse) obj;

    if (hasTone() != other.hasTone()) return false;
    if (hasTone()) {
      if (!getTone()
          .equals(other.getTone())) return false;
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
    if (hasTone()) {
      hash = (37 * hash) + TONE_FIELD_NUMBER;
      hash = (53 * hash) + getTone().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hearlers.api.proto.v1.service.CreateToneResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.CreateToneResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.CreateToneResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.CreateToneResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.CreateToneResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.CreateToneResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.CreateToneResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.CreateToneResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.hearlers.api.proto.v1.service.CreateToneResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.hearlers.api.proto.v1.service.CreateToneResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.CreateToneResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.CreateToneResponse parseFrom(
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
  public static Builder newBuilder(com.hearlers.api.proto.v1.service.CreateToneResponse prototype) {
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
   * Protobuf type {@code com.hearlers.v1.service.CreateToneResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hearlers.v1.service.CreateToneResponse)
      com.hearlers.api.proto.v1.service.CreateToneResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_CreateToneResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_CreateToneResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hearlers.api.proto.v1.service.CreateToneResponse.class, com.hearlers.api.proto.v1.service.CreateToneResponse.Builder.class);
    }

    // Construct using com.hearlers.api.proto.v1.service.CreateToneResponse.newBuilder()
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
        getToneFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      tone_ = null;
      if (toneBuilder_ != null) {
        toneBuilder_.dispose();
        toneBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_CreateToneResponse_descriptor;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.CreateToneResponse getDefaultInstanceForType() {
      return com.hearlers.api.proto.v1.service.CreateToneResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.CreateToneResponse build() {
      com.hearlers.api.proto.v1.service.CreateToneResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.CreateToneResponse buildPartial() {
      com.hearlers.api.proto.v1.service.CreateToneResponse result = new com.hearlers.api.proto.v1.service.CreateToneResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.hearlers.api.proto.v1.service.CreateToneResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tone_ = toneBuilder_ == null
            ? tone_
            : toneBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hearlers.api.proto.v1.service.CreateToneResponse) {
        return mergeFrom((com.hearlers.api.proto.v1.service.CreateToneResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hearlers.api.proto.v1.service.CreateToneResponse other) {
      if (other == com.hearlers.api.proto.v1.service.CreateToneResponse.getDefaultInstance()) return this;
      if (other.hasTone()) {
        mergeTone(other.getTone());
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
                  getToneFieldBuilder().getBuilder(),
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

    private com.hearlers.api.proto.v1.model.Tone tone_;
    private com.google.protobuf.SingleFieldBuilder<
        com.hearlers.api.proto.v1.model.Tone, com.hearlers.api.proto.v1.model.Tone.Builder, com.hearlers.api.proto.v1.model.ToneOrBuilder> toneBuilder_;
    /**
     * <code>.com.hearlers.v1.model.Tone tone = 1 [json_name = "tone"];</code>
     * @return Whether the tone field is set.
     */
    public boolean hasTone() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.com.hearlers.v1.model.Tone tone = 1 [json_name = "tone"];</code>
     * @return The tone.
     */
    public com.hearlers.api.proto.v1.model.Tone getTone() {
      if (toneBuilder_ == null) {
        return tone_ == null ? com.hearlers.api.proto.v1.model.Tone.getDefaultInstance() : tone_;
      } else {
        return toneBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.hearlers.v1.model.Tone tone = 1 [json_name = "tone"];</code>
     */
    public Builder setTone(com.hearlers.api.proto.v1.model.Tone value) {
      if (toneBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        tone_ = value;
      } else {
        toneBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.Tone tone = 1 [json_name = "tone"];</code>
     */
    public Builder setTone(
        com.hearlers.api.proto.v1.model.Tone.Builder builderForValue) {
      if (toneBuilder_ == null) {
        tone_ = builderForValue.build();
      } else {
        toneBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.Tone tone = 1 [json_name = "tone"];</code>
     */
    public Builder mergeTone(com.hearlers.api.proto.v1.model.Tone value) {
      if (toneBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          tone_ != null &&
          tone_ != com.hearlers.api.proto.v1.model.Tone.getDefaultInstance()) {
          getToneBuilder().mergeFrom(value);
        } else {
          tone_ = value;
        }
      } else {
        toneBuilder_.mergeFrom(value);
      }
      if (tone_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.Tone tone = 1 [json_name = "tone"];</code>
     */
    public Builder clearTone() {
      bitField0_ = (bitField0_ & ~0x00000001);
      tone_ = null;
      if (toneBuilder_ != null) {
        toneBuilder_.dispose();
        toneBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.Tone tone = 1 [json_name = "tone"];</code>
     */
    public com.hearlers.api.proto.v1.model.Tone.Builder getToneBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getToneFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.hearlers.v1.model.Tone tone = 1 [json_name = "tone"];</code>
     */
    public com.hearlers.api.proto.v1.model.ToneOrBuilder getToneOrBuilder() {
      if (toneBuilder_ != null) {
        return toneBuilder_.getMessageOrBuilder();
      } else {
        return tone_ == null ?
            com.hearlers.api.proto.v1.model.Tone.getDefaultInstance() : tone_;
      }
    }
    /**
     * <code>.com.hearlers.v1.model.Tone tone = 1 [json_name = "tone"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.hearlers.api.proto.v1.model.Tone, com.hearlers.api.proto.v1.model.Tone.Builder, com.hearlers.api.proto.v1.model.ToneOrBuilder> 
        getToneFieldBuilder() {
      if (toneBuilder_ == null) {
        toneBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.hearlers.api.proto.v1.model.Tone, com.hearlers.api.proto.v1.model.Tone.Builder, com.hearlers.api.proto.v1.model.ToneOrBuilder>(
                getTone(),
                getParentForChildren(),
                isClean());
        tone_ = null;
      }
      return toneBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:com.hearlers.v1.service.CreateToneResponse)
  }

  // @@protoc_insertion_point(class_scope:com.hearlers.v1.service.CreateToneResponse)
  private static final com.hearlers.api.proto.v1.service.CreateToneResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hearlers.api.proto.v1.service.CreateToneResponse();
  }

  public static com.hearlers.api.proto.v1.service.CreateToneResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateToneResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreateToneResponse>() {
    @java.lang.Override
    public CreateToneResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateToneResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateToneResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hearlers.api.proto.v1.service.CreateToneResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

