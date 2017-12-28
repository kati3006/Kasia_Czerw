package com.kodilla.good.patterns.flightService;

import java.util.ArrayList;
import java.util.List;

public class Flights {
    public static List<Flight> getFlights() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("KRK", "KTW"));
        flights.add(new Flight("WRO", "KRK"));
        return flights;
    }
}

