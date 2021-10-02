package SuperKeyword;

public class LoginPage extends Page{
	
	public LoginPage(int time) {
		super(time);	// super keyword should be the first statement of the constructor inside the child class. 
		System.out.println("Login Page Constructor.....");
	}
	
	int loadTime = 20;
	
	void loading() {
		System.out.println("Child load time : " + loadTime);
		
		System.out.println("Page load time : " + super.loadTime);
		
		pageTitle();
		super.pageTitle();
	}

	public void pageTitle() {
		System.out.println("Login Page Title");
	}

}
