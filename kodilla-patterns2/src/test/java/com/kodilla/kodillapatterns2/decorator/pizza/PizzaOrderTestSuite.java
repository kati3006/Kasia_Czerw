package com.kodilla.kodillapatterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void BasicPizzaGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        System.out.println(theOrder.getCost());

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        Assert.assertEquals(new BigDecimal(15), theCost);
    }

    @Test
    public void BasicPizzaGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        System.out.println(theOrder.getIngredients());

        //When
        String ingredients = theOrder.getIngredients();

        //Then
        Assert.assertEquals("Your pizza: mozarella, tomato sauce", ingredients);
    }

    @Test
    public void PizzaWithPepperSalamiGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new Pepper(theOrder);
        theOrder = new Salami(theOrder);
        System.out.println(theOrder.getCost());

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        Assert.assertEquals(new BigDecimal(23), theCost);
    }

    @Test
    public void PizzaWithPepperSalamiGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new Pepper(theOrder);
        theOrder = new Salami(theOrder);
        System.out.println(theOrder.getIngredients());

        //When
        String ingredients = theOrder.getIngredients();

        //Then
        Assert.assertEquals("Your pizza: mozarella, tomato sauce, pepper, salami", ingredients);
    }
}
