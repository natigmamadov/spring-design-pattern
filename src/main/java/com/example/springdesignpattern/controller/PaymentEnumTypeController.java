package com.example.springdesignpattern.controller;

import com.example.springdesignpattern.enumfactory.PaymentEnumType;
import com.example.springdesignpattern.model.request.PaymentRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2/payment")
public class PaymentEnumTypeController {

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String execute(@RequestBody PaymentRequest paymentRequest) {
        return PaymentEnumType.getPaymentType(paymentRequest.getPaymentType()).getPayment().pay(
                paymentRequest.getOrderId(),
                paymentRequest.getAmount(),
                paymentRequest.getPaymentType()
        );

    }
}
