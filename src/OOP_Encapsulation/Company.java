package OOP_Encapsulation;

public class Company {
	
	public String name;			// public variable or public attribute. 
	public int empCount;
	private int sharePrice;		// within the same class private variable can be accessible. 
								// private variable is not accessible to the other class. 
	
	public String getCEOName() {
		return "Tom";
	}
	
	private int totalSharePrice() {		// within the class private method can be accessible. 
		return 1000;					// outside of the class this method is not accessible. 
	}

	public static void main(String[] args) {
		Company obj = new Company();	// Object.
		
		obj.name = "IBM";
		obj.empCount = 500;
		obj.sharePrice = 400;	// we can access private variable in the same class without any problem. 
		
				System.out.println(obj.name + " " + obj.empCount + " " + obj.sharePrice); // IBM 500 400
		
		obj.getCEOName();
		obj.totalSharePrice();	// we can access private method in the same class.
		
				System.out.println(obj.getCEOName()); // Tom
				System.out.println(obj.totalSharePrice()); // 1000
		
		System.out.println("-----------");

	}

}
