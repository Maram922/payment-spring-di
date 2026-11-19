package com.example.payment;

import org.springframework.stereotype.Component;

@Component
public class AirtelMoneyPayment implements PaymentMethod {
    @Override
    public void pay(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }
        System.out.println("Paid UGX " + amount + " using Airtel Money");
    }
}
