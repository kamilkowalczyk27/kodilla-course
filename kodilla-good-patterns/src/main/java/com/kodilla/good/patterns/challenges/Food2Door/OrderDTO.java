package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderDTO {
    private Supplier supplier;
    private String product;
    int quantity;


    public OrderDTO(Supplier supplier, String product, int quantity) {
        this.supplier = supplier;
        this.product = product;
        this.quantity = quantity;

    }

    public Supplier getSupplier() {
        return supplier;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}
