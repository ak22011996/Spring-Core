package com.wiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/wiring/config.xml");
		Employee e1 = (Employee) context.getBean("employee");
		System.out.println(e1);
	}
}
