// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: com/hearlers/v1/service/counselor.proto
// Protobuf Java Version: 4.29.2

package com.hearlers.api.proto.v1.service;

public interface FindEpisodeByIdResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.hearlers.v1.service.FindEpisodeByIdResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.com.hearlers.v1.model.Episode episode = 1 [json_name = "episode"];</code>
   * @return Whether the episode field is set.
   */
  boolean hasEpisode();
  /**
   * <code>.com.hearlers.v1.model.Episode episode = 1 [json_name = "episode"];</code>
   * @return The episode.
   */
  com.hearlers.api.proto.v1.model.Episode getEpisode();
  /**
   * <code>.com.hearlers.v1.model.Episode episode = 1 [json_name = "episode"];</code>
   */
  com.hearlers.api.proto.v1.model.EpisodeOrBuilder getEpisodeOrBuilder();
}
