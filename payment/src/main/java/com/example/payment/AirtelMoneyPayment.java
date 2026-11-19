package com.example.payment;

import org.springframework.stereotype.Component;

@Component
public class AirtelMoneyPayment implements PaymentMethod {
    @Override
    public void pay(int amount) {
        System.out.println("Paid UGX " + amount + " using Airtel Money");
    }
}
