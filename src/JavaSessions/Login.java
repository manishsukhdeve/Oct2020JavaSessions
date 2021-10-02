package JavaSessions;

public class Login {
	
	// two important variable for login class
	String username;
	String password;
	String title;
	String url;

	public static void main(String[] args) {

		Login googlelogin = new Login();
		googlelogin.username = "admin";
		googlelogin.password = "admin1234";
		googlelogin.title = "Login";
		googlelogin.url = "https://www.google.com";
		
		System.out.println(googlelogin.username);
		System.out.println(googlelogin.password);
		
		
		Login amazonlogin = new Login();
		amazonlogin.username = "manish";
		amazonlogin.password = "manish123";
		amazonlogin.url = "https://www.amazon.com";
		
		System.out.println(amazonlogin.username);
		System.out.println(amazonlogin.password);
		System.out.println(amazonlogin.url);
		System.out.println(amazonlogin.title);
		
		System.out.println("------------------------------");
		
		
		Login mylogin = new Login();
		mylogin.url = "https://myapp.com";
		
		System.out.println(mylogin.username);
		System.out.println(mylogin.password);
		System.out.println(mylogin.url);
		System.out.println(mylogin.title);
		
		//new Login().username = "admin@gmail.com"; // this is not a good practice.
		
		System.out.println("------------------------------");

		
	}

}
