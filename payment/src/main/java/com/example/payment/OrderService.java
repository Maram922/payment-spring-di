package com.example.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final PaymentMethod paymentMethod;
    private final PaymentSummaryService paymentSummaryService;

    @Autowired
    public OrderService(PaymentMethod paymentMethod, PaymentSummaryService paymentSummaryService) {
        this.paymentMethod = paymentMethod;
        this.paymentSummaryService = paymentSummaryService;
    }

    public void placeOrder(String item, int amount) {
        System.out.println("Order placed: " + item);
        paymentMethod.pay(amount);
        paymentSummaryService.printSummary(item, amount);
    }
}