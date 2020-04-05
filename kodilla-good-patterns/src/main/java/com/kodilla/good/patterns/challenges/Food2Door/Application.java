package com.kodilla.good.patterns.challenges.Food2Door;

public class Application {

    public static void main(String[] args) {
        ProductOrderRequestRetriever productOrderRequestRetriever = new ProductOrderRequestRetriever();
        ProductOrderRequest productOrderRequest = productOrderRequestRetriever.retrieve();
    }
}
