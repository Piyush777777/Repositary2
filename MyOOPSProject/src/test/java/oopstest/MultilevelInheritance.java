package oopstest;



import static org.junit.Assert.assertEquals;

import org.junit.Test;

import oops.Driver;

public class MultilevelInheritance {
    @Test
    public void answer_check() {
    	Driver d = new Driver();
    	String iPhone_Bat = d.IPhone_battery();
    	assertEquals(iPhone_Bat,"4000");
    	
    	String OnePlus_Bat = d.One_Plus_MAH();
    	assertEquals(OnePlus_Bat,"5000");

    	String Vivo_Bat = d.Vivo_MAH();
    	assertEquals(Vivo_Bat,"6000");
    	
    	

    
    }
}
