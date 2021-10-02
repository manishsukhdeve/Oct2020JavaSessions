package OOP_Abstract;

public class WhatsApp extends Application {

	@Override
	public void serverSetup() {
		System.out.println("Parent Override Method - ServerSetup");
	}

	@Override
	public void dbSetup() {
		System.out.println("Parent Override Method - DataBase Setup");
		
	}

	@Override
	public void envSetup() {
		System.out.println("Parent Override Method - Environment Setup");
		
	}
	
	


}
