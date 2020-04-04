package com.kodilla.good.patterns.challenges.Allegro;

public interface ProductOrderRepository {
    boolean createProductOrder(User user, Product product, int quantity);
}
