package com.demo;

public class EmployeeInfo {

	public int getId() {
		return id;
	}

	public String getEmpName() {
		return empName;
	}

	public String getAddress() {
		return address;
	}

	public String getGender() {
		return gender;
	}

	public int getExperience() {
		return experience;
	}

	public EmployeeInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	private int id;
	
	private String empName;
	
	private String address;
	private String gender;
	
	private int experience;
	
	public EmployeeInfo(int id, String empName, String address, String gender, int experience) {
		super();
		this.id = id;
		this.empName = empName;
		this.address = address;
		this.gender = gender;
		this.experience = experience;
	}
	
	@Override
	public String toString() {
		return "EmployeeInfo [id=" + id + ", empName=" + empName + ", address=" + address + ", gender=" + gender
				+ ", experience=" + experience + "]";
	}


}

