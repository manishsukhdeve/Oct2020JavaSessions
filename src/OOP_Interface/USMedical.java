package OOP_Interface;

public interface USMedical extends WHO, UN {		// USMedical is the child of WHO and UN. 
	
// 	Class to Class Extends keyword
// 	Interface to Interface Extends keyword
// 	Class to Interface implements keyword.
	
	int min_fee = 10;	// All the variables in the Interface are static and final by default.
	
// 	Interface can not have method body for non static methods. Only method prototype. Only method declaration. These kind of methods are called abstract methods. 
// 	Can not create the object of Interface
	
	
// 	Important - Below methods are Abstract Methods.
// 	Abstract methods does not have any method body. You can create abstract method in interfaces and abstract class. 
// 	100% Abstraction in Interface
	
//	public void test() {	// Method body is not allowed in the interface. 
//		
//	}
	
	
	public void orthoServices(); // Abstract keyword will be there by default in the Interface method. ex. public abstract void orthoServices(); No need to write abstract after public in the interface method.
	
	public void physioServices();
	
	public void cardioServices();
	
	public void emergencyServices();	// this is common method which is mention in UKMedical and IndianMedical. 
	
	public void totalDoctors (int count);
	
	
// 	after JDK 1.8 : 
// 	1. We can have static methods in Interface with method body:
	public static void hospitalAdmin() {
		System.out.println("US --> hospitalAdmin");
	}

// 	2. can have default method:
	public default void billing() {
		System.out.println("US --> Billing");
	}
	
}
