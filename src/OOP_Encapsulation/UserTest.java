package OOP_Encapsulation;

public class UserTest {

	public static void main(String[] args) {

		Users user = new Users();
		
		// how many ways initialize class variables (or how many ways you can give values) answer is 3 ways.
		
		// 1. directly accessing them:
		user.name = "Tom";
		System.out.println(user.name);
		
		
		
		// 2, using the constructor:		// this is the best approach to save time and save number of line coding.
		Users u1 = new Users("Lisa", 25, 101);
		System.out.println(u1.name + "|" + u1.age + "|" + u1.id);
		
		// 3. setter and getter:
		Users u2 = new Users ();
		u2.setName("Steve");
		u2.setAge(30);
		u2.setId(301);
		
		System.out.println(u2.getName() + "|" + u2.getAge() + "|" + u2.getId());
		System.out.println(u2.name + " " + u2.age + " " + u2.id + " " + Users.compName);
		
		System.out.println("----------------");
		
	}

}
