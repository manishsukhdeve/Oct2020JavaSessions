package JavaSessions;

public class AmazonAppShoping {

	public static void main(String[] args) {

		AmazonApp shop = new AmazonApp();
		
		shop.login(999999, 990)
			.search("Apple MacBook Pro")
			.addToCart("Apple MacBook Pro")
			.payment("1212 1212 1212")
			.logout();
		
		System.out.println("----------------");
		
		shop.login("manish@gmail.com", "test")
			.addToCart("Samsung s10")
			.payment("1212 1212 1212")
			.logout();
		
		System.out.println("----------------");
		
		shop.login("manish@gmail.com", "123")
			.logout();
		
		System.out.println("----------------");
		
	}

}
