// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/model/user.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.model;

public final class UserOuterClass {
  private UserOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      UserOuterClass.class.getName());
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
    internal_static_com_hearlers_v1_model_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_model_UserProfile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_UserProfile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_model_UserActivity_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_UserActivity_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n com/hearlers/v1/model/user.proto\022\025com." +
      "hearlers.v1.model\032\034google/protobuf/struc" +
      "t.proto\"\352\001\n\004User\022\016\n\002id\030\001 \001(\tR\002id\022\032\n\010nick" +
      "name\030\002 \001(\tR\010nickname\022E\n\014user_profile\030\003 \001" +
      "(\0132\".com.hearlers.v1.model.UserProfileR\013" +
      "userProfile\022\035\n\ncreated_at\030\005 \001(\tR\tcreated" +
      "At\022\035\n\nupdated_at\030\006 \001(\tR\tupdatedAt\022\"\n\ndel" +
      "eted_at\030\007 \001(\tH\000R\tdeletedAt\210\001\001B\r\n\013_delete" +
      "d_at\"\356\002\n\013UserProfile\022#\n\rprofile_image\030\001 " +
      "\001(\tR\014profileImage\022!\n\014phone_number\030\002 \001(\tR" +
      "\013phoneNumber\0225\n\006gender\030\003 \001(\0162\035.com.hearl" +
      "ers.v1.model.GenderR\006gender\022\032\n\010birthday\030" +
      "\004 \001(\tR\010birthday\022\"\n\014introduction\030\005 \001(\tR\014i" +
      "ntroduction\022/\n\004mbti\030\006 \001(\0162\033.com.hearlers" +
      ".v1.model.MbtiR\004mbti\022\035\n\ncreated_at\030\007 \001(\t" +
      "R\tcreatedAt\022\035\n\nupdated_at\030\010 \001(\tR\tupdated" +
      "At\022\"\n\ndeleted_at\030\t \001(\tH\000R\tdeletedAt\210\001\001B\r" +
      "\n\013_deleted_at\"\263\003\n\014UserActivity\022H\n\ractivi" +
      "ty_type\030\001 \001(\0162#.com.hearlers.v1.model.Ac" +
      "tivityTypeR\014activityType\022<\n\ractivity_dat" +
      "a\030\002 \001(\0132\027.google.protobuf.StructR\014activi" +
      "tyData\022A\n\010platform\030\003 \001(\0162%.com.hearlers." +
      "v1.model.DevicePlatformR\010platform\022\035\n\nip_" +
      "address\030\004 \001(\tR\tipAddress\022\035\n\nuser_agent\030\005" +
      " \001(\tR\tuserAgent\022)\n\020duration_seconds\030\006 \001(" +
      "\005R\017durationSeconds\022\035\n\ncreated_at\030\007 \001(\tR\t" +
      "createdAt\022\035\n\nupdated_at\030\010 \001(\tR\tupdatedAt" +
      "\022\"\n\ndeleted_at\030\t \001(\tH\000R\tdeletedAt\210\001\001B\r\n\013" +
      "_deleted_at*D\n\006Gender\022\026\n\022GENDER_UNSPECIF" +
      "IED\020\000\022\017\n\013GENDER_MALE\020\001\022\021\n\rGENDER_FEMALE\020" +
      "\002*\214\002\n\004Mbti\022\024\n\020MBTI_UNSPECIFIED\020\000\022\r\n\tMBTI" +
      "_ENTP\020\001\022\r\n\tMBTI_ENFP\020\002\022\r\n\tMBTI_ENTJ\020\003\022\r\n" +
      "\tMBTI_ENFJ\020\004\022\r\n\tMBTI_ESTP\020\005\022\r\n\tMBTI_ESTJ" +
      "\020\006\022\r\n\tMBTI_ESFP\020\007\022\r\n\tMBTI_ESFJ\020\010\022\r\n\tMBTI" +
      "_INTJ\020\t\022\r\n\tMBTI_INFJ\020\n\022\r\n\tMBTI_INTP\020\013\022\r\n" +
      "\tMBTI_INFP\020\014\022\r\n\tMBTI_ISTP\020\r\022\r\n\tMBTI_ISTJ" +
      "\020\016\022\r\n\tMBTI_ISFP\020\017\022\r\n\tMBTI_ISFJ\020\020*\235\001\n\016Dev" +
      "icePlatform\022\037\n\033DEVICE_PLATFORM_UNSPECIFI" +
      "ED\020\000\022\027\n\023DEVICE_PLATFORM_WEB\020\001\022\027\n\023DEVICE_" +
      "PLATFORM_IOS\020\002\022\033\n\027DEVICE_PLATFORM_ANDROI" +
      "D\020\003\022\033\n\027DEVICE_PLATFORM_DESKTOP\020\004*\351\004\n\014Act" +
      "ivityType\022\035\n\031ACTIVITY_TYPE_UNSPECIFIED\020\000" +
      "\022\027\n\023ACTIVITY_TYPE_LOGIN\020\001\022\030\n\024ACTIVITY_TY" +
      "PE_LOGOUT\020\002\022)\n%ACTIVITY_TYPE_UNLOGINNED_" +
      "USER_COME_IN\020\003\0224\n0ACTIVITY_TYPE_UNLOGINN" +
      "ED_USER_STARTED_COUNSELING\020\004\0225\n1ACTIVITY" +
      "_TYPE_UNLOGINNED_USER_FINISHED_COUNSELIN" +
      "G\020\005\022\"\n\036ACTIVITY_TYPE_ONBOARDING_START\020\006\022" +
      " \n\034ACTIVITY_TYPE_ONBOARDING_END\020\007\022-\n)ACT" +
      "IVITY_TYPE_SET_CONVERSATION_PREFERENCE\020\010" +
      "\022\"\n\036ACTIVITY_TYPE_COUNSELING_START\020\t\022 \n\034" +
      "ACTIVITY_TYPE_COUNSELING_END\020\n\022 \n\034ACTIVI" +
      "TY_TYPE_PROFILE_UPDATE\020\013\022!\n\035ACTIVITY_TYP" +
      "E_FEEDBACK_SUBMIT\020\014\022$\n ACTIVITY_TYPE_SUB" +
      "SCRIPTION_START\020\r\022%\n!ACTIVITY_TYPE_SUBSC" +
      "RIPTION_CANCEL\020\016\022\"\n\036ACTIVITY_TYPE_PAYMEN" +
      "T_COMPLETE\020\017B#\n\037com.hearlers.api.proto.v" +
      "1.modelP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_com_hearlers_v1_model_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_hearlers_v1_model_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_User_descriptor,
        new java.lang.String[] { "Id", "Nickname", "UserProfile", "CreatedAt", "UpdatedAt", "DeletedAt", });
    internal_static_com_hearlers_v1_model_UserProfile_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_hearlers_v1_model_UserProfile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_UserProfile_descriptor,
        new java.lang.String[] { "ProfileImage", "PhoneNumber", "Gender", "Birthday", "Introduction", "Mbti", "CreatedAt", "UpdatedAt", "DeletedAt", });
    internal_static_com_hearlers_v1_model_UserActivity_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_hearlers_v1_model_UserActivity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_UserActivity_descriptor,
        new java.lang.String[] { "ActivityType", "ActivityData", "Platform", "IpAddress", "UserAgent", "DurationSeconds", "CreatedAt", "UpdatedAt", "DeletedAt", });
    descriptor.resolveAllFeaturesImmutable();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
