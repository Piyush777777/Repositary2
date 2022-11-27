package keywork_super;

public class Triangle extends Shapes {
	String name = "Equilateral triangle";

	void calling_variables() {
		System.out.println("I am the triangle of super class: " + super.name);
		System.out.println("I am the triangle of  subclass: " + name);
	}

	public static void main(String args[]) {
		Triangle t = new Triangle();
		t.calling_variables();
	}
}
