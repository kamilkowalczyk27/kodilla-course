package com.kodilla.good.patterns.challenges.Allegro;

public class ComputerOrderService implements ProductOrderService {

    @Override
    public boolean soldProduct(User user, Product product, int quantity) {
        return true;
    }
}
