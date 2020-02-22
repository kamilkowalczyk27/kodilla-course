package com.kodilla.stream.world;
import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;


public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        BigDecimal polishPeople = new BigDecimal("1111111111");
        BigDecimal japanesePeople = new BigDecimal("2222222222222");
        BigDecimal sudanesePeople = new BigDecimal("333333333333333");

        Continent europe = new Continent("Europe");
        Continent asia = new Continent("Asia");
        Continent africa = new Continent("Africa");

        Country poland = new Country("Poland", polishPeople);
        Country japan = new Country("Japan", japanesePeople);
        Country sudan = new Country("Sudan", sudanesePeople);

        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        europe.addCountry(poland);
        asia.addCountry(japan);
        africa.addCountry(sudan);

        //When
        BigDecimal allPeople = world.getPeopleQuantity();

        //Then
        BigDecimal allPeopleExpected = new BigDecimal("335556666666666");
        Assert.assertEquals(allPeople, allPeopleExpected);
    }
}

