package com.Day2Task;

class Rectangle{
	double length;
	double breath;
	double Area;
	double Perimeter;
	 public Rectangle(double length, double breath){
		this.length = length;
		this.breath = breath;
	}
	
	void calculate() {
		Area = length * breath;
		Perimeter = (2 * length) + (2 * breath); 
		System.out.println("Area of Rectangle : " + Area + "\n" + "Perimeter of Rectangle : " + Perimeter + "\n");
	}
}
public class Task3 {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 20);
		//Rectangle r2 = new Rectangle(3, 7);
		r1.calculate();
		//r2.calculate();
	}
}

