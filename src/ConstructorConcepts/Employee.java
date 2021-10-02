package ConstructorConcepts;

public class Employee {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	//}

	String name;			// class variables
	int age;				// class variables
	String dob;				// class variables
	String city;			// class variables
	boolean isPermanent;	// class variables
	
	// Constructor:	Interview Question - 1. What is constructor ? 2. difference between constructor and functions/methods ?
	// Name of the constructor will remain same as the class name:
	// Its looks like a function/method but its not a function
	// Constructor will never return a value, no return and no void keyword in constructor.
	// But a function may or may not return a value. 
	// inside constructor we don't write business logic but in function/method we write business logic. 
	
//	public Employee() {		// this is constructor. class name and constructor name should be same. this is 0 input parameter constructor. 
//		System.out.println("Default Constructor....");
//	}
//	
//	public Employee(int a) {	// constructor overloading. 
//		System.out.println("1 Parameter Constructor....." + a);
//	}
//	
//	public Employee (int a, String b) {		// constructor overloading. 
//		System.out.println("2 Parameter Constructor....." + a+b);
//	}
	
	public Employee() {		// Default constructor with 0 parameter. 
		System.out.println("Default Constructor");
	}
	
	public Employee(String name) {	// constructor with string)
		this.name = name;
	}
	
	public Employee (String name, int age) {
		this.name= name;
		this.age = age;
	}
	// shortcut for create constructor: right click --> select Source --> select "Generate constructor using Fields". (Fields means class variables) 
	// select variables from the popup --> click on Generate. Constructor got created automatically. 
	public Employee(String name, String city) {
		this.name = name;
		this.city = city;
	}
	public Employee(String name, int age, String dob, String city, boolean isPermanent) {
		this.name = name;
		this.age = age;
		this.dob = dob;
		this.city = city;
		this.isPermanent = isPermanent;
	}

	public static void main (String [] a) {			// main method
		
		// constructor will call when you create the object. 
		
//		Employee ob = new Employee();
//		ob.name = "Peter";
//		ob.age = 40;
//		ob.dob = "12/12/12";
//		ob.city = "London";
//		ob.isPermanent = true;
//		System.out.println(ob.name + " " + ob.age + " " + ob.dob + " " + ob.city + " " + ob.isPermanent);
		
		Employee e0 = new Employee();	// Default constructor calling. 
		
		Employee e1 = new Employee ("Tom");			// Object
		System.out.println(e1.name);
		
		Employee e2 = new Employee("Lisa", 25);
		System.out.println(e2.name +" " +e2.age);
		
		Employee e3 = new Employee("Manish", "Mumbai");
		System.out.println(e3.name + " " + e3.city + " " + e3.dob + " " + e3.age + " " + e3.isPermanent);
		
		Employee e4 = new Employee("Mamta", 35, "15/04/1986", "Kalyan", true);
		System.out.println(e4.name + " " + e4.age + " " + e4.dob + " " + e4.city + " " + e4.isPermanent);
		
		System.out.println("-------------------------------");
				
	}
		
}
