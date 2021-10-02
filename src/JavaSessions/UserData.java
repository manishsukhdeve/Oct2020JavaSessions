package JavaSessions;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class UserData {
	
//	Selenium_15_HashMapVsHashtable_How_To_Use_HashMap_In_Selenium.mp4

	public static void main(String[] args) {

//		HashMap <String, String> userMap = new HashMap <String, String>();
		
		Map <String, String> userMap = new HashMap <String, String>();
		
		userMap.put("id", "1");
		userMap.put("name", "Tom");
		userMap.put("city",	"Banglore");
		userMap.put(null, "pune");
		userMap.put(null, "Hyderabad");
		userMap.put("company", null);
		userMap.put("Country", null);
		
		System.out.println(userMap);	// {city=Banglore, name=Tom, id=1}
		System.out.println(userMap.get("id"));	// 1
		System.out.println(userMap.get(0));		// null
		System.out.println(userMap.size());		// 3
		
		for (Map.Entry m : userMap.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		// hashmap is non synchronized -- not thread safe...
		
//		---------------------------------------------------------------------
		
		Hashtable <String, Integer> productTable = new Hashtable <String, Integer> ();
		
		productTable.put("Apple MacBook", 2000);
		productTable.put("Windows Hp Laptop", 1000);
		productTable.put("Apple iPhoneX", 1500);
//		productTable.put(null, null);	// no null key and null value in hashtable.
		
		
		System.out.println(productTable);	// {Apple MacBood=2000, Windows Hp Laptop=1000, Apple iPhoneX=1500}
		System.out.println(productTable.get("Apple MacBook"));
		
		for (Map.Entry m : productTable.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		
		
	}

}
