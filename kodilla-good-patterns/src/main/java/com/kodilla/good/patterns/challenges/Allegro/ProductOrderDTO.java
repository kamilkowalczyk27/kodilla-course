package com.kodilla.good.patterns.challenges.Allegro;

public class ProductOrderDTO {
    private User user;
    private Product product;
    int quantity;
    boolean isSold;

    public ProductOrderDTO(User user, Product product, int quantity, boolean isSold) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.isSold = isSold;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isSold() {
        return isSold;
    }
}
