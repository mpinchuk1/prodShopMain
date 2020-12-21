import entities.Courier;
import entities.Customer;
import entities.Product;
import entities.Seller;
import grpc.CustomerGrpcMethod;
import grpc.OrderGrpcMethod;
import grpc.SupplierGrpcMethod;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;


public class Main {

    private static final String URL = "http://localhost:8081";

    public static void main(String[] args) {

        Courier courier1 = new Courier("Petrov", "Co company");
        List<Product> deliveryProducts = createProductList(courier1);
        List<Integer> quantities = Arrays.asList(4, 5, 1, 46, 2, 88, 7, 22, 3);

        Seller seller1 = new Seller("Kolya", "Frolov");
        Customer customer1 = new Customer(UUID.randomUUID(), "Max", "WEW", 34);
        Customer customer2 = new Customer(UUID.randomUUID(), "Anton", "WEQQQ", 23);

        CustomerGrpcMethod customerGrpcMethod = new CustomerGrpcMethod();
        customerGrpcMethod.createCustomer(customer1);
        customerGrpcMethod.createCustomer(customer2);

        System.out.println("gRPC:");

        SupplierGrpcMethod supplierGrpcMethod = new SupplierGrpcMethod();
        supplierGrpcMethod.productsReport();

        supplierGrpcMethod.deliverProducts(courier1, deliveryProducts, quantities);
        List<Product> reportedProducts = supplierGrpcMethod.productsReport();
        for (Product product : reportedProducts) {
            System.out.println(product);
        }

        OrderGrpcMethod orders = new OrderGrpcMethod();

        List<Product> bucketForCustomer1 = new ArrayList<>(deliveryProducts.subList(0, 2));
        orders.makeOrder(seller1, customer1, bucketForCustomer1);
        List<Product> bucketForCustomer2 = new ArrayList<>(deliveryProducts.subList(2, 5));
        orders.makeOrder(seller1, customer2, bucketForCustomer2);

        orders.orderReport().forEach(System.out::println);
        orders.orderedProductReport().forEach(System.out::println);
    }


    public static List<Product> createProductList(Courier courier1) {

        Product p1 = new Product( "water", 20d, new Date(2133333423423L), courier1, false);
        Product p2 = new Product( "apple",12d, new Date(213333), courier1, false);
        Product p3 = new Product("orange", 34d, new Date(2133333423423L), courier1, false);
        Product p4 = new Product( "cookie",  54d, new Date(3333312423423L), courier1, false);
        Product p5 = new Product( "pill",  212d, new Date(2123333423423L), courier1, false);
        Product p6 = new Product( "bread",  2d, new Date(3121333333333L), courier1, false);
        Product p7 = new Product( "cola",  1111d, new Date(1133333333213L), courier1, false);
        Product p8 = new Product( "bear", 11123121d, new Date(1133333333213L), courier1, true);
        Product p9 = new Product( "vodka",  1d, new Date(3133333333213L), courier1, true);
        return Arrays.asList(p1, p2, p3, p4,p5,p6,p7,p8,p9);
    }

    private static void printProducts(List<Product> products) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n___________________________________________");
        stringBuilder.append("\nProducts: ");
        for (Product p : products) {
            stringBuilder.append("\n").append(p);
        }
        stringBuilder.append("\n___________________________________________");

        System.out.println(stringBuilder.toString());
    }
}
