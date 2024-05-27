package com.example.springdesignpattern.enumfactory.payment;

public interface Payment {
    String pay(String orderId,Double amount,String paymentType);

}
