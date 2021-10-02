package JavaSessions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {

		//Default capacity of Array List is 10
		
		ArrayList<String> ar = new ArrayList<String>(); // Default Virtual Capacity is 10.
		
		ar.add("A");	
		ar.add("B");
		ar.add("C");
		
		System.out.println(ar);			// [A, B, C]
		System.out.println(ar.size());	// 3
		
		ar.clear();	
		
		System.out.println(ar); 		// []
		System.out.println(ar.size());	// 0
		
		System.out.println("--------------------------------");
		
		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("A");
		ar1.add("B");
		ar1.add("C");
		ar1.add("D");
		
		System.out.println(ar1);	// [A, B, C, D]
		
		//System.out.println("----------------");
		
		ArrayList<String> ar2 = (ArrayList<String>) ar1.clone(); //Copy of ar1 to ar2 (Shallo copy means exact copy)
		System.out.println(ar2);	// [A, B, C, D]
		
		// contains:
		System.out.println(ar1.contains("D"));	// true
		System.out.println(ar1.contains("N"));	// false
		
		// indexOf
		System.out.println(ar1.indexOf("B")); 	// 1
		System.out.println(ar1.indexOf("B")>0); // true
		
		
		ArrayList<String> ar3 = new ArrayList<String>(2);
		ar3.add("Test");
		ar3.add("Selenium");
		
		System.out.println(ar3);	// [Test, Selenium]
		
		ar3.ensureCapacity(15); 	// Increase ArrayList capacity // Interview Question.
		
		
		// for each : jdk 1.8 with lambda :
		// for each: // for each method is important for selenium
		// -> Lambda 
		ar1.forEach(e -> System.out.println(e));
		ar1.forEach(e -> System.out.println(e.toLowerCase()));
		
		 
		
		ArrayList<String> EmpName= new ArrayList<String>();
		EmpName.add("Tom");
		EmpName.add("Peter");
		EmpName.add("Manish");
		EmpName.add("Daisy");
		System.out.println(EmpName);

		Collections.sort(EmpName); 		//Collections is a class 
		System.out.println(EmpName);
		
		Collections.sort(EmpName, Collections.reverseOrder());
		System.out.println(EmpName);
		
		System.out.println("---------------------------");
	}

}
