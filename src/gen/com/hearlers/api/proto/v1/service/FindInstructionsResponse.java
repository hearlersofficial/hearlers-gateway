// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

/**
 * Protobuf type {@code com.hearlers.v1.service.FindInstructionsResponse}
 */
public final class FindInstructionsResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.hearlers.v1.service.FindInstructionsResponse)
    FindInstructionsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      FindInstructionsResponse.class.getName());
  }
  // Use FindInstructionsResponse.newBuilder() to construct.
  private FindInstructionsResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private FindInstructionsResponse() {
    instructions_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindInstructionsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindInstructionsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hearlers.api.proto.v1.service.FindInstructionsResponse.class, com.hearlers.api.proto.v1.service.FindInstructionsResponse.Builder.class);
  }

  public static final int INSTRUCTIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.hearlers.api.proto.v1.model.Instruction> instructions_;
  /**
   * <code>repeated .com.hearlers.v1.model.Instruction instructions = 1 [json_name = "instructions"];</code>
   */
  @java.lang.Override
  public java.util.List<com.hearlers.api.proto.v1.model.Instruction> getInstructionsList() {
    return instructions_;
  }
  /**
   * <code>repeated .com.hearlers.v1.model.Instruction instructions = 1 [json_name = "instructions"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.hearlers.api.proto.v1.model.InstructionOrBuilder> 
      getInstructionsOrBuilderList() {
    return instructions_;
  }
  /**
   * <code>repeated .com.hearlers.v1.model.Instruction instructions = 1 [json_name = "instructions"];</code>
   */
  @java.lang.Override
  public int getInstructionsCount() {
    return instructions_.size();
  }
  /**
   * <code>repeated .com.hearlers.v1.model.Instruction instructions = 1 [json_name = "instructions"];</code>
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.Instruction getInstructions(int index) {
    return instructions_.get(index);
  }
  /**
   * <code>repeated .com.hearlers.v1.model.Instruction instructions = 1 [json_name = "instructions"];</code>
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.InstructionOrBuilder getInstructionsOrBuilder(
      int index) {
    return instructions_.get(index);
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
    for (int i = 0; i < instructions_.size(); i++) {
      output.writeMessage(1, instructions_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < instructions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, instructions_.get(i));
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
    if (!(obj instanceof com.hearlers.api.proto.v1.service.FindInstructionsResponse)) {
      return super.equals(obj);
    }
    com.hearlers.api.proto.v1.service.FindInstructionsResponse other = (com.hearlers.api.proto.v1.service.FindInstructionsResponse) obj;

    if (!getInstructionsList()
        .equals(other.getInstructionsList())) return false;
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
    if (getInstructionsCount() > 0) {
      hash = (37 * hash) + INSTRUCTIONS_FIELD_NUMBER;
      hash = (53 * hash) + getInstructionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hearlers.api.proto.v1.service.FindInstructionsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindInstructionsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindInstructionsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindInstructionsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindInstructionsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindInstructionsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindInstructionsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.FindInstructionsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.hearlers.api.proto.v1.service.FindInstructionsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.hearlers.api.proto.v1.service.FindInstructionsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindInstructionsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.FindInstructionsResponse parseFrom(
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
  public static Builder newBuilder(com.hearlers.api.proto.v1.service.FindInstructionsResponse prototype) {
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
   * Protobuf type {@code com.hearlers.v1.service.FindInstructionsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hearlers.v1.service.FindInstructionsResponse)
      com.hearlers.api.proto.v1.service.FindInstructionsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindInstructionsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindInstructionsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hearlers.api.proto.v1.service.FindInstructionsResponse.class, com.hearlers.api.proto.v1.service.FindInstructionsResponse.Builder.class);
    }

    // Construct using com.hearlers.api.proto.v1.service.FindInstructionsResponse.newBuilder()
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
      if (instructionsBuilder_ == null) {
        instructions_ = java.util.Collections.emptyList();
      } else {
        instructions_ = null;
        instructionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindInstructionsResponse_descriptor;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindInstructionsResponse getDefaultInstanceForType() {
      return com.hearlers.api.proto.v1.service.FindInstructionsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindInstructionsResponse build() {
      com.hearlers.api.proto.v1.service.FindInstructionsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindInstructionsResponse buildPartial() {
      com.hearlers.api.proto.v1.service.FindInstructionsResponse result = new com.hearlers.api.proto.v1.service.FindInstructionsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.hearlers.api.proto.v1.service.FindInstructionsResponse result) {
      if (instructionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          instructions_ = java.util.Collections.unmodifiableList(instructions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.instructions_ = instructions_;
      } else {
        result.instructions_ = instructionsBuilder_.build();
      }
    }

    private void buildPartial0(com.hearlers.api.proto.v1.service.FindInstructionsResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hearlers.api.proto.v1.service.FindInstructionsResponse) {
        return mergeFrom((com.hearlers.api.proto.v1.service.FindInstructionsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hearlers.api.proto.v1.service.FindInstructionsResponse other) {
      if (other == com.hearlers.api.proto.v1.service.FindInstructionsResponse.getDefaultInstance()) return this;
      if (instructionsBuilder_ == null) {
        if (!other.instructions_.isEmpty()) {
          if (instructions_.isEmpty()) {
            instructions_ = other.instructions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInstructionsIsMutable();
            instructions_.addAll(other.instructions_);
          }
          onChanged();
        }
      } else {
        if (!other.instructions_.isEmpty()) {
          if (instructionsBuilder_.isEmpty()) {
            instructionsBuilder_.dispose();
            instructionsBuilder_ = null;
            instructions_ = other.instructions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            instructionsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getInstructionsFieldBuilder() : null;
          } else {
            instructionsBuilder_.addAllMessages(other.instructions_);
          }
        }
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
              com.hearlers.api.proto.v1.model.Instruction m =
                  input.readMessage(
                      com.hearlers.api.proto.v1.model.Instruction.parser(),
                      extensionRegistry);
              if (instructionsBuilder_ == null) {
                ensureInstructionsIsMutable();
                instructions_.add(m);
              } else {
                instructionsBuilder_.addMessage(m);
              }
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

    private java.util.List<com.hearlers.api.proto.v1.model.Instruction> instructions_ =
      java.util.Collections.emptyList();
    private void ensureInstructionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        instructions_ = new java.util.ArrayList<com.hearlers.api.proto.v1.model.Instruction>(instructions_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.hearlers.api.proto.v1.model.Instruction, com.hearlers.api.proto.v1.model.Instruction.Builder, com.hearlers.api.proto.v1.model.InstructionOrBuilder> instructionsBuilder_;

    /**
     * <code>repeated .com.hearlers.v1.model.Instruction instructions = 1 [json_name = "instructions"];</code>
     */
    public java.util.List<com.hearlers.api.proto.v1.model.Instruction> getInstructionsList() {
      if (instructionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(instructions_);
      } else {
        return instructionsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Instruction instructions = 1 [json_name = "instructions"];</code>
     */
    public int getInstructionsCount() {
      if (instructionsBuilder_ == null) {
        return instructions_.size();
      } else {
        return instructionsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Instruction instructions = 1 [json_name = "instructions"];</code>
     */
    public com.hearlers.api.proto.v1.model.Instruction getInstructions(int index) {
      if (instructionsBuilder_ == null) {
        return instructions_.get(index);
      } else {
        return instructionsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Instruction instructions = 1 [json_name = "instructions"];</code>
     */
    public Builder setInstructions(
        int index, com.hearlers.api.proto.v1.model.Instruction value) {
      if (instructionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstructionsIsMutable();
        instructions_.set(index, value);
        onChanged();
      } else {
        instructionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Instruction instructions = 1 [json_name = "instructions"];</code>
     */
    public Builder setInstructions(
        int index, com.hearlers.api.proto.v1.model.Instruction.Builder builderForValue) {
      if (instructionsBuilder_ == null) {
        ensureInstructionsIsMutable();
        instructions_.set(index, builderForValue.build());
        onChanged();
      } else {
        instructionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Instruction instructions = 1 [json_name = "instructions"];</code>
     */
    public Builder addInstructions(com.hearlers.api.proto.v1.model.Instruction value) {
      if (instructionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstructionsIsMutable();
        instructions_.add(value);
        onChanged();
      } else {
        instructionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Instruction instructions = 1 [json_name = "instructions"];</code>
     */
    public Builder addInstructions(
        int index, com.hearlers.api.proto.v1.model.Instruction value) {
      if (instructionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInstructionsIsMutable();
        instructions_.add(index, value);
        onChanged();
      } else {
        instructionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Instruction instructions = 1 [json_name = "instructions"];</code>
     */
    public Builder addInstructions(
        com.hearlers.api.proto.v1.model.Instruction.Builder builderForValue) {
      if (instructionsBuilder_ == null) {
        ensureInstructionsIsMutable();
        instructions_.add(builderForValue.build());
        onChanged();
      } else {
        instructionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Instruction instructions = 1 [json_name = "instructions"];</code>
     */
    public Builder addInstructions(
        int index, com.hearlers.api.proto.v1.model.Instruction.Builder builderForValue) {
      if (instructionsBuilder_ == null) {
        ensureInstructionsIsMutable();
        instructions_.add(index, builderForValue.build());
        onChanged();
      } else {
        instructionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Instruction instructions = 1 [json_name = "instructions"];</code>
     */
    public Builder addAllInstructions(
        java.lang.Iterable<? extends com.hearlers.api.proto.v1.model.Instruction> values) {
      if (instructionsBuilder_ == null) {
        ensureInstructionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, instructions_);
        onChanged();
      } else {
        instructionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Instruction instructions = 1 [json_name = "instructions"];</code>
     */
    public Builder clearInstructions() {
      if (instructionsBuilder_ == null) {
        instructions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        instructionsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Instruction instructions = 1 [json_name = "instructions"];</code>
     */
    public Builder removeInstructions(int index) {
      if (instructionsBuilder_ == null) {
        ensureInstructionsIsMutable();
        instructions_.remove(index);
        onChanged();
      } else {
        instructionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Instruction instructions = 1 [json_name = "instructions"];</code>
     */
    public com.hearlers.api.proto.v1.model.Instruction.Builder getInstructionsBuilder(
        int index) {
      return getInstructionsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Instruction instructions = 1 [json_name = "instructions"];</code>
     */
    public com.hearlers.api.proto.v1.model.InstructionOrBuilder getInstructionsOrBuilder(
        int index) {
      if (instructionsBuilder_ == null) {
        return instructions_.get(index);  } else {
        return instructionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Instruction instructions = 1 [json_name = "instructions"];</code>
     */
    public java.util.List<? extends com.hearlers.api.proto.v1.model.InstructionOrBuilder> 
         getInstructionsOrBuilderList() {
      if (instructionsBuilder_ != null) {
        return instructionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(instructions_);
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Instruction instructions = 1 [json_name = "instructions"];</code>
     */
    public com.hearlers.api.proto.v1.model.Instruction.Builder addInstructionsBuilder() {
      return getInstructionsFieldBuilder().addBuilder(
          com.hearlers.api.proto.v1.model.Instruction.getDefaultInstance());
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Instruction instructions = 1 [json_name = "instructions"];</code>
     */
    public com.hearlers.api.proto.v1.model.Instruction.Builder addInstructionsBuilder(
        int index) {
      return getInstructionsFieldBuilder().addBuilder(
          index, com.hearlers.api.proto.v1.model.Instruction.getDefaultInstance());
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Instruction instructions = 1 [json_name = "instructions"];</code>
     */
    public java.util.List<com.hearlers.api.proto.v1.model.Instruction.Builder> 
         getInstructionsBuilderList() {
      return getInstructionsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.hearlers.api.proto.v1.model.Instruction, com.hearlers.api.proto.v1.model.Instruction.Builder, com.hearlers.api.proto.v1.model.InstructionOrBuilder> 
        getInstructionsFieldBuilder() {
      if (instructionsBuilder_ == null) {
        instructionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.hearlers.api.proto.v1.model.Instruction, com.hearlers.api.proto.v1.model.Instruction.Builder, com.hearlers.api.proto.v1.model.InstructionOrBuilder>(
                instructions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        instructions_ = null;
      }
      return instructionsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:com.hearlers.v1.service.FindInstructionsResponse)
  }

  // @@protoc_insertion_point(class_scope:com.hearlers.v1.service.FindInstructionsResponse)
  private static final com.hearlers.api.proto.v1.service.FindInstructionsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hearlers.api.proto.v1.service.FindInstructionsResponse();
  }

  public static com.hearlers.api.proto.v1.service.FindInstructionsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FindInstructionsResponse>
      PARSER = new com.google.protobuf.AbstractParser<FindInstructionsResponse>() {
    @java.lang.Override
    public FindInstructionsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<FindInstructionsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FindInstructionsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hearlers.api.proto.v1.service.FindInstructionsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

