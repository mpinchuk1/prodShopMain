// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Customer.proto

package org.appMain;

public final class Customer {
  private Customer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_appMain_ProtoCustomer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_appMain_ProtoCustomer_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_appMain_GetCustomerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_appMain_GetCustomerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_appMain_GetCustomerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_appMain_GetCustomerResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_appMain_CreateCustomerRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_appMain_CreateCustomerRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_org_appMain_CreateCustomerResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_org_appMain_CreateCustomerResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016Customer.proto\022\013org.appMain\"M\n\rProtoCu" +
      "stomer\022\n\n\002id\030\001 \001(\t\022\021\n\tfirstName\030\002 \001(\t\022\020\n" +
      "\010lastName\030\003 \001(\t\022\013\n\003age\030\004 \001(\005\"\024\n\022GetCusto" +
      "merRequest\"D\n\023GetCustomerResponse\022-\n\tcus" +
      "tomers\030\001 \003(\0132\032.org.appMain.ProtoCustomer" +
      "\"E\n\025CreateCustomerRequest\022,\n\010customer\030\001 " +
      "\001(\0132\032.org.appMain.ProtoCustomer\"\030\n\026Creat" +
      "eCustomerResponse2\256\001\n\017customerService\022H\n" +
      "\003get\022\037.org.appMain.GetCustomerRequest\032 ." +
      "org.appMain.GetCustomerResponse\022Q\n\006creat",
      "e\022\".org.appMain.CreateCustomerRequest\032#." +
      "org.appMain.CreateCustomerResponseB\002P\001b\006" +
      "proto3"
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
    internal_static_org_appMain_ProtoCustomer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_org_appMain_ProtoCustomer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_appMain_ProtoCustomer_descriptor,
        new java.lang.String[] { "Id", "FirstName", "LastName", "Age", });
    internal_static_org_appMain_GetCustomerRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_org_appMain_GetCustomerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_appMain_GetCustomerRequest_descriptor,
        new java.lang.String[] { });
    internal_static_org_appMain_GetCustomerResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_org_appMain_GetCustomerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_appMain_GetCustomerResponse_descriptor,
        new java.lang.String[] { "Customers", });
    internal_static_org_appMain_CreateCustomerRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_org_appMain_CreateCustomerRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_appMain_CreateCustomerRequest_descriptor,
        new java.lang.String[] { "Customer", });
    internal_static_org_appMain_CreateCustomerResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_org_appMain_CreateCustomerResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_org_appMain_CreateCustomerResponse_descriptor,
        new java.lang.String[] { });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
