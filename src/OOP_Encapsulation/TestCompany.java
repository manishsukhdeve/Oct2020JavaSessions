package OOP_Encapsulation;

public class TestCompany {

	public static void main(String[] args) {
		
		// private variable and methods are not accessible from other class.
		// private int sharePrice (variable) is defined as private in the Company class hence private variable not accessible in the current class.
		// private int totalSharePrice() (method) is defined as private in the Company class hence private method not accessible in the current class.
		
		Company c1 = new Company();
		c1.name = "F1";
		c1.empCount = 5000;
		c1.getCEOName();
		
		
// ------------------------------------------------
		
		Employee e1 = new Employee();
		
		e1.setSalary(1000);
		System.out.println(e1.getSalary());
		
		e1.setSalary(5000);
		System.out.println(e1.getSalary());
		
		e1.setAddress("813, London");
		System.out.println(e1.getAddress());
		
		System.out.println("-----------");
		
	}

}
