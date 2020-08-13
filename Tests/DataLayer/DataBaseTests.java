package DataLayer;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;

import BusinessLayer.Doctor;
import BusinessLayer.Patient;

public class DataBaseTests {

DataBase db = DataBase.getDataBase();
Doctor doctor;

@Before
public void setUp() {
	doctor=new Doctor();
	
}
  
	@Test
	public void testFindPatientThrowsPatientDoesNotExist()  {
		doctor.setPatients(new HashSet<Patient>());
		doctor.getPatients().add(new Patient());
		Patient patient;
		try {
			patient = db.findPatient(doctor, "152458675");
			System.out.println(patient);
			fail();
		} catch (Exception e) {
			assertEquals("This patient does not exist!",e.getMessage());

		}
	}
	
	@Test
	public void testDoesDoctorHavePatientsThrowsNoPatients() {
		try {
			doctor.setPatients(new HashSet<Patient>());
			db.Does_Doctor_Have_Patients(doctor);
			fail();
		} catch (Exception e) {
			assertEquals("There are no patients!",e.getMessage());

		}
	}

}
