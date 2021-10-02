package WebDriverArch;

public class GoogleAppTesting {
	
	static WebDriver driver;

	public static void main(String[] args) {

//		ChromeDriver driver = new ChromeDriver();
//		driver.get("http://www.google.com");
//		driver.getTitle();
//		driver.getPageUrl();
//		driver.findElement("UserName");
//		driver.quit();
		
//		FireFoxDriver driver = new FireFoxDriver(); 
//		driver.get("http://www.google.com");
//		driver.getTitle();
//		driver.getPageUrl();
//		driver.findElement("UserName");
//		driver.quit();
	
//		SafariDriver driver = new SafariDriver();
//		driver.get("http://www.google.com");
//		driver.getTitle();
//		driver.getPageUrl();
//		driver.findElement("UserName");
//		driver.quit();
		
		
		
		// Top Casting : Cross browser testing
		String browser = "chrome";
		
		if (browser.equals("chrome")) {
			 driver = new ChromeDriver();
		}
		else if (browser.equals("firefox")) {
			driver = new FireFoxDriver();
		}
		else if (browser.equals("safari")) {
			driver= new SafariDriver();
		}
		else {
			System.out.println("Please pass the correct browser...");
		}
		
		driver.get("http://www.google.com");
		driver.getTitle();
		driver.getPageUrl();
		driver.findElement("UserName");
		driver.quit();
		
	}

}
