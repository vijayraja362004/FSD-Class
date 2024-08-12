package com.Vijay;

//types of methods in Java

public class myMethod {
	void myMethod1 () {
		System.out.println("Instance Method");
		
	}
      static void myMethod2() {
    	  System.out.println("Static Method");
    	  
      }
      public static void main (String args []) {
    	  myMethod obj =new  myMethod ();
    	  obj.myMethod1();
    	  
    	  myMethod.myMethod2();
    	  
      }
}
