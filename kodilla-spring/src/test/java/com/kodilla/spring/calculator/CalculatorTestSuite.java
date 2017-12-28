package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CalculatorTestSuite {
    @Autowired
    private Calculator calculator;
    @Test
    public void testCalculations(){
        double add = calculator.add(4,6);
        double sub = calculator.sub(3,9);
        double div = calculator.div(5,1);
        double mul = calculator.mul(4,6);

        Assert.assertEquals(10, add, 0);
        Assert.assertEquals(-6, sub, 0);
        Assert.assertEquals(5, div, 0);
        Assert.assertEquals(24, mul, 0);
    }
}

