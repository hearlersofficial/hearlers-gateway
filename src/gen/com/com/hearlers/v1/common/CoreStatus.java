// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: v1/common/status.proto
// Protobuf Java Version: 4.29.0

package com.com.hearlers.v1.common;

/**
 * Protobuf enum {@code com.hearlers.v1.common.CoreStatus}
 */
public enum CoreStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>CORE_STATUS_ACTIVE = 0;</code>
   */
  CORE_STATUS_ACTIVE(0),
  /**
   * <code>CORE_STATUS_INACTIVE = 1;</code>
   */
  CORE_STATUS_INACTIVE(1),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 0,
      /* suffix= */ "",
      CoreStatus.class.getName());
  }
  /**
   * <code>CORE_STATUS_ACTIVE = 0;</code>
   */
  public static final int CORE_STATUS_ACTIVE_VALUE = 0;
  /**
   * <code>CORE_STATUS_INACTIVE = 1;</code>
   */
  public static final int CORE_STATUS_INACTIVE_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static CoreStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CoreStatus forNumber(int value) {
    switch (value) {
      case 0: return CORE_STATUS_ACTIVE;
      case 1: return CORE_STATUS_INACTIVE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CoreStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CoreStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CoreStatus>() {
          public CoreStatus findValueByNumber(int number) {
            return CoreStatus.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.com.hearlers.v1.common.StatusProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final CoreStatus[] VALUES = values();

  public static CoreStatus valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private CoreStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:com.hearlers.v1.common.CoreStatus)
}
