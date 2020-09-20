package entities;

import java.util.Date;
import java.util.List;

public class Order {


    private List<Product> orderedProduct;
    private Double price;
    private Seller seller;
    private Customer customer;
    private Date orderDate;


    public Order() {
    }


    public List<Product> getOrderedProduct() {
        return orderedProduct;
    }

    public Double getPrice() {
        return price;
    }

    public Seller getSeller() {
        return seller;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "product=" + orderedProduct +
                ", price=" + price +
                ", seller=" + seller +
                ", customer=" + customer +
                ", orderDate=" + orderDate +
                '}';
    }
}
