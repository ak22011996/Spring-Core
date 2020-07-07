package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext content = new ClassPathXmlApplicationContext(
				"com/springcore/collection/collectionconfig.xml");
		Emp emp1 = (Emp) content.getBean("emp1");
		System.out.println(emp1);

	}

}
