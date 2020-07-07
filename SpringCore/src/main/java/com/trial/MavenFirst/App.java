package com.trial.MavenFirst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext content = new ClassPathXmlApplicationContext("config.xml");
		Student student1 = (Student) content.getBean("student1");
		Student student2 = (Student) content.getBean("student2");
		Student student3 = (Student) content.getBean("student3");
		Student student4 = (Student) content.getBean("student4");
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
	}
}
