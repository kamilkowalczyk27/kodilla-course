package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continentName;
    private final List<Country> countryOfContinents = new ArrayList<>();

    public Continent(String continentName) {
        this.continentName = continentName;
    }

    public String getContinentName() {
        return continentName;
    }

    public List<Country> getCountryOfContinents() {
        return new ArrayList<>(countryOfContinents);
    }

    public boolean addCountry(Country country){
        return countryOfContinents.add(country);
    }
}
