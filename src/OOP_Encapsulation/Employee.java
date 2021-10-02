package OOP_Encapsulation;

public class Employee {
	
	public String name;
	public int age;
	private int salary;
	private String address;
	
	// public getter & setter methods: (this method is specially designed for private variable and methods.)
	
	// short cut of getter and setter method: Right click and go to Source --> Generate Getters and Setters  --> select variable or method and click on the Generate button. 
	
	public int getSalary() {				// getter
		return salary;
	}

	public void setSalary(int salary) {		// setter
		this.salary = salary;
	}

	public String getAddress() {			// getter
		return address;
	}

	public void setAddress(String address) { // setter
		this.address = address;
	}

	
	//-------------------------------------------------------
	public static void main(String[] args) {
		System.out.println("-------");
	}

}
