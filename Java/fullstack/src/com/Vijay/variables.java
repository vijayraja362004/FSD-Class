package com.Vijay;

public class variables {
      int b = 20; //instance or object variables
      static int c = 30; //static or class variables
	public static void main(String[] args) {
       int a = 10;  //local variables
       System.out.println("Local variables : " + a);
       
       variables obj = new variables ();
       System.out.println(obj.b);
       
       System.out.println(variables.c);
	}

}
