package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class World {
    private List<Continent> continents = new ArrayList<>();

    public void addContinet(Continent continent) {
        continents.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return continents.stream()
                .flatMap(c -> c.getCountries().stream())
                .map(c -> c.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, delta) -> sum.add(delta));
    }
}
