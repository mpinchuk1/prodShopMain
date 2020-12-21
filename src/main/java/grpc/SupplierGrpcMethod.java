package grpc;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entities.Courier;
import entities.Product;
import entities.dto.DeliveryDTO;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.appMain.*;

import java.util.ArrayList;
import java.util.List;

public class SupplierGrpcMethod {

    private static final String URL = "localhost";
    private static final int PORT = 9091;

    public List<Product> productsReport() {
        ManagedChannel channel = ManagedChannelBuilder.forAddress(URL, PORT).usePlaintext().build();
        supplierServiceGrpc.supplierServiceBlockingStub stub = supplierServiceGrpc.newBlockingStub(channel);

        GetResponseProduct response = stub.getProducts(GetRequestProduct.newBuilder().build());
        channel.shutdown();

        System.out.println("Product Report:");
        List<ProtoProduct> protoProducts = response.getItemsList();

        List<Product> products = new ArrayList<>();
        for (ProtoProduct protoProduct : protoProducts) {
            Product product = new Product(protoProduct.getName(), protoProduct.getPrice());
            products.add(product);
        }
        return products;
    }

    public void deliverProducts(Courier courier, List<Product> products, List<Integer> quantities) {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress(URL, PORT)
                .usePlaintext()
                .build();

        DeliveryDTO deliveryDTO = new DeliveryDTO();
        deliveryDTO.setCourier(courier);
        deliveryDTO.setProducts(products);
        deliveryDTO.setProductQuantities(quantities);
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        String serveJsonStr = gson.toJson(deliveryDTO);

        supplierServiceGrpc.supplierServiceBlockingStub stub = supplierServiceGrpc.newBlockingStub(channel);
        stub.deliverProducts(DeliverProductsRequest.newBuilder().setServeJson(serveJsonStr).build());
        channel.shutdown();
    }
}
