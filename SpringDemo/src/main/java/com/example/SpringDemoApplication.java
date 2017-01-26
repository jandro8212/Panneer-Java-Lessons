package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/Beans.xml");
		
		String[] beanNames = context.getBeanDefinitionNames();
		for (String beanName : beanNames) {
			System.out.println("Bean: " + beanName);
		}
		Customer c = (Customer) context.getBean("customer");
		System.out.println("Account balance: " + c.getAccount().getBalance());
		
		context.close();
	}
}