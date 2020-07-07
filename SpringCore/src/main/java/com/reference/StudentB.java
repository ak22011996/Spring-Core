package com.reference;

public class StudentB {

	private String bName;
	private String bCity;

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbCity() {
		return bCity;
	}

	public void setbCity(String bCity) {
		this.bCity = bCity;
	}

	public StudentB(String bName, String bCity) {
		super();
		this.bName = bName;
		this.bCity = bCity;
	}

	public StudentB() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "StudentB [bName=" + bName + ", bCity=" + bCity + "]";
	}
}
