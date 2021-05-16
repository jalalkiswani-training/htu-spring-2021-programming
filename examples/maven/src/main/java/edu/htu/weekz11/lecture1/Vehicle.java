package edu.htu.weekz11.lecture1;

//Vehicle: parent - super class
public class Vehicle {
	String model;
	int year;
	String vin;

	public void showInfo() {
		System.out.println("Model : " + model + " , Year : " + year + ", VIN: " + vin);
	}

	public void start() {
		System.out.println("Starting...");
	}

	public void stop() {
		System.out.println("Stopping the vehcile...");
	}

}
