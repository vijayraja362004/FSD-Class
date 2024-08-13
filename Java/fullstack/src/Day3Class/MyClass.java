package Day3Class;

class vechicle{
	void NoOfEngine() {
		System.out.println("I have one Engine ");
	}
}
class twowheeler extends vechicle{
	void noOfWheels() {
	System.out.println("I Have Two Wheelers");
}
}
class Bike extends twowheeler{
	void BrandName() {
		System.out.println("Brand Name Is PulserRS 200 ");
	}
}
class Scooty extends Bike{
	void BrandName() {
		System.out.println("Brand Name Is Yamaka Ray ZR ");
	}
}
public class MyClass {
	public static void main(String[] args) {
		
		Bike Bike=new Bike();
		Bike.NoOfEngine();
		Bike.noOfWheels();
		Bike.BrandName();
		
		Scooty Scooty = new Scooty ();
		Scooty.NoOfEngine();
		Scooty.noOfWheels();
		Scooty.BrandName();
	}
}