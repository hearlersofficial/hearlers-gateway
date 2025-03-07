// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

/**
 * Protobuf type {@code com.hearlers.v1.service.FindPersonasResponse}
 */
public final class FindPersonasResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.hearlers.v1.service.FindPersonasResponse)
    FindPersonasResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      FindPersonasResponse.class.getName());
  }
  // Use FindPersonasResponse.newBuilder() to construct.
  private FindPersonasResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private FindPersonasResponse() {
    personas_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindPersonasResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindPersonasResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hearlers.api.proto.v1.service.FindPersonasResponse.class, com.hearlers.api.proto.v1.service.FindPersonasResponse.Builder.class);
  }

  public static final int PERSONAS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.hearlers.api.proto.v1.model.Persona> personas_;
  /**
   * <code>repeated .com.hearlers.v1.model.Persona personas = 1 [json_name = "personas"];</code>
   */
  @java.lang.Override
  public java.util.List<com.hearlers.api.proto.v1.model.Persona> getPersonasList() {
    return personas_;
  }
  /**
   * <code>repeated .com.hearlers.v1.model.Persona personas = 1 [json_name = "personas"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.hearlers.api.proto.v1.model.PersonaOrBuilder> 
      getPersonasOrBuilderList() {
    return personas_;
  }
  /**
   * <code>repeated .com.hearlers.v1.model.Persona personas = 1 [json_name = "personas"];</code>
   */
  @java.lang.Override
  public int getPersonasCount() {
    return personas_.size();
  }
  /**
   * <code>repeated .com.hearlers.v1.model.Persona personas = 1 [json_name = "personas"];</code>
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.Persona getPersonas(int index) {
    return personas_.get(index);
  }
  /**
   * <code>repeated .com.hearlers.v1.model.Persona personas = 1 [json_name = "personas"];</code>
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.PersonaOrBuilder getPersonasOrBuilder(
      int index) {
    return personas_.get(index);
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
    for (int i = 0; i < personas_.size(); i++) {
      output.writeMessage(1, personas_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < personas_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, personas_.get(i));
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
    if (!(obj instanceof com.hearlers.api.proto.v1.service.FindPersonasResponse)) {
      return super.equals(obj);
    }
    com.hearlers.api.proto.v1.service.FindPersonasResponse other = (com.hearlers.api.proto.v1.service.FindPersonasResponse) obj;

    if (!getPersonasList()
        .equals(other.getPersonasList())) return false;
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
    if (getPersonasCount() > 0) {
      hash = (37 * hash) + PERSONAS_FIELD_NUMBER;
      hash = (53 * hash) + getPersonasList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hearlers.api.proto.v1.service.FindPersonasResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindPersonasResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindPersonasResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindPersonasResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindPersonasResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.FindPersonasResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindPersonasResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.FindPersonasResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.hearlers.api.proto.v1.service.FindPersonasResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.hearlers.api.proto.v1.service.FindPersonasResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.FindPersonasResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.FindPersonasResponse parseFrom(
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
  public static Builder newBuilder(com.hearlers.api.proto.v1.service.FindPersonasResponse prototype) {
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
   * Protobuf type {@code com.hearlers.v1.service.FindPersonasResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hearlers.v1.service.FindPersonasResponse)
      com.hearlers.api.proto.v1.service.FindPersonasResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindPersonasResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindPersonasResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hearlers.api.proto.v1.service.FindPersonasResponse.class, com.hearlers.api.proto.v1.service.FindPersonasResponse.Builder.class);
    }

    // Construct using com.hearlers.api.proto.v1.service.FindPersonasResponse.newBuilder()
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
      if (personasBuilder_ == null) {
        personas_ = java.util.Collections.emptyList();
      } else {
        personas_ = null;
        personasBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_FindPersonasResponse_descriptor;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindPersonasResponse getDefaultInstanceForType() {
      return com.hearlers.api.proto.v1.service.FindPersonasResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindPersonasResponse build() {
      com.hearlers.api.proto.v1.service.FindPersonasResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.FindPersonasResponse buildPartial() {
      com.hearlers.api.proto.v1.service.FindPersonasResponse result = new com.hearlers.api.proto.v1.service.FindPersonasResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.hearlers.api.proto.v1.service.FindPersonasResponse result) {
      if (personasBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          personas_ = java.util.Collections.unmodifiableList(personas_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.personas_ = personas_;
      } else {
        result.personas_ = personasBuilder_.build();
      }
    }

    private void buildPartial0(com.hearlers.api.proto.v1.service.FindPersonasResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hearlers.api.proto.v1.service.FindPersonasResponse) {
        return mergeFrom((com.hearlers.api.proto.v1.service.FindPersonasResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hearlers.api.proto.v1.service.FindPersonasResponse other) {
      if (other == com.hearlers.api.proto.v1.service.FindPersonasResponse.getDefaultInstance()) return this;
      if (personasBuilder_ == null) {
        if (!other.personas_.isEmpty()) {
          if (personas_.isEmpty()) {
            personas_ = other.personas_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePersonasIsMutable();
            personas_.addAll(other.personas_);
          }
          onChanged();
        }
      } else {
        if (!other.personas_.isEmpty()) {
          if (personasBuilder_.isEmpty()) {
            personasBuilder_.dispose();
            personasBuilder_ = null;
            personas_ = other.personas_;
            bitField0_ = (bitField0_ & ~0x00000001);
            personasBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getPersonasFieldBuilder() : null;
          } else {
            personasBuilder_.addAllMessages(other.personas_);
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
              com.hearlers.api.proto.v1.model.Persona m =
                  input.readMessage(
                      com.hearlers.api.proto.v1.model.Persona.parser(),
                      extensionRegistry);
              if (personasBuilder_ == null) {
                ensurePersonasIsMutable();
                personas_.add(m);
              } else {
                personasBuilder_.addMessage(m);
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

    private java.util.List<com.hearlers.api.proto.v1.model.Persona> personas_ =
      java.util.Collections.emptyList();
    private void ensurePersonasIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        personas_ = new java.util.ArrayList<com.hearlers.api.proto.v1.model.Persona>(personas_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        com.hearlers.api.proto.v1.model.Persona, com.hearlers.api.proto.v1.model.Persona.Builder, com.hearlers.api.proto.v1.model.PersonaOrBuilder> personasBuilder_;

    /**
     * <code>repeated .com.hearlers.v1.model.Persona personas = 1 [json_name = "personas"];</code>
     */
    public java.util.List<com.hearlers.api.proto.v1.model.Persona> getPersonasList() {
      if (personasBuilder_ == null) {
        return java.util.Collections.unmodifiableList(personas_);
      } else {
        return personasBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Persona personas = 1 [json_name = "personas"];</code>
     */
    public int getPersonasCount() {
      if (personasBuilder_ == null) {
        return personas_.size();
      } else {
        return personasBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Persona personas = 1 [json_name = "personas"];</code>
     */
    public com.hearlers.api.proto.v1.model.Persona getPersonas(int index) {
      if (personasBuilder_ == null) {
        return personas_.get(index);
      } else {
        return personasBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Persona personas = 1 [json_name = "personas"];</code>
     */
    public Builder setPersonas(
        int index, com.hearlers.api.proto.v1.model.Persona value) {
      if (personasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersonasIsMutable();
        personas_.set(index, value);
        onChanged();
      } else {
        personasBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Persona personas = 1 [json_name = "personas"];</code>
     */
    public Builder setPersonas(
        int index, com.hearlers.api.proto.v1.model.Persona.Builder builderForValue) {
      if (personasBuilder_ == null) {
        ensurePersonasIsMutable();
        personas_.set(index, builderForValue.build());
        onChanged();
      } else {
        personasBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Persona personas = 1 [json_name = "personas"];</code>
     */
    public Builder addPersonas(com.hearlers.api.proto.v1.model.Persona value) {
      if (personasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersonasIsMutable();
        personas_.add(value);
        onChanged();
      } else {
        personasBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Persona personas = 1 [json_name = "personas"];</code>
     */
    public Builder addPersonas(
        int index, com.hearlers.api.proto.v1.model.Persona value) {
      if (personasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePersonasIsMutable();
        personas_.add(index, value);
        onChanged();
      } else {
        personasBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Persona personas = 1 [json_name = "personas"];</code>
     */
    public Builder addPersonas(
        com.hearlers.api.proto.v1.model.Persona.Builder builderForValue) {
      if (personasBuilder_ == null) {
        ensurePersonasIsMutable();
        personas_.add(builderForValue.build());
        onChanged();
      } else {
        personasBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Persona personas = 1 [json_name = "personas"];</code>
     */
    public Builder addPersonas(
        int index, com.hearlers.api.proto.v1.model.Persona.Builder builderForValue) {
      if (personasBuilder_ == null) {
        ensurePersonasIsMutable();
        personas_.add(index, builderForValue.build());
        onChanged();
      } else {
        personasBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Persona personas = 1 [json_name = "personas"];</code>
     */
    public Builder addAllPersonas(
        java.lang.Iterable<? extends com.hearlers.api.proto.v1.model.Persona> values) {
      if (personasBuilder_ == null) {
        ensurePersonasIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, personas_);
        onChanged();
      } else {
        personasBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Persona personas = 1 [json_name = "personas"];</code>
     */
    public Builder clearPersonas() {
      if (personasBuilder_ == null) {
        personas_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        personasBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Persona personas = 1 [json_name = "personas"];</code>
     */
    public Builder removePersonas(int index) {
      if (personasBuilder_ == null) {
        ensurePersonasIsMutable();
        personas_.remove(index);
        onChanged();
      } else {
        personasBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Persona personas = 1 [json_name = "personas"];</code>
     */
    public com.hearlers.api.proto.v1.model.Persona.Builder getPersonasBuilder(
        int index) {
      return getPersonasFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Persona personas = 1 [json_name = "personas"];</code>
     */
    public com.hearlers.api.proto.v1.model.PersonaOrBuilder getPersonasOrBuilder(
        int index) {
      if (personasBuilder_ == null) {
        return personas_.get(index);  } else {
        return personasBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Persona personas = 1 [json_name = "personas"];</code>
     */
    public java.util.List<? extends com.hearlers.api.proto.v1.model.PersonaOrBuilder> 
         getPersonasOrBuilderList() {
      if (personasBuilder_ != null) {
        return personasBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(personas_);
      }
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Persona personas = 1 [json_name = "personas"];</code>
     */
    public com.hearlers.api.proto.v1.model.Persona.Builder addPersonasBuilder() {
      return getPersonasFieldBuilder().addBuilder(
          com.hearlers.api.proto.v1.model.Persona.getDefaultInstance());
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Persona personas = 1 [json_name = "personas"];</code>
     */
    public com.hearlers.api.proto.v1.model.Persona.Builder addPersonasBuilder(
        int index) {
      return getPersonasFieldBuilder().addBuilder(
          index, com.hearlers.api.proto.v1.model.Persona.getDefaultInstance());
    }
    /**
     * <code>repeated .com.hearlers.v1.model.Persona personas = 1 [json_name = "personas"];</code>
     */
    public java.util.List<com.hearlers.api.proto.v1.model.Persona.Builder> 
         getPersonasBuilderList() {
      return getPersonasFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        com.hearlers.api.proto.v1.model.Persona, com.hearlers.api.proto.v1.model.Persona.Builder, com.hearlers.api.proto.v1.model.PersonaOrBuilder> 
        getPersonasFieldBuilder() {
      if (personasBuilder_ == null) {
        personasBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            com.hearlers.api.proto.v1.model.Persona, com.hearlers.api.proto.v1.model.Persona.Builder, com.hearlers.api.proto.v1.model.PersonaOrBuilder>(
                personas_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        personas_ = null;
      }
      return personasBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:com.hearlers.v1.service.FindPersonasResponse)
  }

  // @@protoc_insertion_point(class_scope:com.hearlers.v1.service.FindPersonasResponse)
  private static final com.hearlers.api.proto.v1.service.FindPersonasResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hearlers.api.proto.v1.service.FindPersonasResponse();
  }

  public static com.hearlers.api.proto.v1.service.FindPersonasResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FindPersonasResponse>
      PARSER = new com.google.protobuf.AbstractParser<FindPersonasResponse>() {
    @java.lang.Override
    public FindPersonasResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<FindPersonasResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FindPersonasResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hearlers.api.proto.v1.service.FindPersonasResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

