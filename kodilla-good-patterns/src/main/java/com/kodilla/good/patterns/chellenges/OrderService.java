package com.kodilla.good.patterns.chellenges;

import java.time.LocalDate;
import java.util.Random;

public class OrderService {
    private InformationService informationService;
    private OrderRepository orderRepository;
    public boolean order (User user, LocalDate when, String to) {
        Random generator = new Random();
        return generator.nextBoolean();
    }

    public OrderService(final InformationService informationService,
                          final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isOrdered = order(orderRequest.getUser(), orderRequest.getWhen(),
                orderRequest.getTo());

        if(isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getWhen(), orderRequest.getTo());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
