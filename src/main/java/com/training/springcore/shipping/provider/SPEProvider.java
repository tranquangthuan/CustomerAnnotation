package com.training.springcore.shipping.provider;

import org.springframework.stereotype.Component;

@Component(value = "SPE")
public class SPEProvider implements ShippingProvider {

	@Override
	public String name() {
		return "SPX Express";
	}
}
