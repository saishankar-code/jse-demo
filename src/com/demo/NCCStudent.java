package com.demo;

public class NCCStudent extends Student {
	
	private String physicalActivity;

	public NCCStudent(String physicalActivity, int studentId, String studentName, String studentGender) {
		super(studentId, studentName, studentGender);
		this.physicalActivity = physicalActivity;
	}

	@Override
	public String toString() {
		return "NCCStudent [physicalActivity=" + physicalActivity + "]";
	}
	

}
