package OOP_Encapsulation;

public class WebDriverTool {
	
	public void launchBrowser(String browser) {
		if (browser.equals("chrome")) {
			launchChrome();
		}
		else if (browser.equals("firefox")) {
			launchfirefox();
		}
		else {
			System.out.println("Please pass correct browser");
		}
	}

	private void launchChrome() {
		System.out.println("Checking Chrome Version");
		System.out.println("Checking OS Version");
		System.out.println("Launch Chrome");
	}
	
	private void launchfirefox() {
		System.out.println("Checking FireFox Version");
		System.out.println("Checking OS Version");
		System.out.println("Launch FireFox");
		
	}
}
