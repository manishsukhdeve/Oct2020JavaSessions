package ExceptionHanding;

public class ThrowKeyword {

	public static void main(String[] args) {
		
		// Sometimes we can create Exception object explicitly and we can hand over to the JVM manually by using throw keyword.

		try {
			throw new Exception("Excel cell data is blank exception");
		}
		catch (Exception e) {
			System.out.println("Some exceptino is coming...");
			e.printStackTrace();
		}
		

	}

}
