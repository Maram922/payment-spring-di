package com.example.payment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MobileMoneyPayment implements PaymentMethod {
    @Override
    public void pay(int amount) {
        System.out.println("Paid UGX " + amount + " using Mobile Money");
    }
}