package com.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.springcore.service.shipping.ShippingService;

public class ShippingMainContainer {

	public static void main(String[] args) {
		System.out.println("ShippingService");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
		ShippingService shippingService = applicationContext.getBean(ShippingService.class);
		System.out.println(shippingService.getProviderName());
		((ClassPathXmlApplicationContext) applicationContext).close();
	}
}
