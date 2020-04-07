package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderProcessor {
    public boolean processOrder(OrderDTO orderDTO) {
        OrderSupplier supplier = SupplierFactory.get(orderDTO.getSupplier());
        return supplier.process(orderDTO);
    }
}
