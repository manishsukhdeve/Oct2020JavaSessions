package OOP_Abstract;

public class LoginPage extends Page {
	
	//public abstract void testing(); //Abstract method can be defined in abstract method only.

	public LoginPage() {		// Constructor 
		System.out.println("LoginPage -- Constructor - Child class constructor");
	}
	
	
	@Override
	public void title() {					// page class method
		System.out.println("LP -- Title");
	}

	@Override
	public void url() {						// page class method
		System.out.println("LP - URL -> http://www.google.com");
	}

	@Override
	public void loading() {					// page class method
		System.out.println("LP - Loading");
	}
	
	
	public void doLogin (String un, String pwd) {
		System.out.println("Login with " + un + pwd);
	}
	
	public void doLogin (String un, String pwd, String email) {		// overloaded method. 
		System.out.println("Login with " + un + pwd + email);
	}

	@Override
	public void header() {						
		System.out.println("Page_Override -- Header");	
	}
}
