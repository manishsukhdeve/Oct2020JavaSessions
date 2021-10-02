package JavaSessions;

//import java.nio.charset.Charset;

public class StaticArrayConcept {

	public static void main(String[] args) {
		
		//Static Array -- Size is fixed.
		//Static Array -- Similar data type


		// Limitation of array :
		// 1. size is fixed : static array :to overcome this, we can use ArrayList (Collection)
		// 2. similar data types you can store : to overcome this issue, we can use Object array(static)
		// but we can use ArrayList <Object> - collection.
		
		// Object is a class and it is a super call of all the objects.
		
		// int array :
		int i[] = new int[4];   		// i small because int is a keyword
		//i[-1] = 5; 					// in Java no negative indexing 
		i[0] = 10; // lowest index is always be zero						//	10	20	30	40	values
		i[1] = 20;															//	0	1	2	3	index
		i[2] = 30;															//	0 is lowest index
		i[3] = 40;															// 	3 is highest index
																			//	length of array is 4
																			//	l = 4
																			//	li = 0
																			//	Hi = l - 1 = 3
																			//	l = Hi + 1 = 4
																			//	li = 0
		
		System.out.println("Lowest index " +0);
		//System.out.println("Highest index " +3);
		
		int len = i.length; // 4
		
		System.out.println("Length = " + len);
		System.out.println("Highest index is " + (len -1));
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		//System.out.println(i[4]); 	//ArrayIndexOutOfBoundsException
		//System.out.println(i[-1]);	//ArrayIndexOutOfBoundsException // in java no negative indexing in the array. // Interview Question.
		
		System.out.println("--------------------------------------------------------");
		
		//how to print all values from Array : for loop
		for (int k=0; k<i.length; k++) {
			System.out.println(i[k]); // 10 20 30 40
		}
		
		System.out.println("--------------------------------------------------------");
		
		//for each loop :
		for (Integer e : i) {
			System.out.println(e);
		}

		
		// double array
		double d [] = new double [2];
		d[0] = 12.33;
		d[1] = 23.44;
		for (Double dd : d) {
			System.out.println(dd);
		}
		
		
		// Character array
		char c[] = new char[3];
		c[0] = 'M';
		c[1] = 'P';
		c[2] = 'S';
		for (char cc : c) {							// for each loop
			System.out.println(cc);
		}
				for(char c1=0; c1<c.length; c1++) { // Typical for loop
					System.out.println(c[c1]);
				}
				
		
		// String array:
		String lang [] = new String[3];
		lang[0] = "Java";
		lang[1] = "Python";
		lang[2] = "Ruby";
		
		for (String s : lang) {
			System.out.println(s);
		}
		for (int p = 0; p<lang.length; p++) {
			System.out.println(lang[p]);
		}
		
		
		System.out.println("--------------------------------------------------------");
		
		// Object Array: static array
		Object ob[] = new Object[5];
		ob[0] = "Manish";
		ob[1] = 40;
		ob[2] = 'M';
		ob[3] = 99.99;
		ob[4] = true;
		
		for (Object obj : ob) {
			System.out.println(obj);
		}
		
		for (int i2=0;i2<ob.length;i2++) {
			System.out.println(ob[i2]);
		}
		
		System.out.println("****************************************************************************************************************************");
		
	}

}
