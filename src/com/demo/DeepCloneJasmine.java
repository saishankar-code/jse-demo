package com.demo;

public class DeepCloneJasmine {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Jasmine jasmine = new Jasmine();

		jasmine.setId(1);
		
		jasmine.setName("test");
		
		jasmine.setType("black");
		
		jasmine.setDescription("flower");
		
		Jasmine jasmine1 = (Jasmine) jasmine.clone();
		
		jasmine1.setType("white");
		
		System.out.println(jasmine);
		System.out.println(jasmine1);
		
		

	}

}
