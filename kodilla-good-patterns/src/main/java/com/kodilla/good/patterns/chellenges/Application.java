package com.kodilla.good.patterns.chellenges;

public class Application {
    public static void  main(String[] args) {
        OrderRequestRetriever orderRequestRetriver = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriver.retrieve();

        OrderService orderProcessor = new OrderService(new InformationService(), new OrderRepository());
        orderProcessor.process(orderRequest);
    }
}
