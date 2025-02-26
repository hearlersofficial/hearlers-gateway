// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

/**
 * Protobuf type {@code com.hearlers.v1.service.SaveCounselTechniqueSequenceResponse}
 */
public final class SaveCounselTechniqueSequenceResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.hearlers.v1.service.SaveCounselTechniqueSequenceResponse)
    SaveCounselTechniqueSequenceResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      SaveCounselTechniqueSequenceResponse.class.getName());
  }
  // Use SaveCounselTechniqueSequenceResponse.newBuilder() to construct.
  private SaveCounselTechniqueSequenceResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private SaveCounselTechniqueSequenceResponse() {
    counselTechniques_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_SaveCounselTechniqueSequenceResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_SaveCounselTechniqueSequenceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse.class, com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse.Builder.class);
  }

  public static final int COUNSEL_TECHNIQUES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.hearlers.api.proto.v1.model.CounselTechnique> counselTechniques_;
  /**
   * <code>repeated .com.hearlers.v1.model.CounselTechnique counsel_techniques = 1 [json_name = "counselTechniques"];</code>
   */
  @java.lang.Override
  public java.util.List<com.hearlers.api.proto.v1.model.CounselTechnique> getCounselTechniquesList() {
    return counselTechniques_;
  }
  /**
   * <code>repeated .com.hearlers.v1.model.CounselTechnique counsel_techniques = 1 [json_name = "counselTechniques"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.hearlers.api.proto.v1.model.CounselTechniqueOrBuilder> 
      getCounselTechniquesOrBuilderList() {
    return counselTechniques_;
  }
  /**
   * <code>repeated .com.hearlers.v1.model.CounselTechnique counsel_techniques = 1 [json_name = "counselTechniques"];</code>
   */
  @java.lang.Override
  public int getCounselTechniquesCount() {
    return counselTechniques_.size();
  }
  /**
   * <code>repeated .com.hearlers.v1.model.CounselTechnique counsel_techniques = 1 [json_name = "counselTechniques"];</code>
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.CounselTechnique getCounselTechniques(int index) {
    return counselTechniques_.get(index);
  }
  /**
   * <code>repeated .com.hearlers.v1.model.CounselTechnique counsel_techniques = 1 [json_name = "counselTechniques"];</code>
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.CounselTechniqueOrBuilder getCounselTechniquesOrBuilder(
      int index) {
    return counselTechniques_.get(index);
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
    for (int i = 0; i < counselTechniques_.size(); i++) {
      output.writeMessage(1, counselTechniques_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < counselTechniques_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, counselTechniques_.get(i));
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
    if (!(obj instanceof com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse)) {
      return super.equals(obj);
    }
    com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse other = (com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse) obj;

    if (!getCounselTechniquesList()
        .equals(other.getCounselTechniquesList())) return false;
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
    if (getCounselTechniquesCount() > 0) {
      hash = (37 * hash) + COUNSEL_TECHNIQUES_FIELD_NUMBER;
      hash = (53 * hash) + getCounselTechniquesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse parseFrom(
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
  public static Builder newBuilder(com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse prototype) {
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
   * Protobuf type {@code com.hearlers.v1.service.SaveCounselTechniqueSequenceResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hearlers.v1.service.SaveCounselTechniqueSequenceResponse)
      com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_SaveCounselTechniqueSequenceResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_SaveCounselTechniqueSequenceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse.class, com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse.Builder.class);
    }

    // Construct using com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse.newBuilder()
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
      if (counselTechniquesBuilder_ == null) {
        counselTechniques_ = java.util.Collections.emptyList();
      } else {
        counselTechniques_ = null;
        counselTechniquesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_SaveCounselTechniqueSequenceResponse_descriptor;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse getDefaultInstanceForType() {
      return com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse build() {
      com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse buildPartial() {
      com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse result = new com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse result) {
      if (counselTechniquesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          counselTechniques_ = java.util.Collections.unmodifiableList(counselTechniques_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.counselTechniques_ = counselTechniques_;
      } else {
        result.counselTechniques_ = counselTechniquesBuilder_.build();
      }
    }

    private void buildPartial0(com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse) {
        return mergeFrom((com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse other) {
      if (other == com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse.getDefaultInstance()) return this;
      if (counselTechniquesBuilder_ == null) {
        if (!other.counselTechniques_.isEmpty()) {
          if (counselTechniques_.isEmpty()) {
            counselTechniques_ = other.counselTechniques_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCounselTechniquesIsMutable();
            counselTechniques_.addAll(other.counselTechniques_);
          }
          onChanged();
        }
      } else {
        if (!other.counselTechniques_.isEmpty()) {
          if (counselTechniquesBuilder_.isEmpty()) {
            counselTechniquesBuilder_.dispose();
            counselTechniquesBuilder_ = null;
            counselTechniques_ = other.counselTechniques_;
            bitField0_ = (bitField0_ & ~0x00000001);
            counselTechniquesBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getCounselTechniquesFieldBuilder() : null;
          } else {
            counselTechniquesBuilder_.addAllMessages(other.counselTechniques_);
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
              com.hearlers.api.proto.v1.model.CounselTechnique m =
                  input.readMessage(
                      com.hearlers.api.proto.v1.model.CounselTechnique.parser(),
                      extensionRegistry);
              if (counselTechniquesBuilder_ == null) {
                ensureCounselTechniquesIsMutable();
                counselTechniques_.add(m);
              } else {
                counselTechniquesBuilder_.addMessage(m);
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

    private java.util.List<com.hearlers.api.proto.v1.model.CounselTechnique> counselTechniques_ =
      java.util.Collections.emptyList();
    private void ensureCounselTechniquesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        counselTechniques_ = new java.util.ArrayList<com.hearlers.api.proto.v1.model.CounselTechnique>(counselTechniques_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.hearlers.api.proto.v1.model.CounselTechnique, com.hearlers.api.proto.v1.model.CounselTechnique.Builder, com.hearlers.api.proto.v1.model.CounselTechniqueOrBuilder> counselTechniquesBuilder_;

    /**
     * <code>repeated .com.hearlers.v1.model.CounselTechnique counsel_techniques = 1 [json_name = "counselTechniques"];</code>
     */
    public java.util.List<com.hearlers.api.proto.v1.model.CounselTechnique> getCounselTechniquesList() {
      if (counselTechniquesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(counselTechniques_);
      } else {
        return counselTechniquesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselTechnique counsel_techniques = 1 [json_name = "counselTechniques"];</code>
     */
    public int getCounselTechniquesCount() {
      if (counselTechniquesBuilder_ == null) {
        return counselTechniques_.size();
      } else {
        return counselTechniquesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselTechnique counsel_techniques = 1 [json_name = "counselTechniques"];</code>
     */
    public com.hearlers.api.proto.v1.model.CounselTechnique getCounselTechniques(int index) {
      if (counselTechniquesBuilder_ == null) {
        return counselTechniques_.get(index);
      } else {
        return counselTechniquesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselTechnique counsel_techniques = 1 [json_name = "counselTechniques"];</code>
     */
    public Builder setCounselTechniques(
        int index, com.hearlers.api.proto.v1.model.CounselTechnique value) {
      if (counselTechniquesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCounselTechniquesIsMutable();
        counselTechniques_.set(index, value);
        onChanged();
      } else {
        counselTechniquesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselTechnique counsel_techniques = 1 [json_name = "counselTechniques"];</code>
     */
    public Builder setCounselTechniques(
        int index, com.hearlers.api.proto.v1.model.CounselTechnique.Builder builderForValue) {
      if (counselTechniquesBuilder_ == null) {
        ensureCounselTechniquesIsMutable();
        counselTechniques_.set(index, builderForValue.build());
        onChanged();
      } else {
        counselTechniquesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselTechnique counsel_techniques = 1 [json_name = "counselTechniques"];</code>
     */
    public Builder addCounselTechniques(com.hearlers.api.proto.v1.model.CounselTechnique value) {
      if (counselTechniquesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCounselTechniquesIsMutable();
        counselTechniques_.add(value);
        onChanged();
      } else {
        counselTechniquesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselTechnique counsel_techniques = 1 [json_name = "counselTechniques"];</code>
     */
    public Builder addCounselTechniques(
        int index, com.hearlers.api.proto.v1.model.CounselTechnique value) {
      if (counselTechniquesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCounselTechniquesIsMutable();
        counselTechniques_.add(index, value);
        onChanged();
      } else {
        counselTechniquesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselTechnique counsel_techniques = 1 [json_name = "counselTechniques"];</code>
     */
    public Builder addCounselTechniques(
        com.hearlers.api.proto.v1.model.CounselTechnique.Builder builderForValue) {
      if (counselTechniquesBuilder_ == null) {
        ensureCounselTechniquesIsMutable();
        counselTechniques_.add(builderForValue.build());
        onChanged();
      } else {
        counselTechniquesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselTechnique counsel_techniques = 1 [json_name = "counselTechniques"];</code>
     */
    public Builder addCounselTechniques(
        int index, com.hearlers.api.proto.v1.model.CounselTechnique.Builder builderForValue) {
      if (counselTechniquesBuilder_ == null) {
        ensureCounselTechniquesIsMutable();
        counselTechniques_.add(index, builderForValue.build());
        onChanged();
      } else {
        counselTechniquesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselTechnique counsel_techniques = 1 [json_name = "counselTechniques"];</code>
     */
    public Builder addAllCounselTechniques(
        java.lang.Iterable<? extends com.hearlers.api.proto.v1.model.CounselTechnique> values) {
      if (counselTechniquesBuilder_ == null) {
        ensureCounselTechniquesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, counselTechniques_);
        onChanged();
      } else {
        counselTechniquesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselTechnique counsel_techniques = 1 [json_name = "counselTechniques"];</code>
     */
    public Builder clearCounselTechniques() {
      if (counselTechniquesBuilder_ == null) {
        counselTechniques_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        counselTechniquesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselTechnique counsel_techniques = 1 [json_name = "counselTechniques"];</code>
     */
    public Builder removeCounselTechniques(int index) {
      if (counselTechniquesBuilder_ == null) {
        ensureCounselTechniquesIsMutable();
        counselTechniques_.remove(index);
        onChanged();
      } else {
        counselTechniquesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselTechnique counsel_techniques = 1 [json_name = "counselTechniques"];</code>
     */
    public com.hearlers.api.proto.v1.model.CounselTechnique.Builder getCounselTechniquesBuilder(
        int index) {
      return getCounselTechniquesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselTechnique counsel_techniques = 1 [json_name = "counselTechniques"];</code>
     */
    public com.hearlers.api.proto.v1.model.CounselTechniqueOrBuilder getCounselTechniquesOrBuilder(
        int index) {
      if (counselTechniquesBuilder_ == null) {
        return counselTechniques_.get(index);  } else {
        return counselTechniquesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselTechnique counsel_techniques = 1 [json_name = "counselTechniques"];</code>
     */
    public java.util.List<? extends com.hearlers.api.proto.v1.model.CounselTechniqueOrBuilder> 
         getCounselTechniquesOrBuilderList() {
      if (counselTechniquesBuilder_ != null) {
        return counselTechniquesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(counselTechniques_);
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselTechnique counsel_techniques = 1 [json_name = "counselTechniques"];</code>
     */
    public com.hearlers.api.proto.v1.model.CounselTechnique.Builder addCounselTechniquesBuilder() {
      return getCounselTechniquesFieldBuilder().addBuilder(
          com.hearlers.api.proto.v1.model.CounselTechnique.getDefaultInstance());
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselTechnique counsel_techniques = 1 [json_name = "counselTechniques"];</code>
     */
    public com.hearlers.api.proto.v1.model.CounselTechnique.Builder addCounselTechniquesBuilder(
        int index) {
      return getCounselTechniquesFieldBuilder().addBuilder(
          index, com.hearlers.api.proto.v1.model.CounselTechnique.getDefaultInstance());
    }
    /**
     * <code>repeated .com.hearlers.v1.model.CounselTechnique counsel_techniques = 1 [json_name = "counselTechniques"];</code>
     */
    public java.util.List<com.hearlers.api.proto.v1.model.CounselTechnique.Builder> 
         getCounselTechniquesBuilderList() {
      return getCounselTechniquesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.hearlers.api.proto.v1.model.CounselTechnique, com.hearlers.api.proto.v1.model.CounselTechnique.Builder, com.hearlers.api.proto.v1.model.CounselTechniqueOrBuilder> 
        getCounselTechniquesFieldBuilder() {
      if (counselTechniquesBuilder_ == null) {
        counselTechniquesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.hearlers.api.proto.v1.model.CounselTechnique, com.hearlers.api.proto.v1.model.CounselTechnique.Builder, com.hearlers.api.proto.v1.model.CounselTechniqueOrBuilder>(
                counselTechniques_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        counselTechniques_ = null;
      }
      return counselTechniquesBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:com.hearlers.v1.service.SaveCounselTechniqueSequenceResponse)
  }

  // @@protoc_insertion_point(class_scope:com.hearlers.v1.service.SaveCounselTechniqueSequenceResponse)
  private static final com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse();
  }

  public static com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SaveCounselTechniqueSequenceResponse>
      PARSER = new com.google.protobuf.AbstractParser<SaveCounselTechniqueSequenceResponse>() {
    @java.lang.Override
    public SaveCounselTechniqueSequenceResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SaveCounselTechniqueSequenceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SaveCounselTechniqueSequenceResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hearlers.api.proto.v1.service.SaveCounselTechniqueSequenceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

