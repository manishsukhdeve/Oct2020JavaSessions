package JavaSessions;

public class MethodsInJava {
	
	// 1. Rule : Can not create a method inside a method
	// Method and Function both are same thing.
	// Method means unique and generic code which is responsible some work, means you call that method and that method do something for you.
	// main() method directly called by java. Other method call by object. 
	
	public static void main(String[] args) {	// main method is the entry point of program execution. 
		
		MethodsInJava obj = new MethodsInJava();	//create the object:
		
		obj.test();		// calling test method. 
		
		int p = obj.getMarkds();
		System.out.println(p+100);
		
		String val = obj.getNames();
		System.out.println(val);
		
		int s1 = obj.sum(10, 20);
		System.out.println(s1);
		
		System.out.println(obj.sum(40, 50));	// this is not a good practice. 
		
		System.out.println("--------------------");
		
	}
	
	
	// 1. no input and no return.
	// void means: this method does not return any value. 
	// return type of this method is void. 
	public void test() {					// this is method.
		System.out.println("Test Method");
	}
	
	
	//2. no input but some return
	// return type of this method is int. 
	public int getMarkds() {			// first letter of the method name should be small.
		System.out.println("get marks");
		int total = 100;
		int bonus = 50;
		int totalMarks = total + bonus;
		
		return totalMarks;	// return is a keyword so r small.	
		}
	
	
	// return type of this method is String. 
	public String getNames() {
		System.out.println("get name method");
		String s = "Manish";
		return s;	
	}
	
	
	//3. some input and some return:
	public int sum (int a, int b) {
		System.out.println("Sum Method");
		int z = a+b;
		return z;
	}
		
}