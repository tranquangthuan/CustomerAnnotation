package com.training.springcore.cdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.springcore.cdi.service.InjectService;

public class InjectMainContainer {

	public static void main(String[] args) {
		System.out.println("InjectService");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context_cdi.xml");
		InjectService injectService = applicationContext.getBean(InjectService.class, "injectService");
		System.out.println(injectService.insert());
		System.out.println(injectService.getInjectDao());
		((ClassPathXmlApplicationContext) applicationContext).close();
	}
}
