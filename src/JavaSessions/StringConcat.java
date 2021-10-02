package JavaSessions;

public class StringConcat {

	public static void main(String[] args) {

		//String is non-primitive data type
		//String is a class
		
		String s1 = "Hello World";
		System.out.println(s1);
		
		String s2 = "1000";
		System.out.println(s2);
		
		double d1 = 12.33;
		double d2 = 23.33;
		int a = 100;
		int b = 200;
		String x = " Hello";
		String y = " Selenium";
		
		System.out.println(a+b); // 300 // Arithmatic operation 
		System.out.println(x+y); // Hello Selenium // Concat two strings (+ along with string that means concatination operator)
		
		System.out.println(a+b+x+y); // 300 Hello Selenium // execution happen left to right always
		System.out.println(x+y+a+b); // Hello Selenium100200
		System.out.println(x+y+(a+b)); // Hello Selenium300
		System.out.println(d1+d2); // 35.66
		System.out.println(a+b+d1+d2); // 335.65999999999997
		System.out.println(a+b+d1+d2+x+y); // 335.65999999999997 Hello Selenium
		System.out.println(x+y+a+b+d1+d2); //Hello Selenium10020012.3323.33
		
		System.out.println("The value of a is : " + a); // The value of a is : 100
		System.out.println("The value of b is : " + b); // The value of b is : 20
		System.out.println("The sum is : " + (a + b)); // The sum is : 300
		System.out.println("The sum is : " + a + b); // The sum is : 100200
		
		//https://www.cs.cmu.edu/~pattis/15-1XX/common/handouts/ascii.html - ASCII Table
		char c = 'a'; //97
		char c1 = 'b'; //98
		System.out.println(c+c1); //97+98 = 195 // Perform ASCII operations when we are using + operator.
		System.out.println(c); // a
				
		System.out.println(c1-c); // 98-97 = 1 
		System.out.println(c1*c); // 98*97 = 9506
		
		//Interview Question - 
		//Range of the ASCII number - 
		//a-z : 97 - 122
		//A-Z : 65 - 90
		//0-9 : 48 - 57
		
		System.out.println(x+c); // Helloa
		
		System.out.println(4/2); // 2 (both the numbers int so output is int)
		System.out.println(5/2); // 2
		System.out.println(5.0/2); // 2.5
		System.out.println(5/2.0); // 2.5
		System.out.println(5.0/2.0); // 2.5 (both the numbers in double format)
		
		//System.out.println(9/0); // ArithmeticException
		System.out.println(0/10); // 0
		
		System.out.println(4 % 2); // 0
		System.out.println(5 % 2); // 1 (remender we will get 1) (5/2 = 1 remender)
		System.out.println(17 % 3); // 2 (17/3)
		
		System.out.println("------------------------------");
		
	}

}
