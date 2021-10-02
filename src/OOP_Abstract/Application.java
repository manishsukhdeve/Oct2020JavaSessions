package OOP_Abstract;

public abstract class Application {
	
	// All the methods are abstract in nature.
	// No --> Non Abstract methods
	// 100% Abstraction
	
	public abstract void serverSetup();
	public abstract void dbSetup();
	public abstract void envSetup();
	
	public void UILayerComponents() {
		System.out.println("Application - UILayerComponents");
	}

}
