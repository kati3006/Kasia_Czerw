package com.kodilla.good.paterrens.flightService;

import com.kodilla.good.patterns.flightService.Flight;
import com.kodilla.good.patterns.flightService.FlightService;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FlightServiceTestSuite {
    @Test
    public void testGetFlightsFrom() {
        //given
        FlightService fs = new FlightService();

        //when
        List<Flight> result = fs.getFlightsFrom("KTW");

        //then
        Assert.assertEquals(1, result.size());
    }
    @Test
    public void testGetFlightsTo() {
        //given
        FlightService fs = new FlightService();

        //when
        List<Flight> result = fs.getFlightsTo("KRK");

        //then
        Assert.assertEquals(1, result.size());
    }
    @Test
    public void testGetFlightsVia() {
        //given
        FlightService fs = new FlightService();

        //when
        List<Flight> result = fs.getFlightsVia("KRK", "WRO");

        //then
        Assert.assertEquals(2, result.size());
    }

}
