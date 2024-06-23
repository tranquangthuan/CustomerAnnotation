package com.training.springcore.shipping.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.training.springcore.shipping.provider.ShippingProvider;

@Service
public class ShippingService {

	@Autowired
	@Qualifier(value = "GHN")
	private ShippingProvider shippingProvider;

	public ShippingService() {
		super();
		System.err.println("Constructor No Arg, shippingProvider maybe null " + shippingProvider);
	}

//	@Autowired
//	public ShippingService(@Qualifier(value = "GHTK") ShippingProvider shippingProvider) {
//		super();
//		System.out.println("DI BY Constructor");
//		this.shippingProvider = shippingProvider;
//	}

	@Autowired
	public void setShippingProvider(@Qualifier(value = "SPE") ShippingProvider shippingProvider) {
		System.out.println("DI BY Setter");
		this.shippingProvider = shippingProvider;
	}

	public String getProviderName() {
		return shippingProvider.name();
	}

	@PostConstruct
	public void postConstuct() {
		System.err.println("postConstuct, Dependecies allwasy not null " + shippingProvider);
	}

	@PreDestroy
	public void preDestroy() {
		System.err.println("preDestroy");
	}
}
