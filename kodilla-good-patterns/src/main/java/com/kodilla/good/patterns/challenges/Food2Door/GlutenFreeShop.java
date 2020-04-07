package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop implements OrderSupplier {
    @Override
    public boolean process(OrderDTO orderDTO) {
        System.out.println("Gluten Free Shop confirms Your order. Please wait for our feedback.");
        return true;
    }
}
