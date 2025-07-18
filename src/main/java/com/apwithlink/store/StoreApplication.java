package com.apwithlink.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.apwithlink.OrderService;


@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		///SpringApplication.run(StoreApplication.class, args);

		var OrderService = new OrderService(new StripePaymentService());
		OrderService.placeOrder();
	}

}
