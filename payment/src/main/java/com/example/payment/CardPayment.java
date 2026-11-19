package com.example.payment;

import org.springframework.stereotype.Component;

@Component
public class CardPayment implements PaymentMethod {
    @Override
    public void pay(int amount) {
        System.out.println("Paid UGX " + amount + " using Bank Card");
    }
}