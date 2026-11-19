package com.example.payment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final PaymentMethod paymentMethod;
    private final ReceiptService receiptService;

    @Autowired
    public OrderService(PaymentMethod paymentMethod, ReceiptService receiptService) {
        this.paymentMethod = paymentMethod;
        this.receiptService = receiptService;
    }

    public void placeOrder(String item, int amount) {
        System.out.println("Order placed: " + item);
        paymentMethod.pay(amount);
        receiptService.generateReceipt(item, amount);
    }
}