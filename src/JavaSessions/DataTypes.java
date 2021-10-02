package JavaSessions;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//data types: type of data (8 data type)
		//primitive data types: they will directly associated with the memory allocation, they don't have any relationship with the object. 
		//Integer family: byte, short, long, int
		//floating family: double, float
		//character: char	
		//boolean: boolean - true/false
		
		//non primitive data types -  classes, hash map, array list, arrays, string (without object we cannot use this type of data). 
		
		/*
	 	Primitive Data Types
		A primitive data type specifies the size and type of variable values, and it has no additional methods.
		
		There are eight primitive data types in Java:
		
		Data Type	Size		Description
		
		byte		1 byte		Stores whole numbers from -128 to 127
		short		2 bytes		Stores whole numbers from -32,768 to 32,767
		int			4 bytes		Stores whole numbers from -2,147,483,648 to 2,147,483,647
		long		8 bytes		Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		float		4 bytes		Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
		double		8 bytes		Stores fractional numbers. Sufficient for storing 15 decimal digits
		boolean		1 bit		Stores true or false values
		char		2 bytes		Stores a single character/letter or ASCII values
		-----------------------------------------------------------------------------------------------------------
		Data types are divided into two groups:

		Primitive data types - includes byte, short, int, long, float, double, boolean and char
		Non-primitive data types - such as String, Arrays and Classes 
	    */
		
		
		//1. byte:
		//size: 8 bits = 1 byte [Interview Question]
		//range: -128 to 127
		byte b = 10; //allocation
		//byte b = 20; //Duplicate local variable b not allowed
		b = 20; // now the latest value of b is 20; 10 overwrite to 20
		System.out.println("byte "+ b);
		byte b1 = 0;  // yellow line warning - The value of the local variable b1 is not used
		byte b2 = -10;
		//byte b3 = 150; // out of range - type mismatch: cannot convert from int to byte
		
		//2. short: (is the big brother of byte)
		//size: 16 bits = 2 bytes [Interview Question]
		//range: -32768 to 32767
		short s = 10;
		System.out.println("short "+s);
		
		//3. int: (big brother of short is int)
		//size: 4bytes = 32 bits (4*8)
		//range: -2^31 to 2^32-1
		int i = 10;
		int i1 = -10;
		int p = 1000;
		int l = 0;
		System.out.println("int " + p);
		
		//4. long: (big brother of int)
		//size: 8 bytes = 64 bits
		//range: -2^63 to 2^63-1
		long ph = 99999; 
		long distance = 1212121;
		//long e = 10; // we can use byte in this case.
		System.out.println("long " + distance);
		
		//5. float: (decimal number we can store ex.12.33)
		//size: 4 bytes = 32 bits	(float and int is having the same size.)
		//range: after point it can take upto 7 digits
		float f= 12.33f;
		float g= (float)37.44;
		System.out.println("float "+f);
		System.out.println("float "+g);
		
		//6. double 
		//size: 8 bytes = 64 bits
		//range: after point it can take upto 15 digit
		double d = 12.3333333333333;
		double d1 = -12.44444444444;
		double d3 = 100; //100.0
		System.out.println("double "+ d1);
		System.out.println(d3);
		System.out.println(d);
		
		//7. char: (char means single dight value)
		//size: 16 bits = 2 bytes (Interview Question) Why java take 16 bits for char?
		char c = 'm';
		char c1 = '1';
		char c2 = '$';
		System.out.println("char "+c);
		char gender = 'M';
		System.out.println(gender);
		
		//8. boolean: (true or false)
		//size: ~1 bit
		boolean flag = true; //true & false are a keywords (true and false are reserved keywords)
		boolean flag1 = false;
		System.out.println("boolean " + flag);
		
		System.out.println(1000);
		System.out.println(12.33);
		
		System.out.println("-----------------------------------------------");
		
	}

}
