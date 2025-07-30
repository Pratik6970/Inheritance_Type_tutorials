package com.app;

public class Bike extends Vehicle {

	String bikeName;

	String modelName;

	Bike(String bikeName, String modelName) {

		System.out.println("Bike ctor called here......");
		this.bikeName = bikeName;

		this.modelName = modelName;
	}

	public void KikStart_Bike() {
		System.out.println("Bike start with Kik");
	}

	public void bike_Info() {
		System.out.println("BikeName= " + bikeName);

		System.out.println("ModelName = " + modelName);
	}

	public static void main(String[] args) {

		Car cc = new Car("Toyoto", "Corollea");

		cc.PlayMusic();

		cc.car_Info();

		cc.Vehicle_Start();

		cc.Vehicle_Stop();

		System.out.println("=================================================");

		Bike bike = new Bike("Apache", "Apache-10");

		bike.KikStart_Bike();

		bike.bike_Info();

		bike.Vehicle_Start();

		bike.Vehicle_Stop();
	}
}
