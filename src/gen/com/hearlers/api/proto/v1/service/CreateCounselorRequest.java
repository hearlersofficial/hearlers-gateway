// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counselor.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

/**
 * <pre>
 * 상담사
 * </pre>
 *
 * Protobuf type {@code com.hearlers.v1.service.CreateCounselorRequest}
 */
public final class CreateCounselorRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:com.hearlers.v1.service.CreateCounselorRequest)
    CreateCounselorRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      CreateCounselorRequest.class.getName());
  }
  // Use CreateCounselorRequest.newBuilder() to construct.
  private CreateCounselorRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private CreateCounselorRequest() {
    toneId_ = "";
    name_ = "";
    description_ = "";
    counselorGender_ = 0;
    persona_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.hearlers.api.proto.v1.service.Counselor.internal_static_com_hearlers_v1_service_CreateCounselorRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.hearlers.api.proto.v1.service.Counselor.internal_static_com_hearlers_v1_service_CreateCounselorRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.hearlers.api.proto.v1.service.CreateCounselorRequest.class, com.hearlers.api.proto.v1.service.CreateCounselorRequest.Builder.class);
  }

  public static final int TONE_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object toneId_ = "";
  /**
   * <code>string tone_id = 1 [json_name = "toneId"];</code>
   * @return The toneId.
   */
  @java.lang.Override
  public java.lang.String getToneId() {
    java.lang.Object ref = toneId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      toneId_ = s;
      return s;
    }
  }
  /**
   * <code>string tone_id = 1 [json_name = "toneId"];</code>
   * @return The bytes for toneId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getToneIdBytes() {
    java.lang.Object ref = toneId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      toneId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2 [json_name = "name"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";
  /**
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   * <code>string description = 3 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COUNSELOR_GENDER_FIELD_NUMBER = 4;
  private int counselorGender_ = 0;
  /**
   * <code>.com.hearlers.v1.model.CounselorGender counselor_gender = 4 [json_name = "counselorGender"];</code>
   * @return The enum numeric value on the wire for counselorGender.
   */
  @java.lang.Override public int getCounselorGenderValue() {
    return counselorGender_;
  }
  /**
   * <code>.com.hearlers.v1.model.CounselorGender counselor_gender = 4 [json_name = "counselorGender"];</code>
   * @return The counselorGender.
   */
  @java.lang.Override public com.hearlers.api.proto.v1.model.CounselorGender getCounselorGender() {
    com.hearlers.api.proto.v1.model.CounselorGender result = com.hearlers.api.proto.v1.model.CounselorGender.forNumber(counselorGender_);
    return result == null ? com.hearlers.api.proto.v1.model.CounselorGender.UNRECOGNIZED : result;
  }

  public static final int PERSONA_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object persona_ = "";
  /**
   * <code>string persona = 5 [json_name = "persona"];</code>
   * @return The persona.
   */
  @java.lang.Override
  public java.lang.String getPersona() {
    java.lang.Object ref = persona_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      persona_ = s;
      return s;
    }
  }
  /**
   * <code>string persona = 5 [json_name = "persona"];</code>
   * @return The bytes for persona.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPersonaBytes() {
    java.lang.Object ref = persona_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      persona_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(toneId_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, toneId_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, name_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, description_);
    }
    if (counselorGender_ != com.hearlers.api.proto.v1.model.CounselorGender.COUNSELOR_GENDER_UNSPECIFIED.getNumber()) {
      output.writeEnum(4, counselorGender_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(persona_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 5, persona_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(toneId_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, toneId_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, name_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, description_);
    }
    if (counselorGender_ != com.hearlers.api.proto.v1.model.CounselorGender.COUNSELOR_GENDER_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, counselorGender_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(persona_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(5, persona_);
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
    if (!(obj instanceof com.hearlers.api.proto.v1.service.CreateCounselorRequest)) {
      return super.equals(obj);
    }
    com.hearlers.api.proto.v1.service.CreateCounselorRequest other = (com.hearlers.api.proto.v1.service.CreateCounselorRequest) obj;

    if (!getToneId()
        .equals(other.getToneId())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (!getDescription()
        .equals(other.getDescription())) return false;
    if (counselorGender_ != other.counselorGender_) return false;
    if (!getPersona()
        .equals(other.getPersona())) return false;
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
    hash = (37 * hash) + TONE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getToneId().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + COUNSELOR_GENDER_FIELD_NUMBER;
    hash = (53 * hash) + counselorGender_;
    hash = (37 * hash) + PERSONA_FIELD_NUMBER;
    hash = (53 * hash) + getPersona().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.hearlers.api.proto.v1.service.CreateCounselorRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselorRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselorRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselorRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselorRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselorRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselorRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselorRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.hearlers.api.proto.v1.service.CreateCounselorRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.hearlers.api.proto.v1.service.CreateCounselorRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselorRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static com.hearlers.api.proto.v1.service.CreateCounselorRequest parseFrom(
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
  public static Builder newBuilder(com.hearlers.api.proto.v1.service.CreateCounselorRequest prototype) {
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
   * <pre>
   * 상담사
   * </pre>
   *
   * Protobuf type {@code com.hearlers.v1.service.CreateCounselorRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.hearlers.v1.service.CreateCounselorRequest)
      com.hearlers.api.proto.v1.service.CreateCounselorRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.hearlers.api.proto.v1.service.Counselor.internal_static_com_hearlers_v1_service_CreateCounselorRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.hearlers.api.proto.v1.service.Counselor.internal_static_com_hearlers_v1_service_CreateCounselorRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.hearlers.api.proto.v1.service.CreateCounselorRequest.class, com.hearlers.api.proto.v1.service.CreateCounselorRequest.Builder.class);
    }

    // Construct using com.hearlers.api.proto.v1.service.CreateCounselorRequest.newBuilder()
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
      toneId_ = "";
      name_ = "";
      description_ = "";
      counselorGender_ = 0;
      persona_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.hearlers.api.proto.v1.service.Counselor.internal_static_com_hearlers_v1_service_CreateCounselorRequest_descriptor;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.CreateCounselorRequest getDefaultInstanceForType() {
      return com.hearlers.api.proto.v1.service.CreateCounselorRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.CreateCounselorRequest build() {
      com.hearlers.api.proto.v1.service.CreateCounselorRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.hearlers.api.proto.v1.service.CreateCounselorRequest buildPartial() {
      com.hearlers.api.proto.v1.service.CreateCounselorRequest result = new com.hearlers.api.proto.v1.service.CreateCounselorRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.hearlers.api.proto.v1.service.CreateCounselorRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.toneId_ = toneId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.description_ = description_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.counselorGender_ = counselorGender_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.persona_ = persona_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.hearlers.api.proto.v1.service.CreateCounselorRequest) {
        return mergeFrom((com.hearlers.api.proto.v1.service.CreateCounselorRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.hearlers.api.proto.v1.service.CreateCounselorRequest other) {
      if (other == com.hearlers.api.proto.v1.service.CreateCounselorRequest.getDefaultInstance()) return this;
      if (!other.getToneId().isEmpty()) {
        toneId_ = other.toneId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.counselorGender_ != 0) {
        setCounselorGenderValue(other.getCounselorGenderValue());
      }
      if (!other.getPersona().isEmpty()) {
        persona_ = other.persona_;
        bitField0_ |= 0x00000010;
        onChanged();
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
              toneId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              description_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 32: {
              counselorGender_ = input.readEnum();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              persona_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
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

    private java.lang.Object toneId_ = "";
    /**
     * <code>string tone_id = 1 [json_name = "toneId"];</code>
     * @return The toneId.
     */
    public java.lang.String getToneId() {
      java.lang.Object ref = toneId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        toneId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string tone_id = 1 [json_name = "toneId"];</code>
     * @return The bytes for toneId.
     */
    public com.google.protobuf.ByteString
        getToneIdBytes() {
      java.lang.Object ref = toneId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        toneId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string tone_id = 1 [json_name = "toneId"];</code>
     * @param value The toneId to set.
     * @return This builder for chaining.
     */
    public Builder setToneId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      toneId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string tone_id = 1 [json_name = "toneId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearToneId() {
      toneId_ = getDefaultInstance().getToneId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string tone_id = 1 [json_name = "toneId"];</code>
     * @param value The bytes for toneId to set.
     * @return This builder for chaining.
     */
    public Builder setToneIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      toneId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2 [json_name = "name"];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2 [json_name = "name"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2 [json_name = "name"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     * <code>string description = 3 [json_name = "description"];</code>
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string description = 3 [json_name = "description"];</code>
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString
        getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string description = 3 [json_name = "description"];</code>
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      description_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string description = 3 [json_name = "description"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string description = 3 [json_name = "description"];</code>
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      description_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int counselorGender_ = 0;
    /**
     * <code>.com.hearlers.v1.model.CounselorGender counselor_gender = 4 [json_name = "counselorGender"];</code>
     * @return The enum numeric value on the wire for counselorGender.
     */
    @java.lang.Override public int getCounselorGenderValue() {
      return counselorGender_;
    }
    /**
     * <code>.com.hearlers.v1.model.CounselorGender counselor_gender = 4 [json_name = "counselorGender"];</code>
     * @param value The enum numeric value on the wire for counselorGender to set.
     * @return This builder for chaining.
     */
    public Builder setCounselorGenderValue(int value) {
      counselorGender_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.CounselorGender counselor_gender = 4 [json_name = "counselorGender"];</code>
     * @return The counselorGender.
     */
    @java.lang.Override
    public com.hearlers.api.proto.v1.model.CounselorGender getCounselorGender() {
      com.hearlers.api.proto.v1.model.CounselorGender result = com.hearlers.api.proto.v1.model.CounselorGender.forNumber(counselorGender_);
      return result == null ? com.hearlers.api.proto.v1.model.CounselorGender.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.hearlers.v1.model.CounselorGender counselor_gender = 4 [json_name = "counselorGender"];</code>
     * @param value The counselorGender to set.
     * @return This builder for chaining.
     */
    public Builder setCounselorGender(com.hearlers.api.proto.v1.model.CounselorGender value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      counselorGender_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.hearlers.v1.model.CounselorGender counselor_gender = 4 [json_name = "counselorGender"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCounselorGender() {
      bitField0_ = (bitField0_ & ~0x00000008);
      counselorGender_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object persona_ = "";
    /**
     * <code>string persona = 5 [json_name = "persona"];</code>
     * @return The persona.
     */
    public java.lang.String getPersona() {
      java.lang.Object ref = persona_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        persona_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string persona = 5 [json_name = "persona"];</code>
     * @return The bytes for persona.
     */
    public com.google.protobuf.ByteString
        getPersonaBytes() {
      java.lang.Object ref = persona_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        persona_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string persona = 5 [json_name = "persona"];</code>
     * @param value The persona to set.
     * @return This builder for chaining.
     */
    public Builder setPersona(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      persona_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>string persona = 5 [json_name = "persona"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPersona() {
      persona_ = getDefaultInstance().getPersona();
      bitField0_ = (bitField0_ & ~0x00000010);
      onChanged();
      return this;
    }
    /**
     * <code>string persona = 5 [json_name = "persona"];</code>
     * @param value The bytes for persona to set.
     * @return This builder for chaining.
     */
    public Builder setPersonaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      persona_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:com.hearlers.v1.service.CreateCounselorRequest)
  }

  // @@protoc_insertion_point(class_scope:com.hearlers.v1.service.CreateCounselorRequest)
  private static final com.hearlers.api.proto.v1.service.CreateCounselorRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.hearlers.api.proto.v1.service.CreateCounselorRequest();
  }

  public static com.hearlers.api.proto.v1.service.CreateCounselorRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateCounselorRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateCounselorRequest>() {
    @java.lang.Override
    public CreateCounselorRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateCounselorRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateCounselorRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.hearlers.api.proto.v1.service.CreateCounselorRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

