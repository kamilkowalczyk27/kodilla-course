package com.kodilla.stream.world;

import org.junit.Test;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){}
        //Given
    World world = new World();

    Continent europe = new Continent("Europe");
    Continent asia = new Continent("Asia");
    Continent africa = new Continent("Africa");

    Country poland = new Country("Poland", ("222222222222222222"));
    Country japan = new Country("Japan");
    Country sudan = new Country("Sudan");

    world.addContinet(europe);
    world.addContinent(asia);
    world.addContinent(africa);

    europe.addCountry(poland);
    asia.addCountry(japan);
    africa.addCountry(sudan);

}
