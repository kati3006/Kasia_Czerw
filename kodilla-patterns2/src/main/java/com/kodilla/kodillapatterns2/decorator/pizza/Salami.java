package com.kodilla.kodillapatterns2.decorator.pizza;

import java.math.BigDecimal;

public class Salami extends AbstractPizzaOrderDecorator {

    public Salami(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + ", salami";
    }
}