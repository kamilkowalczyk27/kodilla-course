package com.kodilla.good.patterns.challenges.Allegro;

public class ProductOrderRequestRetriever {

    public ProductOrderRequest retrieve(){
        User user = new User("Kamil", "kam123");
        Product product = new Product("Computer", 1500);
        int quantity = 1;

        System.out.println("User: " + user.getName() + "\n" + "Product: " + product.getProductName() + "\n" + "quantity = " + quantity);
        return new ProductOrderRequest(user,product,quantity);
    }
}
