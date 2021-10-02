package ConstructorConcepts;

import java.util.ArrayList;

public class CarDesign {	// this is just template of the car. no main method. 

	String name;
	String color;
	int price;
	double mileage;
	boolean isElectric;
	char isAvailable;
	ArrayList<String> featureslist;
	
	
	public CarDesign(String name, String color) {
		this.name = name;
		this.color = color;
	}

	public CarDesign(String name, String color, int price, char isAvailable) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.isAvailable = isAvailable;
	}

	public CarDesign(String name, String color, int price, double mileage, boolean isElectric, char isAvailable,
			ArrayList<String> featureslist) {
		this.name = name;
		this.color = color;
		this.price = price;
		this.mileage = mileage;
		this.isElectric = isElectric;
		this.isAvailable = isAvailable;
		this.featureslist = featureslist;
	}
	
}
