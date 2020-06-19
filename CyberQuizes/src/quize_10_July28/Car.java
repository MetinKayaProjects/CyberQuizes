package quize_10_July28;

public class Car {
	
	String make;
	String model;
	int numberOfDoors;
	int topSpeed;
	double price;
	
	
	//* The main constructor
	public void Car() {
		
	}
	//* A secondary constructor that does not include numberOfDoors, which should default to 4
	public void Car(String make, String model, int topSpeed, double price) {
		this.make = make;
		this.model = model;
		this.topSpeed = topSpeed;
		this.price = price;	
		numberOfDoors = 4;
	}
	
	//* A secondary constructor that does not include make and model; both default to "unknown"
	public void Car(int numberOfDoors, int topSpeed, double price ) {
		make = "unknown";
		model = "unknown";
		this.numberOfDoors = numberOfDoors;
		this.topSpeed = topSpeed;
		this.price = price;
		
	}
	
		
	//* A secondary constructor that does not include topSpeed or price; default to 90 and 0 respectively.
	public void Car(String make, String model, int numberOfDoors) {
		this.make = make;
		this.model = model;
		this.numberOfDoors = numberOfDoors;		
		topSpeed =90;
		price = 0;
		
	}
	
	
	

}
