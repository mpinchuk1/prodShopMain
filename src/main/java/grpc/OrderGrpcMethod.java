package grpc;

import entities.Customer;
import entities.Order;
import entities.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.appMain.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class OrderGrpcMethod {

    private static final String URL = "localhost";
    private static final int PORT = 9091;

    public List<Order> orderReport() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(URL, PORT).usePlaintext().build();
        orderServiceGrpc.orderServiceBlockingStub stub = orderServiceGrpc.newBlockingStub(channel);

        GetResponseOrder response = stub.getOrders(GetRequestOrder.newBuilder().build());
        channel.shutdown();

        System.out.println("Order Report:");
        List<ProtoOrder> protoOrders = response.getOrderList();

        List<Order> orders = new ArrayList<>();
        for (ProtoOrder protoOrder : protoOrders) {
            orders.add(new Order(UUID.fromString(protoOrder.getId()), UUID.fromString(protoOrder.getCustomerId()), (double) protoOrder.getPrice()));
        }

        return orders;
    }

    public List<OrderProduct> orderedProductReport() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(URL, PORT).usePlaintext().build();
        orderServiceGrpc.orderServiceBlockingStub stub = orderServiceGrpc.newBlockingStub(channel);

        GetResponseOrderedProduct response = stub.getOrderedThing(GetRequestOrderedProduct.newBuilder().build());
        channel.shutdown();

        System.out.println("Ordered Product Report:");
        List<ProtoOrderedProduct> orderedProductsList = response.getOrderedProductsList();

        List<OrderProduct> list = new ArrayList<>();
        for (ProtoOrderedProduct protoOrderedProduct : orderedProductsList) {
            list.add(new OrderProduct(UUID.fromString(protoOrderedProduct.getOrderId()),
                    UUID.fromString(protoOrderedProduct.getProductId())));
        }
        return list;
    }

    public void makeOrder(Seller seller, Customer customer, List<Product> bucketForCustomer) {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress(URL, PORT)
                .usePlaintext()
                .build();
        orderServiceGrpc.orderServiceBlockingStub stub = orderServiceGrpc.newBlockingStub(channel);

        ProtoCustomerOrder protoCustomer = ProtoCustomerOrder.newBuilder()
                .setFirstName(customer.getFirstName())
                .setLastName(customer.getLastName())
                .setCustomerId(customer.getCustomerId().toString())
                .build();

        ProtoSeller protoSeller = ProtoSeller.newBuilder()
                .setFirstName(seller.getFirstName())
                .setLastName(seller.getLastName())
                .build();

        List<ProtoProductOrder> protoProductOrders = new ArrayList<>();
        for (Product product : bucketForCustomer) {
            ProtoProductOrder protoProduct = ProtoProductOrder.newBuilder()
                    .setName(product.getName())
                    .setPrice(product.getPrice())
                    .build();
            protoProductOrders.add(protoProduct);
        }
        stub.create(CreateOrderRequest.newBuilder()
                .addAllProducts(protoProductOrders)
                .setCustomer(protoCustomer)
                .setSeller(protoSeller)
                .build());
        channel.shutdown();

    }

}
