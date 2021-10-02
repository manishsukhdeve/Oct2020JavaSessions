package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		
		FortisHospital fh = new FortisHospital();
		
		fh.orthoServices();			// USMedical Method.		FH --> orthoServices
		fh.physioServices();		// USMedical Method.		FH --> physioServices	
		fh.cardioServices();		// USMedical Method.		FH --> cardioServices
		fh.emergencyServices();		// USMedical Method.		FH --> emergencyServices
		fh.totalDoctors(100);		// USMedical Method.		FH --> Doctors Count 100
		
		System.out.println("--------------------------------------------------------------");
		
		fh.pediaServices();			// UKMedical Method. 		FH --> pediaServices	
		fh.ENTServices();			// UKMedical Method.		FH --> ENTServices
		fh.emergencyServices();		// UKMedical Method.		FH --> emergencyServices
		
		System.out.println("--------------------------------------------------------------");
		
		fh.gyncServices();			// IndianMedical Method.	FH --> gyncServices
		fh.neuroServices();			// IndianMedical Method.	FH --> neuroServices
		fh.oncologyServices();		// IndianMedical Method.	FH --> oncologyServices
		fh.emergencyServices();		// IndianMedical Method.	FH --> emergencyServices
		
		System.out.println("--------------------------------------------------------------");
		
		fh.pathologyServices();		// FortisHospital Method.	FH -- pathologyServices	
		fh.medicalInsurance();		// FortisHospital Method.	FH -- medicalInsurance
		
		System.out.println("--------------------------------------------------------------"); 
		
		USMedical.hospitalAdmin();	// US --> hospitalAdmin		USMedical Static method (static method call by interface name)
		
		fh.billing();				// FH --> Billing
		
		fh.medicalTraining();		// MedicalAssociation --> medicalTraining
		
		fh.covidTest();				// FH --> Covid 19 Test		//WHO (Interface)	
		
		fh.medicalResearch();		// Medical Org --> medicalResearch		//MedicalOrg (class)
		
		fh.unisco();				// FH --> Unisco		// UN (Interface)
		
		
		System.out.println("--------------------------------------------------------------"); 
				
		System.out.println("Minium fee : " + USMedical.min_fee);	// USMedical variable (static variable call with class/interface name)
		
//		USMedical.min_fee = 20; 			// Variable defined as final hence we can not assign value at run time. 
				
// 		USMedical us = new USMedical(); 	// Can not create the object of Interface.
		
		System.out.println("--------------------------------------------------------------"); 
		
		// Top Casting
		USMedical us = new FortisHospital();	// Child class object can be referred by parent interface reference variable.
		
		us.orthoServices();			// FH --> orthoServices
		us.physioServices();		// FH --> physioServices
		us.cardioServices();		// FH --> cardioServices
		us.emergencyServices();		// FH --> emergencyServices	
		
// 		Other interface method cannot access because below methods are coming from different interface hence rule will applicable as reference type check.  		
//		us.pediaServices();			// reference type check  	// UKMedical Method. 		
//		us.ENTServices();			// reference type check  	// UKMedical Method.	
//		us.emergencyServices();		// reference type check 	// UKMedical Method.		
//		us.gyncServices();			// reference type check 	// IndianMedical Method.	
//		us.neuroServices();			// reference type check 	// IndianMedical Method.	
//		us.oncologyServices();		// reference type check 	// IndianMedical Method.	
//		us.emergencyServices();		// reference type check 	// IndianMedical Method.	
//		us.pathologyServices();		// reference type check		// FortisHospital Method.	
//		us.medicalInsurance();		// reference type check		// FortisHospital Method.	
		
		System.out.println("--------------------------------------------------------------");
		
// 		Down Casting - is strictly not allowed (down casting is allowed at compile time but at run time error appears)
//		FortisHospital fh1 = new USMedical(); // Error: Unresolved compilation problems: 
		
	}

}
