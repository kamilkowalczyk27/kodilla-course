package com.kodilla.good.patterns.challenges.Allegro;

public class ProductOrderProcessor {
    private InformationService informationService;
    private ProductOrderService productOrderService;
    private ProductOrderRepository productOrderRepository;

    public ProductOrderProcessor(InformationService informationService, ProductOrderService productOrderService, ProductOrderRepository productOrderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.productOrderRepository = productOrderRepository;
    }

    public ProductOrderDTO process(ProductOrderRequest productOrderRequest) {
        boolean isSold = productOrderService.soldProduct(productOrderRequest.getUser(), productOrderRequest.getProduct(), productOrderRequest.getQuantity());
        if(isSold){
            informationService.inform(productOrderRequest.getUser());
            productOrderRepository.createProductOrder(productOrderRequest.getUser(), productOrderRequest.getProduct(), productOrderRequest.getQuantity());
        } else {
            System.out.println("You failed to buy a product. Try again.");
        } return new ProductOrderDTO(productOrderRequest.getUser(), productOrderRequest.getProduct(), productOrderRequest.getQuantity(), isSold);
    }
}
