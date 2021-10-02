package ExceptionHanding;

// What is exception handing? Exception handing means whenever any kind of exception or error is coming in your program that you have to bypass or ignore or you have to handle that particular exception. 

public class TryCatchBlock {

	public static void main(String[] args) {  		// main method

		int base = 0;
		
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		
				try {
					int i = 9/base;			// ArithmeticException
				}
				catch (Exception e) {
					System.out.println("Some exception is coming...");
					e.printStackTrace();	// good practice to print error log. 
				}

		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		
	}

}
