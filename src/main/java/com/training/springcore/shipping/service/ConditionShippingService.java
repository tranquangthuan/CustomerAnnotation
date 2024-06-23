package com.training.springcore.shipping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springcore.shipping.factory.ShippingProviderFactory;
import com.training.springcore.shipping.provider.ShippingProvider;

@Service
public class ConditionShippingService {

	@Autowired
	private ShippingProviderFactory factory;

	public String getProviderName() {
		ShippingProvider shippingProvider = factory.getProvider("GHN");
		return shippingProvider.name();
	}

}
