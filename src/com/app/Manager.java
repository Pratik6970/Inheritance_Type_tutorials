package com.app;

public class Manager extends Employee {
	
	String department;
	
	public Manager() {
		System.out.println("Manager constructor called here..........");
	}
	
	Manager(String empName, int age, double salary,String department)
	{
		super(empName,age,salary);
		
		this.department=department;
	}
	
	public void display_Info()
	{
		Employee_Info();
		
		System.out.println("Department = "+department);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("Single Inheritance Concepts Here...............");
		
		System.out.println("========================================");
		
		Manager manager = new Manager("Ram", 25, 50000.00, "Computer");
		
		manager.display_Info();
		
		System.out.println("=========================================");
		
      Manager manager1 = new Manager("Shyam", 27, 70000.00, "Mechanical");
		
		manager1.display_Info();
	}

}
