// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/versions.proto

package org.tensorflow.framework;

public interface VersionDefOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.VersionDef)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The version of the code that produced this data.
   * </pre>
   *
   * <code>int32 producer = 1;</code>
   */
  int getProducer();

  /**
   * <pre>
   * Any consumer below this version is not allowed to consume this data.
   * </pre>
   *
   * <code>int32 min_consumer = 2;</code>
   */
  int getMinConsumer();

  /**
   * <pre>
   * Specific consumer versions which are disallowed (e.g. due to bugs).
   * </pre>
   *
   * <code>repeated int32 bad_consumers = 3;</code>
   */
  java.util.List<Integer> getBadConsumersList();
  /**
   * <pre>
   * Specific consumer versions which are disallowed (e.g. due to bugs).
   * </pre>
   *
   * <code>repeated int32 bad_consumers = 3;</code>
   */
  int getBadConsumersCount();
  /**
   * <pre>
   * Specific consumer versions which are disallowed (e.g. due to bugs).
   * </pre>
   *
   * <code>repeated int32 bad_consumers = 3;</code>
   */
  int getBadConsumers(int index);
}