package com.training.springcore.customer;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.springcore.customer.model.Customer;
import com.training.springcore.customer.service.CustomerService;

public class CustomerMainContainer {

	public static void main(String[] args) {
		System.out.println("CustomerAnnotation");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context_customer.xml");
		CustomerService customerService = applicationContext.getBean("customerServiceImpl", CustomerService.class);
		List<Customer> customers = customerService.findAll();
		customers.forEach(System.out::println);

		Customer customer = customerService.findById(1);
		System.out.println(customer);
		((ClassPathXmlApplicationContext) applicationContext).close();
	}

}
