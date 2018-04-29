package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class Chicken extends AbstractPizzaOrderDecorator {

    public Chicken(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", chicken";
    }
}
