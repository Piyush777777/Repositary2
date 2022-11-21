package oops_polymorphism;
//
public class Engine_Info extends Car {
	@Override
	public void Engine(String Engine_Type, int horsepower) {
	      System.out.println("Type of a Engine "+Engine_Type);
	      System.out.println("Horsepower of a Engine "+horsepower);
	      System.out.println("Max RPM 600");
		}
}
