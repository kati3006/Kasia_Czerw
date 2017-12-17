package com.kodilla.good.patterns.flightService;

public class Flight {
    private String arrival;
    private String departure;

    public Flight(String arrival, String departure) {
        this.arrival = arrival;
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String getDeparture() {
        return departure;
    }
}

