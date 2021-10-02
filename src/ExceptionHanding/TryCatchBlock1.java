package ExceptionHanding;

public class TryCatchBlock1 {

	public static void main(String[] args) {

		int base = 3;
		
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		
				try {
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
