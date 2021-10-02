package JavaSessions;

public class AmazonApp {
	
	public AmazonApp login(String un, String pwd) {
		System.out.println("Login with : " + un + " Password : " + pwd);
		return this;
	}
	
	public AmazonApp login(long ph, int otp) {
		System.out.println("Login with : " + ph + " OTP : " + otp);
		return this;
	}
	
	public AmazonApp search(String name) {
		System.out.println("Search with Product : " + name);
		return this;
	}
	
	public AmazonApp addToCart(String name) {
		System.out.println("Adding to cart : " + name);
		return this;
	}
	
	public AmazonApp payment (String cc) {
		System.out.println("Making the payment with : " + cc);
		return this;
	}
	
	public AmazonApp logout() {
		System.out.println("Logout from the applicatoin");
		return this;
	}

}
