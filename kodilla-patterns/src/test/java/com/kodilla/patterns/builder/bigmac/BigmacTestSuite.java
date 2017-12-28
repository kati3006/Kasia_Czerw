package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBuilder() {
        //When
        Bigmac bm = new Bigmac.BigMacBuilder().roll("z sezamem")
                .burgers(2)
                .sauce("hamburgerowy")
                .ingredient("cebula")
                .ingredient("bekon")
                .ingredient("salata")
                .build();

        Assert.assertEquals("z sezamem", bm.getRoll());
        Assert.assertEquals(2, bm.getBurgers());
        Assert.assertEquals("hamburgerowy", bm.getSauce());
        Assert.assertEquals(3, bm.getIngredients().size());
    }
}
