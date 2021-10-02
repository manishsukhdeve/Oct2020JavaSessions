package OOP_Inheritance;

public class BMW extends Car {
	
	// Method Overriding: Poly + Morphism (Run Time / Dynamic polymorphism) 
	// When we have a parent class having the same method with the same name and same number of parameters in child class -- is called method overridding  
	
	@Override 
	public void start() {				// overriden method.
		System.out.println("BMW -> Start");
	}

	public void autoParking() {			// this is bmw method. 
		System.out.println("BMW -> Auto Parking");
	}
	
	public static void SunRoof() {		
		System.out.println("	BMW - SunRoof");
	}
		
	
		
	// Method Overloading : Poly + Morphism (Compile time polymorphism)
	// Method Overloading is always compile time polymorphism. 
	public void musicSystem() {
		System.out.println("BMW - Music System");
	}
	
	public void musicSystem(String CD) {
		System.out.println("BMW - Music System " + CD);
	}
	
	public void musicSystem(String Radio, double frequency) {
		System.out.println("BMW - Music System " + Radio + " Radio Frequency -> " + frequency);
	}

}
