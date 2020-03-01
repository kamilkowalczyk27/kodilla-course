package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightLogic {
    private Map<String, Boolean> flightBase;

    public boolean findFlight(Flight flight) throws RouteNotFoundException {
        return findAirport(flight.getArrivalAirport()) && findAirport(flight.getDepartureAirport());
    }

    public boolean findAirport(String airportName) throws RouteNotFoundException {
        if (flightBase.containsKey(airportName)) {
            return flightBase.get(airportName);
        } else {
            throw new RouteNotFoundException();
        }
    }

    public Map<String, Boolean> flightBase() {
        Map<String, Boolean> flightBase = new HashMap<>();
        flightBase.put("Warsaw", true);
        flightBase.put("London", true);
        flightBase.put("Paris", false);
        flightBase.put("Rome", true);

        return flightBase;
    }
}

















