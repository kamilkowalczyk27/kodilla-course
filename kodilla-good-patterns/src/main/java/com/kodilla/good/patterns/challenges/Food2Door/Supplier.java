package com.kodilla.good.patterns.challenges.Food2Door;

public class Supplier implements Order {
    private String supplierName;
    protected String isSupplierAvailable;

    public Supplier(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "supplierName='" + supplierName + '\'' +
                '}';
    }

    @Override
    public String process() {
        if (supplierName != null) {
            isSupplierAvailable = "Thank You for making order in " + supplierName;
        } else {
            isSupplierAvailable = "We are sorry. We don't cooperate with this company.";
        }
        return isSupplierAvailable;
    }
}
