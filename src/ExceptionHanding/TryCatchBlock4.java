package ExceptionHanding;

public class TryCatchBlock4 {
	
	String name;

	public static void main(String[] args) {

		int base = 3;
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		
		try {
			TryCatchBlock4 obj = new TryCatchBlock4();
			obj = null;
			obj.name = "Tom";
			System.out.println(obj.name);
			
			int i = 9/base;
			System.out.println("Bye!!!");
			System.out.println("Bye!!!");
			System.out.println("Bye!!!");
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception is coming");
			e.printStackTrace();
		}
		catch (NullPointerException e) { 	// NPE is short form of exception
			System.out.println("Null Pointer Exception is coming");
			e.printStackTrace();
		}
				
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		
	}

}
