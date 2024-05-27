package com.example.springdesignpattern.enumfactory.payment.impl;

import com.example.springdesignpattern.enumfactory.payment.Payment;
import org.springframework.stereotype.Service;

@Service
public class CreditCardPayment implements Payment {
    @Override
    public String pay(String orderId, Double amount, String paymentType) {
        return "Payment done using Credit card in enum type method";
    }
}
