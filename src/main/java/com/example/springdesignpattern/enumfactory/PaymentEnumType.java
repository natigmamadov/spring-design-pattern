package com.example.springdesignpattern.enumfactory;

import com.example.springdesignpattern.enumfactory.payment.Payment;
import com.example.springdesignpattern.enumfactory.payment.impl.CreditCardPayment;
import com.example.springdesignpattern.enumfactory.payment.impl.WireTransferPayment;

public enum PaymentEnumType {
    CREDIT_CARD("creditCard", new CreditCardPayment()),
    WIRE_TRANSFER("wireTransfer", new WireTransferPayment());

    private final String value;
    private final Payment payment;

    PaymentEnumType(String value, Payment payment) {
        this.value = value;
        this.payment = payment;
    }

    public String getValue() {
        return value;
    }

    public Payment getPayment() {
        return payment;
    }

    public static PaymentEnumType getPaymentType(String paymentType) {
        for (PaymentEnumType paymentEnumType : PaymentEnumType.values()) {
            if (paymentEnumType.getValue().equals(paymentType)) {
                return paymentEnumType;
            }
        }
        throw new IllegalArgumentException("invalid payment type: " + paymentType);
    }
}
