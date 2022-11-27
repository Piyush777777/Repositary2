package keyword_this;

//his keyword refers to the current object in a method or constructor.
public class Doctor {

	String name = "Harshad";

	Doctor(String name_of_doctor) {
		this.name = name_of_doctor;
	}

	public static void main(String args[]) {
		Doctor d = new Doctor("Pavan");
		System.out.println(d.name);
	}
}
