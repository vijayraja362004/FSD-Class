package com.Vijay;
import java .util.*;

   //class and object program
class employee{
	int employeeId ;
	String employeeName;
	float employeeSalary;
	
	//constructor
	
   employee ( int employeeId, String employeeName, float employeeSalary) {
		this.employeeId =employeeId;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
	}
	//method
	
	void display() {
		System.out.println("Employee Id : "+ employeeId);
		System.out.println("Employee Name : "+ employeeName);
		System.out.println("Employee Salary : "+ employeeSalary);
		}
}
public class day2 {
	
	//variables;
	public static void main(String[] args) {
       employee emp1 =new employee (101,"vijay",2000.0f);
       emp1.display();
       
       employee emp2 = new employee (102,"abishek",300.0f);
       emp2.display ();
	}
	}
	