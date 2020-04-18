package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuit {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User kamil = new Millenials("Kamil");
        User magda = new YGeneration("Magda");
        User wojtek = new ZGeneration("Wojtek");
        //When
        String kamilUses = kamil.sharePost();
        System.out.println("Kamil uses: " + kamilUses);
        String magdaUses = magda.sharePost();
        System.out.println("Magda uses: " + magdaUses);
        String wojtekUses = wojtek.sharePost();
        System.out.println("Wojtek uses: " + wojtekUses);
        //Then
        Assert.assertEquals("the Facebook", kamilUses);
        Assert.assertEquals("the Twitter", magdaUses);
        Assert.assertEquals("the Snapchat",wojtekUses);
    }
    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User kamil = new Millenials("Kamil");
        //When
        String kamilUses = kamil.sharePost();
        System.out.println("Kamil uses: " + kamilUses);
        kamil.setSocialPublisher(new TwitterPublisher());
        kamilUses = kamil.sharePost();
        System.out.println("Kamil uses: " + kamilUses);
        //Then
        Assert.assertEquals("the Twitter", kamilUses);
    }
}
