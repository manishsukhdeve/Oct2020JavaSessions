package BuilderPattern;

public class EcommUser {

	public static void main(String[] args) {
		
		EcommApp shop = new EcommApp();		// Create Object and calling methods.  
		
		shop.login("manish@gmail.com", "Test123")	// method chaining 	// Login with :- manish@gmail.com / Test123
		.doSearch("MacBook", 1000)					// Search with :- MacBookPrice : 1000
		.addToCart("MacBook")						// Adding the product in the cart : MacBook
		.doPayment("ICICI Bank 121212", "Test123")	// Payment done via : ICICI Bank 121212 Password : Test123
		.getEmail()									// Email is sent successfully...
		.logout()									// Logout from Application....
		
		.login()									// Default login
		.doSearch("Nike shoes")						// Search with :- Nike shoes
		.addToCart("Nike Shoes")					// Adding the product in the cart : Nike Shoes
		.doPayment("HSBC Bank", "Test111")			// Payment done via : HSBC Bank Password : Test111
		.logout();									// Logout from Application....
		
		int orderId = shop.generateOrderID();		
		System.out.println("System generated id : " + orderId);		// System generated id : 10002
		
		shop.login().doPayment("HDFC Bank 22", "test").logout();			// Default login	// Payment done via : HDFC Bank 22 Password : test	// Logout from Application....
		
		shop.login().doSearch("iMac").doPayment("GPay", "Test456").logout();	// Default login	// Search with :- iMac // Payment done via : GPay Password : Test456 // Logout from Application....
		
		shop.login().logout();	// Default login	// Logout from Application....
		
	}
}
