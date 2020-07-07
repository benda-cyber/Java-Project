package BusinessLayer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DoctorTests {

	Doctor doctor1;
	
	@Before
	public void setUp() {
		System.out.println("SetUp");
		doctor1 = new Doctor();
		
	}
	
	
	@Test
	public void testDoctorHasUserName() {
		doctor1.setUserName("Dr.Moshe");
		String expected = "Dr.Moshe";
		assertSame("Dr.Moshe", expected, doctor1.getUserName());
	}

}
