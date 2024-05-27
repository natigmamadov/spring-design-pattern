package com.example.springdesignpattern.strategy;

public interface PaymentStrategy {
    String pay(String orderId,Double amount,String paymentType);
}
