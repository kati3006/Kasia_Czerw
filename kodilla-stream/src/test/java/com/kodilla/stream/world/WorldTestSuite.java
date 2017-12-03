package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {

    @Test
    public void TestGetPeopleQuantity() {
        //Given
        Country poland = new Country("Poland", new BigDecimal("38000000"));
        Country germany = new Country("Germany", new BigDecimal("50000000"));
        Country france = new Country("France", new BigDecimal("60000000"));

        Continent europe = new Continent("Europe");

        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);

        Country china = new Country("China", new BigDecimal("200000000"));
        Country japan = new Country("Japan", new BigDecimal("5000000"));
        Country india = new Country("India", new BigDecimal("100000000"));

        Continent asia = new Continent("Asia");

        asia.addCountry(china);
        asia.addCountry(japan);
        asia.addCountry(india);

        World world = new World();

        world.addContinet(europe);
        world.addContinet(asia);

        //When
        BigDecimal result = world.getPeopleQuantity();

        //Than
        System.out.println(result);
        Assert.assertEquals(new BigDecimal("453000000"), result);


    }
}
