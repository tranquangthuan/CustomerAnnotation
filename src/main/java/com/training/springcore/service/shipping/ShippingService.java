package com.training.springcore.service.shipping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.training.springcore.service.shipping.provider.ShippingProvider;

@Service
public class ShippingService {

	@Autowired
	@Qualifier(value = "GHN")
	private ShippingProvider shippingProvider;

	@Autowired
	public ShippingService(@Qualifier(value = "GHTK") ShippingProvider shippingProvider) {
		super();
		System.out.println("DI BY Constructor");
		this.shippingProvider = shippingProvider;
	}

	@Autowired
	public void setShippingProvider(@Qualifier(value = "SPE") ShippingProvider shippingProvider) {
		System.out.println("DI BY Setter");
		this.shippingProvider = shippingProvider;
	}

	public String getProviderName() {
		return shippingProvider.name();
	}

}
