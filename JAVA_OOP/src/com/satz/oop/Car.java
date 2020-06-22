package com.satz.oop;

public class Car extends Vehicle{
	private boolean powerStearing = false;
	private boolean ledScreen = true;

	public Car(String name, String color, String model, String company,boolean powerStearing,boolean ledScreen) {
		super(name, color, model, company); // super is used to call the parent constructor (or) method
		this.powerStearing = powerStearing;
		this.ledScreen = ledScreen;
	}
	
	public void setPowerStearing(boolean powerStearing) {
		this.powerStearing = powerStearing;
	}
	
	public boolean getPowerStearing() {
		return this.powerStearing;
	}

	public void setledScreen(boolean ledScreen) {
		this.ledScreen = ledScreen;
	}
	
	public boolean getLedScreen() {
		return this.ledScreen;
	}
	
	public String getInfo() {
		return "This is car info";
	}

	
	
}
