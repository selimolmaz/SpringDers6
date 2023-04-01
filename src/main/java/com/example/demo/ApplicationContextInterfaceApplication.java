package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApplicationContextInterfaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationContextInterfaceApplication.class, args);
	}

}

/*
 * 
 * ApplicationContext

ApplicationContext interface'i Spring IoC Container'ı temsil eder.

ApplicationContext, nesnelerin(bean) olusturulması, konfigüre edilmesi
ve noktalara bu nesneleri atamakla (Injection) sorumludur.

Yani ApplicationContext'in ana görevi nesnelerimizin (bean) yönetimini
saglamakt1c.

*/