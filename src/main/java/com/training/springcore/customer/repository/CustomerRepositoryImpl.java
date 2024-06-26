package com.training.springcore.customer.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.training.springcore.customer.entity.CustomerEntity;
import com.training.springcore.customer.model.Customer;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

	public CustomerRepositoryImpl() {
		super();
		System.out.println("CustomerRepositoryImpl constructor");
	}

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = Arrays.asList(new Customer(1, "A"), new Customer(2, "B"));
		return customers;
	}

	@Override
	public CustomerEntity findById(long id) {
		// TODO Auto-generated method stub
		CustomerEntity customerEntity = new CustomerEntity(1, "A", "password");
		return customerEntity;
	}

}
