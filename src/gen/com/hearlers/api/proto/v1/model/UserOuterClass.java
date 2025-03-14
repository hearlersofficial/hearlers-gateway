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
    internal_static_com_hearlers_v1_model_UserProgress_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_UserProgress_fieldAccessorTable;
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
      "t.proto\"\244\002\n\004User\022\016\n\002id\030\001 \001(\tR\002id\022\032\n\010nick" +
      "name\030\002 \001(\tR\010nickname\022E\n\014user_profile\030\003 \001" +
      "(\0132\".com.hearlers.v1.model.UserProfileR\013" +
      "userProfile\022L\n\017user_progresses\030\004 \003(\0132#.c" +
      "om.hearlers.v1.model.UserProgressR\016userP" +
      "rogresses\022\035\n\ncreated_at\030\005 \001(\tR\tcreatedAt" +
      "\022\035\n\nupdated_at\030\006 \001(\tR\tupdatedAt\022\035\n\ndelet" +
      "ed_at\030\007 \001(\tR\tdeletedAt\"\332\002\n\013UserProfile\022#" +
      "\n\rprofile_image\030\001 \001(\tR\014profileImage\022!\n\014p" +
      "hone_number\030\002 \001(\tR\013phoneNumber\0225\n\006gender" +
      "\030\003 \001(\0162\035.com.hearlers.v1.model.GenderR\006g" +
      "ender\022\032\n\010birthday\030\004 \001(\tR\010birthday\022\"\n\014int" +
      "roduction\030\005 \001(\tR\014introduction\022/\n\004mbti\030\006 " +
      "\001(\0162\033.com.hearlers.v1.model.MbtiR\004mbti\022\035" +
      "\n\ncreated_at\030\007 \001(\tR\tcreatedAt\022\035\n\nupdated" +
      "_at\030\010 \001(\tR\tupdatedAt\022\035\n\ndeleted_at\030\t \001(\t" +
      "R\tdeletedAt\"\227\002\n\014UserProgress\022H\n\rprogress" +
      "_type\030\001 \001(\0162#.com.hearlers.v1.model.Prog" +
      "ressTypeR\014progressType\022=\n\006status\030\002 \001(\0162%" +
      ".com.hearlers.v1.model.ProgressStatusR\006s" +
      "tatus\022!\n\014last_updated\030\003 \001(\tR\013lastUpdated" +
      "\022\035\n\ncreated_at\030\004 \001(\tR\tcreatedAt\022\035\n\nupdat" +
      "ed_at\030\005 \001(\tR\tupdatedAt\022\035\n\ndeleted_at\030\006 \001" +
      "(\tR\tdeletedAt\"\237\003\n\014UserActivity\022H\n\ractivi" +
      "ty_type\030\001 \001(\0162#.com.hearlers.v1.model.Ac" +
      "tivityTypeR\014activityType\022<\n\ractivity_dat" +
      "a\030\002 \001(\0132\027.google.protobuf.StructR\014activi" +
      "tyData\022A\n\010platform\030\003 \001(\0162%.com.hearlers." +
      "v1.model.DevicePlatformR\010platform\022\035\n\nip_" +
      "address\030\004 \001(\tR\tipAddress\022\035\n\nuser_agent\030\005" +
      " \001(\tR\tuserAgent\022)\n\020duration_seconds\030\006 \001(" +
      "\005R\017durationSeconds\022\035\n\ncreated_at\030\007 \001(\tR\t" +
      "createdAt\022\035\n\nupdated_at\030\010 \001(\tR\tupdatedAt" +
      "\022\035\n\ndeleted_at\030\t \001(\tR\tdeletedAt*D\n\006Gende" +
      "r\022\026\n\022GENDER_UNSPECIFIED\020\000\022\017\n\013GENDER_MALE" +
      "\020\001\022\021\n\rGENDER_FEMALE\020\002*\257\001\n\016ProgressStatus" +
      "\022\037\n\033PROGRESS_STATUS_UNSPECIFIED\020\000\022\037\n\033PRO" +
      "GRESS_STATUS_NOT_STARTED\020\001\022\037\n\033PROGRESS_S" +
      "TATUS_IN_PROGRESS\020\002\022\035\n\031PROGRESS_STATUS_C" +
      "OMPLETED\020\003\022\033\n\027PROGRESS_STATUS_BLOCKED\020\004*" +
      "k\n\014ProgressType\022\035\n\031PROGRESS_TYPE_UNSPECI" +
      "FIED\020\000\022\034\n\030PROGRESS_TYPE_ONBOARDING\020\001\022\036\n\032" +
      "PROGRESS_TYPE_VERIFICATION\020\002*\214\002\n\004Mbti\022\024\n" +
      "\020MBTI_UNSPECIFIED\020\000\022\r\n\tMBTI_ENTP\020\001\022\r\n\tMB" +
      "TI_ENFP\020\002\022\r\n\tMBTI_ENTJ\020\003\022\r\n\tMBTI_ENFJ\020\004\022" +
      "\r\n\tMBTI_ESTP\020\005\022\r\n\tMBTI_ESTJ\020\006\022\r\n\tMBTI_ES" +
      "FP\020\007\022\r\n\tMBTI_ESFJ\020\010\022\r\n\tMBTI_INTJ\020\t\022\r\n\tMB" +
      "TI_INFJ\020\n\022\r\n\tMBTI_INTP\020\013\022\r\n\tMBTI_INFP\020\014\022" +
      "\r\n\tMBTI_ISTP\020\r\022\r\n\tMBTI_ISTJ\020\016\022\r\n\tMBTI_IS" +
      "FP\020\017\022\r\n\tMBTI_ISFJ\020\020*\235\001\n\016DevicePlatform\022\037" +
      "\n\033DEVICE_PLATFORM_UNSPECIFIED\020\000\022\027\n\023DEVIC" +
      "E_PLATFORM_WEB\020\001\022\027\n\023DEVICE_PLATFORM_IOS\020" +
      "\002\022\033\n\027DEVICE_PLATFORM_ANDROID\020\003\022\033\n\027DEVICE" +
      "_PLATFORM_DESKTOP\020\004*\351\004\n\014ActivityType\022\035\n\031" +
      "ACTIVITY_TYPE_UNSPECIFIED\020\000\022\027\n\023ACTIVITY_" +
      "TYPE_LOGIN\020\001\022\030\n\024ACTIVITY_TYPE_LOGOUT\020\002\022)" +
      "\n%ACTIVITY_TYPE_UNLOGINNED_USER_COME_IN\020" +
      "\003\0224\n0ACTIVITY_TYPE_UNLOGINNED_USER_START" +
      "ED_COUNSELING\020\004\0225\n1ACTIVITY_TYPE_UNLOGIN" +
      "NED_USER_FINISHED_COUNSELING\020\005\022\"\n\036ACTIVI" +
      "TY_TYPE_ONBOARDING_START\020\006\022 \n\034ACTIVITY_T" +
      "YPE_ONBOARDING_END\020\007\022-\n)ACTIVITY_TYPE_SE" +
      "T_CONVERSATION_PREFERENCE\020\010\022\"\n\036ACTIVITY_" +
      "TYPE_COUNSELING_START\020\t\022 \n\034ACTIVITY_TYPE" +
      "_COUNSELING_END\020\n\022 \n\034ACTIVITY_TYPE_PROFI" +
      "LE_UPDATE\020\013\022!\n\035ACTIVITY_TYPE_FEEDBACK_SU" +
      "BMIT\020\014\022$\n ACTIVITY_TYPE_SUBSCRIPTION_STA" +
      "RT\020\r\022%\n!ACTIVITY_TYPE_SUBSCRIPTION_CANCE" +
      "L\020\016\022\"\n\036ACTIVITY_TYPE_PAYMENT_COMPLETE\020\017B" +
      "#\n\037com.hearlers.api.proto.v1.modelP\001b\006pr" +
      "oto3"
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
        new java.lang.String[] { "Id", "Nickname", "UserProfile", "UserProgresses", "CreatedAt", "UpdatedAt", "DeletedAt", });
    internal_static_com_hearlers_v1_model_UserProfile_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_hearlers_v1_model_UserProfile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_UserProfile_descriptor,
        new java.lang.String[] { "ProfileImage", "PhoneNumber", "Gender", "Birthday", "Introduction", "Mbti", "CreatedAt", "UpdatedAt", "DeletedAt", });
    internal_static_com_hearlers_v1_model_UserProgress_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_hearlers_v1_model_UserProgress_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_UserProgress_descriptor,
        new java.lang.String[] { "ProgressType", "Status", "LastUpdated", "CreatedAt", "UpdatedAt", "DeletedAt", });
    internal_static_com_hearlers_v1_model_UserActivity_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_hearlers_v1_model_UserActivity_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_UserActivity_descriptor,
        new java.lang.String[] { "ActivityType", "ActivityData", "Platform", "IpAddress", "UserAgent", "DurationSeconds", "CreatedAt", "UpdatedAt", "DeletedAt", });
    descriptor.resolveAllFeaturesImmutable();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
