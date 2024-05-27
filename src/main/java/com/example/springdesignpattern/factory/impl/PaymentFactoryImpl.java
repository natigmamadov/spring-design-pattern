package com.example.springdesignpattern.factory.impl;

import com.example.springdesignpattern.factory.PaymentFactory;
import com.example.springdesignpattern.model.request.PaymentRequest;
import com.example.springdesignpattern.strategy.PaymentStrategy;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class PaymentFactoryImpl implements PaymentFactory {
    private final Map<String, PaymentStrategy> paymentStrategyMap;

    public PaymentFactoryImpl(Map<String, PaymentStrategy> paymentStrategyMap) {
        this.paymentStrategyMap = paymentStrategyMap;
    }

    public PaymentStrategy getPaymentStrategy(String paymentType) {
        PaymentStrategy paymentStrategy = paymentStrategyMap.get(paymentType);
        if (paymentStrategy == null) {
            throw new IllegalArgumentException("Invalid Payment type: " + paymentType);
        }
        return paymentStrategy;
    }

    @Override
    public String execute(PaymentRequest paymentRequest) {
        PaymentStrategy paymentStrategy = getPaymentStrategy(paymentRequest.getPaymentType());
        return paymentStrategy.pay(paymentRequest.getOrderId(),
                paymentRequest.getAmount(),
                paymentRequest.getPaymentType());

    }
}
