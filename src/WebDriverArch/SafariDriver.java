package WebDriverArch;

public class SafariDriver implements WebDriver {
	
	public SafariDriver() {		// Constructor got created.
		System.out.println("Launch Safari Browser");
	}

	@Override
	public void get(String url) {
		System.out.println("Launching url " + url);
	}

	@Override
	public void getTitle() {
		System.out.println("Title is " + "Google");
	}

	@Override
	public void getPageUrl() {
		System.out.println("URL is : " + "https://www.google.com");
	}

	@Override
	public void findElement(String locator) {
		System.out.println("Finding the elememnt with : " + locator);
	}

	@Override
	public void quit() {
		System.out.println("Quit the browser");
	}
	

}
