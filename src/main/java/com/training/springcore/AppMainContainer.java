package com.training.springcore;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.springcore.model.Customer;
import com.training.springcore.service.CustomerService;

public class AppMainContainer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("CustomerAnnotation");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context.xml");
		CustomerService customerService = applicationContext.getBean("customerServiceImpl", CustomerService.class);
		List<Customer> customers = customerService.findAll();
		customers.forEach(System.out::println);

		Customer customer = customerService.findById(1);
		System.out.println(customer);
	}

}
