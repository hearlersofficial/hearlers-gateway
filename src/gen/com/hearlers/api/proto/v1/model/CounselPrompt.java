// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/model/counsel_prompt.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.model;

public final class CounselPrompt {
  private CounselPrompt() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 2,
      /* suffix= */ "",
      CounselPrompt.class.getName());
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
    internal_static_com_hearlers_v1_model_PromptVersion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_PromptVersion_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_model_CounselorScopedPrompt_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_CounselorScopedPrompt_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_model_ToneScopedPrompt_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_ToneScopedPrompt_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_model_PersonaPrompt_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_PersonaPrompt_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_model_TonePrompt_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_TonePrompt_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_model_CounselTechnique_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_CounselTechnique_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_hearlers_v1_model_PromptActivateHistory_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_hearlers_v1_model_PromptActivateHistory_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*com/hearlers/v1/model/counsel_prompt.p" +
      "roto\022\025com.hearlers.v1.model\"\354\003\n\rPromptVe" +
      "rsion\022\016\n\002id\030\001 \001(\tR\002id\022\022\n\004name\030\002 \001(\tR\004nam" +
      "e\022 \n\013description\030\003 \001(\tR\013description\022\033\n\ti" +
      "s_active\030\004 \001(\010R\010isActive\022!\n\014is_temporary" +
      "\030\005 \001(\010R\013isTemporary\022#\n\ris_bookmarked\030\006 \001" +
      "(\010R\014isBookmarked\022f\n\030counselor_scoped_pro" +
      "mpts\030\007 \003(\0132,.com.hearlers.v1.model.Couns" +
      "elorScopedPromptR\026counselorScopedPrompts" +
      "\022W\n\023tone_scoped_prompts\030\010 \003(\0132\'.com.hear" +
      "lers.v1.model.ToneScopedPromptR\021toneScop" +
      "edPrompts\022\035\n\ncreated_at\030\t \001(\tR\tcreatedAt" +
      "\022\035\n\nupdated_at\030\n \001(\tR\tupdatedAt\022\"\n\ndelet" +
      "ed_at\030\013 \001(\tH\000R\tdeletedAt\210\001\001B\r\n\013_deleted_" +
      "at\"\327\001\n\025CounselorScopedPrompt\022!\n\014counselo" +
      "r_id\030\001 \001(\tR\013counselorId\022*\n\021persona_promp" +
      "t_id\030\002 \001(\tR\017personaPromptId\022\035\n\ncreated_a" +
      "t\030\003 \001(\tR\tcreatedAt\022\035\n\nupdated_at\030\004 \001(\tR\t" +
      "updatedAt\022\"\n\ndeleted_at\030\005 \001(\tH\000R\tdeleted" +
      "At\210\001\001B\r\n\013_deleted_at\"\273\002\n\020ToneScopedPromp" +
      "t\022\027\n\007tone_id\030\001 \001(\tR\006toneId\022)\n\016tone_promp" +
      "t_id\030\002 \001(\tH\000R\014tonePromptId\210\001\001\022@\n\032first_c" +
      "ounsel_technique_id\030\003 \001(\tH\001R\027firstCounse" +
      "lTechniqueId\210\001\001\022\035\n\ncreated_at\030\004 \001(\tR\tcre" +
      "atedAt\022\035\n\nupdated_at\030\005 \001(\tR\tupdatedAt\022\"\n" +
      "\ndeleted_at\030\006 \001(\tH\002R\tdeletedAt\210\001\001B\021\n\017_to" +
      "ne_prompt_idB\035\n\033_first_counsel_technique" +
      "_idB\r\n\013_deleted_at\"\307\001\n\rPersonaPrompt\022\016\n\002" +
      "id\030\001 \001(\tR\002id\022\022\n\004body\030\002 \001(\tR\004body\022!\n\014coun" +
      "selor_id\030\003 \001(\tR\013counselorId\022\035\n\ncreated_a" +
      "t\030\004 \001(\tR\tcreatedAt\022\035\n\nupdated_at\030\005 \001(\tR\t" +
      "updatedAt\022\"\n\ndeleted_at\030\006 \001(\tH\000R\tdeleted" +
      "At\210\001\001B\r\n\013_deleted_at\"\272\001\n\nTonePrompt\022\016\n\002i" +
      "d\030\001 \001(\tR\002id\022\022\n\004body\030\002 \001(\tR\004body\022\027\n\007tone_" +
      "id\030\003 \001(\tR\006toneId\022\035\n\ncreated_at\030\004 \001(\tR\tcr" +
      "eatedAt\022\035\n\nupdated_at\030\005 \001(\tR\tupdatedAt\022\"" +
      "\n\ndeleted_at\030\006 \001(\tH\000R\tdeletedAt\210\001\001B\r\n\013_d" +
      "eleted_at\"\252\003\n\020CounselTechnique\022\016\n\002id\030\001 \001" +
      "(\tR\002id\022\022\n\004name\030\002 \001(\tR\004name\022\027\n\007tone_id\030\003 " +
      "\001(\tR\006toneId\022\030\n\007context\030\004 \001(\tR\007context\022 \n" +
      "\013instruction\030\005 \001(\tR\013instruction\022+\n\021messa" +
      "ge_threshold\030\006 \001(\005R\020messageThreshold\022!\n\014" +
      "is_temporary\030\007 \001(\010R\013isTemporary\022>\n\031next_" +
      "counsel_technique_id\030\010 \001(\tH\000R\026nextCounse" +
      "lTechniqueId\210\001\001\022\035\n\ncreated_at\030\t \001(\tR\tcre" +
      "atedAt\022\035\n\nupdated_at\030\n \001(\tR\tupdatedAt\022\"\n" +
      "\ndeleted_at\030\013 \001(\tH\001R\tdeletedAt\210\001\001B\034\n\032_ne" +
      "xt_counsel_technique_idB\r\n\013_deleted_at\"\347" +
      "\001\n\025PromptActivateHistory\022\016\n\002id\030\001 \001(\tR\002id" +
      "\022*\n\021prompt_version_id\030\002 \001(\tR\017promptVersi" +
      "onId\022!\n\014activated_at\030\003 \001(\tR\013activatedAt\022" +
      "\035\n\ncreated_at\030\004 \001(\tR\tcreatedAt\022\035\n\nupdate" +
      "d_at\030\005 \001(\tR\tupdatedAt\022\"\n\ndeleted_at\030\006 \001(" +
      "\tH\000R\tdeletedAt\210\001\001B\r\n\013_deleted_atB#\n\037com." +
      "hearlers.api.proto.v1.modelP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_hearlers_v1_model_PromptVersion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_hearlers_v1_model_PromptVersion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_PromptVersion_descriptor,
        new java.lang.String[] { "Id", "Name", "Description", "IsActive", "IsTemporary", "IsBookmarked", "CounselorScopedPrompts", "ToneScopedPrompts", "CreatedAt", "UpdatedAt", "DeletedAt", });
    internal_static_com_hearlers_v1_model_CounselorScopedPrompt_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_hearlers_v1_model_CounselorScopedPrompt_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_CounselorScopedPrompt_descriptor,
        new java.lang.String[] { "CounselorId", "PersonaPromptId", "CreatedAt", "UpdatedAt", "DeletedAt", });
    internal_static_com_hearlers_v1_model_ToneScopedPrompt_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_hearlers_v1_model_ToneScopedPrompt_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_ToneScopedPrompt_descriptor,
        new java.lang.String[] { "ToneId", "TonePromptId", "FirstCounselTechniqueId", "CreatedAt", "UpdatedAt", "DeletedAt", });
    internal_static_com_hearlers_v1_model_PersonaPrompt_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_hearlers_v1_model_PersonaPrompt_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_PersonaPrompt_descriptor,
        new java.lang.String[] { "Id", "Body", "CounselorId", "CreatedAt", "UpdatedAt", "DeletedAt", });
    internal_static_com_hearlers_v1_model_TonePrompt_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_com_hearlers_v1_model_TonePrompt_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_TonePrompt_descriptor,
        new java.lang.String[] { "Id", "Body", "ToneId", "CreatedAt", "UpdatedAt", "DeletedAt", });
    internal_static_com_hearlers_v1_model_CounselTechnique_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_com_hearlers_v1_model_CounselTechnique_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_CounselTechnique_descriptor,
        new java.lang.String[] { "Id", "Name", "ToneId", "Context", "Instruction", "MessageThreshold", "IsTemporary", "NextCounselTechniqueId", "CreatedAt", "UpdatedAt", "DeletedAt", });
    internal_static_com_hearlers_v1_model_PromptActivateHistory_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_com_hearlers_v1_model_PromptActivateHistory_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_hearlers_v1_model_PromptActivateHistory_descriptor,
        new java.lang.String[] { "Id", "PromptVersionId", "ActivatedAt", "CreatedAt", "UpdatedAt", "DeletedAt", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
