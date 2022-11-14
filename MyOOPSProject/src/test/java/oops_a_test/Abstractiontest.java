package oops_a_test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import oopsabstraction.Driver_a;

public class Abstractiontest {
	@Test
	public void abs_test() {
		Driver_a obj = new Driver_a();
		String silk_test = obj.Silk();
		assertEquals("I am Silk", silk_test);
		int silk_test1 = obj.Cost_of_Silk();
		assertEquals(50, silk_test1);

	}
}
