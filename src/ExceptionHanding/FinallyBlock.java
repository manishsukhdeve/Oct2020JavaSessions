package ExceptionHanding;

public class FinallyBlock {

	public static void main(String[] args) {
		
		// doesn't matter exception is coming or not finally block is always executed. 

		System.out.println("Try - Catch - Finally");
		
		try {
			int i = 9/0;
		}
		catch (ArithmeticException e) {
			System.out.println("Exception in try block...");
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally block...executed always");
		}
		
		
		// Interview Question - 
		
		// 1. make connection with DB --
			// DB is down -- exception appears
			// User name / password is wrong -- exception appears
			// connectivity issue -- exception appears.
		
		// 2. connection is done...
			// get the data using SQL -- exception appears
		 	// use that data
			// close the connection  -- finally block
		
	}

}
