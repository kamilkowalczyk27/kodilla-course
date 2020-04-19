package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                            .bun("normal")
                            .burgers(2)
                            .sauce("standard")
                            .ingredient("onion")
                            .ingredient("salad")
                            .ingredient("bacon")
                            .ingredient("chilli")
                            .ingredient("cheese")
                            .ingredient("mushrooms")
                            .build();
        System.out.println(bigmac);
        //When
        int howManyIngredients = bigmac.getIngredients().size();
        //Then
        Assert.assertEquals(6, howManyIngredients);
    }
}
