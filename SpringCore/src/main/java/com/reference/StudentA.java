package com.reference;

public class StudentA {
	private int aRoll;
	private String aName;
	private StudentB ob;

	public StudentA() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentA(int aRoll, String aName, StudentB ob) {
		super();
		this.aRoll = aRoll;
		this.aName = aName;
		this.ob = ob;
	}

	@Override
	public String toString() {
		return "StudentA [aRoll=" + aRoll + ", aName=" + aName + ", ob=" + ob + "]";
	}

	public int getaRoll() {
		return aRoll;
	}

	public void setaRoll(int aRoll) {
		this.aRoll = aRoll;
	}

	public String getaName() {
		return aName;
	}

	public void setaName(String aName) {
		this.aName = aName;
	}

	public StudentB getOb() {
		return ob;
	}

	public void setOb(StudentB ob) {
		this.ob = ob;
	}
}
