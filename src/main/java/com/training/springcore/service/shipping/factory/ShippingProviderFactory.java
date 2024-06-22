package com.training.springcore.service.shipping.factory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;

import com.training.springcore.service.shipping.provider.ShippingProvider;

@Configuration
public class ShippingProviderFactory {
	@Autowired
	@Qualifier(value = "GHN")
	private ShippingProvider GHNProvider;

	@Autowired
	@Qualifier(value = "GHTK")
	private ShippingProvider GHTKProvider;

	@Autowired
	@Qualifier(value = "SPE")
	private ShippingProvider SPEProvider;

	public ShippingProvider getProvider(String name) {
		if ("GHN" == name) {
			return GHNProvider;
		} else if ("GHTK" == name) {
			return GHTKProvider;
		} else {
			return SPEProvider;
		}
	}
}
