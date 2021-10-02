package OOP_Encapsulation;

public class Users {
	
	public String name;
	public int age;
	public int id;
	
	////////////////////////////////////////
	public static String compName = "IBM";
	////////////////////////////////////////
	
	public Users() {
		//System.out.println("Default Constructor");
	}

	public Users(String name, int age, int id) {	// Created Constructor
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
	// getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("----");

	}

}
