package com.kodilla.good.patterns.challenges.Flights;

import java.util.ArrayList;
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

    public List <Flight> flightsThroughCity(String departure, String through, String arrival) {
        List<Flight> firstPart = FlightList.getFlightsList().stream()
                .filter(flight -> flight.getDeparture().equals(departure))
                .filter(flight -> flight.getArrival().equals(through))
                .collect(Collectors.toList());

        List<Flight> secondPart = FlightList.getFlightsList().stream()
                .filter(flight -> flight.getDeparture().equals(through))
                .filter(flight -> flight.getArrival().equals(arrival))
                .collect(Collectors.toList());

        List connectingLists = new ArrayList();
        connectingLists.addAll(firstPart);
        connectingLists.addAll(secondPart);

        return connectingLists;
    }
}
