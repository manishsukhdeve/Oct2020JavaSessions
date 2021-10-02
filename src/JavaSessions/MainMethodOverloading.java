package JavaSessions;

public class MainMethodOverloading {
	
	// Interview Question - Can we overload main method ? Ans: Yes, but JMV will call such method where particular signature is matched. 

	public static void main(String a []) {		// (String[] args)
		System.out.println("Hello World");
		System.out.println(a.length);
		//System.out.println(a[0]);	 			// ArrayIndexOutOfBoundsException
		
//		MainMethodOverloading.main(10);			// main method can call with class name or without class name. 
//		MainMethodOverloading.main(10, 20);		// main method can call with class name or without class name. 
//		MainMethodOverloading.main(10, " Testing"); 	// main method can call with class name or without class name. 
		
		main(10);			// main method can call with class name or without class name. 
		main(10,20);		// main method can call with class name or without class name. 
		main(40," Testomg");// main method can call with class name or without class name. 
		
	}
	
	public static void main(int a) {
		System.out.println(a);
	}
	
	public static void main(int a, int b) {
		System.out.println(a + b);
	}

	public static void main(int a, String c) {
		System.out.println(a + c);
	}
}
