package ExceptionHanding;

public class TryCatchBlock3 {
	
	String name;

	public static void main(String[] args) {

		int base = 0;
		
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		
				try {
						TryCatchBlock3 obj = new TryCatchBlock3();
						obj.name = "Tom";
						System.out.println(obj.name);
						
						int i = 9/base;
						System.out.println("Bye!!!");
						System.out.println("Bye!!!");
						System.out.println("Bye!!!");
					}
				catch (ArithmeticException e) {		
						System.out.println("Some Exception is coming");
						e.printStackTrace();
					}
		
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
	}

}
