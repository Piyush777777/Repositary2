/**
 * @author Engineering with piyush
 *
 */
public class Exception_handling {
	public static void main(String args[]) {
		try {
			int data = 30 / 0; 
			System.out.println("rest of the code"+data);
		}
		// handling the exception
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
