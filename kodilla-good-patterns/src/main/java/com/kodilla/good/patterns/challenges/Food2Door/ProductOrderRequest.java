package com.kodilla.good.patterns.challenges.Food2Door;

public class ProductOrderRequest {
    private Supplier supplier;
    private Product product;
    private int quantity;

    public ProductOrderRequest(Supplier supplier, Product product, int quantity) {
        this.supplier = supplier;
        this.product = product;
        this.quantity = quantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }
}

