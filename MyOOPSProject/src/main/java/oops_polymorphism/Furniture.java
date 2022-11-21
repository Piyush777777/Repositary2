package oops_polymorphism;

/**
 * @author Engineering ki baatein Polymorphism: one object taking many forms is
 *         what we called polymorphism
 * 
 *         Example of Compile time polymorphism
 */
public class Furniture {
	public void Type_of_furniture(int cost) {
		System.out.println("Cost of the furniture " + cost);
		System.out.println("Name Of Furniture Chair");
	}

	public void Type_of_furniture(int cost, String name) {
		System.out.println("Cost Of Furniture " + cost);
		System.out.println("Name Of Furniture " + name);
	}

	public void Type_of_furniture(int cost, String name, String Quality) {
		System.out.println("Cost Of Furniture " + cost);
		System.out.println("Name Of Furniture " + name);
		System.out.println("Quality Of furniture " + Quality);
	}

	public String Type_Of_furniture() {
		return "Set";
	}

	public static void main(String args[]) {
		Furniture f = new Furniture();
		f.Type_of_furniture(1000);
		f.Type_of_furniture(3000, "Table");
		f.Type_of_furniture(10000, "Sofa", "Good");
		System.out.println(f.Type_Of_furniture());
	}

}
