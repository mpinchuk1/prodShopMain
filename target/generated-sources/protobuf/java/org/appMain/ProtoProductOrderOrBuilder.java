// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Order.proto

package org.appMain;

public interface ProtoProductOrderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.appMain.ProtoProductOrder)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string productId = 1;</code>
   */
  java.lang.String getProductId();
  /**
   * <code>string productId = 1;</code>
   */
  com.google.protobuf.ByteString
      getProductIdBytes();

  /**
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>double price = 3;</code>
   */
  double getPrice();

  /**
   * <code>int32 quantity = 4;</code>
   */
  int getQuantity();

  /**
   * <code>bool isForAdult = 5;</code>
   */
  boolean getIsForAdult();
}
