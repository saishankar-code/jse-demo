package com.demo;

public class SampleClient {

	public static void main(String[] args) {

		Sample s1 = new Sample();
		System.out.println(s1);
		
		Sample s2 = new Sample(1);
		System.out.println(s2);
		
		
		Sample s3 = new Sample(1,"test");
		System.out.println(s3);
		
		Sample s4 = new Sample(1,"test","Arizona");
		System.out.println(s4);
		
		Sample s5 = new Sample(1,"test","Arizona","Blood");
		System.out.println(s5);

	}

}
