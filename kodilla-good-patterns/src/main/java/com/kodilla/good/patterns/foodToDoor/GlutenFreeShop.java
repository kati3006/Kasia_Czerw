package com.kodilla.good.patterns.foodToDoor;

import java.util.Random;

public class GlutenFreeShop implements Supplier{
    @Override
    public boolean process(Order order) {
        Random generator = new Random();
        return generator.nextBoolean();
    }

    @Override
    public String getSupplierName() {
        return "GlutenFreeShop";
    }
}
