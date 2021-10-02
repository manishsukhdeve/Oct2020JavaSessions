package ConstructorConcepts;

import java.util.ArrayList;

public class TestDrive {

	public static void main(String[] args) {
		
		CarDesign car_alto = new CarDesign("Alto", "Red");
		System.out.println(car_alto.name + " | " + car_alto.color + " | " + car_alto.price);
		System.out.println("---------------------");
		
		CarDesign bmw = new CarDesign("BMW", "White", 80, 'y');
		System.out.println(bmw.name + " | " + bmw.color + " | " + bmw.price + " | " + bmw.isAvailable);
		System.out.println("------------------------------------");
		
		
		ArrayList<String> audifeatures = new ArrayList<String>();
		audifeatures.add("Automatic Parking");
		audifeatures.add("Turbo engine");
		audifeatures.add("Sun roof");
		audifeatures.add("Rear Camera");
		audifeatures.add("Lane assist");
		
		CarDesign audi = new CarDesign("Audi", "Black", 85, 14.4, true, 'Y', audifeatures);
		
		System.out.println(audi.name + " | " + audi.color + " | " + audi.price + " | " + audi.mileage + " | " + audi.isElectric + " | " + audi.isAvailable);
		
		System.out.println(audi.featureslist);
		
		for (String s: audifeatures) {
			System.out.println(s);
		}
		
		String s = audi.featureslist.get(0);
		System.out.println(s);
		
		System.out.println("-----------------");
		
		for(int m=0;m<=5;m++) {
			for (int n=0;n<=5;n++) {
				System.out.print(m + "" + n + " ");
			}
			System.out.println();
		}
		
	}

}
