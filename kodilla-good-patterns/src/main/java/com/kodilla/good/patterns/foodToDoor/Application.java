package com.kodilla.good.patterns.foodToDoor;

import java.util.Random;

public class Application {
    public static void main (String[] args) {
        Order order = new Order("123", 2.0);
        Random generator = new Random();
        int supplierNumber = generator.nextInt(3);
        Supplier supplier = null;
        switch (supplierNumber) {
            case 0: supplier = new ExtraFoodShop();
                break;
            case 1: supplier = new GlutenFreeShop();
                break;
            case 2: supplier = new HealthyShop();
                break;
        }
        OrderProcessor orderProcessor = new OrderProcessor(supplier, order);
        orderProcessor.process();
    }

}
