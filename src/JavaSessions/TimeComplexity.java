package JavaSessions;

public class TimeComplexity {

	public static void main(String[] args) {

		int i = 10; // O(1) how many times this will execute - this statement is executed only once.
		// BIG O
		System.out.println(i); //O(1)
		
		
		// What is the time complexity of this program. Answer is O(1).
		int p1 = 10+20;
		System.out.println(p1);
		
		
		for (int k=1; k<=10; k++) {		//O(10) --> O(n) Interview Question.
			System.out.println(k);
		}
		
		
		for (int p =1; p<=10; p++) {
			for (int q=1; q<=10; q++) {
				System.out.println(p + q);
			}
			System.out.println("-----------------------");
		}
		
		
	}

}
