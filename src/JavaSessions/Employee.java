package JavaSessions;

public class Employee {
	
	// class is entity, its a template to define the objects. 
	// we can create n-number of objects.
	// class is a template and using template we can create number of objects inside the heap memory. 

	// class variables :
	String name;
	int age;
	double salary;
	boolean isActive;
	
				@Override
				public void finalize() {
					System.out.println("Inside the Employee class finalize method");
				}

	public static void main(String[] args) {

		// create object of this class:
		// new keyword :
		
		Employee e1 = new Employee(); // Object is new Employee (RHS) (new Employee)
		// e1 is object reference name
		
		e1.name = "Manish";
		e1.age = 25;
		e1.salary = 99.44;
		e1.isActive = true;
		
		System.out.println(e1.name);	// Default value of String is null.
		System.out.println(e1.age);		// Default value of int is 0;
		System.out.println(e1.isActive);// Default value of boolean is false.
		
		Employee e2 = new Employee();
		
		e2.name = "Lisa";
		e2.age = 24;
		e2.salary = 34.12;
		e2.isActive = false;
		
		System.out.println(e2.name + "|" + e2.age + "|" + e2.salary + "|" + e2.isActive);
		
		new Employee(); // Object is created has no name (not a good practice)
		
		Employee e4 = new Employee();
		e4 = null; 		// no one referring this object, this object is also applicable for garbage collector.   
		//e4.name = "Testing";
		//System.out.println(e4.name); // NullPointerException
		
		//System.gc();
		
		System.out.println("-------------------");	
	}

}
