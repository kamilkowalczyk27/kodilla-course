package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {

    public static void main(String[] args) {
        Flight warsawLondon = new Flight("Warsaw", "London");
        Flight romeParis = new Flight("Rome", "Paris");

        FlightLogic flightLogic = new FlightLogic();

        try{
            boolean existWarsawLondon = flightLogic.findFlight(warsawLondon);
            System.out.println("Flight Warsaw - London is good" + existWarsawLondon);
        }catch(RouteNotFoundException e){
            System.out.println("Flight Warsaw - London is not good");
        }

        try {
            boolean existRomeParis = flightLogic.findFlight(romeParis);
            System.out.println("Flight Rome - Paris is good" + existRomeParis);
        }catch(RouteNotFoundException e){
            System.out.println("Flight Rome - Paris is not good");
        }
    }
}
