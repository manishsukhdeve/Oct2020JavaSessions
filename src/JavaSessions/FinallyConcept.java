package JavaSessions;

public class FinallyConcept {

	public static void main(String[] args) {

	//	finally is the block always associated with try-catch to maintain clean up code 
	//	which should be executed always irrespective of whether exception raised or not 
	//	raised and whether handled or not handled.	
		
	// 	finally is a special keyword - 	if any kind of exception is coming or not inside of finally block is always executed. 
		
		int p = 10;
	
			try {
				int div = p/0;
			}
			catch (ArithmeticException e) {
				System.out.println("Airmethmetic Exeception is coming...");
			}	
			finally {
				System.out.println("In finally block...");
			}	
			
		System.out.println("Bye!!!");
	
		System.out.println("-----------------------------------");
	
		System.out.println(getMarks ("Tom"));	
		
		}	
	
	public static int getMarks(String name) {
		
		if(name.equals("Tom")) {
			try {
				int i = 9/0;
			}
			catch (ArithmeticException e) {
				//System.out.println("AE is coming");
				return 98;
			}
			finally {
				System.out.println("Finally block");
				return 100;
			}
		}
		
		else if (name.equals("Peter")) {
			return 90;
		}
		
		else {
			System.out.println("Name is not found");
			return -1;
		}
	
	}

}
