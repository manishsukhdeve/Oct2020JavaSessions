package JavaSessions;

public class Persons {

	public static void main(String[] args) {
		Persons p1 = new Persons();
		p1.getName();				// static method internally calling each other. no need to create object. 
		
		System.out.println("---------------");
		
	}
	
	public void getName() {
		getFirstName();			
		getPhone();
	}
	
	public void getFirstName() {
		getCity();
		getAddress();
	}
	
	public void getCity() {
		System.out.println("Mumbai");
	}
	
	public void getAddress() {
		getCity();
		System.out.println("Mumbai 421306");
	}
	
	public void getPhone() {
		System.out.println("9881229019");
	}
}
