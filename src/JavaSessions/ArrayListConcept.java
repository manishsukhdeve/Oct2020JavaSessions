package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {

		// ArrayList - Dynamic Array
		
		// ArrayList is a class which is already available in java
		
		// its a index based collection -- linear collection 
		// Static Array --Size is fixed.
		
		// ArrayList Object created as below.
		ArrayList ar = new ArrayList(); 	// No need to define size, size will increase and decrease automatically.
		// import import java.util.ArrayList - shortcut: Control + Shift + O
		// ArrayList is a class
		// ar is the object reference name.
		// new is a keyword to create ArrayList object.
		
		System.out.println(ar.size()); //size should be 0.
		
		ar.add(100); //0
		ar.add(200); //1
		
		System.out.println(ar.size()); //size should be 2.
		
		ar.add(300); //2
		ar.add(400); //3
		
		System.out.println(ar.size()); //4
		
		ar.add(500); //4
		ar.add(600); //5
		ar.add(700); //6
		
		System.out.println(ar.size()); // 7
		
		ar.add(800); //7
		ar.add(900); //8
		ar.add(1000);//9
		
		System.out.println(ar.size()); // 10 --> PC 10
		
		ar.add(1100); //10
		
		System.out.println(ar.size()); // 11
		
		//how to print all the values from the arrayList: for loop"
		
		System.out.println("--------------");
		
		for (int i=0; i<ar.size(); i++) { 	// regular for loop
			System.out.println(ar.get(i));
		}
		
		System.out.println("-------------");
		
		
		for (Object e : ar) {				// for each loop 
			System.out.println(e);
		}		
		
		System.out.println("---------------------");
	}

}
