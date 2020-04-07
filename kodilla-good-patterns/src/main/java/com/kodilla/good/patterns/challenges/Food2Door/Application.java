package com.kodilla.good.patterns.challenges.Food2Door;

public class Application {
    public static void main(String[] args) {
        OrderDTO orderDTO = new OrderDTO("ExtraFoodShop", "Salad", 2);
        OrderDTO orderDTO2 = new OrderDTO("GlutenFreeShop", "Avocado", 6);
        OrderProcessor orderProcessor = new OrderProcessor();
        boolean result = orderProcessor.processOrder(orderDTO);
        System.out.println(result);
        result = orderProcessor.processOrder(orderDTO2);
        System.out.println(result);
    }
}
