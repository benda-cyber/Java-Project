package DataLayer;

import static org.junit.Assert.*;

import org.junit.Test;

import BusinessLayer.Doctor;
import BusinessLayer.Patient;
import BusinessLayer.PatientService;

public class DataBaseTests {

DataBase db = DataBase.getDataBase();
   
    		
	
	@Test
	public void testRegisterDoctor()  {
	
		try {
			db.RegisterDoctor("gg", "ff", 22, "flu", "f", "asd,das", "headAche", "sym", "dsadsa", 55);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	@Test
	public void testValidateAndFindDoctor()  {
		Doctor doctor;
		//doctor = new Doctor();
		try {
			doctor = db.Validate_And_Find_Doctor("gg", "ff", "ggg");
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void testAddPatient()  {
		Doctor doctor;
		doctor = new Doctor();
		try {
			db.addPatient(doctor, "dsa", "dsa", "222", "flu", "sick", "medicine", "ha", "sym", "", "", "", "", "", 5, 5);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void testViewPatientData()  {
		Doctor doctor;
		doctor = new Doctor();
		Patient patient;
		
		try {
			patient = db.viewPatientData(doctor, "123");
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
