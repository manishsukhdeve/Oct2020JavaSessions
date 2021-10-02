package JavaSessions;

public class LoginPage { 					

	public static void main(String[] args) {
		
		LoginPage LP = new LoginPage();
		
		LP.login();
		LP.login(10);
		LP.login(10, 20);
		LP.login(10, "String");
		LP.login("String", 10);
		LP.login("admin", "admin123");
		LP.search("iPhone", 80000);
		LP.dopayment(12121212, 456);
		
		System.out.println("-------------------------------------------------");

	}
	
	// Method overloading concept : (Compile time) OOP - Poly + Morphism (Poly means many and Morphism means different forms)
	// within the same class, when we have different method with the same name and different input parameters sequence of the parameters is also different. 
	
	public void login() {  		// 0 Parameters
		System.out.println("Login to the applicaton");
	}
	
	public void login(int a) {	// 1 Parameters
		System.out.println("Login with int a : " + a);
	}
	
	public void login (int a, int b) {	// 2 parameter
		System.out.println("Login with int a and int b : " + a + " and " + b);
	}

	public void login (int a, String b) {	// 2 parameters
		System.out.println("Login with int a and String b");
	}
	
	public void login (String a, int b) {	// 2 parameters
		System.out.println("Login with String a and int b");
	}
	
	//------------------------------------------------------------------------------
	
	public void login (String username, String password) {
		System.out.println("Login with : " + username + " and " + password);
	}
	
	public void login (String username, String password, int otp) {
		
	}
	
	public void login (String username, String password, int otp, String role) {
		
	}
	
	public void login (String username, String password, long phone) {
		
	}
	
	//------------------------------------------------------------------------------
	
	// Amazon search (practical example)
	public void search () {
		
	}
	
	public void search (String name) {
		
	}
	
	public void search (String name, int price) {
		System.out.println("Product Name: " + name);
		System.out.println("Price is :" + price);
	}
	
	public void search (String name, int price, String color) {
		
	}
	
	public void search (String sellerName, int price, boolean availibility) {
		
	}
	
	//------------------------------------------------------------------------------
	
	// E-Commerce (practical example)
	public void dopayment (String UPI) {
		
	}
	
	public void dopayment (String UPI, long phone) {
		
	}
	
	public void dopayment (long CC, int cvv) {
		System.out.println("Make the payment with : " + CC +" and CVV is : " + cvv);
	}
	
	public void dopayment (long phone, String password) {
		
	}
}
