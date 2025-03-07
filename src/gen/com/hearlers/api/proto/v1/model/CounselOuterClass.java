// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/model/counsel.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.model;

public final class CounselOuterClass {
  private CounselOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      CounselOuterClass.class.getName());
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
    internal_static_com_hearlers_v1_model_Counsel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_Counsel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_model_CounselMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_CounselMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_model_Counselor_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_Counselor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_model_CounselTechnique_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_CounselTechnique_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_model_CounselorUserRelationship_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_CounselorUserRelationship_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_model_Persona_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_Persona_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_model_Context_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_Context_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_model_Instruction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_Instruction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_model_InstructionItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_InstructionItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_model_Tone_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_Tone_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#com/hearlers/v1/model/counsel.proto\022\025c" +
      "om.hearlers.v1.model\"\362\002\n\007Counsel\022\016\n\002id\030\001" +
      " \001(\tR\002id\022!\n\014counselor_id\030\002 \001(\tR\013counselo" +
      "rId\022\027\n\007user_id\030\003 \001(\tR\006userId\022!\n\014last_mes" +
      "sage\030\004 \001(\tR\013lastMessage\022$\n\016last_chated_a" +
      "t\030\005 \001(\tR\014lastChatedAt\0220\n\024counsel_techniq" +
      "ue_id\030\006 \001(\tR\022counselTechniqueId\022C\n\036couns" +
      "elor_user_relationship_id\030\007 \001(\tR\033counsel" +
      "orUserRelationshipId\022\035\n\ncreated_at\030\010 \001(\t" +
      "R\tcreatedAt\022\035\n\nupdated_at\030\t \001(\tR\tupdated" +
      "At\022\035\n\ndeleted_at\030\n \001(\tR\tdeletedAt\"\310\002\n\016Co" +
      "unselMessage\022\016\n\002id\030\001 \001(\tR\002id\022\035\n\ncounsel_" +
      "id\030\002 \001(\tR\tcounselId\022\030\n\007message\030\003 \001(\tR\007me" +
      "ssage\022&\n\017is_user_message\030\004 \001(\010R\risUserMe" +
      "ssage\022\035\n\nreacted_at\030\005 \001(\tR\treactedAt\022I\n\010" +
      "reaction\030\006 \001(\0162-.com.hearlers.v1.model.C" +
      "ounselMessageReactionR\010reaction\022\035\n\ncreat" +
      "ed_at\030\007 \001(\tR\tcreatedAt\022\035\n\nupdated_at\030\010 \001" +
      "(\tR\tupdatedAt\022\035\n\ndeleted_at\030\t \001(\tR\tdelet" +
      "edAt\"\202\003\n\tCounselor\022\016\n\002id\030\001 \001(\tR\002id\022\027\n\007to" +
      "ne_id\030\002 \001(\tR\006toneId\022\022\n\004name\030\003 \001(\tR\004name\022" +
      " \n\013description\030\004 \001(\tR\013description\022>\n\006gen" +
      "der\030\005 \001(\0162&.com.hearlers.v1.model.Counse" +
      "lorGenderR\006gender\022#\n\rintro_message\030\006 \001(\t" +
      "R\014introMessage\022)\n\020response_option1\030\007 \001(\t" +
      "R\017responseOption1\022)\n\020response_option2\030\010 " +
      "\001(\tR\017responseOption2\022\035\n\ncreated_at\030\t \001(\t" +
      "R\tcreatedAt\022\035\n\nupdated_at\030\n \001(\tR\tupdated" +
      "At\022\035\n\ndeleted_at\030\013 \001(\tR\tdeletedAt\"\307\003\n\020Co" +
      "unselTechnique\022\016\n\002id\030\001 \001(\tR\002id\022\022\n\004name\030\002" +
      " \001(\tR\004name\022\034\n\007tone_id\030\003 \001(\tH\000R\006toneId\210\001\001" +
      "\022\035\n\ncontext_id\030\004 \001(\tR\tcontextId\022%\n\016instr" +
      "uction_id\030\005 \001(\tR\rinstructionId\022d\n\027counse" +
      "l_technique_stage\030\006 \001(\0162,.com.hearlers.v" +
      "1.model.CounselTechniqueStageR\025counselTe" +
      "chniqueStage\022>\n\031next_counsel_technique_i" +
      "d\030\007 \001(\tH\001R\026nextCounselTechniqueId\210\001\001\022\035\n\n" +
      "created_at\030\010 \001(\tR\tcreatedAt\022\035\n\nupdated_a" +
      "t\030\t \001(\tR\tupdatedAt\022\035\n\ndeleted_at\030\n \001(\tR\t" +
      "deletedAtB\n\n\010_tone_idB\034\n\032_next_counsel_t" +
      "echnique_id\"\336\001\n\031CounselorUserRelationshi" +
      "p\022\016\n\002id\030\001 \001(\tR\002id\022!\n\014counselor_id\030\002 \001(\tR" +
      "\013counselorId\022\027\n\007user_id\030\003 \001(\tR\006userId\022\030\n" +
      "\007rapport\030\004 \001(\005R\007rapport\022\035\n\ncreated_at\030\005 " +
      "\001(\tR\tcreatedAt\022\035\n\nupdated_at\030\006 \001(\tR\tupda" +
      "tedAt\022\035\n\ndeleted_at\030\007 \001(\tR\tdeletedAt\"\255\001\n" +
      "\007Persona\022\016\n\002id\030\001 \001(\tR\002id\022\022\n\004body\030\002 \001(\tR\004" +
      "body\022!\n\014counselor_id\030\003 \001(\tR\013counselorId\022" +
      "\035\n\ncreated_at\030\004 \001(\tR\tcreatedAt\022\035\n\nupdate" +
      "d_at\030\005 \001(\tR\tupdatedAt\022\035\n\ndeleted_at\030\006 \001(" +
      "\tR\tdeletedAt\"\302\001\n\007Context\022\016\n\002id\030\001 \001(\tR\002id" +
      "\022\022\n\004name\030\002 \001(\tR\004name\022\"\n\014placeholders\030\003 \003" +
      "(\tR\014placeholders\022\022\n\004body\030\004 \001(\tR\004body\022\035\n\n" +
      "created_at\030\005 \001(\tR\tcreatedAt\022\035\n\nupdated_a" +
      "t\030\006 \001(\tR\tupdatedAt\022\035\n\ndeleted_at\030\007 \001(\tR\t" +
      "deletedAt\"\250\002\n\013Instruction\022\016\n\002id\030\001 \001(\tR\002i" +
      "d\022\022\n\004name\030\002 \001(\tR\004name\022.\n\020initial_sentenc" +
      "e\030\003 \001(\tH\000R\017initialSentence\210\001\001\022S\n\021instruc" +
      "tion_items\030\004 \003(\0132&.com.hearlers.v1.model" +
      ".InstructionItemR\020instructionItems\022\035\n\ncr" +
      "eated_at\030\005 \001(\tR\tcreatedAt\022\035\n\nupdated_at\030" +
      "\006 \001(\tR\tupdatedAt\022\035\n\ndeleted_at\030\007 \001(\tR\tde" +
      "letedAtB\023\n\021_initial_sentence\"\222\001\n\017Instruc" +
      "tionItem\022\016\n\002id\030\001 \001(\tR\002id\022\022\n\004body\030\002 \001(\tR\004" +
      "body\022\035\n\ncreated_at\030\003 \001(\tR\tcreatedAt\022\035\n\nu" +
      "pdated_at\030\004 \001(\tR\tupdatedAt\022\035\n\ndeleted_at" +
      "\030\005 \001(\tR\tdeletedAt\"\233\001\n\004Tone\022\016\n\002id\030\001 \001(\tR\002" +
      "id\022\022\n\004name\030\002 \001(\tR\004name\022\022\n\004body\030\003 \001(\tR\004bo" +
      "dy\022\035\n\ncreated_at\030\004 \001(\tR\tcreatedAt\022\035\n\nupd" +
      "ated_at\030\005 \001(\tR\tupdatedAt\022\035\n\ndeleted_at\030\006" +
      " \001(\tR\tdeletedAt*\213\001\n\026CounselMessageReacti" +
      "on\022(\n$COUNSEL_MESSAGE_REACTION_UNSPECIFI" +
      "ED\020\000\022!\n\035COUNSEL_MESSAGE_REACTION_LIKE\020\001\022" +
      "$\n COUNSEL_MESSAGE_REACTION_DISLIKE\020\002*\206\001" +
      "\n\017CounselorGender\022 \n\034COUNSELOR_GENDER_UN" +
      "SPECIFIED\020\000\022\031\n\025COUNSELOR_GENDER_MALE\020\001\022\033" +
      "\n\027COUNSELOR_GENDER_FEMALE\020\002\022\031\n\025COUNSELOR" +
      "_GENDER_NONE\020\003*\211\001\n\025CounselTechniqueStage" +
      "\022\'\n#COUNSEL_TECHNIQUE_STAGE_UNSPECIFIED\020" +
      "\000\022#\n\037COUNSEL_TECHNIQUE_STAGE_INITIAL\020\001\022\"" +
      "\n\036COUNSEL_TECHNIQUE_STAGE_MIDDLE\020\002B#\n\037co" +
      "m.hearlers.api.proto.v1.modelP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_hearlers_v1_model_Counsel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_hearlers_v1_model_Counsel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_Counsel_descriptor,
        new java.lang.String[] { "Id", "CounselorId", "UserId", "LastMessage", "LastChatedAt", "CounselTechniqueId", "CounselorUserRelationshipId", "CreatedAt", "UpdatedAt", "DeletedAt", });
    internal_static_com_hearlers_v1_model_CounselMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_hearlers_v1_model_CounselMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_CounselMessage_descriptor,
        new java.lang.String[] { "Id", "CounselId", "Message", "IsUserMessage", "ReactedAt", "Reaction", "CreatedAt", "UpdatedAt", "DeletedAt", });
    internal_static_com_hearlers_v1_model_Counselor_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_hearlers_v1_model_Counselor_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_Counselor_descriptor,
        new java.lang.String[] { "Id", "ToneId", "Name", "Description", "Gender", "IntroMessage", "ResponseOption1", "ResponseOption2", "CreatedAt", "UpdatedAt", "DeletedAt", });
    internal_static_com_hearlers_v1_model_CounselTechnique_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_hearlers_v1_model_CounselTechnique_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_CounselTechnique_descriptor,
        new java.lang.String[] { "Id", "Name", "ToneId", "ContextId", "InstructionId", "CounselTechniqueStage", "NextCounselTechniqueId", "CreatedAt", "UpdatedAt", "DeletedAt", });
    internal_static_com_hearlers_v1_model_CounselorUserRelationship_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_hearlers_v1_model_CounselorUserRelationship_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_CounselorUserRelationship_descriptor,
        new java.lang.String[] { "Id", "CounselorId", "UserId", "Rapport", "CreatedAt", "UpdatedAt", "DeletedAt", });
    internal_static_com_hearlers_v1_model_Persona_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_hearlers_v1_model_Persona_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_Persona_descriptor,
        new java.lang.String[] { "Id", "Body", "CounselorId", "CreatedAt", "UpdatedAt", "DeletedAt", });
    internal_static_com_hearlers_v1_model_Context_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_hearlers_v1_model_Context_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_Context_descriptor,
        new java.lang.String[] { "Id", "Name", "Placeholders", "Body", "CreatedAt", "UpdatedAt", "DeletedAt", });
    internal_static_com_hearlers_v1_model_Instruction_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_com_hearlers_v1_model_Instruction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_Instruction_descriptor,
        new java.lang.String[] { "Id", "Name", "InitialSentence", "InstructionItems", "CreatedAt", "UpdatedAt", "DeletedAt", });
    internal_static_com_hearlers_v1_model_InstructionItem_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_com_hearlers_v1_model_InstructionItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_InstructionItem_descriptor,
        new java.lang.String[] { "Id", "Body", "CreatedAt", "UpdatedAt", "DeletedAt", });
    internal_static_com_hearlers_v1_model_Tone_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_com_hearlers_v1_model_Tone_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_Tone_descriptor,
        new java.lang.String[] { "Id", "Name", "Body", "CreatedAt", "UpdatedAt", "DeletedAt", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
