package com.Day2Task;

class Employees{
	String Name;
	String JobTitle;
	int Salary;
	Employees(String Name, String JobTitle, int Salary){
		this.Name = Name;
		this.JobTitle = JobTitle;
		this.Salary = Salary;
	}
	void display() {
		System.out.println("Name : " + Name + "\n" + "JobTitle : " + JobTitle + "\n" + "Salary : " + Salary);
	}
	public void raisesalary(double Percentage) {
		if(Percentage > 0) {
			double Increase = Salary * (Percentage / 100);
			Salary += Increase;
			System.out.println("Salary Increased by " + Percentage + "%");
		}
		else {
			System.out.println("Salary Percentage Should be Positive");
		}
	}
}
public class Task6 {
	public static void main(String[] args) {
		Employees emp = new Employees("DK", "CyberAnalyst", 90000);
        System.out.println("Emloyee Details");
		emp.display();
		emp.raisesalary(7);
        System.out.println("Updated Emloyee Details");
        emp.display();
	}
}