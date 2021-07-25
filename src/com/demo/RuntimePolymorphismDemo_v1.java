package com.demo;

public class RuntimePolymorphismDemo_v1 {
	
	public static void main(String[] args) {
		BankFactory factory  = new BankFactory();
		
		Bank bank = factory.getBank("HDFC");
		System.out.println(bank.getRateOfInterest());
	}

}
