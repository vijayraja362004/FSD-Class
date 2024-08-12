package com.Vijay;

public class this_keyword {
	String name;
	this_keyword(String name){
		this(10,20);
		this.name = name;
		this.greeting();
		
	}
	
	this_keyword (int a, int b){
		System.out.println("Addition :" + (a+b));
		System.out.println("Subraction :" + (a-b));
		System.out.println("Multiple :" + (a*b));
		System.out.println("Division :" + (a%b));

		
	}
	 void greeting() {
		 System.out.println("Welcome" + name);
		 
	 }

	public static void main(String[] args) {
		this_keyword obj = new this_keyword ("vijay");
	}

}
