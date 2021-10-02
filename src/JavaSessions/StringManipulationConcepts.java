package JavaSessions;

public class StringManipulationConcepts {

	public static void main(String[] args) {
		
// 		String is not a primitive data type. 		
// 		String is a class. String is collection of multiple characters.	
//		internally string maintain character array.		

		String str = "This is my java code and I am so happy";
		
		System.out.println(str.length());	// 38
		
		int len = str.length();	// 38
		int li = 0;				// lowest index
		System.out.println(li);	// 0
		int hi = len - 1;		// highest index 
		System.out.println(hi);	// 37
		
		System.out.println(str.charAt(2));	// i
		System.out.println(str.charAt(37));	// y
//		System.out.println(str.charAt(38)); // StringIndexOutOfBoundsException
// 		System.out.println(str.charAt(len));
		System.out.println(str.charAt(0));	// T
		
		System.out.println(str.indexOf('T'));	// 0
		System.out.println(str.indexOf('s')); 	// 1st occurrence of s is 3
		
		System.out.println(str.indexOf("s", 4)); // 2nd occurrence of s is 6
		
		System.out.println(str.indexOf("s", str.indexOf('s')+1));	// 2nd occurrence of s is 6 
		
		System.out.println(str.indexOf("java"));	// 11
		
		System.out.println(str.indexOf("Hello"));	//-1
		
		String msg = "Welcome admin";
		
		if (msg.indexOf("admin") >= 0) {	// or if (msg.indexOf("admin") == 8
			System.out.println("Correct Messge");
		}
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		// trim() method
		
		String s = "     Hello World     ";
		System.out.println(s.trim());	// space removed from the corners, not remove middle of space
		
		String text = "     1234";
		System.out.println(text.trim());
		
		// replace() method
		
		String dob = "01-01-1990";
		System.out.println(dob.replace('-', '/'));
		
		String s1 = "Hello Java i am happy with Java";
		System.out.println(s1.replace("Java", "Python"));
		
		// contains() method
		
		String s2 = "Welcome Admin";
		System.out.println(s2.contains("Admin"));	// true
		
		if (s2.contains("Admin")) {
			System.out.println("Correct message");
		}
		else {
			System.out.println("incorrect message");
		}
		
		// concat() method
		
		String s11 = "Hello ";
		String s12 = "Selenium";
		System.out.println(s11 + s12);
		System.out.println(s11.concat(s12));
		System.out.println(s11.concat(s12).concat(" Test Automation").concat(" ").concat("Python"));
		
		// comparison() method
		
		String s3 = "This is my java Code";
		String s4 = "This is my Java Code";
		System.out.println(s3.equals(s4));	
		System.out.println(s3.equalsIgnoreCase(s4));
		
		// substring() method
		
		String s5 = "This is my order id 12345";
		System.out.println(s5.substring(11));	// order id 12345
		System.out.println(s5.substring(0, 9));	// This is m
		System.out.println(s5.substring(s5.indexOf("id")+3, s5.length()));
		
		// split() method
		
		String test = "Java;Python;JavaScript;Ruby";
		String arr[] = test.split(";");
		System.out.println("0th Position of " + arr[0]);
		for (String e : arr) {
			System.out.println(e);
		}
		
		String userData = "Tom:Peter:30:London:UK:999999:IBM";
		String user[] = userData.split(":");
		System.out.println("0th Position of : " + user[0]);
		System.out.println("1st Position of : " + user[1]);
		System.out.println("2ne Position of : " + user[2]);
		for (int i = 0; i<user.length; i++) {
			System.out.println(user[i]);
		}
		
		String data = "xXTestingXxXxJavaxXSelenium";
		String dataArr[] = data.split("xX");
		System.out.println("0th Position : " + dataArr[0]);
		System.out.println("1st Position : " + dataArr[1]);
		System.out.println("2nd Position : " + dataArr[2]);
		System.out.println("3rd Position : " + dataArr[3]);
		
		// String tp int
		String x = "100";
		System.out.println(x+20);
		int i = Integer.parseInt(x); // Integer is a class and parsInt is a static method.
		System.out.println(i+20);
		
//		String y = "100A";
//		System.out.println(y+20);
//		int j = Integer.parseInt(y); // lang.NumberFormatException
//		System.out.println(j+20);
		
		// String to double 
		String ds = "12.33";
		System.out.println(ds+100);
		double d = Double.parseDouble(ds);
		System.out.println(d+100);
		
		// int to string
		int total = 1000;
		System.out.println(total + "" + 20);
		String tt = String.valueOf(total);
		System.out.println(tt+20);
		
		// double to string
		double dss = 12.44;
		System.out.println(dss+100);
		String dsss = String.valueOf(dss);
		System.out.println(dsss+100);
		
	}
}
