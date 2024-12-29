// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

/**
 * Protobuf type {@code com.hearlers.v1.service.GetPromptListResult}
 */
public final class GetPromptListResult extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.hearlers.v1.service.GetPromptListResult)
    GetPromptListResultOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      GetPromptListResult.class.getName());
  }
  // Use GetPromptListResult.newBuilder() to construct.
  private GetPromptListResult(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private GetPromptListResult() {
    promptList_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_GetPromptListResult_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_GetPromptListResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hearlers.api.proto.v1.service.GetPromptListResult.class, com.hearlers.api.proto.v1.service.GetPromptListResult.Builder.class);
  }

  public static final int PROMPT_LIST_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.hearlers.api.proto.v1.model.CounselPrompt> promptList_;
  /**
   * <code>repeated .com.hearlers.v1.model.CounselPrompt prompt_list = 1 [json_name = "promptList"];</code>
   */
  @java.lang.Override
  public java.util.List<com.hearlers.api.proto.v1.model.CounselPrompt> getPromptListList() {
    return promptList_;
  }
  /**
   * <code>repeated .com.hearlers.v1.model.CounselPrompt prompt_list = 1 [json_name = "promptList"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.hearlers.api.proto.v1.model.CounselPromptOrBuilder> 
      getPromptListOrBuilderList() {
    return promptList_;
  }
  /**
   * <code>repeated .com.hearlers.v1.model.CounselPrompt prompt_list = 1 [json_name = "promptList"];</code>
   */
  @java.lang.Override
  public int getPromptListCount() {
    return promptList_.size();
  }
  /**
   * <code>repeated .com.hearlers.v1.model.CounselPrompt prompt_list = 1 [json_name = "promptList"];</code>
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.CounselPrompt getPromptList(int index) {
    return promptList_.get(index);
  }
  /**
   * <code>repeated .com.hearlers.v1.model.CounselPrompt prompt_list = 1 [json_name = "promptList"];</code>
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.CounselPromptOrBuilder getPromptListOrBuilder(
      int index) {
    return promptList_.get(index);
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
    for (int i = 0; i < promptList_.size(); i++) {
      output.writeMessage(1, promptList_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < promptList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, promptList_.get(i));
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
    if (!(obj instanceof com.hearlers.api.proto.v1.service.GetPromptListResult)) {
      return super.equals(obj);
    }
    com.hearlers.api.proto.v1.service.GetPromptListResult other = (com.hearlers.api.proto.v1.service.GetPromptListResult) obj;

    if (!getPromptListList()
        .equals(other.getPromptListList())) return false;
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
    if (getPromptListCount() > 0) {
      hash = (37 * hash) + PROMPT_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getPromptListList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hearlers.api.proto.v1.service.GetPromptListResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.GetPromptListResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.GetPromptListResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.GetPromptListResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.GetPromptListResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.GetPromptListResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.GetPromptListResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.GetPromptListResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.hearlers.api.proto.v1.service.GetPromptListResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.hearlers.api.proto.v1.service.GetPromptListResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.GetPromptListResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.GetPromptListResult parseFrom(
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
  public static Builder newBuilder(com.hearlers.api.proto.v1.service.GetPromptListResult prototype) {
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
   * Protobuf type {@code com.hearlers.v1.service.GetPromptListResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hearlers.v1.service.GetPromptListResult)
      com.hearlers.api.proto.v1.service.GetPromptListResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_GetPromptListResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_GetPromptListResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hearlers.api.proto.v1.service.GetPromptListResult.class, com.hearlers.api.proto.v1.service.GetPromptListResult.Builder.class);
    }

    // Construct using com.hearlers.api.proto.v1.service.GetPromptListResult.newBuilder()
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
      if (promptListBuilder_ == null) {
        promptList_ = java.util.Collections.emptyList();
      } else {
        promptList_ = null;
        promptListBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_GetPromptListResult_descriptor;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.GetPromptListResult getDefaultInstanceForType() {
      return com.hearlers.api.proto.v1.service.GetPromptListResult.getDefaultInstance();
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.GetPromptListResult build() {
      com.hearlers.api.proto.v1.service.GetPromptListResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.GetPromptListResult buildPartial() {
      com.hearlers.api.proto.v1.service.GetPromptListResult result = new com.hearlers.api.proto.v1.service.GetPromptListResult(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.hearlers.api.proto.v1.service.GetPromptListResult result) {
      if (promptListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          promptList_ = java.util.Collections.unmodifiableList(promptList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.promptList_ = promptList_;
      } else {
        result.promptList_ = promptListBuilder_.build();
      }
    }

    private void buildPartial0(com.hearlers.api.proto.v1.service.GetPromptListResult result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hearlers.api.proto.v1.service.GetPromptListResult) {
        return mergeFrom((com.hearlers.api.proto.v1.service.GetPromptListResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hearlers.api.proto.v1.service.GetPromptListResult other) {
      if (other == com.hearlers.api.proto.v1.service.GetPromptListResult.getDefaultInstance()) return this;
      if (promptListBuilder_ == null) {
        if (!other.promptList_.isEmpty()) {
          if (promptList_.isEmpty()) {
            promptList_ = other.promptList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePromptListIsMutable();
            promptList_.addAll(other.promptList_);
          }
          onChanged();
        }
      } else {
        if (!other.promptList_.isEmpty()) {
          if (promptListBuilder_.isEmpty()) {
            promptListBuilder_.dispose();
            promptListBuilder_ = null;
            promptList_ = other.promptList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            promptListBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getPromptListFieldBuilder() : null;
          } else {
            promptListBuilder_.addAllMessages(other.promptList_);
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
              com.hearlers.api.proto.v1.model.CounselPrompt m =
                  input.readMessage(
                      com.hearlers.api.proto.v1.model.CounselPrompt.parser(),
                      extensionRegistry);
              if (promptListBuilder_ == null) {
                ensurePromptListIsMutable();
                promptList_.add(m);
              } else {
                promptListBuilder_.addMessage(m);
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

    private java.util.List<com.hearlers.api.proto.v1.model.CounselPrompt> promptList_ =
      java.util.Collections.emptyList();
    private void ensurePromptListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        promptList_ = new java.util.ArrayList<com.hearlers.api.proto.v1.model.CounselPrompt>(promptList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.hearlers.api.proto.v1.model.CounselPrompt, com.hearlers.api.proto.v1.model.CounselPrompt.Builder, com.hearlers.api.proto.v1.model.CounselPromptOrBuilder> promptListBuilder_;

    /**
     * <code>repeated .com.hearlers.v1.model.CounselPrompt prompt_list = 1 [json_name = "promptList"];</code>
     */
    public java.util.List<com.hearlers.api.proto.v1.model.CounselPrompt> getPromptListList() {
      if (promptListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(promptList_);
      } else {
        return promptListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselPrompt prompt_list = 1 [json_name = "promptList"];</code>
     */
    public int getPromptListCount() {
      if (promptListBuilder_ == null) {
        return promptList_.size();
      } else {
        return promptListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselPrompt prompt_list = 1 [json_name = "promptList"];</code>
     */
    public com.hearlers.api.proto.v1.model.CounselPrompt getPromptList(int index) {
      if (promptListBuilder_ == null) {
        return promptList_.get(index);
      } else {
        return promptListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselPrompt prompt_list = 1 [json_name = "promptList"];</code>
     */
    public Builder setPromptList(
        int index, com.hearlers.api.proto.v1.model.CounselPrompt value) {
      if (promptListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePromptListIsMutable();
        promptList_.set(index, value);
        onChanged();
      } else {
        promptListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselPrompt prompt_list = 1 [json_name = "promptList"];</code>
     */
    public Builder setPromptList(
        int index, com.hearlers.api.proto.v1.model.CounselPrompt.Builder builderForValue) {
      if (promptListBuilder_ == null) {
        ensurePromptListIsMutable();
        promptList_.set(index, builderForValue.build());
        onChanged();
      } else {
        promptListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselPrompt prompt_list = 1 [json_name = "promptList"];</code>
     */
    public Builder addPromptList(com.hearlers.api.proto.v1.model.CounselPrompt value) {
      if (promptListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePromptListIsMutable();
        promptList_.add(value);
        onChanged();
      } else {
        promptListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselPrompt prompt_list = 1 [json_name = "promptList"];</code>
     */
    public Builder addPromptList(
        int index, com.hearlers.api.proto.v1.model.CounselPrompt value) {
      if (promptListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePromptListIsMutable();
        promptList_.add(index, value);
        onChanged();
      } else {
        promptListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselPrompt prompt_list = 1 [json_name = "promptList"];</code>
     */
    public Builder addPromptList(
        com.hearlers.api.proto.v1.model.CounselPrompt.Builder builderForValue) {
      if (promptListBuilder_ == null) {
        ensurePromptListIsMutable();
        promptList_.add(builderForValue.build());
        onChanged();
      } else {
        promptListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselPrompt prompt_list = 1 [json_name = "promptList"];</code>
     */
    public Builder addPromptList(
        int index, com.hearlers.api.proto.v1.model.CounselPrompt.Builder builderForValue) {
      if (promptListBuilder_ == null) {
        ensurePromptListIsMutable();
        promptList_.add(index, builderForValue.build());
        onChanged();
      } else {
        promptListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselPrompt prompt_list = 1 [json_name = "promptList"];</code>
     */
    public Builder addAllPromptList(
        java.lang.Iterable<? extends com.hearlers.api.proto.v1.model.CounselPrompt> values) {
      if (promptListBuilder_ == null) {
        ensurePromptListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, promptList_);
        onChanged();
      } else {
        promptListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselPrompt prompt_list = 1 [json_name = "promptList"];</code>
     */
    public Builder clearPromptList() {
      if (promptListBuilder_ == null) {
        promptList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        promptListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselPrompt prompt_list = 1 [json_name = "promptList"];</code>
     */
    public Builder removePromptList(int index) {
      if (promptListBuilder_ == null) {
        ensurePromptListIsMutable();
        promptList_.remove(index);
        onChanged();
      } else {
        promptListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselPrompt prompt_list = 1 [json_name = "promptList"];</code>
     */
    public com.hearlers.api.proto.v1.model.CounselPrompt.Builder getPromptListBuilder(
        int index) {
      return getPromptListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselPrompt prompt_list = 1 [json_name = "promptList"];</code>
     */
    public com.hearlers.api.proto.v1.model.CounselPromptOrBuilder getPromptListOrBuilder(
        int index) {
      if (promptListBuilder_ == null) {
        return promptList_.get(index);  } else {
        return promptListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselPrompt prompt_list = 1 [json_name = "promptList"];</code>
     */
    public java.util.List<? extends com.hearlers.api.proto.v1.model.CounselPromptOrBuilder> 
         getPromptListOrBuilderList() {
      if (promptListBuilder_ != null) {
        return promptListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(promptList_);
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselPrompt prompt_list = 1 [json_name = "promptList"];</code>
     */
    public com.hearlers.api.proto.v1.model.CounselPrompt.Builder addPromptListBuilder() {
      return getPromptListFieldBuilder().addBuilder(
          com.hearlers.api.proto.v1.model.CounselPrompt.getDefaultInstance());
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselPrompt prompt_list = 1 [json_name = "promptList"];</code>
     */
    public com.hearlers.api.proto.v1.model.CounselPrompt.Builder addPromptListBuilder(
        int index) {
      return getPromptListFieldBuilder().addBuilder(
          index, com.hearlers.api.proto.v1.model.CounselPrompt.getDefaultInstance());
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselPrompt prompt_list = 1 [json_name = "promptList"];</code>
     */
    public java.util.List<com.hearlers.api.proto.v1.model.CounselPrompt.Builder> 
         getPromptListBuilderList() {
      return getPromptListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.hearlers.api.proto.v1.model.CounselPrompt, com.hearlers.api.proto.v1.model.CounselPrompt.Builder, com.hearlers.api.proto.v1.model.CounselPromptOrBuilder> 
        getPromptListFieldBuilder() {
      if (promptListBuilder_ == null) {
        promptListBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.hearlers.api.proto.v1.model.CounselPrompt, com.hearlers.api.proto.v1.model.CounselPrompt.Builder, com.hearlers.api.proto.v1.model.CounselPromptOrBuilder>(
                promptList_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        promptList_ = null;
      }
      return promptListBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:com.hearlers.v1.service.GetPromptListResult)
  }

  // @@protoc_insertion_point(class_scope:com.hearlers.v1.service.GetPromptListResult)
  private static final com.hearlers.api.proto.v1.service.GetPromptListResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hearlers.api.proto.v1.service.GetPromptListResult();
  }

  public static com.hearlers.api.proto.v1.service.GetPromptListResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetPromptListResult>
      PARSER = new com.google.protobuf.AbstractParser<GetPromptListResult>() {
    @java.lang.Override
    public GetPromptListResult parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetPromptListResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetPromptListResult> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hearlers.api.proto.v1.service.GetPromptListResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
