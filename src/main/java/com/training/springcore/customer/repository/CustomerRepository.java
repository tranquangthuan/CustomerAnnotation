package com.training.springcore.customer.repository;

import java.util.List;

import com.training.springcore.customer.entity.CustomerEntity;
import com.training.springcore.customer.model.Customer;

public interface CustomerRepository {

	public List<Customer> findAll();

	public CustomerEntity findById(long id);
}
