package com.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext content = new ClassPathXmlApplicationContext("com/reference/reference.xml");
		StudentA a1 = (StudentA) content.getBean("aref");
		System.out.println(a1);
		System.out.println(a1.getOb().getbCity());
	}
}
