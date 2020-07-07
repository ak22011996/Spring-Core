package com.xml.lifecycle;

public class Person {
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

	// init() name can be changed,then you have to put method name in config
	public void init() {
		System.out.println("Init method called");
	}

	public void destroy() {
		System.out.println("Destroy method called");
	}

}
