package JavaSessions;

public class CarDesign {
	
	String name;				// non-static variable	// this is template 
	String color;				// non-static variable	// this is template
	int price;					// non-static variable	// this is template
	static int wheels = 4;		// Static variable		// this is template
	// wheels = 4 some were available in the common memory allocation.

	
	
	public static void steering() {
		System.out.println("CAR - Steering");
		engine();		// static method can call directly. 
		//getCarInfo();	// non-static method can not call directly, we must call with object reference name. 
	}
	
	public static void engine() {
		System.out.println("CAR - engine");
	}
	
	public void getCarInfo() {
		System.out.println("Get Car Info");
	}
	
	
//	public static void main(String[] args) {
//	
//		CarDesign c1 = new CarDesign();
//		c1.name = "BMW";
//		c1.color = "Blue";
//		c1.price = 70;
//		
//		CarDesign c2 = new CarDesign();
//		c2.name = "Audi";
//		c2.color = "White";
//		c2.price = 80;
//		
//		CarDesign c3 = new CarDesign();
//		c3.name = "Honda";
//		c3.color = "Red";
//		c3.price = 30;
//		
//		System.out.println(c1.name + "|" + c1.color + "|" + c1.price + "|" + CarDesign.wheels);
//		System.out.println(c2.name + "|" + c2.color + "|" + c2.price + "|" + wheels);
//		System.out.println(c3.name + "|" + c3.color + "|" + c3.price + "|" + wheels);
//	}
	
}
