package keyword_static;

public class Outer {

	private static String msg = "static msg from outer class";

	public static class NestedStaticClass {

		public void printMessage() {

			System.out.println("Message from nested static class: " + msg);
		}
	}

	public static void main(String args[]) {
		Outer.NestedStaticClass obj = new Outer.NestedStaticClass();
		obj.printMessage();
	}
}
