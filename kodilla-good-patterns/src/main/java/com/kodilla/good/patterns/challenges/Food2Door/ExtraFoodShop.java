package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop implements OrderSupplier {
    @Override
    public boolean process(OrderDTO orderDTO) {
        System.out.println("Extra Food Shop confirms the order.");
        return true;
    }
}
