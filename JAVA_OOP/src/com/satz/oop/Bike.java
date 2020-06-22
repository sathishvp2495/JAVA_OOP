package com.satz.oop;

public class Bike extends Vehicle{
	
	private boolean fourStroke = false;

	public Bike(String name, String color, String model, String company,boolean fourStroke) {
		super(name, color, model, company); // super is used to call the parent constructor (or) method
		this.fourStroke = fourStroke;	
		}
	
	public void setFourStroke(boolean fourStroke) {
		this.fourStroke = fourStroke;
	}
	
	public boolean getFourStroke() {
		return this.fourStroke;
	}

	public String getInfo() {
		return "This is bike info";
	}
	
}
