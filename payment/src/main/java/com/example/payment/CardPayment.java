package com.example.payment;

import org.springframework.stereotype.Component;

@Component
public class CardPayment implements PaymentMethod {
    @Override
    public void pay(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Card payment amount must be greater than zero");
        }
        System.out.println("Paid UGX " + amount + " using Bank Card");
    }
}