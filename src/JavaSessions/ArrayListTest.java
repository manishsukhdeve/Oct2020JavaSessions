package JavaSessions;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		// Default capacity of array list is 10.

		ArrayList<Object> ar = new ArrayList<Object>(); // import shortcut: Control + Shift + O 
		// Object Class: with the Object class we can store different types of data. 
		ar.add(100);
		ar.add("Testing"); //1
		ar.add(12.33);
		ar.add(true);
		ar.add('M');
		
		System.out.println(ar.get(1));
		System.out.println(ar); // print all the values from the array. 
		
		// generics in ArrayList:
		// Integer array list: (Integer class)
		// array list can not hold any primitive data type ex. ArrayList<int>
		// int type array list: (below example)
		ArrayList<Integer> markslist = new ArrayList<Integer>();
		 
		markslist.add(100); //0
		//markslist.add(12.33); // double value not acceptable because we already mentioned Integer in ArrayList.
		markslist.add(200); //1
		markslist.add(300); //2
		//markslist.add(400); //3
		
		for (Integer e : markslist) {
			System.out.println(e);
		}
		
		System.out.println("----------");
		
		for (int j=0; j<markslist.size(); j++) {
			System.out.println(markslist.get(j));
		}
			
		System.out.println("-------");
		
		System.out.println(markslist.get(0));
		//System.out.println(markslist.get(3));   //IndexOutOfBoundsException
		//System.out.println(markslist.get(-1));  //IndexOutOfBoundsException
		
		
		ArrayList<String> namesList = new ArrayList<String>();
		namesList.add("Manish");
		namesList.add("Mamta");
		namesList.add("Mitansh");
		//namesList.add("Ovee");
		//namesList.add("Swanandi");
		
		System.out.println(namesList.size());
		//namesList.remove(3);
		System.out.println(namesList.size());
		
		System.out.println(namesList.get(1));
		
		for(int i=0; i<namesList.size(); i++) {
			System.out.println(namesList.get(i));
		}
		
		for (String e : namesList) {
			System.out.println(e);
			
			if(e.equals("Manish")) {
				System.out.println("Manish is an Automation Test Engineer");
			}			
		}
		System.out.println("---------------------");
	}

}
