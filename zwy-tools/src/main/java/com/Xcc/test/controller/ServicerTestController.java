package com.Xcc.test.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.Xcc.test.bean.JavaInfo;
import com.Xcc.test.bean.Person;
import com.Xcc.test.bean.SystemInfo;
import com.Xcc.test.service.SystemService;

@Controller
@RequestMapping(value = "/serviceTest")
public class ServicerTestController {
	
	static{
		System.out.println("Controller Test");
	}
	
	@Autowired
	private SystemService systemService;
	
	@RequestMapping(value = "systemInfo",method = RequestMethod.GET)
	public @ResponseBody SystemInfo systemInfo(HttpServletResponse  response) throws IOException{
		return systemService.getSystemInfo();
	}
	
	@RequestMapping(value = "javaInfo", method = RequestMethod.GET) 
	public @ResponseBody JavaInfo javaInfo(@ModelAttribute Person person,HttpServletResponse  response) throws IOException{
		return systemService.getJavaInfo();
	}
	
}
