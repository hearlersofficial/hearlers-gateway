// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

/**
 * Protobuf type {@code com.hearlers.v1.service.CreatePersonaResponse}
 */
public final class CreatePersonaResponse extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.hearlers.v1.service.CreatePersonaResponse)
    CreatePersonaResponseOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      CreatePersonaResponse.class.getName());
  }
  // Use CreatePersonaResponse.newBuilder() to construct.
  private CreatePersonaResponse(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CreatePersonaResponse() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_CreatePersonaResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_CreatePersonaResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hearlers.api.proto.v1.service.CreatePersonaResponse.class, com.hearlers.api.proto.v1.service.CreatePersonaResponse.Builder.class);
  }

  private int bitField0_;
  public static final int PERSONA_FIELD_NUMBER = 1;
  private com.hearlers.api.proto.v1.model.Persona persona_;
  /**
   * <code>.com.hearlers.v1.model.Persona persona = 1 [json_name = "persona"];</code>
   * @return Whether the persona field is set.
   */
  @java.lang.Override
  public boolean hasPersona() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.com.hearlers.v1.model.Persona persona = 1 [json_name = "persona"];</code>
   * @return The persona.
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.Persona getPersona() {
    return persona_ == null ? com.hearlers.api.proto.v1.model.Persona.getDefaultInstance() : persona_;
  }
  /**
   * <code>.com.hearlers.v1.model.Persona persona = 1 [json_name = "persona"];</code>
   */
  @java.lang.Override
  public com.hearlers.api.proto.v1.model.PersonaOrBuilder getPersonaOrBuilder() {
    return persona_ == null ? com.hearlers.api.proto.v1.model.Persona.getDefaultInstance() : persona_;
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
      output.writeMessage(1, getPersona());
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
        .computeMessageSize(1, getPersona());
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
    if (!(obj instanceof com.hearlers.api.proto.v1.service.CreatePersonaResponse)) {
      return super.equals(obj);
    }
    com.hearlers.api.proto.v1.service.CreatePersonaResponse other = (com.hearlers.api.proto.v1.service.CreatePersonaResponse) obj;

    if (hasPersona() != other.hasPersona()) return false;
    if (hasPersona()) {
      if (!getPersona()
          .equals(other.getPersona())) return false;
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
    if (hasPersona()) {
      hash = (37 * hash) + PERSONA_FIELD_NUMBER;
      hash = (53 * hash) + getPersona().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hearlers.api.proto.v1.service.CreatePersonaResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.CreatePersonaResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.CreatePersonaResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.CreatePersonaResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.CreatePersonaResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.CreatePersonaResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.CreatePersonaResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.CreatePersonaResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.hearlers.api.proto.v1.service.CreatePersonaResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.hearlers.api.proto.v1.service.CreatePersonaResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.CreatePersonaResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.CreatePersonaResponse parseFrom(
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
  public static Builder newBuilder(com.hearlers.api.proto.v1.service.CreatePersonaResponse prototype) {
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
   * Protobuf type {@code com.hearlers.v1.service.CreatePersonaResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hearlers.v1.service.CreatePersonaResponse)
      com.hearlers.api.proto.v1.service.CreatePersonaResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_CreatePersonaResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_CreatePersonaResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hearlers.api.proto.v1.service.CreatePersonaResponse.class, com.hearlers.api.proto.v1.service.CreatePersonaResponse.Builder.class);
    }

    // Construct using com.hearlers.api.proto.v1.service.CreatePersonaResponse.newBuilder()
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
        getPersonaFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      persona_ = null;
      if (personaBuilder_ != null) {
        personaBuilder_.dispose();
        personaBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hearlers.api.proto.v1.service.Counsel.internal_static_com_hearlers_v1_service_CreatePersonaResponse_descriptor;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.CreatePersonaResponse getDefaultInstanceForType() {
      return com.hearlers.api.proto.v1.service.CreatePersonaResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.CreatePersonaResponse build() {
      com.hearlers.api.proto.v1.service.CreatePersonaResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.CreatePersonaResponse buildPartial() {
      com.hearlers.api.proto.v1.service.CreatePersonaResponse result = new com.hearlers.api.proto.v1.service.CreatePersonaResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.hearlers.api.proto.v1.service.CreatePersonaResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.persona_ = personaBuilder_ == null
            ? persona_
            : personaBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hearlers.api.proto.v1.service.CreatePersonaResponse) {
        return mergeFrom((com.hearlers.api.proto.v1.service.CreatePersonaResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hearlers.api.proto.v1.service.CreatePersonaResponse other) {
      if (other == com.hearlers.api.proto.v1.service.CreatePersonaResponse.getDefaultInstance()) return this;
      if (other.hasPersona()) {
        mergePersona(other.getPersona());
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
                  getPersonaFieldBuilder().getBuilder(),
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

    private com.hearlers.api.proto.v1.model.Persona persona_;
    private com.google.protobuf.SingleFieldBuilder<
        com.hearlers.api.proto.v1.model.Persona, com.hearlers.api.proto.v1.model.Persona.Builder, com.hearlers.api.proto.v1.model.PersonaOrBuilder> personaBuilder_;
    /**
     * <code>.com.hearlers.v1.model.Persona persona = 1 [json_name = "persona"];</code>
     * @return Whether the persona field is set.
     */
    public boolean hasPersona() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.com.hearlers.v1.model.Persona persona = 1 [json_name = "persona"];</code>
     * @return The persona.
     */
    public com.hearlers.api.proto.v1.model.Persona getPersona() {
      if (personaBuilder_ == null) {
        return persona_ == null ? com.hearlers.api.proto.v1.model.Persona.getDefaultInstance() : persona_;
      } else {
        return personaBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.hearlers.v1.model.Persona persona = 1 [json_name = "persona"];</code>
     */
    public Builder setPersona(com.hearlers.api.proto.v1.model.Persona value) {
      if (personaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        persona_ = value;
      } else {
        personaBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.Persona persona = 1 [json_name = "persona"];</code>
     */
    public Builder setPersona(
        com.hearlers.api.proto.v1.model.Persona.Builder builderForValue) {
      if (personaBuilder_ == null) {
        persona_ = builderForValue.build();
      } else {
        personaBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.Persona persona = 1 [json_name = "persona"];</code>
     */
    public Builder mergePersona(com.hearlers.api.proto.v1.model.Persona value) {
      if (personaBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          persona_ != null &&
          persona_ != com.hearlers.api.proto.v1.model.Persona.getDefaultInstance()) {
          getPersonaBuilder().mergeFrom(value);
        } else {
          persona_ = value;
        }
      } else {
        personaBuilder_.mergeFrom(value);
      }
      if (persona_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.Persona persona = 1 [json_name = "persona"];</code>
     */
    public Builder clearPersona() {
      bitField0_ = (bitField0_ & ~0x00000001);
      persona_ = null;
      if (personaBuilder_ != null) {
        personaBuilder_.dispose();
        personaBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.Persona persona = 1 [json_name = "persona"];</code>
     */
    public com.hearlers.api.proto.v1.model.Persona.Builder getPersonaBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getPersonaFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.hearlers.v1.model.Persona persona = 1 [json_name = "persona"];</code>
     */
    public com.hearlers.api.proto.v1.model.PersonaOrBuilder getPersonaOrBuilder() {
      if (personaBuilder_ != null) {
        return personaBuilder_.getMessageOrBuilder();
      } else {
        return persona_ == null ?
            com.hearlers.api.proto.v1.model.Persona.getDefaultInstance() : persona_;
      }
    }
    /**
     * <code>.com.hearlers.v1.model.Persona persona = 1 [json_name = "persona"];</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.hearlers.api.proto.v1.model.Persona, com.hearlers.api.proto.v1.model.Persona.Builder, com.hearlers.api.proto.v1.model.PersonaOrBuilder> 
        getPersonaFieldBuilder() {
      if (personaBuilder_ == null) {
        personaBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.hearlers.api.proto.v1.model.Persona, com.hearlers.api.proto.v1.model.Persona.Builder, com.hearlers.api.proto.v1.model.PersonaOrBuilder>(
                getPersona(),
                getParentForChildren(),
                isClean());
        persona_ = null;
      }
      return personaBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:com.hearlers.v1.service.CreatePersonaResponse)
  }

  // @@protoc_insertion_point(class_scope:com.hearlers.v1.service.CreatePersonaResponse)
  private static final com.hearlers.api.proto.v1.service.CreatePersonaResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hearlers.api.proto.v1.service.CreatePersonaResponse();
  }

  public static com.hearlers.api.proto.v1.service.CreatePersonaResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreatePersonaResponse>
      PARSER = new com.google.protobuf.AbstractParser<CreatePersonaResponse>() {
    @java.lang.Override
    public CreatePersonaResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreatePersonaResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreatePersonaResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hearlers.api.proto.v1.service.CreatePersonaResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

