package com.training.springcore;

import java.util.List;

import com.training.springcore.model.Customer;
import com.training.springcore.service.CustomerServiceImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();
		List<Customer> customers = customerServiceImpl.findAll();
		customers.forEach(System.out::println);
	}
}
