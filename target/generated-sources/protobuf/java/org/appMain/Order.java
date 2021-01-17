// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Order.proto

package org.appMain;

public final class Order {
  private Order() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_appMain_ProtoOrder_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_appMain_ProtoOrder_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_appMain_ProtoOrderedProduct_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_appMain_ProtoOrderedProduct_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_appMain_ProtoProductOrder_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_appMain_ProtoProductOrder_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_appMain_ProtoCustomerOrder_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_appMain_ProtoCustomerOrder_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_appMain_ProtoSeller_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_appMain_ProtoSeller_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_appMain_GetRequestOrder_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_appMain_GetRequestOrder_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_appMain_GetResponseOrder_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_appMain_GetResponseOrder_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_appMain_GetRequestOrderedProduct_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_appMain_GetRequestOrderedProduct_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_appMain_GetResponseOrderedProduct_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_appMain_GetResponseOrderedProduct_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_appMain_CreateOrderRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_appMain_CreateOrderRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_appMain_CreateOrderResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_appMain_CreateOrderResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Order.proto\022\013org.appMain\";\n\nProtoOrder" +
      "\022\n\n\002id\030\001 \001(\t\022\022\n\ncustomerId\030\002 \001(\t\022\r\n\005pric" +
      "e\030\003 \001(\003\"9\n\023ProtoOrderedProduct\022\021\n\tproduc" +
      "tId\030\001 \001(\t\022\017\n\007orderId\030\002 \001(\t\"i\n\021ProtoProdu" +
      "ctOrder\022\021\n\tproductId\030\001 \001(\t\022\014\n\004name\030\002 \001(\t" +
      "\022\r\n\005price\030\003 \001(\001\022\020\n\010quantity\030\004 \001(\005\022\022\n\nisF" +
      "orAdult\030\005 \001(\010\"Z\n\022ProtoCustomerOrder\022\022\n\nc" +
      "ustomerId\030\001 \001(\t\022\021\n\tfirstName\030\002 \001(\t\022\020\n\010la" +
      "stName\030\003 \001(\t\022\013\n\003age\030\004 \001(\005\"2\n\013ProtoSeller" +
      "\022\021\n\tfirstName\030\001 \001(\t\022\020\n\010lastName\030\002 \001(\t\"\021\n",
      "\017GetRequestOrder\":\n\020GetResponseOrder\022&\n\005" +
      "order\030\001 \003(\0132\027.org.appMain.ProtoOrder\"\032\n\030" +
      "GetRequestOrderedProduct\"V\n\031GetResponseO" +
      "rderedProduct\0229\n\017orderedProducts\030\001 \003(\0132 " +
      ".org.appMain.ProtoOrderedProduct\"\243\001\n\022Cre" +
      "ateOrderRequest\022(\n\006seller\030\001 \001(\0132\030.org.ap" +
      "pMain.ProtoSeller\0221\n\010customer\030\002 \001(\0132\037.or" +
      "g.appMain.ProtoCustomerOrder\0220\n\010products" +
      "\030\003 \003(\0132\036.org.appMain.ProtoProductOrder\"\025" +
      "\n\023CreateOrderResponse2\207\002\n\014orderService\022H",
      "\n\tgetOrders\022\034.org.appMain.GetRequestOrde" +
      "r\032\035.org.appMain.GetResponseOrder\022`\n\017getO" +
      "rderedThing\022%.org.appMain.GetRequestOrde" +
      "redProduct\032&.org.appMain.GetResponseOrde" +
      "redProduct\022K\n\006create\022\037.org.appMain.Creat" +
      "eOrderRequest\032 .org.appMain.CreateOrderR" +
      "esponseB\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_org_appMain_ProtoOrder_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_appMain_ProtoOrder_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_appMain_ProtoOrder_descriptor,
        new java.lang.String[] { "Id", "CustomerId", "Price", });
    internal_static_org_appMain_ProtoOrderedProduct_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_appMain_ProtoOrderedProduct_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_appMain_ProtoOrderedProduct_descriptor,
        new java.lang.String[] { "ProductId", "OrderId", });
    internal_static_org_appMain_ProtoProductOrder_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_org_appMain_ProtoProductOrder_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_appMain_ProtoProductOrder_descriptor,
        new java.lang.String[] { "ProductId", "Name", "Price", "Quantity", "IsForAdult", });
    internal_static_org_appMain_ProtoCustomerOrder_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_org_appMain_ProtoCustomerOrder_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_appMain_ProtoCustomerOrder_descriptor,
        new java.lang.String[] { "CustomerId", "FirstName", "LastName", "Age", });
    internal_static_org_appMain_ProtoSeller_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_org_appMain_ProtoSeller_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_appMain_ProtoSeller_descriptor,
        new java.lang.String[] { "FirstName", "LastName", });
    internal_static_org_appMain_GetRequestOrder_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_org_appMain_GetRequestOrder_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_appMain_GetRequestOrder_descriptor,
        new java.lang.String[] { });
    internal_static_org_appMain_GetResponseOrder_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_org_appMain_GetResponseOrder_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_appMain_GetResponseOrder_descriptor,
        new java.lang.String[] { "Order", });
    internal_static_org_appMain_GetRequestOrderedProduct_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_org_appMain_GetRequestOrderedProduct_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_appMain_GetRequestOrderedProduct_descriptor,
        new java.lang.String[] { });
    internal_static_org_appMain_GetResponseOrderedProduct_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_org_appMain_GetResponseOrderedProduct_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_appMain_GetResponseOrderedProduct_descriptor,
        new java.lang.String[] { "OrderedProducts", });
    internal_static_org_appMain_CreateOrderRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_org_appMain_CreateOrderRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_appMain_CreateOrderRequest_descriptor,
        new java.lang.String[] { "Seller", "Customer", "Products", });
    internal_static_org_appMain_CreateOrderResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_org_appMain_CreateOrderResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_appMain_CreateOrderResponse_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
