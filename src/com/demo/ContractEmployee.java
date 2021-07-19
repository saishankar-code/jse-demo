package com.demo;

public class ContractEmployee extends EmployeeInfo{
	
	@Override
	public String toString() {
		return "ContractEmployee [payrollName=" + payrollName + ", contractDuration=" + contractDuration + "]";
	}

	public ContractEmployee(String payrollName, String contractDuration,int id, String empName, String address, String gender, int experience) {
		super(id,empName,address,gender,experience);
		this.payrollName = payrollName;
		this.contractDuration = contractDuration;
	}

	private String payrollName;
	
	private String contractDuration;

}
