package com.demo;

public class PermanentEmployee extends EmployeeInfo{
	


	@Override
	public String toString() {
		return "PermanentEmployee [iseligibelForcab=" + iseligibelForcab + ", iseligibleforfood=" + iseligibleforfood
				+ ", pfamount=" + pfamount + "]";
	}

	private boolean iseligibelForcab;
	
	private boolean iseligibleforfood;
	
	 private double pfamount;
	 
		public PermanentEmployee(boolean iseligibelForcab, boolean iseligibleforfood, double pfamount,int id, String empName, String address, String gender, int experience) {
			super(id,empName,address,gender,experience);
			this.iseligibelForcab = iseligibelForcab;
			this.iseligibleforfood = iseligibleforfood;
			this.pfamount = pfamount;
		}
}
