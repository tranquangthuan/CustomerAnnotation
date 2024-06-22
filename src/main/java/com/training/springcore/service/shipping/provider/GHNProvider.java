package com.training.springcore.service.shipping.provider;

import org.springframework.stereotype.Component;

@Component(value = "GHN")
public class GHNProvider implements ShippingProvider {

	@Override
	public String name() {
		return "Giao Hàng Nhanh";
	}
}
