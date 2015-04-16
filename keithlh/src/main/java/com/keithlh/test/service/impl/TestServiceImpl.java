package com.keithlh.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keithlh.base.service.PropertiesService;
import com.keithlh.test.dao.AdminMapper;
import com.keithlh.test.domain.Admin;
import com.keithlh.test.service.TestService;
import com.keithlh.utils.Print;

@Service
public class TestServiceImpl implements TestService {
	
	private final String PROPERTIES_URL = "/test.properties";
	
	@Autowired
	private PropertiesService propertiesService;
	@Autowired
	private AdminMapper	adminMapper;
	
	@Override
	public void PropertityTest() {
		System.out.println(propertiesService.getProperties(PROPERTIES_URL));
	}

	@Override
	public void myBatisTest() {
		Admin admin = adminMapper.selectByPrimaryKey(1l);
		Print.print(admin.getName());
	}

}
