package JavaSessions;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {

		// HashMap is another dynamic collection available in java which stores the value on the basis of key and value format 
		// key-value : format
		// its a class so we have to create object of hashmap
		// Default capacity of hashmap is 16
		// Default vertual capacity of hashmap is 16.
		// HashMap is non order based and ArrayList is order based
		// Interview Question - Internal mechanism of HashMap and ArrayList 
		
		// Link list = linking with the different node. 
		// Collision in Hash map ?
		
		HashMap<String, String> EmpName = new HashMap<String, String>();
		EmpName.put("A", "Peter");
		EmpName.put("B", "Manish");
		EmpName.put("C", "Lisa");
		EmpName.put("D", "Tom");
		
		System.out.println(EmpName);
		System.out.println(EmpName.get("B"));
		
		System.out.println(EmpName.size());
		
		System.out.println("------------------");	
	}

}
