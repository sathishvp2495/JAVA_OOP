package com.satz.oop;

public class Main {

	public static void main(String[] args) {
		
		Vehicle vehicle1 = new Vehicle("creta", "white", "cretaV2019", "hyundai");		//created a object reference for Vehicle Class 
		
		System.out.println("------------------------------ENCAPSULATION----------------------------");
		/* ENCAPSULATION 
		 * 
		 * We can't access the variable of Vehicle class
		 * To access a variable by using getter , setter methods
		 * 
		 * */
		
		System.out.println(vehicle1.getColor());		//print white
		vehicle1.setColor("blue");
		System.out.println(vehicle1.getColor());		//print blue
		System.out.println("------------------------------INHERITANCE----------------------------");
		
		/* INHERITANCE 
		 * 
		 * We can access the parent class variables in child class
		 * 
		 * */
		
		Car vehicle2 = new Car("i20", "red", "i2019", "hyundai",false,true); 		//created a object reference for Car Class 
		System.out.println(vehicle2.getCompany());		//print hyundai (parent class method)
		System.out.println(vehicle2.getLedScreen());	//print true (child class method)
		
		System.out.println("------------------------------POLYMORPHISM----------------------------");
		/* POLYMORPHISM - many formation
		 * 
		 * same method written in both parent and child classes
		 * we can access the method depending upon the variables
		 * 
		 * */
		
		
		Vehicle vehicle3 = new Vehicle("i20", "red", "i2019", "hyundai"); 			//created a object reference for Vehicle Class
		System.out.println(vehicle3.getInfo());			//print - this is vehicle info
		
		Vehicle vehicle4 = new Car("i20", "red", "i2019", "hyundai",false,true); 	//created a object reference for Car Class
		System.out.println(vehicle4.getInfo());			//print - this is car info
		
		Vehicle vehicle5 = new Bike("i20", "red", "i2019", "hyundai",false); 	//created a object reference for Bike Class
		System.out.println(vehicle5.getInfo());			//print - this is bike info
		
		System.out.println("------------------------------ABSTRACTION----------------------------");
		/* ABSTRACTION 
		 * 
		 * we can declare a abstract methods in abstract class
		 * we cam't define a abstract methods
		 * 
		 * if we extends a abstract class, we must implement the abstract methods declared in parent class
		 * 
		 * */
		
		
		Shape shape1 = new Rectangle();
		shape1.draw();			//print Rectangle Drawn
		
		
		System.out.println("------------------------------INTERFACE----------------------------");
		/* INTERFACE 
		 * 
		 * we can define and declare a methods in interface
		 * 
		 * if we declare a method in interface we must use in child class
		 * 
		 * we can't extend a interface
		 * only we can implement a interface
		 * 
		 * */
		
		Drawing tr = new Circle();
		tr.drawingNote();		//method declare in interface
		tr.pencil(); 			//method define in interface
		
		
		
	}

}
