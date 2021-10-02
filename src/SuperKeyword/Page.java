package SuperKeyword;

// super keyword is used at the time of inheritance. 
// whenever we have to call the parent class properties from the child class in that case we can use super keyword. super class behave like a parent class reference variable. 
// we can use super keyword within method also. 

public class Page {
	
	public Page () {
		System.out.println("Page Constructor.....");
	}
	
	public Page (int time) {
		System.out.println("Page Constructor with time...." + time);
	}
	
	int loadTime = 30;
	
	public void pageTitle() {
		System.out.println("Page Title");
	}

}
