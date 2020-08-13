package BusinessLayer;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class PatientServiceTests {

PatientService ps = PatientService.getPatientService();
LoginService ls=LoginService.getLoginService();
   
    		
	
	@Test
	public void testAddPatientThrowsDoctorId()  {
		
		try {
			Doctor doctor =ls.Login("eitany","123456","315074864");
			ps.Add(doctor, "mark", "tzuker", "315074864", "flu", "f", "good", "headAche", "sym", "dsadsa", "negative", "none", "tel aviv","em amoshavot", 12, 55);
			fail();
	
		} catch (Exception e) {
			assertEquals("One of the doctors already have this id!",e.getMessage());
		}
	}
	
	@Test
	public void testAddPatientThrowsPatientAlreadyExists() {
		
		try {
			Doctor doctor =ls.Login("eitany","123456","315074864");
			ps.Add(doctor, "mark", "tzuker", "111111111", "flu", "f", "good", "headAche", "sym", "dsadsa", "negative", "none", "tel aviv","em amoshavot", 12, 55);
		fail();
		} catch (Exception e) {
			assertEquals("This patient already exists!",e.getMessage());
		}	
	}

}
