package com.example.payment;

import org.springframework.stereotype.Service;

@Service
public class ReceiptService {

    public void generateReceipt(String item, double amount) {
        System.out.println("Receipt Generated");
        System.out.println("Item: " + item);
        System.out.println("Amount: UGX " + amount);
    }
}