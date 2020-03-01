package com.kodilla.exception.test;

import java.util.HashMap;

public class FlightLogic {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> flightBase = new HashMap<>();
        flightBase.put("Warsaw", true);
        flightBase.put("London", false);

        if (flightBase.containsKey(flight.getDepartureAirport())) {
            return flightBase.get(flight.getDepartureAirport());
        } else {
            throw new RouteNotFoundException();
        }
    }
}
