package JavaSessions;

public class StringImmutable { 		// String object are immutable (non changeable) 

	public static void main(String[] args) {

		String s1 = new String ("Manish");	// Object	// two object created 1 in heap area and 1 in stack area. 
		String s2 = new String ("Manish");	// create object inside heap area. 
		
//		String s1 = "Manish ";	 // String variable. 
//		String s2 = "Manish ";	 // create object inside stack area.	
		
//		s1 = s1.concat(s2);
//		
//		System.out.println(s1);
		
		System.out.println(s1 == s2);		// reference comparison 	
		System.out.println(s1.equals(s2));	// content comparison 
		
	}

}
