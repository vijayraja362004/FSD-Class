package com.Day2Task;
 
class Dog {
	  String Name;
	  String Breed;
	  
	 public Dog(String Name, String Breed){
		  this.Name = Name;
		  this.Breed = Breed;
	  }
	  
	    public String getName(){
		  return Name; 
	  }
	   void setName(String Name) {
		   this.Name = Name;
	   }
	    public String getBreed() {
		   return Breed;
	   }
	   void setBreed(String Breed) {
		   this.Breed = Breed;
	   }
}
public class Task2 {

	public static void main(String[] args) {
		Dog Dog1 = new Dog ("Billa","German Shepherd");
		Dog Dog2 =  new Dog ("Jocky","Golden Retriver");
		
		System.out.println("Dog 1 Name : "+Dog1.getName());
		System.out.println("Dog 1 Breed :"+Dog1.getBreed());
		System.out.println("Dog 2 Name : "+Dog2.getName());
		System.out.println("Dog 2 Breed :"+Dog2.getBreed());
		
		Dog1.setName("Loki");
		Dog1.setBreed("Labrador");
		Dog2.setName("Blacky");
		Dog2.setBreed("Beagle");
		
		System.out.println("Updated Dog 1 Name = "+Dog1.getName());
		System.out.println("updated Dog 1 Breed = "+Dog1.getBreed());
		System.out.println("Updated Dog 2 Name = "+Dog2.getName());
		System.out.println("updated Dog 2 Breed = "+Dog2.getBreed());
	}
}

		
