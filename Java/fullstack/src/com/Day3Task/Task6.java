package com.Day3Task;

class Animal2 {
 public void move() {
     System.out.println("The animal moves");
 }
}

class Cheetah extends Animal2 {

 public void move() {
     System.out.println("The cheetah runs swiftly");
 }
}

public class Task6 {
 public static void main(String[] args) {
     Animal2 genericAnimal = new Animal2();

     Cheetah cheetah = new Cheetah();
     
    genericAnimal.move(); 
     
     cheetah.move();
 }
}
