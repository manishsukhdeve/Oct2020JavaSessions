package OOP_Abstract;

public class TestPage {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		
		lp.title();		// LP -- Title
		lp.url();
		lp.loading();
		
		lp.header();

		Page.logo();
		
		lp.doLogin("Admin", " Admin");
		lp.doLogin("Admin1", " Admin2", " Admin3");
		
		//Page p = new Page(); // Can not create object of page class because page is a Abstract class.
		
		// Top Casting
		// Child class object can be referred by parent class reference variable.
		Page p = new LoginPage();
		
		p.header();
		Page.logo();
		p.title();
		p.url();
		p.loading();
	
		// Down Casting: 
		//LoginPage l = new Page(); // down casting is not possible
		
		
		
		
	}

}
