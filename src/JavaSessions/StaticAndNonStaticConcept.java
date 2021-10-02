package JavaSessions;

public class StaticAndNonStaticConcept {
	
	// What is static method and what is static variable ?
	
	String name;		// non static variable
	static int age; 	// static variable 
	
	
	
	public void getName() {					// Non static method
		System.out.println("Get Name : ");
	}
	
	public static void getInfo() {			// Static method
		System.out.println("Get INfo : ");
	}

	
	
	public static void main(String[] args) {

		// int i = 10;  	// local variable
		
		// how to access non static variables and methods :
		// we have to create the Object of the class so that we can access non static methods and variables. 
		
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();	// object of the class
		
		obj.name = "Tom";				// non static variable calling 
		System.out.println(obj.name);
		
		//name = "Peter";
		
		obj.getName();					// non static method calling
		
		// how to call static variables and methods:
		// 1. you can call them directly: No need to use the object.
		
		age = 25;						// static variable. can call directly or call with class name;
		System.out.println(age);
		
		getInfo();						// static method. can call directly or call with class name;
		//getName();					// non static method can not call directly, we must use object for calling non static methods. 
		
		//2. you can call them using class name:
		// static variable and method we can call directly or we can call them using class name. 
		StaticAndNonStaticConcept.age = 50;	// static variable. can call directly or call with class name;
		System.out.println(age);
		
		StaticAndNonStaticConcept.getInfo();	// static method. can call directly or call with class name;
	
		//3. Can I use Object to call static variables and methods:
		obj.age = 25;	// The static method getInfo() from the type StaticAndNonStaticConcept should be accessed in a static way
		obj.getInfo();	// The static method getInfo() from the type StaticAndNonStaticConcept should be accessed in a static way
		
		System.out.println("------------------");	
	}

}
