package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop implements OrderSupplier {
    @Override
    public boolean process(OrderDTO orderDTO) {
        System.out.println("Thank You for choosing Healthy Shop. You will receive an email confirming the order");
        return false;
    }
}
