// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel_prompt.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

/**
 * Protobuf type {@code com.hearlers.v1.service.FindPromptVersionByIdResponse}
 */
public final class FindPromptVersionByIdResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.hearlers.v1.service.FindPromptVersionByIdResponse)
    FindPromptVersionByIdResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      FindPromptVersionByIdResponse.class.getName());
  }
  // Use FindPromptVersionByIdResponse.newBuilder() to construct.
  private FindPromptVersionByIdResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private FindPromptVersionByIdResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hearlers.api.proto.v1.service.CounselPrompt.internal_static_com_hearlers_v1_service_FindPromptVersionByIdResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hearlers.api.proto.v1.service.CounselPrompt.internal_static_com_hearlers_v1_service_FindPromptVersionByIdResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse.class, com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse.Builder.class);
  }

  private int bitField0_;
  public static final int PROMPT_VERSION_FIELD_NUMBER = 1;
  private com.hearlers.api.proto.v1.model.PromptVersion promptVersion_;
  /**
   * <code>optional .com.hearlers.v1.model.PromptVersion prompt_version = 1 [json_name = "promptVersion"];</code>
   * @return Whether the promptVersion field is set.
   */
  @java.lang.Override
  public boolean hasPromptVersion() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .com.hearlers.v1.model.PromptVersion prompt_version = 1 [json_name = "promptVersion"];</code>
   * @return The promptVersion.
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.PromptVersion getPromptVersion() {
    return promptVersion_ == null ? com.hearlers.api.proto.v1.model.PromptVersion.getDefaultInstance() : promptVersion_;
  }
  /**
   * <code>optional .com.hearlers.v1.model.PromptVersion prompt_version = 1 [json_name = "promptVersion"];</code>
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.PromptVersionOrBuilder getPromptVersionOrBuilder() {
    return promptVersion_ == null ? com.hearlers.api.proto.v1.model.PromptVersion.getDefaultInstance() : promptVersion_;
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
      output.writeMessage(1, getPromptVersion());
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
        .computeMessageSize(1, getPromptVersion());
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
    if (!(obj instanceof com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse)) {
      return super.equals(obj);
    }
    com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse other = (com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse) obj;

    if (hasPromptVersion() != other.hasPromptVersion()) return false;
    if (hasPromptVersion()) {
      if (!getPromptVersion()
          .equals(other.getPromptVersion())) return false;
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
    if (hasPromptVersion()) {
      hash = (37 * hash) + PROMPT_VERSION_FIELD_NUMBER;
      hash = (53 * hash) + getPromptVersion().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse parseFrom(
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
  public static Builder newBuilder(com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse prototype) {
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
   * Protobuf type {@code com.hearlers.v1.service.FindPromptVersionByIdResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hearlers.v1.service.FindPromptVersionByIdResponse)
      com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hearlers.api.proto.v1.service.CounselPrompt.internal_static_com_hearlers_v1_service_FindPromptVersionByIdResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hearlers.api.proto.v1.service.CounselPrompt.internal_static_com_hearlers_v1_service_FindPromptVersionByIdResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse.class, com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse.Builder.class);
    }

    // Construct using com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse.newBuilder()
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
        getPromptVersionFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      promptVersion_ = null;
      if (promptVersionBuilder_ != null) {
        promptVersionBuilder_.dispose();
        promptVersionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hearlers.api.proto.v1.service.CounselPrompt.internal_static_com_hearlers_v1_service_FindPromptVersionByIdResponse_descriptor;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse getDefaultInstanceForType() {
      return com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse build() {
      com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse buildPartial() {
      com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse result = new com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.promptVersion_ = promptVersionBuilder_ == null
            ? promptVersion_
            : promptVersionBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse) {
        return mergeFrom((com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse other) {
      if (other == com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse.getDefaultInstance()) return this;
      if (other.hasPromptVersion()) {
        mergePromptVersion(other.getPromptVersion());
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
                  getPromptVersionFieldBuilder().getBuilder(),
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

    private com.hearlers.api.proto.v1.model.PromptVersion promptVersion_;
    private com.google.protobuf.SingleFieldBuilder<
        com.hearlers.api.proto.v1.model.PromptVersion, com.hearlers.api.proto.v1.model.PromptVersion.Builder, com.hearlers.api.proto.v1.model.PromptVersionOrBuilder> promptVersionBuilder_;
    /**
     * <code>optional .com.hearlers.v1.model.PromptVersion prompt_version = 1 [json_name = "promptVersion"];</code>
     * @return Whether the promptVersion field is set.
     */
    public boolean hasPromptVersion() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .com.hearlers.v1.model.PromptVersion prompt_version = 1 [json_name = "promptVersion"];</code>
     * @return The promptVersion.
     */
    public com.hearlers.api.proto.v1.model.PromptVersion getPromptVersion() {
      if (promptVersionBuilder_ == null) {
        return promptVersion_ == null ? com.hearlers.api.proto.v1.model.PromptVersion.getDefaultInstance() : promptVersion_;
      } else {
        return promptVersionBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .com.hearlers.v1.model.PromptVersion prompt_version = 1 [json_name = "promptVersion"];</code>
     */
    public Builder setPromptVersion(com.hearlers.api.proto.v1.model.PromptVersion value) {
      if (promptVersionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        promptVersion_ = value;
      } else {
        promptVersionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .com.hearlers.v1.model.PromptVersion prompt_version = 1 [json_name = "promptVersion"];</code>
     */
    public Builder setPromptVersion(
        com.hearlers.api.proto.v1.model.PromptVersion.Builder builderForValue) {
      if (promptVersionBuilder_ == null) {
        promptVersion_ = builderForValue.build();
      } else {
        promptVersionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>optional .com.hearlers.v1.model.PromptVersion prompt_version = 1 [json_name = "promptVersion"];</code>
     */
    public Builder mergePromptVersion(com.hearlers.api.proto.v1.model.PromptVersion value) {
      if (promptVersionBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          promptVersion_ != null &&
          promptVersion_ != com.hearlers.api.proto.v1.model.PromptVersion.getDefaultInstance()) {
          getPromptVersionBuilder().mergeFrom(value);
        } else {
          promptVersion_ = value;
        }
      } else {
        promptVersionBuilder_.mergeFrom(value);
      }
      if (promptVersion_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>optional .com.hearlers.v1.model.PromptVersion prompt_version = 1 [json_name = "promptVersion"];</code>
     */
    public Builder clearPromptVersion() {
      bitField0_ = (bitField0_ & ~0x00000001);
      promptVersion_ = null;
      if (promptVersionBuilder_ != null) {
        promptVersionBuilder_.dispose();
        promptVersionBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .com.hearlers.v1.model.PromptVersion prompt_version = 1 [json_name = "promptVersion"];</code>
     */
    public com.hearlers.api.proto.v1.model.PromptVersion.Builder getPromptVersionBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPromptVersionFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .com.hearlers.v1.model.PromptVersion prompt_version = 1 [json_name = "promptVersion"];</code>
     */
    public com.hearlers.api.proto.v1.model.PromptVersionOrBuilder getPromptVersionOrBuilder() {
      if (promptVersionBuilder_ != null) {
        return promptVersionBuilder_.getMessageOrBuilder();
      } else {
        return promptVersion_ == null ?
            com.hearlers.api.proto.v1.model.PromptVersion.getDefaultInstance() : promptVersion_;
      }
    }
    /**
     * <code>optional .com.hearlers.v1.model.PromptVersion prompt_version = 1 [json_name = "promptVersion"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.hearlers.api.proto.v1.model.PromptVersion, com.hearlers.api.proto.v1.model.PromptVersion.Builder, com.hearlers.api.proto.v1.model.PromptVersionOrBuilder> 
        getPromptVersionFieldBuilder() {
      if (promptVersionBuilder_ == null) {
        promptVersionBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.hearlers.api.proto.v1.model.PromptVersion, com.hearlers.api.proto.v1.model.PromptVersion.Builder, com.hearlers.api.proto.v1.model.PromptVersionOrBuilder>(
                getPromptVersion(),
                getParentForChildren(),
                isClean());
        promptVersion_ = null;
      }
      return promptVersionBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:com.hearlers.v1.service.FindPromptVersionByIdResponse)
  }

  // @@protoc_insertion_point(class_scope:com.hearlers.v1.service.FindPromptVersionByIdResponse)
  private static final com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse();
  }

  public static com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FindPromptVersionByIdResponse>
      PARSER = new com.google.protobuf.AbstractParser<FindPromptVersionByIdResponse>() {
    @java.lang.Override
    public FindPromptVersionByIdResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<FindPromptVersionByIdResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FindPromptVersionByIdResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hearlers.api.proto.v1.service.FindPromptVersionByIdResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

