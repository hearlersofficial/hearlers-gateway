// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

/**
 * Protobuf type {@code com.hearlers.v1.service.FindInstructionItemByIdResponse}
 */
public final class FindInstructionItemByIdResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.hearlers.v1.service.FindInstructionItemByIdResponse)
    FindInstructionItemByIdResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      FindInstructionItemByIdResponse.class.getName());
  }
  // Use FindInstructionItemByIdResponse.newBuilder() to construct.
  private FindInstructionItemByIdResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private FindInstructionItemByIdResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindInstructionItemByIdResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindInstructionItemByIdResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse.class, com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse.Builder.class);
  }

  private int bitField0_;
  public static final int INSTRUCTION_ITEM_FIELD_NUMBER = 1;
  private com.hearlers.api.proto.v1.model.InstructionItem instructionItem_;
  /**
   * <code>.com.hearlers.v1.model.InstructionItem instruction_item = 1 [json_name = "instructionItem"];</code>
   * @return Whether the instructionItem field is set.
   */
  @java.lang.Override
  public boolean hasInstructionItem() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.com.hearlers.v1.model.InstructionItem instruction_item = 1 [json_name = "instructionItem"];</code>
   * @return The instructionItem.
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.InstructionItem getInstructionItem() {
    return instructionItem_ == null ? com.hearlers.api.proto.v1.model.InstructionItem.getDefaultInstance() : instructionItem_;
  }
  /**
   * <code>.com.hearlers.v1.model.InstructionItem instruction_item = 1 [json_name = "instructionItem"];</code>
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.InstructionItemOrBuilder getInstructionItemOrBuilder() {
    return instructionItem_ == null ? com.hearlers.api.proto.v1.model.InstructionItem.getDefaultInstance() : instructionItem_;
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
      output.writeMessage(1, getInstructionItem());
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
        .computeMessageSize(1, getInstructionItem());
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
    if (!(obj instanceof com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse)) {
      return super.equals(obj);
    }
    com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse other = (com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse) obj;

    if (hasInstructionItem() != other.hasInstructionItem()) return false;
    if (hasInstructionItem()) {
      if (!getInstructionItem()
          .equals(other.getInstructionItem())) return false;
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
    if (hasInstructionItem()) {
      hash = (37 * hash) + INSTRUCTION_ITEM_FIELD_NUMBER;
      hash = (53 * hash) + getInstructionItem().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse parseFrom(
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
  public static Builder newBuilder(com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse prototype) {
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
   * Protobuf type {@code com.hearlers.v1.service.FindInstructionItemByIdResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hearlers.v1.service.FindInstructionItemByIdResponse)
      com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindInstructionItemByIdResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindInstructionItemByIdResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse.class, com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse.Builder.class);
    }

    // Construct using com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse.newBuilder()
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
        getInstructionItemFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      instructionItem_ = null;
      if (instructionItemBuilder_ != null) {
        instructionItemBuilder_.dispose();
        instructionItemBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindInstructionItemByIdResponse_descriptor;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse getDefaultInstanceForType() {
      return com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse build() {
      com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse buildPartial() {
      com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse result = new com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.instructionItem_ = instructionItemBuilder_ == null
            ? instructionItem_
            : instructionItemBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse) {
        return mergeFrom((com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse other) {
      if (other == com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse.getDefaultInstance()) return this;
      if (other.hasInstructionItem()) {
        mergeInstructionItem(other.getInstructionItem());
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
                  getInstructionItemFieldBuilder().getBuilder(),
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

    private com.hearlers.api.proto.v1.model.InstructionItem instructionItem_;
    private com.google.protobuf.SingleFieldBuilder<
        com.hearlers.api.proto.v1.model.InstructionItem, com.hearlers.api.proto.v1.model.InstructionItem.Builder, com.hearlers.api.proto.v1.model.InstructionItemOrBuilder> instructionItemBuilder_;
    /**
     * <code>.com.hearlers.v1.model.InstructionItem instruction_item = 1 [json_name = "instructionItem"];</code>
     * @return Whether the instructionItem field is set.
     */
    public boolean hasInstructionItem() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.com.hearlers.v1.model.InstructionItem instruction_item = 1 [json_name = "instructionItem"];</code>
     * @return The instructionItem.
     */
    public com.hearlers.api.proto.v1.model.InstructionItem getInstructionItem() {
      if (instructionItemBuilder_ == null) {
        return instructionItem_ == null ? com.hearlers.api.proto.v1.model.InstructionItem.getDefaultInstance() : instructionItem_;
      } else {
        return instructionItemBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.hearlers.v1.model.InstructionItem instruction_item = 1 [json_name = "instructionItem"];</code>
     */
    public Builder setInstructionItem(com.hearlers.api.proto.v1.model.InstructionItem value) {
      if (instructionItemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        instructionItem_ = value;
      } else {
        instructionItemBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.InstructionItem instruction_item = 1 [json_name = "instructionItem"];</code>
     */
    public Builder setInstructionItem(
        com.hearlers.api.proto.v1.model.InstructionItem.Builder builderForValue) {
      if (instructionItemBuilder_ == null) {
        instructionItem_ = builderForValue.build();
      } else {
        instructionItemBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.InstructionItem instruction_item = 1 [json_name = "instructionItem"];</code>
     */
    public Builder mergeInstructionItem(com.hearlers.api.proto.v1.model.InstructionItem value) {
      if (instructionItemBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          instructionItem_ != null &&
          instructionItem_ != com.hearlers.api.proto.v1.model.InstructionItem.getDefaultInstance()) {
          getInstructionItemBuilder().mergeFrom(value);
        } else {
          instructionItem_ = value;
        }
      } else {
        instructionItemBuilder_.mergeFrom(value);
      }
      if (instructionItem_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.InstructionItem instruction_item = 1 [json_name = "instructionItem"];</code>
     */
    public Builder clearInstructionItem() {
      bitField0_ = (bitField0_ & ~0x00000001);
      instructionItem_ = null;
      if (instructionItemBuilder_ != null) {
        instructionItemBuilder_.dispose();
        instructionItemBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.InstructionItem instruction_item = 1 [json_name = "instructionItem"];</code>
     */
    public com.hearlers.api.proto.v1.model.InstructionItem.Builder getInstructionItemBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getInstructionItemFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.hearlers.v1.model.InstructionItem instruction_item = 1 [json_name = "instructionItem"];</code>
     */
    public com.hearlers.api.proto.v1.model.InstructionItemOrBuilder getInstructionItemOrBuilder() {
      if (instructionItemBuilder_ != null) {
        return instructionItemBuilder_.getMessageOrBuilder();
      } else {
        return instructionItem_ == null ?
            com.hearlers.api.proto.v1.model.InstructionItem.getDefaultInstance() : instructionItem_;
      }
    }
    /**
     * <code>.com.hearlers.v1.model.InstructionItem instruction_item = 1 [json_name = "instructionItem"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.hearlers.api.proto.v1.model.InstructionItem, com.hearlers.api.proto.v1.model.InstructionItem.Builder, com.hearlers.api.proto.v1.model.InstructionItemOrBuilder> 
        getInstructionItemFieldBuilder() {
      if (instructionItemBuilder_ == null) {
        instructionItemBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.hearlers.api.proto.v1.model.InstructionItem, com.hearlers.api.proto.v1.model.InstructionItem.Builder, com.hearlers.api.proto.v1.model.InstructionItemOrBuilder>(
                getInstructionItem(),
                getParentForChildren(),
                isClean());
        instructionItem_ = null;
      }
      return instructionItemBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:com.hearlers.v1.service.FindInstructionItemByIdResponse)
  }

  // @@protoc_insertion_point(class_scope:com.hearlers.v1.service.FindInstructionItemByIdResponse)
  private static final com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse();
  }

  public static com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FindInstructionItemByIdResponse>
      PARSER = new com.google.protobuf.AbstractParser<FindInstructionItemByIdResponse>() {
    @java.lang.Override
    public FindInstructionItemByIdResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<FindInstructionItemByIdResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FindInstructionItemByIdResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hearlers.api.proto.v1.service.FindInstructionItemByIdResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

