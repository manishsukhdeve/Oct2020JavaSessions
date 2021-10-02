package OOP_Abstract;

public abstract class Page { 	// for making abstract class we have to mention abstract keyword before the class (abstract class)
	
	// Can not create the object of abstract class. (same as we can not create the object in interface.)
	// Page class constructor will be called when we create the object of child class
	
	// Some abstract methods and some non abstract methods: Partial abstraction
	
	// Abstract method can only be defined only in the abstract class only. 
	
	public Page() {									// Constructor 
		System.out.println("Page -- Constructor - Parent Class Constructor");
	}
	
	public abstract void title();	// Abstract Methods	// Abstract methods do not have any method body
	
	public abstract void url();		// Abstract Methods
	
	public abstract void loading();	// Abstract Methods
	
	
	public void header() {						// Non Abstract Method
		System.out.println("Page -- Header");	
	}
	
	public static final void logo() {			// Non Abstract Method
		System.out.println("Page -- Logo");
	}
	
	// final keyword means this method cannot be overridden. 
	// non static method can be override.
	// static methods can not override. 

}
