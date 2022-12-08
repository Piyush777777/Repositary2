/**
 * @author Engineering with piyush
 *
 */
public class Exception_throw {
	public static void main(String args[]) {
		try {
		int a = 10/0;
		}
		catch(ArithmeticException e) {
		 throw new ArithmeticException("/ by zero");
		  
		}
	}
}
