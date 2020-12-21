package grpc;

import entities.Customer;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.appMain.*;

import java.util.ArrayList;
import java.util.List;

public class CustomerGrpcMethod {

    private static final String URL = "localhost";
    private static final int PORT = 9091;

    public List<Customer> customerReport() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(URL, PORT).usePlaintext().build();
        customerServiceGrpc.customerServiceBlockingStub stub = customerServiceGrpc.newBlockingStub(channel);

        GetCustomerResponse response = stub.get(GetCustomerRequest.newBuilder().build());
        channel.shutdown();

        System.out.println("Customer Report:");
        List<ProtoCustomer> protoCustomers = response.getCustomersList();

        List<Customer> customers = new ArrayList<>();
        for (ProtoCustomer protoCustomer : protoCustomers) {
            customers.add(new Customer(protoCustomer.getFirstName(), protoCustomer.getLastName(), protoCustomer.getAge()));
        }
        return customers;
    }

    public void createCustomer(Customer customer) {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress(URL, PORT)
                .usePlaintext()
                .build();
        customerServiceGrpc.customerServiceBlockingStub stub = customerServiceGrpc.newBlockingStub(channel);
        ProtoCustomer protoCustomer = ProtoCustomer.newBuilder()
                .setId(customer.getCustomerId().toString())
                .setFirstName(customer.getFirstName())
                .setLastName(customer.getLastName())
                .setAge(customer.getAge())
                .build();

        stub.create(CreateCustomerRequest.newBuilder().setCustomer(protoCustomer).build());
        channel.shutdown();
    }
}
