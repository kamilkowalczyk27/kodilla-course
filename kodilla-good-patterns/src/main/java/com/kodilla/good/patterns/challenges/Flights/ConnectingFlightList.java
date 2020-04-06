package com.kodilla.good.patterns.challenges.Flights;

import java.util.ArrayList;
import java.util.List;

public class ConnectingFlightList {

    public static List<ConnectingFlight> getConnectingFlightsList() {
        List<ConnectingFlight> connectingFlights = new ArrayList<>();
        connectingFlights.add(new ConnectingFlight("Warsaw", "Rome", "Berlin"));
        connectingFlights.add(new ConnectingFlight("Berlin", "Paris", "Wroclaw"));
        connectingFlights.add(new ConnectingFlight("Moscow", "Barcelona", "Cracow"));
        connectingFlights.add(new ConnectingFlight("Tokyo", "Paris", "Warsaw"));
        connectingFlights.add(new ConnectingFlight("Wroclaw", "Gdansk", "Warsaw"));

        return connectingFlights;
    }
}
