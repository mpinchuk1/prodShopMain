// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Order.proto

package org.appMain;

/**
 * Protobuf type {@code org.appMain.GetResponseOrder}
 */
public  final class GetResponseOrder extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.appMain.GetResponseOrder)
    GetResponseOrderOrBuilder {
  // Use GetResponseOrder.newBuilder() to construct.
  private GetResponseOrder(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetResponseOrder() {
    order_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GetResponseOrder(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              order_ = new java.util.ArrayList<org.appMain.ProtoOrder>();
              mutable_bitField0_ |= 0x00000001;
            }
            order_.add(
                input.readMessage(org.appMain.ProtoOrder.parser(), extensionRegistry));
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        order_ = java.util.Collections.unmodifiableList(order_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.appMain.Order.internal_static_org_appMain_GetResponseOrder_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.appMain.Order.internal_static_org_appMain_GetResponseOrder_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.appMain.GetResponseOrder.class, org.appMain.GetResponseOrder.Builder.class);
  }

  public static final int ORDER_FIELD_NUMBER = 1;
  private java.util.List<org.appMain.ProtoOrder> order_;
  /**
   * <code>repeated .org.appMain.ProtoOrder order = 1;</code>
   */
  public java.util.List<org.appMain.ProtoOrder> getOrderList() {
    return order_;
  }
  /**
   * <code>repeated .org.appMain.ProtoOrder order = 1;</code>
   */
  public java.util.List<? extends org.appMain.ProtoOrderOrBuilder> 
      getOrderOrBuilderList() {
    return order_;
  }
  /**
   * <code>repeated .org.appMain.ProtoOrder order = 1;</code>
   */
  public int getOrderCount() {
    return order_.size();
  }
  /**
   * <code>repeated .org.appMain.ProtoOrder order = 1;</code>
   */
  public org.appMain.ProtoOrder getOrder(int index) {
    return order_.get(index);
  }
  /**
   * <code>repeated .org.appMain.ProtoOrder order = 1;</code>
   */
  public org.appMain.ProtoOrderOrBuilder getOrderOrBuilder(
      int index) {
    return order_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < order_.size(); i++) {
      output.writeMessage(1, order_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < order_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, order_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.appMain.GetResponseOrder)) {
      return super.equals(obj);
    }
    org.appMain.GetResponseOrder other = (org.appMain.GetResponseOrder) obj;

    boolean result = true;
    result = result && getOrderList()
        .equals(other.getOrderList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getOrderCount() > 0) {
      hash = (37 * hash) + ORDER_FIELD_NUMBER;
      hash = (53 * hash) + getOrderList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.appMain.GetResponseOrder parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.appMain.GetResponseOrder parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.appMain.GetResponseOrder parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.appMain.GetResponseOrder parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.appMain.GetResponseOrder parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.appMain.GetResponseOrder parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.appMain.GetResponseOrder parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.appMain.GetResponseOrder parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.appMain.GetResponseOrder parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.appMain.GetResponseOrder parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.appMain.GetResponseOrder parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.appMain.GetResponseOrder parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.appMain.GetResponseOrder prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.appMain.GetResponseOrder}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.appMain.GetResponseOrder)
      org.appMain.GetResponseOrderOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.appMain.Order.internal_static_org_appMain_GetResponseOrder_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.appMain.Order.internal_static_org_appMain_GetResponseOrder_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.appMain.GetResponseOrder.class, org.appMain.GetResponseOrder.Builder.class);
    }

    // Construct using org.appMain.GetResponseOrder.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getOrderFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (orderBuilder_ == null) {
        order_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        orderBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.appMain.Order.internal_static_org_appMain_GetResponseOrder_descriptor;
    }

    public org.appMain.GetResponseOrder getDefaultInstanceForType() {
      return org.appMain.GetResponseOrder.getDefaultInstance();
    }

    public org.appMain.GetResponseOrder build() {
      org.appMain.GetResponseOrder result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.appMain.GetResponseOrder buildPartial() {
      org.appMain.GetResponseOrder result = new org.appMain.GetResponseOrder(this);
      int from_bitField0_ = bitField0_;
      if (orderBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          order_ = java.util.Collections.unmodifiableList(order_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.order_ = order_;
      } else {
        result.order_ = orderBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.appMain.GetResponseOrder) {
        return mergeFrom((org.appMain.GetResponseOrder)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.appMain.GetResponseOrder other) {
      if (other == org.appMain.GetResponseOrder.getDefaultInstance()) return this;
      if (orderBuilder_ == null) {
        if (!other.order_.isEmpty()) {
          if (order_.isEmpty()) {
            order_ = other.order_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOrderIsMutable();
            order_.addAll(other.order_);
          }
          onChanged();
        }
      } else {
        if (!other.order_.isEmpty()) {
          if (orderBuilder_.isEmpty()) {
            orderBuilder_.dispose();
            orderBuilder_ = null;
            order_ = other.order_;
            bitField0_ = (bitField0_ & ~0x00000001);
            orderBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOrderFieldBuilder() : null;
          } else {
            orderBuilder_.addAllMessages(other.order_);
          }
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.appMain.GetResponseOrder parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.appMain.GetResponseOrder) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.appMain.ProtoOrder> order_ =
      java.util.Collections.emptyList();
    private void ensureOrderIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        order_ = new java.util.ArrayList<org.appMain.ProtoOrder>(order_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.appMain.ProtoOrder, org.appMain.ProtoOrder.Builder, org.appMain.ProtoOrderOrBuilder> orderBuilder_;

    /**
     * <code>repeated .org.appMain.ProtoOrder order = 1;</code>
     */
    public java.util.List<org.appMain.ProtoOrder> getOrderList() {
      if (orderBuilder_ == null) {
        return java.util.Collections.unmodifiableList(order_);
      } else {
        return orderBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .org.appMain.ProtoOrder order = 1;</code>
     */
    public int getOrderCount() {
      if (orderBuilder_ == null) {
        return order_.size();
      } else {
        return orderBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .org.appMain.ProtoOrder order = 1;</code>
     */
    public org.appMain.ProtoOrder getOrder(int index) {
      if (orderBuilder_ == null) {
        return order_.get(index);
      } else {
        return orderBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .org.appMain.ProtoOrder order = 1;</code>
     */
    public Builder setOrder(
        int index, org.appMain.ProtoOrder value) {
      if (orderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrderIsMutable();
        order_.set(index, value);
        onChanged();
      } else {
        orderBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .org.appMain.ProtoOrder order = 1;</code>
     */
    public Builder setOrder(
        int index, org.appMain.ProtoOrder.Builder builderForValue) {
      if (orderBuilder_ == null) {
        ensureOrderIsMutable();
        order_.set(index, builderForValue.build());
        onChanged();
      } else {
        orderBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.appMain.ProtoOrder order = 1;</code>
     */
    public Builder addOrder(org.appMain.ProtoOrder value) {
      if (orderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrderIsMutable();
        order_.add(value);
        onChanged();
      } else {
        orderBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .org.appMain.ProtoOrder order = 1;</code>
     */
    public Builder addOrder(
        int index, org.appMain.ProtoOrder value) {
      if (orderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrderIsMutable();
        order_.add(index, value);
        onChanged();
      } else {
        orderBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .org.appMain.ProtoOrder order = 1;</code>
     */
    public Builder addOrder(
        org.appMain.ProtoOrder.Builder builderForValue) {
      if (orderBuilder_ == null) {
        ensureOrderIsMutable();
        order_.add(builderForValue.build());
        onChanged();
      } else {
        orderBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.appMain.ProtoOrder order = 1;</code>
     */
    public Builder addOrder(
        int index, org.appMain.ProtoOrder.Builder builderForValue) {
      if (orderBuilder_ == null) {
        ensureOrderIsMutable();
        order_.add(index, builderForValue.build());
        onChanged();
      } else {
        orderBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.appMain.ProtoOrder order = 1;</code>
     */
    public Builder addAllOrder(
        java.lang.Iterable<? extends org.appMain.ProtoOrder> values) {
      if (orderBuilder_ == null) {
        ensureOrderIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, order_);
        onChanged();
      } else {
        orderBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .org.appMain.ProtoOrder order = 1;</code>
     */
    public Builder clearOrder() {
      if (orderBuilder_ == null) {
        order_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        orderBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .org.appMain.ProtoOrder order = 1;</code>
     */
    public Builder removeOrder(int index) {
      if (orderBuilder_ == null) {
        ensureOrderIsMutable();
        order_.remove(index);
        onChanged();
      } else {
        orderBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .org.appMain.ProtoOrder order = 1;</code>
     */
    public org.appMain.ProtoOrder.Builder getOrderBuilder(
        int index) {
      return getOrderFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .org.appMain.ProtoOrder order = 1;</code>
     */
    public org.appMain.ProtoOrderOrBuilder getOrderOrBuilder(
        int index) {
      if (orderBuilder_ == null) {
        return order_.get(index);  } else {
        return orderBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .org.appMain.ProtoOrder order = 1;</code>
     */
    public java.util.List<? extends org.appMain.ProtoOrderOrBuilder> 
         getOrderOrBuilderList() {
      if (orderBuilder_ != null) {
        return orderBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(order_);
      }
    }
    /**
     * <code>repeated .org.appMain.ProtoOrder order = 1;</code>
     */
    public org.appMain.ProtoOrder.Builder addOrderBuilder() {
      return getOrderFieldBuilder().addBuilder(
          org.appMain.ProtoOrder.getDefaultInstance());
    }
    /**
     * <code>repeated .org.appMain.ProtoOrder order = 1;</code>
     */
    public org.appMain.ProtoOrder.Builder addOrderBuilder(
        int index) {
      return getOrderFieldBuilder().addBuilder(
          index, org.appMain.ProtoOrder.getDefaultInstance());
    }
    /**
     * <code>repeated .org.appMain.ProtoOrder order = 1;</code>
     */
    public java.util.List<org.appMain.ProtoOrder.Builder> 
         getOrderBuilderList() {
      return getOrderFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.appMain.ProtoOrder, org.appMain.ProtoOrder.Builder, org.appMain.ProtoOrderOrBuilder> 
        getOrderFieldBuilder() {
      if (orderBuilder_ == null) {
        orderBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.appMain.ProtoOrder, org.appMain.ProtoOrder.Builder, org.appMain.ProtoOrderOrBuilder>(
                order_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        order_ = null;
      }
      return orderBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:org.appMain.GetResponseOrder)
  }

  // @@protoc_insertion_point(class_scope:org.appMain.GetResponseOrder)
  private static final org.appMain.GetResponseOrder DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.appMain.GetResponseOrder();
  }

  public static org.appMain.GetResponseOrder getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetResponseOrder>
      PARSER = new com.google.protobuf.AbstractParser<GetResponseOrder>() {
    public GetResponseOrder parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetResponseOrder(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetResponseOrder> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetResponseOrder> getParserForType() {
    return PARSER;
  }

  public org.appMain.GetResponseOrder getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

