package com.training.springcore.service.shipping.provider;

import org.springframework.stereotype.Component;

@Component(value = "GHTK")
public class GHTKProvider implements ShippingProvider {

	@Override
	public String name() {
		return "Giao Hàng Tiết Kiệm";
	}
}
