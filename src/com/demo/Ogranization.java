package com.demo;

public class Ogranization {
	
	public String getOrganizationName() {
		return organizationName;
	}

	public String getAddress() {
		return address;
	}

	public EmployeeInfo getEmployeeInfo() {
		return employeeInfo;
	}

	@Override
	public String toString() {
		return "Ogranization [organizationName=" + organizationName + ", address=" + address + ", employeeInfo="
				+ employeeInfo + "]";
	}

	public Ogranization(String organizationName, String address, EmployeeInfo employeeInfo) {
		super();
		this.organizationName = organizationName;
		this.address = address;
		this.employeeInfo = employeeInfo;
	}

	private String organizationName;
	private String address;
	
	private EmployeeInfo employeeInfo;

}
