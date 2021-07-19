package com.demo;

public class Test {

	

	private String testValue;
	
	public String getTestValue() {
		return testValue;
	}

	public void setTestValue(String testValue) {
		this.testValue = testValue;
	}

	
	public static void main(String[] args) {
		// to access object properties needs to create object
		
		Test t = new Test();
		t.setTestValue("test");
		//calling the static method
		m1(t);
		System.out.println(t.getTestValue());
	}
	
	//static method
	
	public static void m1(Test t) {
		//assigning null means unrefrencing
		
		t.setTestValue("test1");
		
	}
}
