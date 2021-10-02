package WebDriverArch;

public interface WebDriver {
	
	// In selenium WebDriver is a interface. 
	
	public void get(String url); 	// interface method by default in Abstract in nature and no need to give method body
	
	public void getTitle();

	public void getPageUrl();
	
	public void findElement(String locator);
	
	public void quit();
	
}
