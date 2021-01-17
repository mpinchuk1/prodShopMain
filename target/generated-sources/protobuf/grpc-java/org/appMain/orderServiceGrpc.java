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
    comments = "Source: Order.proto")
public final class orderServiceGrpc {

  private orderServiceGrpc() {}

  public static final String SERVICE_NAME = "org.appMain.orderService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.appMain.GetRequestOrder,
      org.appMain.GetResponseOrder> METHOD_GET_ORDERS =
      io.grpc.MethodDescriptor.<org.appMain.GetRequestOrder, org.appMain.GetResponseOrder>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.appMain.orderService", "getOrders"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.appMain.GetRequestOrder.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.appMain.GetResponseOrder.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.appMain.GetRequestOrderedProduct,
      org.appMain.GetResponseOrderedProduct> METHOD_GET_ORDERED_THING =
      io.grpc.MethodDescriptor.<org.appMain.GetRequestOrderedProduct, org.appMain.GetResponseOrderedProduct>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.appMain.orderService", "getOrderedThing"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.appMain.GetRequestOrderedProduct.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.appMain.GetResponseOrderedProduct.getDefaultInstance()))
          .build();
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<org.appMain.CreateOrderRequest,
      org.appMain.CreateOrderResponse> METHOD_CREATE =
      io.grpc.MethodDescriptor.<org.appMain.CreateOrderRequest, org.appMain.CreateOrderResponse>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "org.appMain.orderService", "create"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.appMain.CreateOrderRequest.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              org.appMain.CreateOrderResponse.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static orderServiceStub newStub(io.grpc.Channel channel) {
    return new orderServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static orderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new orderServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static orderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new orderServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class orderServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getOrders(org.appMain.GetRequestOrder request,
        io.grpc.stub.StreamObserver<org.appMain.GetResponseOrder> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ORDERS, responseObserver);
    }

    /**
     */
    public void getOrderedThing(org.appMain.GetRequestOrderedProduct request,
        io.grpc.stub.StreamObserver<org.appMain.GetResponseOrderedProduct> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_ORDERED_THING, responseObserver);
    }

    /**
     */
    public void create(org.appMain.CreateOrderRequest request,
        io.grpc.stub.StreamObserver<org.appMain.CreateOrderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_ORDERS,
            asyncUnaryCall(
              new MethodHandlers<
                org.appMain.GetRequestOrder,
                org.appMain.GetResponseOrder>(
                  this, METHODID_GET_ORDERS)))
          .addMethod(
            METHOD_GET_ORDERED_THING,
            asyncUnaryCall(
              new MethodHandlers<
                org.appMain.GetRequestOrderedProduct,
                org.appMain.GetResponseOrderedProduct>(
                  this, METHODID_GET_ORDERED_THING)))
          .addMethod(
            METHOD_CREATE,
            asyncUnaryCall(
              new MethodHandlers<
                org.appMain.CreateOrderRequest,
                org.appMain.CreateOrderResponse>(
                  this, METHODID_CREATE)))
          .build();
    }
  }

  /**
   */
  public static final class orderServiceStub extends io.grpc.stub.AbstractStub<orderServiceStub> {
    private orderServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private orderServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected orderServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new orderServiceStub(channel, callOptions);
    }

    /**
     */
    public void getOrders(org.appMain.GetRequestOrder request,
        io.grpc.stub.StreamObserver<org.appMain.GetResponseOrder> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ORDERS, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getOrderedThing(org.appMain.GetRequestOrderedProduct request,
        io.grpc.stub.StreamObserver<org.appMain.GetResponseOrderedProduct> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_ORDERED_THING, getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void create(org.appMain.CreateOrderRequest request,
        io.grpc.stub.StreamObserver<org.appMain.CreateOrderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class orderServiceBlockingStub extends io.grpc.stub.AbstractStub<orderServiceBlockingStub> {
    private orderServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private orderServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected orderServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new orderServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.appMain.GetResponseOrder getOrders(org.appMain.GetRequestOrder request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ORDERS, getCallOptions(), request);
    }

    /**
     */
    public org.appMain.GetResponseOrderedProduct getOrderedThing(org.appMain.GetRequestOrderedProduct request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_ORDERED_THING, getCallOptions(), request);
    }

    /**
     */
    public org.appMain.CreateOrderResponse create(org.appMain.CreateOrderRequest request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class orderServiceFutureStub extends io.grpc.stub.AbstractStub<orderServiceFutureStub> {
    private orderServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private orderServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected orderServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new orderServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.appMain.GetResponseOrder> getOrders(
        org.appMain.GetRequestOrder request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ORDERS, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.appMain.GetResponseOrderedProduct> getOrderedThing(
        org.appMain.GetRequestOrderedProduct request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_ORDERED_THING, getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.appMain.CreateOrderResponse> create(
        org.appMain.CreateOrderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ORDERS = 0;
  private static final int METHODID_GET_ORDERED_THING = 1;
  private static final int METHODID_CREATE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final orderServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(orderServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ORDERS:
          serviceImpl.getOrders((org.appMain.GetRequestOrder) request,
              (io.grpc.stub.StreamObserver<org.appMain.GetResponseOrder>) responseObserver);
          break;
        case METHODID_GET_ORDERED_THING:
          serviceImpl.getOrderedThing((org.appMain.GetRequestOrderedProduct) request,
              (io.grpc.stub.StreamObserver<org.appMain.GetResponseOrderedProduct>) responseObserver);
          break;
        case METHODID_CREATE:
          serviceImpl.create((org.appMain.CreateOrderRequest) request,
              (io.grpc.stub.StreamObserver<org.appMain.CreateOrderResponse>) responseObserver);
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

  private static final class orderServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.appMain.Order.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (orderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new orderServiceDescriptorSupplier())
              .addMethod(METHOD_GET_ORDERS)
              .addMethod(METHOD_GET_ORDERED_THING)
              .addMethod(METHOD_CREATE)
              .build();
        }
      }
    }
    return result;
  }
}
