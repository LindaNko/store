package com.apwithlink;

import com.apwithlink.store.PaymentService;
import com.apwithlink.store.StripePaymentService;
import com.apwithlink.OrderService;
import com.apwithlink.OrderService;



public class OrderService {

    private PaymentService paymentService;

    public OrderService(PaymentService paymentService ){
        this.paymentService =paymentService;
    }

    public void placeOrder(){
     
        paymentService.processPayment(100);

    }

}
