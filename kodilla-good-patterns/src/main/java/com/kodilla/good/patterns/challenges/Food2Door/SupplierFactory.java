package com.kodilla.good.patterns.challenges.Food2Door;

public class SupplierFactory {
    public static OrderSupplier get(String supplier) {
        if(supplier.equals("ExtraFoodShop"))
            return new ExtraFoodShop();
        else if(supplier.equals("GlutenFreeShop"))
            return new GlutenFreeShop();
        else if(supplier.equals("HealthyShop"))
            return new HealthyShop();
        return null;
    }
}
