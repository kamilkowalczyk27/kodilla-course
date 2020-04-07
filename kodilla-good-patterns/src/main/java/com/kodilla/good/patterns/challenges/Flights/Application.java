package com.kodilla.good.patterns.challenges.Flights;

public class Application {
    public static void main(String[] args) {
        FlightProcessor flightProcessorFromCity = new FlightProcessor();
        System.out.println(flightProcessorFromCity.flightsFromCity("London"));

        FlightProcessor flightProcessorToCity = new FlightProcessor();
        System.out.println(flightProcessorToCity.flightsToCity("Wroclaw"));

        FlightProcessor flightProcessorThroughCity = new FlightProcessor();
        System.out.println(flightProcessorThroughCity.flightsThroughCity("London", "Rome", "Warsaw"));

    }
}
