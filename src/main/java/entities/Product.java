package entities;


import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.Date;
import java.util.UUID;


public class Product {

    private UUID id;
    private String name;
    private Double price;
    private Date deliveryDate;
    private Date expireDate;
    private Courier deliveredBy;
    private Boolean forAdult;

    public Product() {
    }

    public Product( String name, Double price, Date expireDate, Courier deliveredBy, Boolean forAdult) {
        this.name = name;
        this.price = price;
        this.deliveryDate = new Date();
        this.expireDate = expireDate;
        this.deliveredBy = deliveredBy;
        this.forAdult = forAdult;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public Courier getDeliveredBy(){
        return deliveredBy;
    }

    public Boolean getForAdult() {
        return forAdult;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public void setDeliveredBy(Courier deliveredBy) {
        this.deliveredBy = deliveredBy;
    }

    public void setForAdult(Boolean forAdult) {
        this.forAdult = forAdult;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", deliveryDate=" + deliveryDate +
                ", expireDate=" + expireDate +
                '}';
    }

}
