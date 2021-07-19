package com.demo;

public class RelationShipDemo {
	
	public static void main(String[] args) {
		
		
		
		//create object for Organization
		
		EmployeeInfo info = new ContractEmployee("ibm", "01jan2018-03jan-2021", 1, "gouse", "guntur", "male", 6);
		
		Ogranization org = new Ogranization("infosys", "pocharam,hydreabad", info);
		
		System.out.println(org);
		
		System.out.println(org.getEmployeeInfo().getEmpName());
	}

}
