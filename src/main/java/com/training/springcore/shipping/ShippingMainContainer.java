package com.training.springcore.shipping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.springcore.shipping.service.ShippingService;

public class ShippingMainContainer {

	public static void main(String[] args) {
		System.out.println("ShippingService");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context_shipping.xml");
		ShippingService shippingService = applicationContext.getBean(ShippingService.class);
		System.out.println(shippingService.getProviderName());
		((ClassPathXmlApplicationContext) applicationContext).close();
	}
}
