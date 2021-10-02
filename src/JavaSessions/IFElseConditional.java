package JavaSessions;

public class IFElseConditional {

	public static void main(String[] args) {

		// Conditional Operators:  < > == != <= >=

		// x == y		x is equal to y
		// x != y       x is not equal to y
		// x > y        x is greater than y
		// x < y        x is less than y
		// x >= y       x is greater than or equal to y
		// x <= y       x is less than or equal to y
		
		int a = 10; // = Assignment operator
		int b = 10;
		
		System.out.println(a == b); // true // Comparison operator
		
		if (a == b) 				// if is a reserved keyword so i is small.
		{ 							// == boolean value - true or false
			System.out.println("Hi");
		}
		else 
		{
			System.out.println("Bye");
		}

		System.out.println("--------------------------");
		
		if (true) // or if (false)
		{
			System.out.println("Testing");
		}
		else // (Here else part is the dead code)
		{
			System.out.println("Development");  // Dead code means unreachable code.(Interview Question )
		}
		
		System.out.println("---------------------------");
		
		if (false) { System.out.println("Checking"); } else { System.out.println("checking dead code"); } // here if part is dead code.
		
		System.out.println("---------------------------");
		
		String s1 = "Selenium";
		String s2 = "selenium";
		
		if (s1.equals(s2)) 
		{
			System.out.println("Both are equal");
		}
		else 
		{
			System.out.println("Both are not equal");
		}
		
				if (s1.equalsIgnoreCase(s2)) 
				{
					System.out.println("Both are equal");
				}
				else 
				{
					System.out.println("Both are not equal");
				}
		
		// nested if :
		int marks = 60;
		
		if(marks>=60) {
			System.out.println("A Grade");
				
				if (marks<=80) {
					System.out.println("B Grade");
						
						if (marks<=60) {
							System.out.println("C Grade");
						}						
				}
		}
		else {
			System.out.println("Fail");
		}
		
		// not a good practice - this is not nasted if (normal if)
		String browser = "chrome";
		if (browser.equals("chrome")) {
			System.out.println("Launch Chrome");
		}
		if (browser.equals("firefox")) {
			System.out.println("Launch FireFox");
		}
		if (browser.equals("safari")) {
			System.out.println("Launch Safari");
		}
			
		
		// if-elseif - good approach
		if (browser.equals("chrome")) {
			System.out.println("Launch Chrome");
		}
		else if (browser.equals("firefox")) {
			System.out.println("Launch Firefox");
		}
		else if (browser.equals("safari")) {
			System.out.println("Launch Safari");
		}
		else {
			System.out.println("Please pass the correct browser");
		}
		
		// This is interview question.
		// Write A Program - to find out the max number where three different numbers are given:
		int x = 700;
		int y = 600;
		int z = 800;
		
		if (x>y && x>z) { //true && false = false
			System.out.println("X is the greatest number");
		}
		else if (y>z) { // false
			System.out.println("Y is the greatest number");
		}
		else {
			System.out.println("Z is the greatest number");
		}
			
		
		double d1 = 12.33;
		double d2 = 12.33;
		if (d1 == d2) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		char c1 = 'a';
		char c2 = 'a';
		if ( c1 == c2) {
			System.out.println("Hello");
		}
		else {
			System.out.println("Hi");
		}
		
		if (c1 == 97) { // system will take ASCII value while comparison 
			System.out.println("Hey");
		}
		System.out.println("-----------------------------------------------");
}
}