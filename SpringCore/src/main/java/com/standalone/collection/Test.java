package com.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/standalone/collection/aloneconfig.xml");
		Person t1 = (Person) context.getBean("person1");
		System.out.println(t1.getFriends());
		System.out.println(t1.getFeestructure());
		System.out.println(t1.getProperty());
		System.out.println(t1.getFeestructure().getClass().getName());
	}

}
