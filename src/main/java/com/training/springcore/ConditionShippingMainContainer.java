package com.training.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.springcore.service.shipping.ConditionShippingService;

public class ConditionShippingMainContainer {

	public static void main(String[] args) {
		System.out.println("ConditionShippingService");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
		ConditionShippingService shippingService = applicationContext.getBean(ConditionShippingService.class);
		System.out.println(shippingService.getProviderName());
		((ClassPathXmlApplicationContext) applicationContext).close();
	}
}
