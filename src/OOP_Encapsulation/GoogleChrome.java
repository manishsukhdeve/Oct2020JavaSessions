package OOP_Encapsulation;

public class GoogleChrome {
	
	// this is the one of the best example of the Encapsulation. 
	
	public void launchGoogleChrome () {
		
		System.out.println("Checking Google Chrome");
		
		checkOSCompatibility();
		checkBrowserVersion();
		checkWindowsRAM();
		checkChromeUpdates();
		
		System.out.println("Google Chrome Launched");
	}
	
	private void checkOSCompatibility() {
		System.out.println("	checkOSCompatibility");
	}
	
	private void checkBrowserVersion() {
		System.out.println("	checkBrowserVersion");
	}

	private void checkWindowsRAM() {
		System.out.println("	checkWindowsRAM");
	}
	
	private void checkChromeUpdates() {
		System.out.println("	checkChromeUpdates");
	}
	
}
