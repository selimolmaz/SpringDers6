package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class MyController {
	
	@Autowired
	private ApplicationContext applicationContext; 
	
	@GetMapping(path = "application-context")
	public int examples() {
//		String[] definationsNames =  applicationContext.getBeanDefinitionNames();
//		
//		for (String string : definationsNames) {
//			System.out.println(string);
//		}
//		return definationsNames;
		
		int count = applicationContext.getBeanDefinitionCount();
		return count;
	}
} 
