package com.kodilla.good.patterns.challenges.Flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightProcessor {
    public List<Flight> flightsFromCity(String departure) {
        return FlightList.getFlightsList().stream()
                .filter(flight -> flight.getDeparture().equals(departure))
                .collect(Collectors.toList());
    }

    public List<Flight> flightsToCity(String arrival) {
        return FlightList.getFlightsList().stream()
                .filter(flight -> flight.getArrival().equals(arrival))
                .collect(Collectors.toList());
    }

    public List<ConnectingFlight> flightsThroughCity(String through) {
        return ConnectingFlightList.getConnectingFlightsList().stream()
                .filter(flightThrough ->flightThrough.getThrough().equals(through))
                .collect(Collectors.toList());
    }
}
