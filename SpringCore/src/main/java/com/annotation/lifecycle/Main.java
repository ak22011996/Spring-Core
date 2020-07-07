package com.annotation.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AbstractApplicationContext content = new ClassPathXmlApplicationContext("com/annotation/lifecycle/config.xml");
		Person data = (Person) content.getBean("person");
		content.registerShutdownHook();
		System.out.println(data);
	}
}