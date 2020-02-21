package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> continentsOfWorld = new ArrayList<>();

    public boolean addContinent(Continent continent){
        return continentsOfWorld.add(continent);
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal peopleOnTheWorld = continentsOfWorld.stream()
                .flatMap(continent -> continent.getCountryOfContinents().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum,current)->sum.add(current));

        return peopleOnTheWorld;
    }
}
