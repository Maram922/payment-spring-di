package com.example.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final PaymentMethod paymentMethod;

    @Autowired
    public OrderService(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void placeOrder(String item, int amount) {
        if (item == null || item.isBlank()) {
            throw new IllegalArgumentException("Item name cannot be empty");
        }
        System.out.println("Order placed: " + item);
        paymentMethod.pay(amount);
    }
}