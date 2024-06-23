package com.training.springcore.cdi.service;

import javax.inject.Inject;
import javax.inject.Named;

import com.training.springcore.cdi.dao.InjectDao;

@Named

public class InjectService {
	@Inject
	private InjectDao injectDao;

	public String insert() {
		return injectDao.insert();
	}

	public InjectDao getInjectDao() {
		return injectDao;
	}

}
