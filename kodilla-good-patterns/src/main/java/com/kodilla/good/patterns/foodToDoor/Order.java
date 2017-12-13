package com.kodilla.good.patterns.foodToDoor;

public class Order {
    private static Order ourInstance = new Order();

    public static Order getInstance() {
        return ourInstance;
    }

    private Order() {
    }
}
