package com.kodilla.good.patterns.challenges.Flights;

import java.util.ArrayList;
import java.util.List;

public class FlightList {

    public static List<Flight> getFlightsList(){
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("London", "Warsaw"));
        flights.add(new Flight("Rome", "Warsaw"));
        flights.add(new Flight("Paris", "Cracow"));
        flights.add(new Flight("Moscow", "Wroclaw"));
        flights.add(new Flight("Gdansk","Wroclaw"));
        flights.add(new Flight("Warsaw", "Berlin"));

        return flights;
    }
}
