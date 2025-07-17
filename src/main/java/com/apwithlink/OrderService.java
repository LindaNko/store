package com.apwithlink;

import com.apwithlink.store.PaymentService;
import com.apwithlink.store.StripePaymentService;

public class OrderService {
    public void placeOrder(){
        PaymentService paymentService = new StripePaymentService();
        paymentService.processPayment(100);

    }

}
