package com.Day3Task;
class Animal {
	
 public void makeSound() {
     System.out.println("The animal makes a sound");
 }
}

class Cat extends Animal {
 public void makeSound() {
     System.out.println("The Dog barks");
 }
}

public class Task1 {
 public static void main(String[] args) {
     Animal myCat = new Cat();
     
     myCat.makeSound();
 }
}

