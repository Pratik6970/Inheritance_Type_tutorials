package com.app;

public class Car extends Vehicle {

	String carName;

	String modelName;

	Car(String carName, String modelName) {

		System.out.println("Car constructor called here Car.......");
		this.carName = carName;
		this.modelName = modelName;
	}

	public void PlayMusic() {
		System.out.println("In car Play Music here.........");
	}

	public void car_Info() {
		System.out.println("CarName = " + carName);

		System.out.println("ModelName = " + modelName);
	}

}
