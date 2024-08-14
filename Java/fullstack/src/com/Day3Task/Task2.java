package com.Day3Task;

class Vehicle {
 public void drive() {
     System.out.println("The vehicle is being driven");
 }
}

class Car extends Vehicle {
 public void drive() {
     System.out.println("Repairing a car");
 }
}

public class Task2 {
 public static void main(String[] args) {
     Vehicle myCar = new Car();
     
     myCar.drive(); 
 }
}
