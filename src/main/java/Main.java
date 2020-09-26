import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entities.*;
import entities.dto.*;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
import java.util.*;


public class Main {
    private static final String URL = "http://localhost:8081";
    private static final RestTemplate restTemplate = new RestTemplate();
    private static final HttpHeaders headers = new HttpHeaders();
    private static final HttpEntity<Object> headersEntity = new HttpEntity<>(headers);

    public static void main(String[] args) {

        headers.setContentType(MediaType.APPLICATION_JSON);

        Courier courier1 = new Courier( "Petrov", "Co company");
        List<Product> deliveryProducts = createProductList(courier1);
        List<Integer> quantities = Arrays.asList(4,5,1,46,2,88,7,22,3);

        Seller seller1 = new Seller( "Kolya", "Frolov");

        //deliver products to shop
        deliverProductsToShop(courier1, deliveryProducts, quantities);

        //get products from DB
        ResponseEntity<ProductsDTO> response2 = restTemplate
                .exchange(URL + "/products/getAll", HttpMethod.GET, headersEntity, ProductsDTO.class);
        printProducts(Objects.requireNonNull(response2.getBody()).getProducts());

        //filter expired products
        System.out.println("Checking products for expiration");
        ResponseEntity<Void> response3 = restTemplate
                .exchange(URL + "/shop/filterExpiredProducts", HttpMethod.GET, headersEntity, Void.class);

        //get products from DB
        response2 = restTemplate
                .exchange(URL + "/products/getAll", HttpMethod.GET, headersEntity, ProductsDTO.class);
        List<Product> productsForSale = Objects.requireNonNull(response2.getBody()).getProducts();
        printProducts(productsForSale);

        Customer customer1 = new Customer( "Anton", "Vitas", 20);
        Customer customer2 = new Customer( "Bad", "Guy", 17);

        //creating orders
        System.out.println("Trying to create new order");
        List<Product> bucketForCustomer1 = new ArrayList<>(productsForSale.subList(0, 2));
        makeOrder(customer1, seller1, bucketForCustomer1);

        System.out.println("Trying to create new order");
        List<Product> bucketForCustomer2 = new ArrayList<>(productsForSale.subList(2, 4));
        bucketForCustomer2.add(productsForSale.get(5));
        makeOrder(customer2, seller1, bucketForCustomer2);

        //get products from DB
        response2 = restTemplate
                .exchange(URL + "/products/getAll", HttpMethod.GET, headersEntity, ProductsDTO.class);
        printProducts(Objects.requireNonNull(response2.getBody()).getProducts());

        //get customers from DB
        ResponseEntity<CustomersDTO> response4 = restTemplate
                .exchange(URL + "/customers/getAll", HttpMethod.GET, headersEntity, CustomersDTO.class);
        System.out.println("___________________________________________" + "\nCustomers: ");
        for (Customer c : Objects.requireNonNull(response4.getBody()).getCustomers()) {
            System.out.println(c);
        }
        System.out.println("\n___________________________________________");

        ResponseEntity<OrdersDTO> response5 = restTemplate
                .exchange(URL + "/orders/getAll", HttpMethod.GET, headersEntity, OrdersDTO.class);
        System.out.println("___________________________________________" + "\nOrders: ");
        for (Order o : Objects.requireNonNull(response5.getBody()).getOrders()) {
            System.out.println(o);
        }
        System.out.println("\n___________________________________________");
    }

    private static void makeOrder(Customer customer, Seller seller, List<Product> bucketForCustomer) {
        CreateOrderDTO createOrderDTO = new CreateOrderDTO();
        createOrderDTO.setCustomer(customer);
        createOrderDTO.setSeller(seller);
        createOrderDTO.setProducts(bucketForCustomer);
        HttpEntity<CreateOrderDTO> createOrder = new HttpEntity<>(createOrderDTO);
        ResponseEntity<Void> response4 = restTemplate
                .exchange(URL + "/orders/create", HttpMethod.POST,
                        createOrder, Void.class);
    }

    public static List<Product> createProductList(Courier courier1) {

        Product p1 = new Product( "water", (double) 20, new Date(2133333423423L), courier1, false);
        Product p2 = new Product( "apple", (double) 12, new Date(213333), courier1, false);
        Product p3 = new Product("orange", (double) 34, new Date(2133333423423L), courier1, false);
        Product p4 = new Product( "cookie", (double) 54, new Date(3333312423423L), courier1, false);
        Product p5 = new Product( "pill", (double) 212, new Date(2123333423423L), courier1, false);
        Product p6 = new Product( "bread", (double) 2, new Date(3121333333333L), courier1, false);
        Product p7 = new Product( "cola", (double) 1111, new Date(1133333333213L), courier1, false);
        Product p8 = new Product( "bear", (double) 11123121, new Date(1133333333213L), courier1, true);
        Product p9 = new Product( "vodka", (double) 1, new Date(3133333333213L), courier1, true);
        return Arrays.asList(p1, p2, p3, p4,p5,p6,p7,p8,p9);
    }

    private static void deliverProductsToShop(Courier courier1, List<Product> deliveryProducts, List<Integer> quantities) {
        DeliveryDTO deliveryDTO = new DeliveryDTO();
        deliveryDTO.setCourier(courier1);
        deliveryDTO.setProducts(deliveryProducts);
        deliveryDTO.setProductQuantities(quantities);
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        String deliverJsonStr = gson.toJson(deliveryDTO);

        HttpEntity<String> deliverJson = new HttpEntity<>(deliverJsonStr, headers);
        ResponseEntity<Void> response1 = restTemplate
                .exchange(URL + "/supply/deliverProducts", HttpMethod.POST, deliverJson, Void.class);

        System.out.println("Delivery by " + courier1.getSupplierCompanyName() + ": \n" + "Courier "
                + courier1.getLastName() + " has delivered " + deliveryProducts);
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
