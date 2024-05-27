package com.example.springdesignpattern.controller;

import com.example.springdesignpattern.factory.PaymentFactory;
import com.example.springdesignpattern.model.request.PaymentRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/payment")
public class PaymentController {
    private final PaymentFactory paymentFactory;

    public PaymentController(PaymentFactory paymentFactory) {
        this.paymentFactory = paymentFactory;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public String execute(@RequestBody PaymentRequest paymentRequest) {
        return paymentFactory.execute(paymentRequest);
    }

}

