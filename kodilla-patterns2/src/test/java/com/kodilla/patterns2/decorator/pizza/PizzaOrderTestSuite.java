package com.kodilla.patterns2.decorator.pizza;

import org.junit.Test;
import static org.junit.Assert.*;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        System.out.println("Cost of Your pizza: " + theOrder.getCost());
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(15), calculatedCost);
    }
    @Test
    public void testBasicPizzaOrderGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Your pizza: dough, tomato sauce, cheese", description);
    }
    @Test
    public void testBasicPizzaOrderWithExtraCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        System.out.println("Cost of Your pizza: " + theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(19), theCost);
    }
    @Test
    public void testBasicPizzaOrderWithExtraCheeseGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Your pizza: dough, tomato sauce, cheese + cheese", description);
    }
    @Test
    public void testBasicPizzaOrderWithExtraHamAndExtraCheeseGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraHamDecorator(theOrder);
        theOrder = new ExtraCheeseDecorator(theOrder);
        System.out.println("Cost of Your pizza: " + theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(23), theCost);
    }
    @Test
    public void testBasicPizzaOrderWithExtraHamAndExtraCheeseGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new ExtraHamDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Your pizza: dough, tomato sauce, cheese + cheese + ham", description);
    }
    @Test
    public void testBasicPizzaOrderWithAllExtraAdditivesGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new ExtraHamDecorator(theOrder);
        theOrder = new ExtraBaconDecorator(theOrder);
        theOrder = new ExtraPineappleDecorator(theOrder);
        theOrder = new ExtraGarlicSauceDecorator(theOrder);
        System.out.println("Cost of Your pizza: " + theOrder.getCost());
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        assertEquals(new BigDecimal(35), theCost);
    }
    @Test
    public void testBasicPizzaOrderWithAllExtraAdditivesGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new ExtraHamDecorator(theOrder);
        theOrder = new ExtraBaconDecorator(theOrder);
        theOrder = new ExtraPineappleDecorator(theOrder);
        theOrder = new ExtraGarlicSauceDecorator(theOrder);
        System.out.println(theOrder.getDescription());
        //When
        String description = theOrder.getDescription();
        //Then
        assertEquals("Your pizza: dough, tomato sauce, cheese + cheese + ham + bacon + pineapple + garlic sauce", description);
    }
}
