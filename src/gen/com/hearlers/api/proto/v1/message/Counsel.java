// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: v1/message/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.message;

public final class Counsel {
  private Counsel() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      Counsel.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_message_CounselCreatedPayload_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_message_CounselCreatedPayload_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_message_CounselMessageCreatedPayload_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_message_CounselMessageCreatedPayload_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030v1/message/counsel.proto\022\027com.hearlers" +
      ".v1.message\032\026v1/model/counsel.proto\032\037goo" +
      "gle/protobuf/timestamp.proto\"\331\001\n\025Counsel" +
      "CreatedPayload\022\035\n\ncounsel_id\030\001 \001(\005R\tcoun" +
      "selId\022\027\n\007user_id\030\002 \001(\005R\006userId\022K\n\016counse" +
      "lor_type\030\003 \001(\0162$.com.hearlers.v1.model.C" +
      "ounselorTypeR\rcounselorType\022;\n\013occurred_" +
      "at\030\004 \001(\0132\032.google.protobuf.TimestampR\noc" +
      "curredAt\"\274\001\n\034CounselMessageCreatedPayloa" +
      "d\022\035\n\ncounsel_id\030\001 \001(\005R\tcounselId\022\030\n\007mess" +
      "age\030\002 \001(\tR\007message\022&\n\017is_user_message\030\003 " +
      "\001(\010R\risUserMessage\022;\n\013occurred_at\030\004 \001(\0132" +
      "\032.google.protobuf.TimestampR\noccurredAtB" +
      "%\n!com.hearlers.api.proto.v1.messageP\001b\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.hearlers.api.proto.v1.model.CounselOuterClass.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_com_hearlers_v1_message_CounselCreatedPayload_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_hearlers_v1_message_CounselCreatedPayload_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_message_CounselCreatedPayload_descriptor,
        new java.lang.String[] { "CounselId", "UserId", "CounselorType", "OccurredAt", });
    internal_static_com_hearlers_v1_message_CounselMessageCreatedPayload_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_hearlers_v1_message_CounselMessageCreatedPayload_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_message_CounselMessageCreatedPayload_descriptor,
        new java.lang.String[] { "CounselId", "Message", "IsUserMessage", "OccurredAt", });
    descriptor.resolveAllFeaturesImmutable();
    com.hearlers.api.proto.v1.model.CounselOuterClass.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}