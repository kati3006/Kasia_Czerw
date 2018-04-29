package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class Pepper extends AbstractPizzaOrderDecorator {

    public Pepper(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", pepper";
    }
}
