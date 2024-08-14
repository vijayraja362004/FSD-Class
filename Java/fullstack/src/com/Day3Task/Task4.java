package com.Day3Task;

class Employee {
  double salary;
  
 public Employee(double salary) {
     this.salary = salary;
 }

 public void work() {
     System.out.println("Employee is working");
 }

 public double getSalary() {
     return salary;
 }
}

class HRManager extends Employee {
 
 public HRManager(double salary) {
     super(salary);
 }

 // Overriding the work method
 @Override
 public void work() {
     System.out.println("HR Manager is managing HR tasks");
 }

 public void addEmployee() {
     System.out.println("HR Manager is adding a new employee");
 }
}

public class Task4 {
 public static void main(String[] args) {
     HRManager hrManager = new HRManager(75000);
     
     hrManager.work();
     
     hrManager.addEmployee();
     
     double salary = hrManager.getSalary();
     System.out.println("HR Manager's salary: " + salary);
 }
}

