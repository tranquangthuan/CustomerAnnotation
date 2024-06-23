package com.training.springcore.customer;

import java.util.List;

import com.training.springcore.customer.model.Customer;
import com.training.springcore.customer.service.CustomerServiceImpl;

/**
 * Hello world!
 *
 */
public class CustomerMainNoDI {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		CustomerServiceImpl customerServiceImpl = new CustomerServiceImpl();
		List<Customer> customers = customerServiceImpl.findAllWithNoDI();
		customers.forEach(System.out::println);
	}
}
