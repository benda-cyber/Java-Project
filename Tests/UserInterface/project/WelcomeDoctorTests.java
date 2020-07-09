package project;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import BusinessLayer.Doctor;
import UserInterface.WelcomeDoctor;

public class  WelcomeDoctorTests {

	
	WelcomeDoctor wd1;
	Doctor doctor1;
	Object obj1;
	
	@Before
	public void setUp() {
		System.out.println("SetUp");
		wd1 = new WelcomeDoctor();
		doctor1 = new Doctor();
		obj1 = new Object();
	}
	@Test 
	public void testAddPatient() throws ClassNotFoundException, IOException, Exception {
		try {
			
			wd1.addPatient(doctor1);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	@Test 
	public void testDeletePatient()  {
		try {
			
			wd1.deletePatient(doctor1);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	@Test 
	public void testUpdatePatientHealth() throws ClassNotFoundException, IOException, Exception {
		try {
			
			wd1.Update_Patient_Health_Condition(doctor1);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	@Test 
	public void testRegister() {
		try {
			
			wd1.Register();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	@Test 
	public void testRemoveAcc() {
		try {
			
			wd1.removeAccount(doctor1);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
	
	@Test 
	public void test() throws ClassNotFoundException, IOException, Exception {
		try {
			
			wd1.systemOperations(doctor1);
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

}
