package com.kodilla.testing.collection;

import org.junit.*;
import java.util.*;

public class CollectionTestSuite {
    private  OddNumbersExterminator OddNumbersExterminator;

    @Before
    public void before(){
        System.out.println("Test case: begin");
    }

    @After
    public void after(){
        System.out.println("Test case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> result = OddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing empty list");
        //Then
        Assert.assertEquals(emptyList, result);
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(5);
        normalList.add(6);
        normalList.add(7);
        normalList.add(8);
        normalList.add(9);
        normalList.add(10);

        ArrayList<Integer> evenNumbersList = new ArrayList<>();
        evenNumbersList.add(2);
        evenNumbersList.add(4);
        evenNumbersList.add(6);
        evenNumbersList.add(8);
        evenNumbersList.add(10);

        //When
        List<Integer> result = OddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing normal list");

        //Then
        Assert.assertEquals(evenNumbersList, result );
    }
}
