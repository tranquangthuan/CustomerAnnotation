package com.training.springcore.shipping;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.springcore.shipping.service.ConditionShippingService;

public class ConditionShippingMainContainer {

	public static void main(String[] args) {
		System.out.println("ConditionShippingService");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context_shipping.xml");
		ConditionShippingService shippingService = applicationContext.getBean(ConditionShippingService.class);
		System.out.println(shippingService.getProviderName());
		((ClassPathXmlApplicationContext) applicationContext).close();
	}
}
