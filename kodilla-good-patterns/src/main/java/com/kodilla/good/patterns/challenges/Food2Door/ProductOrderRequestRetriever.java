package com.kodilla.good.patterns.challenges.Food2Door;

public class ProductOrderRequestRetriever {
    private static final String GLUTEN_FREE_SHOP = "Gluten Free Shop";
    private static final String SALAD = "salad";

    public ProductOrderRequest retrieve(){
        Supplier supplier = new Supplier(GLUTEN_FREE_SHOP);
        Product product = new Product(SALAD);
        int quantity = 2;
        supplier.process();

        System.out.println("Supplier: " + supplier.getSupplierName() + "\n" + "Product: " + product.getProductName() + "\n" + "quantity = " + quantity);
        return new ProductOrderRequest(supplier,product,quantity);
    }
}
