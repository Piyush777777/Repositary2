package oops_polymorphism;

public class RunTime_PolyDriver {
	public static void main(String args[]) {
            Car car = new Engine_Info();
            car.Engine("Hybrid engine", 600);
            Car car1 = new Breaks_description();
            System.out.println(car1.Break_type("ABS"));
            Car car2 = new Car();
            System.out.println(car2.Car_Type("Sedan"));
            car2.Engine("Electric Engine", 300);
	}
}
