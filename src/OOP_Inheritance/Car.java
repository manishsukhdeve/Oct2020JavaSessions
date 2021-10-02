package OOP_Inheritance;

public class Car extends Vehicle {
	
	int engine = 10;	// variable can be inherited. 
										// final keyword is used for to prevent inheritance and method overriding. if class id declared with final it cannot be inherited. It cannot become a parent.  
//	public final void start() {			// final method is used to prevent method overriding. 
//		System.out.println("Car -- Start");
//	}
	
	public void start() { 				
		System.out.println("Car -> Start");
	}
	
	public void stop() {
		System.out.println("Car -> Stop");
	}
	
	public void reful() {
		System.out.println("Car -> Reful");
	}
	
	
	
	public static void sunRoof() {		// Static method cannot be overridden in java and non static method can be override. Static method is never part of the object and static method is the part of common memory allocation.
		System.out.println("	Car - SunRoof");
	}

}
