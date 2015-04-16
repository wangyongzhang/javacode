package com.keithlh.test.service.impl;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.stereotype.Service;

import com.keithlh.test.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	public TestServiceImpl(){
		System.out.println("loaded service!");
	}
	
	@Override
	public void PropertityTest() {
		Resource resource = new ClassPathResource("/test.properties");
		try {
			Properties props = PropertiesLoaderUtils.loadProperties(resource);
			System.out.println(props);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
