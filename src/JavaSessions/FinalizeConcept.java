package JavaSessions;

public class FinalizeConcept {		// finalize is a method.

	public static void main(String[] args) {
		
		// finalize is a method, always invoked by Garbage collector just before destroying an object to perform cleanup activities.
		
		FinalizeConcept obj = new FinalizeConcept();	// object is created
		obj = null;										// object make it as null hence FinalizeConcept is eligible for garbage collector. 
		
		Employee e1 = new Employee();
		e1 = null;
		
		System.gc();
		
		System.out.println("Bye!!!");
	}

	@Override					// Overrides: finalize() in Object
	public void finalize() {	// finalize method is coming from the object class.
		System.out.println("Inside the FinalizeConcept finalize method");
	}
	
}
