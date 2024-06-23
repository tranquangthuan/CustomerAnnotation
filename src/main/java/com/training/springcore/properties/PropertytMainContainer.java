package com.training.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.springcore.properties.config.DBPropertiesConfig;

public class PropertytMainContainer {

	public static void main(String[] args) {
		System.out.println("PropertytMainContainer");
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("context_properties.xml");
		DBPropertiesConfig dbPropertiesConfig = applicationContext.getBean(DBPropertiesConfig.class);

		System.out.println(dbPropertiesConfig.getDriverClassName());
		System.out.println(dbPropertiesConfig.getUrl());
		System.out.println(dbPropertiesConfig.getUsername());
		System.out.println(dbPropertiesConfig.getPassword());

		((ClassPathXmlApplicationContext) applicationContext).close();
	}
}
