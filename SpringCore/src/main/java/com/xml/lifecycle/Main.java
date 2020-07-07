package com.xml.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/xml/lifecycle/config.xml");
		Person data=(Person) context.getBean("person");
		System.out.println(data);
		context.registerShutdownHook();
	}
}
