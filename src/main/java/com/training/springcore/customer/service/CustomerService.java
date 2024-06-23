package com.training.springcore.customer.service;

import java.util.List;

import com.training.springcore.customer.model.Customer;

public interface CustomerService {
	public List<Customer> findAll();
	
	
	public Customer findById(long id);
}
