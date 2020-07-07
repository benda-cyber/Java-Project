package BusinessLayer;

import static org.junit.Assert.*;

import org.junit.Test;

public class PatientServiceTests {

PatientService ps = PatientService.getPatientService();
   
    		
	
	@Test
	public void testPatientServiceAddsNewPatient()  {
		Doctor doctor;
		doctor = new Doctor();
		try {
			ps.Add(doctor, "gg", "ff", "ds", "flu", "f", "asd,das", "headAche", "sym", "dsadsa", "status", "", "", null, 12, 55);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
