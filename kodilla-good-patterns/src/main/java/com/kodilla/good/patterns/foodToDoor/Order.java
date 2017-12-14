package com.kodilla.good.patterns.foodToDoor;

public class Order {
    String product;
    Double quantity;

    public Order(String product, Double quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public Double getQuantity() {
        return quantity;
    }
}
