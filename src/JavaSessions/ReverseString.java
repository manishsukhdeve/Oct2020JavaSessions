package JavaSessions;

public class ReverseString {

	public static void main(String[] args) {
		
// 		Reverse method is not available in the String Class because Strings are immutable. 
// 		Interview Question - why reverse method is not available in String class.
		
		
//		String str = "Selenium"; 			// muineleS
//		
//		//	System.out.println(str.length());	// 8
//		
//		int len = str.length();
//		
//		//System.out.println(len);	// 8
//		
//		String rev = "";
//		
//		for (int i = len -1; i >= 0; i--)
//		{
//			rev = rev + str.charAt(i);
//		}
//		
//		System.out.println(rev); // muineleS
		
		String str = "Selenium";
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());	// reverse function is available in StringBuffer concept.
		

		//System.out.println(reverseString("Selenium"));
		
	}

	public static String reverseString (String value) { 
		
		if (value == null) {
			System.out.println("You are passing null value");
			return null;
		}
		
		int len = value.length();
		
		if (len == 1)
		{
			return value;
		}
		
		String rev = "";
		
		for (int i = len -1; i>=0; i--)
		{
			rev = rev + value.charAt(i);
		}
		
		return rev;
	}
}
