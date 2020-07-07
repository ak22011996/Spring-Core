package com.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/stereotype/stereoconfig.xml");
		//Student student = context.getBean("student", Student.class);
		Student student = context.getBean("ob", Student.class);
		System.out.println(student);
	}

}
