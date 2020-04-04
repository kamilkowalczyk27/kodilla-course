package com.kodilla.good.patterns.challenges.Allegro;

public class Application {

    public static void main(String[] args) {
        ProductOrderRequestRetriever productOrderRequestRetriever = new ProductOrderRequestRetriever();
        ProductOrderRequest productOrderRequest = productOrderRequestRetriever.retrieve();

        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new MailService(), new ComputerOrderService(), new ComputerOrderRepository());
        productOrderProcessor.process(productOrderRequest);
    }
}
