package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {

		BMW b = new BMW();
		b.start();	// Overridden		// BMW -> Start
		b.stop();	// Inherited 		// Car -> Stop
		b.reful();	// Inherited		// Car -> Reful
		b.autoParking();	// child class method	// BMW -> Auto Parking	
		
		System.out.println(b.engine);	// 10
		BMW.SunRoof();	// BMW - SunRoof	// static method can be call by class name. 
		b.engine();		// Vehicle - Engine
		
		b.musicSystem();					// BMW - Music System
		b.musicSystem(": Bollywood Songs");	// BMW - Music System : Bollywood Songs
		b.musicSystem(": Mumbai", 94.4);	// BMW - Music System : Mumbai Radio Frequency -> 94.4
		
		Car c = new Car();
		c.start();		// Car -> Start
		c.stop();		// Car -> Stop
		c.reful();		// Car -> Reful
		//c.autoparking();	 	// Reference type check 
		System.out.println(c.engine);	// 10
		Car.sunRoof();	// Car - SunRoof
		c.engine();		// Vehicle - Engine
		
		// Top Casting: 
		Car c1 = new BMW();	// Child class object can be referred by parent class reference variable.
		c1.start();		// BMW -> Start		// Overridden method can be call by parent class reference variable. 
		c1.stop();		// Car -> Stop
		c1.reful();		// Car -> Reful
		//c1.autoparking(); //type casting (Interview Question.)	// individual method of BMW an this method cant call by parent class reference variable. 
		
		// Down Casting:	Down casting is not allowed in the run time (Interview Question)
		// BMW b1 = (BMW) new Car(); //ClassCastException:
		// down casting is not allowed in java. 
	}

}
