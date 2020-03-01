package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {

    public static void main(String[] args) {
        Flight airFlight = new Flight("Paris", "Rome");
        Flight airFlight1 = new Flight("London", "Rome");


        FlightLogic flightLogic = new FlightLogic();

        try{
            flightLogic.findFlight(airFlight);
            System.out.println(airFlight + " is good");
        }catch(RouteNotFoundException e){
            System.out.println(airFlight + " is not good");
        }

        try{
            flightLogic.findFlight(airFlight1);
            System.out.println(airFlight1 + " is good");
        }catch(RouteNotFoundException e){
            System.out.println(airFlight1 + " is not good");
        }
    }
}
