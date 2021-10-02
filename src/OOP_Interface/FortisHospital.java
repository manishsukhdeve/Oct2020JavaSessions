package OOP_Interface;

public class FortisHospital extends MedicalAssociation implements USMedical, UKMedical, IndianMedical {

//	Implement for class to interface.
//	Extends for class to class.

	
// 	USMedical - 
	
	@Override
	public void orthoServices() {
		System.out.println("FH --> orthoServices");
	}

	@Override
	public void physioServices() {
		System.out.println("FH --> physioServices");
		
	}

	@Override
	public void cardioServices() {
		System.out.println("FH --> cardioServices");
		
	}

	@Override
	public void totalDoctors(int count) {
		System.out.println("FH --> Doctors Count " + count);
	}
	
//	@Override	// static method can not be overridden. 
//	public static void hospitalAdmin() {
//		System.out.println("FH --> hospitalAdmin");
//	}
	
//---------------------------------------------------------------------------
	
// 	UKMedical -
	
	@Override
	public void pediaServices() {
		System.out.println("FH --> pediaServices");
		
	}

	@Override
	public void ENTServices() {
		System.out.println("FH --> ENTServices");
		
	}

	@Override
	public void emergencyServices() {
		System.out.println("FH --> emergencyServices");

	}

//---------------------------------------------------------------------------
	
// 	Indian Medical - 
	
	@Override
	public void gyncServices() {
		System.out.println("FH --> gyncServices");
		
	}

	@Override
	public void neuroServices() {
		System.out.println("FH --> neuroServices");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH --> oncologyServices");
		
	}
	
//---------------------------------------------------------------------------
	
// 	Fortis Hospital own Methods -
	
	public void pathologyServices() {
		System.out.println("FH --> pathologyServices");

	}
	
	public void medicalInsurance() {
		System.out.println("FH --> medicalInsurance");

	}
	
	@Override
	public void billing() {						// default keyword is not allowed in classes, default keyword allowed in interfaces. 
		System.out.println("FH --> Billing");
	}

//---------------------------------------------------------------------------
	
// 	WHO
	
	@Override
	public void covidTest() {
		System.out.println("FH --> Covid 19 Test");		
	}

//---------------------------------------------------------------------------
	
// 	UN
	
	@Override
	public void unisco() {
		System.out.println("FH --> Unisco");
	}

//	@Override
//	public void medicalTraining() {
//		System.out.println("FH --> MedicalAssociation --> medicalTraining");
//	}
	
//	@Override
//	public void medicalResearch() {
//		System.out.println("FH --> Medical Org --> medicalResearch");
//	}
	
	
}
