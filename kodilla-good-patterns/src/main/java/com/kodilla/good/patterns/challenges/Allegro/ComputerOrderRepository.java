package com.kodilla.good.patterns.challenges.Allegro;

public class ComputerOrderRepository implements ProductOrderRepository {
    @Override
    public boolean createProductOrder(User user, Product product, int quantity) {
        return true;
    }
}
