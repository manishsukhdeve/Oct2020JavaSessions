package ExceptionHanding;

public class FinallyBlock1 {

	public static void main(String[] args) {

		// Interview Question -
		
		System.out.println(getMarks("Tom"));
	}
	
	public static int getMarks(String name) {
		if (name.equals("Sonam")) {
			return 90;
		}
		else if (name.equals("Tom")) {
			try {
				int i = 9/0;
				return 45;
			}
			catch (Exception e){
				//e.printStackTrace();
				return 50;
			}
			finally {
				System.out.println("Inside finally block");
				return 10;	
			}
			
		}
		else if (name.equals("Manish")) {
			return 95;
		}
		
		return -1;
	}
	
}
