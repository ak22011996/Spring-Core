package com.Interface.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements InitializingBean, DisposableBean {
	private String name;
	private String city;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}

	public Person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("init method");

	}

	public void destroy() throws Exception {
		System.out.println("destroy method");

	}

}
