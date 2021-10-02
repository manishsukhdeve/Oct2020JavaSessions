package BuilderPattern;		// builder pattern means method chaining 

public class EcommApp {
	
	
//			public void login() {			// instead of void we have to mention classname EcommApp (Current class object)
			public EcommApp login() {		// method / function	// Method Overloading	
				System.out.println("Default login");
				return this;				// this - means method returns object of the same class. 
			}
			
			public EcommApp login(String un, String pwd) {			// Method Overloading	
				System.out.println("Login with :- " + un + " / " + pwd);
				return this;
			}
			
			public EcommApp doSearch(String productName) {
				System.out.println("Search with :- " + productName);
				return this;
			}
			
			public EcommApp doSearch(String productName, int price) {
				System.out.println("Search with :- " + productName + " Price : " + price);
				return this;
			}
			
			public EcommApp selectProduct(String productName) {
				System.out.println("Select the Product : " + productName);
				return this;
			}
			
			public EcommApp addToCart(String productName) {
				System.out.println("Adding the product in the cart : " + productName);
				return this;
			}
		
			public EcommApp doPayment(String accountName, String pwd) {
				System.out.println("Payment done via : " + accountName + " Password : " + pwd);
				return this;
			}
			
			public int generateOrderID() {
				return 10002;
			}
			
			public EcommApp getEmail() {
				System.out.println("Email is sent successfully...");
				return this;
			}
			
			public EcommApp logout() {
				System.out.println("Logout from Application....");
				return this;
			}		
			
			
}
