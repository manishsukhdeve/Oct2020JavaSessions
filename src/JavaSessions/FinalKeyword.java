package JavaSessions;

public class FinalKeyword {		// final is a keyword.

	public static void main(String[] args) {

//		final is the modifier applicable for classes, methods and variables.
//		If a class declared as the final then child class creation is not possible.
//		If a method declared as the final then overriding of the method is not possible.
//		If a variable declared as the final then reassignment is not possible.
		
//		To provide the constant values.	
		
//		prevent the overriding and inheritance.
		
		final int a = 10;
		//a = 20;
		System.out.println(a);		// 10
//		System.out.println(a++);	// increase the value is not possible because datatype is declared as final.
		
		final int days = 7;	
		int salary = days * 10;
		System.out.println(salary);	// 70
		
	}

}
