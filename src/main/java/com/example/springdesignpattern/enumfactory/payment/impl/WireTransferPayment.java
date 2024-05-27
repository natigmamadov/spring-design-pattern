package com.example.springdesignpattern.enumfactory.payment.impl;

import com.example.springdesignpattern.enumfactory.payment.Payment;
import org.springframework.stereotype.Service;

@Service
public class WireTransferPayment implements Payment {
    @Override
    public String pay(String orderId, Double amount, String paymentType) {
        return "Payment done using Wire transfer in enum type method";
    }
}
