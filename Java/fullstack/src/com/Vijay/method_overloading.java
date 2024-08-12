package com.Vijay;

//Method Overloading in java

public class method_overloading {
	void myMethod (String name)
	{
		System.out.println("Welcome " + name);
		
	}
	void myMethod (int a,int b) {
		System.out.println("sum : "+(a+b));
	}
	 void myMethod(int n) {
		 System.out.println("sum :"+(n+n));
	 }

	public static void main(String[] args) {
		method_overloading obj = new method_overloading();
		//method_overloading obj2 = new method_overloading(10,20);
		//method_overloading obj3 = new method_overloading(5);

		obj.myMethod (5);
		obj.myMethod("vijay");
		obj.myMethod(10,20);

	}

}
