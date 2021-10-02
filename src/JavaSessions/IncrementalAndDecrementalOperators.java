package JavaSessions;

public class IncrementalAndDecrementalOperators {

	public static void main(String[] args) {

		// Incremental Operator ++
		// Decremental Operator --
		
		//Post Increment: Increase the value later.
		int a = 1;
		int b = a++;
		System.out.println(a); //2	// First give orignal value of a to b then increase the value.
		System.out.println(b); //1
		
		int c = -99;
		int d = c++;
		System.out.println(c); // -98
		System.out.println(d); // -99
		
		int g = -1000;
		int h = g++;
		System.out.println(g); //-999
		System.out.println(h); //-1000
		
		//Pre Increment: 
		int m = 1;
		int n = ++m;	// first increase the value of m and then give it to n.
		System.out.println(m);	// 2
		System.out.println(n);	// 2
		
		int u = -99;
		int o = ++u;
		System.out.println(u); //-98
		System.out.println(o); //-98
		
		// Post Decrement: Decrease the value later.
		int x = 2;
		int y = x--;	// first x value give to y and then decrease the value of x.
		System.out.println(x); //1
		System.out.println(y); //2
		
		// Pre Decrement
		int q = 3;
		int f = --q;
		System.out.println(q);	// 2
		System.out.println(f);	// 2
		
		// Interview Question :
		int total = 100;
		System.out.println(total++);// 100 (Post Increment) first give total value 100 and print and then increment so first print 100 and then increase.  
		System.out.println(total); //  101
		
		int bal = 999;
		System.out.println(++bal); // 1000 (Pre Increment)
		
		double d1 = 99.99;
		System.out.println(++d1); // 100.99
		
		//Interview Question:
		char c1 = 'a'; //97
		System.out.println(++c1); // b (97 + 1 = 98 ASCII is b)
		
//		boolean b1 = true;
//		System.out.println(++b1); Error will give.
		
		System.out.println("---------------------------------");
		
	}

}
