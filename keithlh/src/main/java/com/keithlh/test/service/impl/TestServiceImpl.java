package com.keithlh.test.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.keithlh.base.service.PropertiesService;
import com.keithlh.test.dao.AdminMapper;
import com.keithlh.test.domain.Admin;
import com.keithlh.test.service.TestService;
import com.keithlh.utils.Print;

@Service
public class TestServiceImpl implements TestService {
	
	Logger logger = LoggerFactory.getLogger(TestServiceImpl.class);
	
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

	@Override
	public void logTest() {
		logger.debug("This is debug log !");
		logger.info("This is info log !");
		logger.error("This is error log !");
	}

}
