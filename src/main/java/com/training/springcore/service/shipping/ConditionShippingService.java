package com.training.springcore.service.shipping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springcore.service.shipping.factory.ShippingProviderFactory;
import com.training.springcore.service.shipping.provider.ShippingProvider;

@Service
public class ConditionShippingService {

	@Autowired
	private ShippingProviderFactory factory;

	public String getProviderName() {
		ShippingProvider shippingProvider = factory.getProvider("GHN");
		return shippingProvider.name();
	}

}
