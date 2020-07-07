package com.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext content = new ClassPathXmlApplicationContext("com/constructor/constructor.xml");
		Person p1 = (Person) content.getBean("person");
		System.out.println(p1);
	}

}
