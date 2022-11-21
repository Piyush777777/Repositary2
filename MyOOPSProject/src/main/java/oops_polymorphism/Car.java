package oops_polymorphism;

/**
 * 
 * @author Engineering ki baatein Polymorphism: one object taking many forms is
 *         what we called polymorphism
 * 
 *         Example of Run time polymorphism
 *
 */
public class Car {
	public void Engine(String Engine_Type, int horsepower) {
      System.out.println("Type of a Engine "+Engine_Type);
      System.out.println("Horsepower of a Engine "+horsepower);
	}
	public String Break_type(String Type) {
		return Type;
	}
	public String Car_Type(String  car_type) {
		return car_type;
	}
}

