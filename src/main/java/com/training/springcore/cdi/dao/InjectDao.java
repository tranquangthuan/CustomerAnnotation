package com.training.springcore.cdi.dao;

import javax.inject.Named;

@Named
public class InjectDao {
	public String insert() {
		return "insert success by javax.inject";
	}
}
