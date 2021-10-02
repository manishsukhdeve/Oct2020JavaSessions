package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {

//		while loop and for loop both are exactly  same;		
//		whenever number of iterations are not predefined in that case we will use while loop.
//		number of iterations are already predefined in that case we will use for loop.		
		
		// Print 1 to 10.
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
				
		 
		// 1. While loop:
		
		int i = 1; // Start - Initialization
		while(i<=10) {	//Conditional part		// while is a keyword (reserved keyword)
			System.out.println(i); // Statement // 1 1 1  keep printing 1 if i=i+1 not mentioned (infinite loop)
			// i=i+1; // 2 3 4 5 6 7 8 9 10 // Increment or Decrement 
			// i++;
			++i;
		}	

		
		System.out.println("-------------------------------------------------");
		
		
		int k = 1;
		while (k<=10) {
			System.out.println(k++); // this is not a good practice
		}
		
		System.out.println("-------------------------------------------------");
		
		
		
		// Welcome to my Hotel ( Practical scenario )
//		while (true) {
//			System.out.println("Welcome!! to my hotel"); // infinite loop 
//		}	// keep printing message continue.
		
		
		
		// 2. For loop - most important loop
		// 1 to 10:
		for (int j=1; j<=10; j++) {
			System.out.println(j);
		}
		
		
		for (int z=1; z<=10;) {
			System.out.println(z);
			z++; // not a good practice 
		}
		
		
//		Interview Question: 
//		for (; ;) 							// valid syntax
//		{
//			System.out.println("Hello"); 	// infinite loop
//		}
		
				
		//a to z: Print a to z (Interview question.)
		for (char c='a'; c<='z'; c++) {
			System.out.println(c);
		}
		
		
		for (double d = 1.1; d<=10.1; d++) {
			System.out.println(d);
		}
		
		
		boolean flag = false;
		while (flag) {
			System.out.println("Hii");
		}
		
		
		// 3. do-while loop
		int p = 1;
		do {
			System.out.println(p);
			p++;
		}
		while (p<=10);
		
		
		//4. for-each loop:
		//5. streams: JDK 8 for ArrayList
		//6. forEach Loop Method - JDK8
		
		int marks[] = new int[5];
		marks [0] = 100;
		marks [1] = 200;
		marks [2] = 300;
		marks [3] = 400;
		marks [4] = 500;
		for (int a=0; a<5; a++) {			// typical for loop
			System.out.println(marks [a]);
		}
		
		System.out.println("-------------------------------------------------");
		
		
		for (Integer e : marks) { 			// for-each loop
			System.out.println(e);
		}
		
		
		//WAP to print only even numbers (1 to 10)
		// 2 4 6 8 10
		for (int even = 2; even<=10; even= even+2) {
			System.out.println(even);
		}
		
		
		System.out.println("-------------------------------------------------");
		
		
		//WAP to print only odd numbers (1 to 10)
		//1 3 5 7 9 
		for (int odd = 1; odd<=10; odd=odd+2) {
			System.out.println(odd);
		}
		
		
		System.out.println("-------------------------------------------------");
		
		
		// for loop with if condition
		// print 1 to 100
		// when i find a number which is divisible by 5 then print Hiii
		
		for (int g = 1; g<=100; g++) {
			System.out.println(g);
			if ( g % 5 == 0) {
				System.out.println("  Hiii");
				break; //if we use break condition system print numbers 1 to 5 and Hii and break the loop
			}
		}
		
		
		
		//	00	01	02	03	04	05
		//	10	11	12	13	14	15	two for loop ON square
		
		for (int m = 0; m<=5; m++) {
			for (int n = 0; n<=5; n++) {
				System.out.print(m + "" + n + " ");
			}
				System.out.println();
		}
		
		
		System.out.println("--------------------------------------------------------------------------------");
		
}

}	