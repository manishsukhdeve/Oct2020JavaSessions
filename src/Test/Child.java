package Test;

public class Child extends Page {
	
	public Child (int time) {
		super(time);
		System.out.println("Child class constructor...");
		
	}
	
	int loadtime = 20;
	
	void loading() {
		
		System.out.println("Child Page " + loadtime);
		System.out.println("Page " + super.loadtime);
		
		pageload();
		super.pageload();
	}
	
	public void pageload() {
		System.out.println("Child Page title");
	}
}
