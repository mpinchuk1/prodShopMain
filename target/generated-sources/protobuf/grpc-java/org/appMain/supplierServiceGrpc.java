package org.appMain;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: CourierProduct.proto")
public final class supplierServiceGrpc {

  private supplierServiceGrpc() {}

  public static final String SERVICE_NAME = "org.appMain.supplierService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.appMain.GetRequestProduct,
      org.appMain.GetResponseProduct> METHOD_GET_PRODUCTS =
      io.grpc.MethodDescriptor.<org.appMain.GetRequestProduct, org.appMain.GetResponseProduct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.appMain.supplierService", "getProducts"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.appMain.GetRequestProduct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.appMain.GetResponseProduct.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.appMain.DeliverProductsRequest,
      org.appMain.DeliverProductsResponse> METHOD_DELIVER_PRODUCTS =
      io.grpc.MethodDescriptor.<org.appMain.DeliverProductsRequest, org.appMain.DeliverProductsResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.appMain.supplierService", "deliverProducts"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.appMain.DeliverProductsRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.appMain.DeliverProductsResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static supplierServiceStub newStub(io.grpc.Channel channel) {
    return new supplierServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static supplierServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new supplierServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static supplierServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new supplierServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class supplierServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getProducts(org.appMain.GetRequestProduct request,
        io.grpc.stub.StreamObserver<org.appMain.GetResponseProduct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PRODUCTS, responseObserver);
    }

    /**
     */
    public void deliverProducts(org.appMain.DeliverProductsRequest request,
        io.grpc.stub.StreamObserver<org.appMain.DeliverProductsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_DELIVER_PRODUCTS, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_PRODUCTS,
            asyncUnaryCall(
              new MethodHandlers<
                org.appMain.GetRequestProduct,
                org.appMain.GetResponseProduct>(
                  this, METHODID_GET_PRODUCTS)))
          .addMethod(
            METHOD_DELIVER_PRODUCTS,
            asyncUnaryCall(
              new MethodHandlers<
                org.appMain.DeliverProductsRequest,
                org.appMain.DeliverProductsResponse>(
                  this, METHODID_DELIVER_PRODUCTS)))
          .build();
    }
  }

  /**
   */
  public static final class supplierServiceStub extends io.grpc.stub.AbstractStub<supplierServiceStub> {
    private supplierServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private supplierServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected supplierServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new supplierServiceStub(channel, callOptions);
    }

    /**
     */
    public void getProducts(org.appMain.GetRequestProduct request,
        io.grpc.stub.StreamObserver<org.appMain.GetResponseProduct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCTS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deliverProducts(org.appMain.DeliverProductsRequest request,
        io.grpc.stub.StreamObserver<org.appMain.DeliverProductsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_DELIVER_PRODUCTS, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class supplierServiceBlockingStub extends io.grpc.stub.AbstractStub<supplierServiceBlockingStub> {
    private supplierServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private supplierServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected supplierServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new supplierServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.appMain.GetResponseProduct getProducts(org.appMain.GetRequestProduct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PRODUCTS, getCallOptions(), request);
    }

    /**
     */
    public org.appMain.DeliverProductsResponse deliverProducts(org.appMain.DeliverProductsRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_DELIVER_PRODUCTS, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class supplierServiceFutureStub extends io.grpc.stub.AbstractStub<supplierServiceFutureStub> {
    private supplierServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private supplierServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected supplierServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new supplierServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.appMain.GetResponseProduct> getProducts(
        org.appMain.GetRequestProduct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PRODUCTS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.appMain.DeliverProductsResponse> deliverProducts(
        org.appMain.DeliverProductsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_DELIVER_PRODUCTS, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PRODUCTS = 0;
  private static final int METHODID_DELIVER_PRODUCTS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final supplierServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(supplierServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PRODUCTS:
          serviceImpl.getProducts((org.appMain.GetRequestProduct) request,
              (io.grpc.stub.StreamObserver<org.appMain.GetResponseProduct>) responseObserver);
          break;
        case METHODID_DELIVER_PRODUCTS:
          serviceImpl.deliverProducts((org.appMain.DeliverProductsRequest) request,
              (io.grpc.stub.StreamObserver<org.appMain.DeliverProductsResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static final class supplierServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.appMain.CourierProduct.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (supplierServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new supplierServiceDescriptorSupplier())
              .addMethod(METHOD_GET_PRODUCTS)
              .addMethod(METHOD_DELIVER_PRODUCTS)
              .build();
        }
      }
    }
    return result;
  }
}
