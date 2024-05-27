package com.example.springdesignpattern.strategy.impl;

import com.example.springdesignpattern.strategy.PaymentStrategy;
import org.springframework.stereotype.Service;

@Service("wireTransfer")
public class WireTransferPaymentStrategy implements PaymentStrategy {
    @Override
    public String pay(String orderId, Double amount, String paymentType) {
        return "Payment done with wire transfer for orderId: " + orderId +
                " amount: " + amount + " .";
    }
}