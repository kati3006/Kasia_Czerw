package com.kodilla.good.patterns.flightService;

import java.util.List;
import java.util.stream.Collectors;

public class FlightService {
    public List<Flight> getFlightsFrom(String departure) {
        return Flights.getFlights().stream()
                .filter(f -> f.getDeparture().equals(departure))
                .collect(Collectors.toList());
    }
    public List<Flight> getFlightsTo(String arrival) {
        return Flights.getFlights().stream()
                .filter(f -> f.getArrival().equals(arrival))
                .collect(Collectors.toList());
    }
    public List<Flight> getFlightsVia(String via, String arrival) {
        List<Flight> result = Flights.getFlights().stream()
                .filter(f -> f.getArrival().equals(via))
                .collect(Collectors.toList());
        result.addAll(Flights.getFlights().stream()
                .filter(f -> f.getDeparture().equals(via))
                .filter(f -> f.getArrival().equals(arrival))
                .collect(Collectors.toList()));
        return result;
    }
}