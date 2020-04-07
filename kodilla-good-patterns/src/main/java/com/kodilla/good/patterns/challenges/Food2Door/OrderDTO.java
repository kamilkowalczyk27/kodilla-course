package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderDTO {
    private String supplier;
    private String product;
    int quantity;

    public OrderDTO(String supplier, String product, int quantity) {
        this.supplier = supplier;
        this.product = product;
        this.quantity = quantity;

    }

    public String getSupplier() {
        return supplier;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
