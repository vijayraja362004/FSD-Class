package com.Day4Class;

class animal{
	void move() {
		System.out.println("All animal move from one place to another place");
	}
	void eat() {
		System.out.println("All animals will eat something");
	}
}
class doge extends animal{
	void move() {
		System.out.println("Dog will walk");
		
	}
	void eat() {
		System.out.println("Dog will eat chicken");
	}
}
public class Method_overriding {

	public static void main(String[] args) {
		doge Dog =new doge();
		Dog.move();
		Dog.eat();

	}

}
