package oops_Encapsulation;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class oops_E_test {
	@Test
	public void Encapsulation_Test() {
		Student s = new Student();
		s.setRoll_no(1);
		int r_no = s.getRoll_no();
		assertEquals(1, r_no);
		s.setName("Harshad");
		String name_test = s.getName();
		assertEquals("Harshad", name_test);
		s.setClass_Of_student("Section A");
		String Section_test = s.getClass_Of_student();
		assertEquals("Section A", Section_test);

	}
}
