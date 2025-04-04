// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

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
    internal_static_com_hearlers_v1_service_CreateCounselRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_CreateCounselRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_CreateCounselResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_CreateCounselResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_FindCounselsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_FindCounselsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_FindCounselsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_FindCounselsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_FindCounselByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_FindCounselByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_FindCounselByIdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_FindCounselByIdResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_CreateMessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_CreateMessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_CreateMessageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_CreateMessageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_FindMessagesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_FindMessagesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_FindMessagesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_FindMessagesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_ReactMessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_ReactMessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_ReactMessageResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_ReactMessageResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_FindCounselorUserRelationshipsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_FindCounselorUserRelationshipsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_service_FindCounselorUserRelationshipsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_service_FindCounselorUserRelationshipsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%com/hearlers/v1/service/counsel.proto\022" +
      "\027com.hearlers.v1.service\032#com/hearlers/v" +
      "1/model/counsel.proto\"\323\001\n\024CreateCounselR" +
      "equest\022\027\n\007user_id\030\001 \001(\tR\006userId\022!\n\014couns" +
      "elor_id\030\002 \001(\tR\013counselorId\022(\n\rintro_mess" +
      "age\030\003 \001(\tH\000R\014introMessage\210\001\001\022.\n\020response" +
      "_message\030\004 \001(\tH\001R\017responseMessage\210\001\001B\020\n\016" +
      "_intro_messageB\023\n\021_response_message\"\243\001\n\025" +
      "CreateCounselResponse\0228\n\007counsel\030\001 \001(\0132\036" +
      ".com.hearlers.v1.model.CounselR\007counsel\022" +
      "P\n\020counsel_messages\030\002 \003(\0132%.com.hearlers" +
      ".v1.model.CounselMessageR\017counselMessage" +
      "s\"g\n\023FindCounselsRequest\022\027\n\007user_id\030\001 \001(" +
      "\tR\006userId\022&\n\014counselor_id\030\002 \001(\tH\000R\013couns" +
      "elorId\210\001\001B\017\n\r_counselor_id\"R\n\024FindCounse" +
      "lsResponse\022:\n\010counsels\030\001 \003(\0132\036.com.hearl" +
      "ers.v1.model.CounselR\010counsels\"7\n\026FindCo" +
      "unselByIdRequest\022\035\n\ncounsel_id\030\001 \001(\tR\tco" +
      "unselId\"d\n\027FindCounselByIdResponse\022=\n\007co" +
      "unsel\030\001 \001(\0132\036.com.hearlers.v1.model.Coun" +
      "selH\000R\007counsel\210\001\001B\n\n\010_counsel\"O\n\024CreateM" +
      "essageRequest\022\035\n\ncounsel_id\030\001 \001(\tR\tcouns" +
      "elId\022\030\n\007message\030\002 \001(\tR\007message\"\333\001\n\025Creat" +
      "eMessageResponse\022]\n\027created_counsel_mess" +
      "age\030\001 \001(\0132%.com.hearlers.v1.model.Counse" +
      "lMessageR\025createdCounselMessage\022c\n\032couns" +
      "elor_response_message\030\002 \001(\0132%.com.hearle" +
      "rs.v1.model.CounselMessageR\030counselorRes" +
      "ponseMessage\"4\n\023FindMessagesRequest\022\035\n\nc" +
      "ounsel_id\030\001 \001(\tR\tcounselId\"h\n\024FindMessag" +
      "esResponse\022P\n\020counsel_messages\030\001 \003(\0132%.c" +
      "om.hearlers.v1.model.CounselMessageR\017cou" +
      "nselMessages\"\177\n\023ReactMessageRequest\022\035\n\nm" +
      "essage_id\030\001 \001(\tR\tmessageId\022I\n\010reaction\030\002" +
      " \001(\0162-.com.hearlers.v1.model.CounselMess" +
      "ageReactionR\010reaction\"f\n\024ReactMessageRes" +
      "ponse\022N\n\017counsel_message\030\001 \001(\0132%.com.hea" +
      "rlers.v1.model.CounselMessageR\016counselMe" +
      "ssage\"c\n%FindCounselorUserRelationshipsR" +
      "equest\022!\n\014counselor_id\030\001 \001(\tR\013counselorI" +
      "d\022\027\n\007user_id\030\002 \001(\tR\006userId\"\234\001\n&FindCouns" +
      "elorUserRelationshipsResponse\022r\n\034counsel" +
      "or_user_relationships\030\001 \003(\01320.com.hearle" +
      "rs.v1.model.CounselorUserRelationshipR\032c" +
      "ounselorUserRelationships2\321\006\n\016CounselSer" +
      "vice\022n\n\rCreateCounsel\022-.com.hearlers.v1." +
      "service.CreateCounselRequest\032..com.hearl" +
      "ers.v1.service.CreateCounselResponse\022k\n\014" +
      "FindCounsels\022,.com.hearlers.v1.service.F" +
      "indCounselsRequest\032-.com.hearlers.v1.ser" +
      "vice.FindCounselsResponse\022t\n\017FindCounsel" +
      "ById\022/.com.hearlers.v1.service.FindCouns" +
      "elByIdRequest\0320.com.hearlers.v1.service." +
      "FindCounselByIdResponse\022n\n\rCreateMessage" +
      "\022-.com.hearlers.v1.service.CreateMessage" +
      "Request\032..com.hearlers.v1.service.Create" +
      "MessageResponse\022k\n\014FindMessages\022,.com.he" +
      "arlers.v1.service.FindMessagesRequest\032-." +
      "com.hearlers.v1.service.FindMessagesResp" +
      "onse\022k\n\014ReactMessage\022,.com.hearlers.v1.s" +
      "ervice.ReactMessageRequest\032-.com.hearler" +
      "s.v1.service.ReactMessageResponse\022\241\001\n\036Fi" +
      "ndCounselorUserRelationships\022>.com.hearl" +
      "ers.v1.service.FindCounselorUserRelation" +
      "shipsRequest\032?.com.hearlers.v1.service.F" +
      "indCounselorUserRelationshipsResponseB%\n" +
      "!com.hearlers.api.proto.v1.serviceP\001b\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.hearlers.api.proto.v1.model.CounselOuterClass.getDescriptor(),
        });
    internal_static_com_hearlers_v1_service_CreateCounselRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_hearlers_v1_service_CreateCounselRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_CreateCounselRequest_descriptor,
        new java.lang.String[] { "UserId", "CounselorId", "IntroMessage", "ResponseMessage", });
    internal_static_com_hearlers_v1_service_CreateCounselResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_hearlers_v1_service_CreateCounselResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_CreateCounselResponse_descriptor,
        new java.lang.String[] { "Counsel", "CounselMessages", });
    internal_static_com_hearlers_v1_service_FindCounselsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_hearlers_v1_service_FindCounselsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_FindCounselsRequest_descriptor,
        new java.lang.String[] { "UserId", "CounselorId", });
    internal_static_com_hearlers_v1_service_FindCounselsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_hearlers_v1_service_FindCounselsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_FindCounselsResponse_descriptor,
        new java.lang.String[] { "Counsels", });
    internal_static_com_hearlers_v1_service_FindCounselByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_hearlers_v1_service_FindCounselByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_FindCounselByIdRequest_descriptor,
        new java.lang.String[] { "CounselId", });
    internal_static_com_hearlers_v1_service_FindCounselByIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_hearlers_v1_service_FindCounselByIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_FindCounselByIdResponse_descriptor,
        new java.lang.String[] { "Counsel", });
    internal_static_com_hearlers_v1_service_CreateMessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_hearlers_v1_service_CreateMessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_CreateMessageRequest_descriptor,
        new java.lang.String[] { "CounselId", "Message", });
    internal_static_com_hearlers_v1_service_CreateMessageResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_com_hearlers_v1_service_CreateMessageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_CreateMessageResponse_descriptor,
        new java.lang.String[] { "CreatedCounselMessage", "CounselorResponseMessage", });
    internal_static_com_hearlers_v1_service_FindMessagesRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_com_hearlers_v1_service_FindMessagesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_FindMessagesRequest_descriptor,
        new java.lang.String[] { "CounselId", });
    internal_static_com_hearlers_v1_service_FindMessagesResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_com_hearlers_v1_service_FindMessagesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_FindMessagesResponse_descriptor,
        new java.lang.String[] { "CounselMessages", });
    internal_static_com_hearlers_v1_service_ReactMessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_com_hearlers_v1_service_ReactMessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_ReactMessageRequest_descriptor,
        new java.lang.String[] { "MessageId", "Reaction", });
    internal_static_com_hearlers_v1_service_ReactMessageResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_com_hearlers_v1_service_ReactMessageResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_ReactMessageResponse_descriptor,
        new java.lang.String[] { "CounselMessage", });
    internal_static_com_hearlers_v1_service_FindCounselorUserRelationshipsRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_com_hearlers_v1_service_FindCounselorUserRelationshipsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_FindCounselorUserRelationshipsRequest_descriptor,
        new java.lang.String[] { "CounselorId", "UserId", });
    internal_static_com_hearlers_v1_service_FindCounselorUserRelationshipsResponse_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_com_hearlers_v1_service_FindCounselorUserRelationshipsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_service_FindCounselorUserRelationshipsResponse_descriptor,
        new java.lang.String[] { "CounselorUserRelationships", });
    descriptor.resolveAllFeaturesImmutable();
    com.hearlers.api.proto.v1.model.CounselOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
