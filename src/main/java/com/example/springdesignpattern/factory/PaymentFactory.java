package com.example.springdesignpattern.factory;

import com.example.springdesignpattern.model.request.PaymentRequest;

public interface PaymentFactory {
    String execute(PaymentRequest paymentRequest);
}
