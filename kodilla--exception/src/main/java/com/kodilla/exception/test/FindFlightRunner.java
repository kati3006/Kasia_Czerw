package com.kodilla.exception.test;

public class FindFlightRunner {
    public static void main(String[] args) {
        Flight flight = new Flight("KATL", "OTHR");

        FindFlights findFlights = new FindFlights();

        try {
            System.out.println(findFlights.findFlight(flight));
        } catch (RouteNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("OK");
    }
}
