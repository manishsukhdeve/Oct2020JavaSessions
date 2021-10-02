package Test;

public class Page {
	
	int loadtime = 30;
	
	public Page() {
		System.out.println("Page class constructor....");
	}
	
	public Page (int time) {
		System.out.println("Page time " + time);
	}
	
	public void pageload() {
		System.out.println("Parent Page title");
	}

}
