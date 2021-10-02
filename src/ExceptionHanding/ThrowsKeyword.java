package ExceptionHanding;

public class ThrowsKeyword {
	
		// Throws keyword is just to pass the exception from one method to another method. Throws keyword is not responsible to handle the exception.  

		public void m1() throws ArithmeticException {
			System.out.println("M1");
			m2();
		}
		
		public void m2() throws ArithmeticException, NullPointerException {
			System.out.println("M2");
			m3();
		}
		
		public void m3() throws ArithmeticException {  
			System.out.println("M3");
			m4();
		}
		
		public void m4() {
			System.out.println("M4");
			try {
				booking();
			}
			catch(ArithmeticException e){
//				e.printStackTrace();
			}
		}
		
		public void booking() throws ArithmeticException {
			
			System.out.println("Booking Cab...");
			int i = 9/0;	// Arithmetic Exception
		}
		
		public static void main (String [] args) throws ArithmeticException {
			ThrowsKeyword obj = new ThrowsKeyword();
			obj.m1();
		}
}
