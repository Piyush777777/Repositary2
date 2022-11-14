package oops_Encapsulation;
/*
 * @author EKB
 *   Encapsulation : Biding of data together to achieve data hiding , data flexibility , Code reusability , Testing
 * 
 * */
public class Student {
	int roll_no;
	String name;
	String class_Of_student;
    
	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClass_Of_student() {
		return class_Of_student;
	}

	public void setClass_Of_student(String class_Of_student) {
		this.class_Of_student = class_Of_student;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.setRoll_no(1);
		System.out.println(s.getRoll_no());
		s.setName("Pavan");
		System.out.println(s.getName());
		s.setClass_Of_student("Section A");
		System.out.println(s.getClass_Of_student());
		

	}

}
