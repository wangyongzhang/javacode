package com.keithlh.base.service;

import java.io.IOException;
import java.util.Properties;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.stereotype.Service;

@Service
public class PropertiesService {

	public Properties getProperties(String url){
		Resource resource = new ClassPathResource(url);
		try {
			Properties props = PropertiesLoaderUtils.loadProperties(resource);
			return props;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new Properties();
	}
	
}
