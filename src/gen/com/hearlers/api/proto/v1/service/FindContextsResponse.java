// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

/**
 * Protobuf type {@code com.hearlers.v1.service.FindContextsResponse}
 */
public final class FindContextsResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.hearlers.v1.service.FindContextsResponse)
    FindContextsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      FindContextsResponse.class.getName());
  }
  // Use FindContextsResponse.newBuilder() to construct.
  private FindContextsResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private FindContextsResponse() {
    contexts_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindContextsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindContextsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hearlers.api.proto.v1.service.FindContextsResponse.class, com.hearlers.api.proto.v1.service.FindContextsResponse.Builder.class);
  }

  public static final int CONTEXTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.hearlers.api.proto.v1.model.Context> contexts_;
  /**
   * <code>repeated .com.hearlers.v1.model.Context contexts = 1 [json_name = "contexts"];</code>
   */
  @java.lang.Override
  public java.util.List<com.hearlers.api.proto.v1.model.Context> getContextsList() {
    return contexts_;
  }
  /**
   * <code>repeated .com.hearlers.v1.model.Context contexts = 1 [json_name = "contexts"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.hearlers.api.proto.v1.model.ContextOrBuilder> 
      getContextsOrBuilderList() {
    return contexts_;
  }
  /**
   * <code>repeated .com.hearlers.v1.model.Context contexts = 1 [json_name = "contexts"];</code>
   */
  @java.lang.Override
  public int getContextsCount() {
    return contexts_.size();
  }
  /**
   * <code>repeated .com.hearlers.v1.model.Context contexts = 1 [json_name = "contexts"];</code>
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.Context getContexts(int index) {
    return contexts_.get(index);
  }
  /**
   * <code>repeated .com.hearlers.v1.model.Context contexts = 1 [json_name = "contexts"];</code>
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.ContextOrBuilder getContextsOrBuilder(
      int index) {
    return contexts_.get(index);
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
    for (int i = 0; i < contexts_.size(); i++) {
      output.writeMessage(1, contexts_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < contexts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, contexts_.get(i));
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
    if (!(obj instanceof com.hearlers.api.proto.v1.service.FindContextsResponse)) {
      return super.equals(obj);
    }
    com.hearlers.api.proto.v1.service.FindContextsResponse other = (com.hearlers.api.proto.v1.service.FindContextsResponse) obj;

    if (!getContextsList()
        .equals(other.getContextsList())) return false;
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
    if (getContextsCount() > 0) {
      hash = (37 * hash) + CONTEXTS_FIELD_NUMBER;
      hash = (53 * hash) + getContextsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hearlers.api.proto.v1.service.FindContextsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindContextsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindContextsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindContextsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindContextsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindContextsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindContextsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.FindContextsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.hearlers.api.proto.v1.service.FindContextsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.hearlers.api.proto.v1.service.FindContextsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindContextsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.FindContextsResponse parseFrom(
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
  public static Builder newBuilder(com.hearlers.api.proto.v1.service.FindContextsResponse prototype) {
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
   * Protobuf type {@code com.hearlers.v1.service.FindContextsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hearlers.v1.service.FindContextsResponse)
      com.hearlers.api.proto.v1.service.FindContextsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindContextsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindContextsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hearlers.api.proto.v1.service.FindContextsResponse.class, com.hearlers.api.proto.v1.service.FindContextsResponse.Builder.class);
    }

    // Construct using com.hearlers.api.proto.v1.service.FindContextsResponse.newBuilder()
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
      if (contextsBuilder_ == null) {
        contexts_ = java.util.Collections.emptyList();
      } else {
        contexts_ = null;
        contextsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindContextsResponse_descriptor;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindContextsResponse getDefaultInstanceForType() {
      return com.hearlers.api.proto.v1.service.FindContextsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindContextsResponse build() {
      com.hearlers.api.proto.v1.service.FindContextsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindContextsResponse buildPartial() {
      com.hearlers.api.proto.v1.service.FindContextsResponse result = new com.hearlers.api.proto.v1.service.FindContextsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.hearlers.api.proto.v1.service.FindContextsResponse result) {
      if (contextsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          contexts_ = java.util.Collections.unmodifiableList(contexts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.contexts_ = contexts_;
      } else {
        result.contexts_ = contextsBuilder_.build();
      }
    }

    private void buildPartial0(com.hearlers.api.proto.v1.service.FindContextsResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hearlers.api.proto.v1.service.FindContextsResponse) {
        return mergeFrom((com.hearlers.api.proto.v1.service.FindContextsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hearlers.api.proto.v1.service.FindContextsResponse other) {
      if (other == com.hearlers.api.proto.v1.service.FindContextsResponse.getDefaultInstance()) return this;
      if (contextsBuilder_ == null) {
        if (!other.contexts_.isEmpty()) {
          if (contexts_.isEmpty()) {
            contexts_ = other.contexts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureContextsIsMutable();
            contexts_.addAll(other.contexts_);
          }
          onChanged();
        }
      } else {
        if (!other.contexts_.isEmpty()) {
          if (contextsBuilder_.isEmpty()) {
            contextsBuilder_.dispose();
            contextsBuilder_ = null;
            contexts_ = other.contexts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            contextsBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getContextsFieldBuilder() : null;
          } else {
            contextsBuilder_.addAllMessages(other.contexts_);
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
              com.hearlers.api.proto.v1.model.Context m =
                  input.readMessage(
                      com.hearlers.api.proto.v1.model.Context.parser(),
                      extensionRegistry);
              if (contextsBuilder_ == null) {
                ensureContextsIsMutable();
                contexts_.add(m);
              } else {
                contextsBuilder_.addMessage(m);
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

    private java.util.List<com.hearlers.api.proto.v1.model.Context> contexts_ =
      java.util.Collections.emptyList();
    private void ensureContextsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        contexts_ = new java.util.ArrayList<com.hearlers.api.proto.v1.model.Context>(contexts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.hearlers.api.proto.v1.model.Context, com.hearlers.api.proto.v1.model.Context.Builder, com.hearlers.api.proto.v1.model.ContextOrBuilder> contextsBuilder_;

    /**
     * <code>repeated .com.hearlers.v1.model.Context contexts = 1 [json_name = "contexts"];</code>
     */
    public java.util.List<com.hearlers.api.proto.v1.model.Context> getContextsList() {
      if (contextsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(contexts_);
      } else {
        return contextsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Context contexts = 1 [json_name = "contexts"];</code>
     */
    public int getContextsCount() {
      if (contextsBuilder_ == null) {
        return contexts_.size();
      } else {
        return contextsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Context contexts = 1 [json_name = "contexts"];</code>
     */
    public com.hearlers.api.proto.v1.model.Context getContexts(int index) {
      if (contextsBuilder_ == null) {
        return contexts_.get(index);
      } else {
        return contextsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Context contexts = 1 [json_name = "contexts"];</code>
     */
    public Builder setContexts(
        int index, com.hearlers.api.proto.v1.model.Context value) {
      if (contextsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContextsIsMutable();
        contexts_.set(index, value);
        onChanged();
      } else {
        contextsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Context contexts = 1 [json_name = "contexts"];</code>
     */
    public Builder setContexts(
        int index, com.hearlers.api.proto.v1.model.Context.Builder builderForValue) {
      if (contextsBuilder_ == null) {
        ensureContextsIsMutable();
        contexts_.set(index, builderForValue.build());
        onChanged();
      } else {
        contextsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Context contexts = 1 [json_name = "contexts"];</code>
     */
    public Builder addContexts(com.hearlers.api.proto.v1.model.Context value) {
      if (contextsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContextsIsMutable();
        contexts_.add(value);
        onChanged();
      } else {
        contextsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Context contexts = 1 [json_name = "contexts"];</code>
     */
    public Builder addContexts(
        int index, com.hearlers.api.proto.v1.model.Context value) {
      if (contextsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureContextsIsMutable();
        contexts_.add(index, value);
        onChanged();
      } else {
        contextsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Context contexts = 1 [json_name = "contexts"];</code>
     */
    public Builder addContexts(
        com.hearlers.api.proto.v1.model.Context.Builder builderForValue) {
      if (contextsBuilder_ == null) {
        ensureContextsIsMutable();
        contexts_.add(builderForValue.build());
        onChanged();
      } else {
        contextsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Context contexts = 1 [json_name = "contexts"];</code>
     */
    public Builder addContexts(
        int index, com.hearlers.api.proto.v1.model.Context.Builder builderForValue) {
      if (contextsBuilder_ == null) {
        ensureContextsIsMutable();
        contexts_.add(index, builderForValue.build());
        onChanged();
      } else {
        contextsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Context contexts = 1 [json_name = "contexts"];</code>
     */
    public Builder addAllContexts(
        java.lang.Iterable<? extends com.hearlers.api.proto.v1.model.Context> values) {
      if (contextsBuilder_ == null) {
        ensureContextsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, contexts_);
        onChanged();
      } else {
        contextsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Context contexts = 1 [json_name = "contexts"];</code>
     */
    public Builder clearContexts() {
      if (contextsBuilder_ == null) {
        contexts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        contextsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Context contexts = 1 [json_name = "contexts"];</code>
     */
    public Builder removeContexts(int index) {
      if (contextsBuilder_ == null) {
        ensureContextsIsMutable();
        contexts_.remove(index);
        onChanged();
      } else {
        contextsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Context contexts = 1 [json_name = "contexts"];</code>
     */
    public com.hearlers.api.proto.v1.model.Context.Builder getContextsBuilder(
        int index) {
      return getContextsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Context contexts = 1 [json_name = "contexts"];</code>
     */
    public com.hearlers.api.proto.v1.model.ContextOrBuilder getContextsOrBuilder(
        int index) {
      if (contextsBuilder_ == null) {
        return contexts_.get(index);  } else {
        return contextsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Context contexts = 1 [json_name = "contexts"];</code>
     */
    public java.util.List<? extends com.hearlers.api.proto.v1.model.ContextOrBuilder> 
         getContextsOrBuilderList() {
      if (contextsBuilder_ != null) {
        return contextsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(contexts_);
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Context contexts = 1 [json_name = "contexts"];</code>
     */
    public com.hearlers.api.proto.v1.model.Context.Builder addContextsBuilder() {
      return getContextsFieldBuilder().addBuilder(
          com.hearlers.api.proto.v1.model.Context.getDefaultInstance());
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Context contexts = 1 [json_name = "contexts"];</code>
     */
    public com.hearlers.api.proto.v1.model.Context.Builder addContextsBuilder(
        int index) {
      return getContextsFieldBuilder().addBuilder(
          index, com.hearlers.api.proto.v1.model.Context.getDefaultInstance());
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Context contexts = 1 [json_name = "contexts"];</code>
     */
    public java.util.List<com.hearlers.api.proto.v1.model.Context.Builder> 
         getContextsBuilderList() {
      return getContextsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.hearlers.api.proto.v1.model.Context, com.hearlers.api.proto.v1.model.Context.Builder, com.hearlers.api.proto.v1.model.ContextOrBuilder> 
        getContextsFieldBuilder() {
      if (contextsBuilder_ == null) {
        contextsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.hearlers.api.proto.v1.model.Context, com.hearlers.api.proto.v1.model.Context.Builder, com.hearlers.api.proto.v1.model.ContextOrBuilder>(
                contexts_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        contexts_ = null;
      }
      return contextsBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:com.hearlers.v1.service.FindContextsResponse)
  }

  // @@protoc_insertion_point(class_scope:com.hearlers.v1.service.FindContextsResponse)
  private static final com.hearlers.api.proto.v1.service.FindContextsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hearlers.api.proto.v1.service.FindContextsResponse();
  }

  public static com.hearlers.api.proto.v1.service.FindContextsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FindContextsResponse>
      PARSER = new com.google.protobuf.AbstractParser<FindContextsResponse>() {
    @java.lang.Override
    public FindContextsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<FindContextsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FindContextsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hearlers.api.proto.v1.service.FindContextsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

