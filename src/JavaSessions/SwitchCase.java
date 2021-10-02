package JavaSessions;

public class SwitchCase {

	public static void main(String[] args) {
		
		// float and double values are not allowed in switch case statements.

		String browser = "chrome";
		
		//switch-case: // The 'switch' and 'case' is a keyword
		
		switch (browser) {
		case "chrome":
			System.out.println("Launch Chrome");
			break;
		case "firefox":
			System.out.println("Launch Firefox");
			break;
		case "safari":
			System.out.println("Launch Safari");
			break;
		case "ie":
			System.out.println("Launch IE");
			break;

		default:
			System.out.println("Please pass the correct browser " + browser);
			break;
		}
		
		//
		int marks = 100;
		int discount = 0;
		
		switch (marks) { // float and double value are not allowed in the switch case
		case 100:
			System.out.println("Grade A");
			discount = 1000;
			break;
		case 90:
			System.out.println("Grade B");
			discount = 800;
			break;
		case 80:
			System.out.println("Grade C");
			discount = 500;
			break;	
			
		default:
			break;
		}
		System.out.println("Your marks are : " + marks + " and discount is " + discount);
		
		System.out.println("-----------------------------------------");
		
	}

}
