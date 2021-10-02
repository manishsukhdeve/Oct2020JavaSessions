
package OOP_Abstract;

public class ApplicationTEsting {

	public static void main(String[] args) {

		WhatsApp wt = new WhatsApp();
		
		wt.dbSetup();
		wt.serverSetup();
		wt.envSetup();
		
		wt.UILayerComponents();
		
		
	}

}
