package JavaSessions;

import java.util.ArrayList;

public class Company {
	
	String name;
	int empCount;
	
	
	public String getCEOName() {
		return "Manish";
	}
	
	
	public int getTotalCount() {
		System.out.println("Get total count of the Shares");
		int totalShare = 2000;
		return totalShare;
	}
	
	
	public String[] getCoFounders() {
		System.out.println("Get Co-Founders");
		String founder [] = new String[3];		// String of Array
		founder [0] = "Tom";
		founder [1] = "Peter";
		founder [2] = "Steve";
		return founder;
	}
	

	public ArrayList<String> getCustomerList() {
		System.out.println("Get Customer List");
		ArrayList<String> cust = new ArrayList<String>();
		cust.add("Nestle");
		cust.add("Pepsi");
		cust.add("Deo");
		return cust;
	}
	
	
	
	public static void main(String[] args) {
		
		Company comp = new Company();
		System.out.println(comp.getCEOName());
		
		int shares = comp.getTotalCount();
		System.out.println(shares);
		
		String founderArr[] = comp.getCoFounders();
		System.out.println("Total Co-Founders : " + founderArr.length);	// .length() is for Array.
		for (String e : founderArr) {
			System.out.println(e);
		}

		ArrayList<String> ar = comp.getCustomerList();
		System.out.println("Total number of customer : " + ar.size());	// .size() is for ArrayList.
		for (String n : ar) {
			System.out.println(n);
		}
		
		System.out.println("--------------------------");
		//return "naveen";
	}

}
