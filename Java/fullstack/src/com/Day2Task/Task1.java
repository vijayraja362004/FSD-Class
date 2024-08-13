package com.Day2Task;
import java.util.*;

class person{
	int Age ;
	String Name;
	  
	person (int age,String name){
		this.Age =age;
		this.Name=name;
	}
	void display() {
		System.out.println("Name : "+Name);
		System.out.println("Age : "+Age);
	}
}

public class Task1 {

	public static void main(String[] args) {
		//Scanner sc= new Scanner (System.in);
		
		person obj1 = new person (22,"vijay");
		person obj2 = new person (33,"ajith");

		obj1.display();
		obj2.display();
	}

}
