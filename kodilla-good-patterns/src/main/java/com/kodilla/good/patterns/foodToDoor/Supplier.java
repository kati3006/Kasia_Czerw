package com.kodilla.good.patterns.foodToDoor;

public interface Supplier {
    boolean process(Order order);
    String getSupplierName();
}
