package com.example.payment;

import org.springframework.stereotype.Service;

@Service
public class PaymentSummaryService {

    public void printSummary(String item, double amount) {
        System.out.println("\n Payment Summary");
        System.out.println("Item: " + item);
        System.out.println("Amount: UGX " + amount);
    }
}