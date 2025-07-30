package com.app;

public class Employee {
	
	String empName;
	
	int age;
	
	double salary;
	
	public Employee() {
		System.out.println("Employee constructor called here......");
	}
	
	Employee(String empName, int age, double salary)
	{
		this.empName=empName;
		
		this.age=age;
		
		this.salary=salary;
	}
	
	public void Employee_Info()
	{
		System.out.println("EmpName = "+empName);
		
		System.out.println("Age = "+age);
		
		System.out.println("Salary = "+salary);
	}
	
	
	
	

}
