package com.example.springdesignpattern.model.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PaymentRequest {

    private String orderId;
    private Double amount;
    private String paymentType;
}
