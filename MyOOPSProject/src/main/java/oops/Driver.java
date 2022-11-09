package oops;

public class Driver extends Vivo {
	public static void main(String args[]) {
		Driver d = new Driver();
		System.out.println(d.Battery() + "Battery of Parent class");
		// child1 -> methods
		System.out.println();
		System.out.println(d.IPhone_battery() + " Battery of IPhone child1");
		System.out.println(d.megaPixel_IPhone() + " megapixel  of IPhone child1");
		System.out.println();
		// child2 -> methods
		System.out.println(d.One_Plus_MAH() + " Battery of One Plus child2");
		System.out.println(d.Oneplus_megaPixel() + " megapixel  of One Plus child2");
		System.out.println();
		// child3 -> methods
		System.out.println(d.Vivo_MAH() + " Battery of Vivo child3");
		System.out.println(d.Vivo_megaPixel() + " megapixel  of Vivo child3");

	}
}
