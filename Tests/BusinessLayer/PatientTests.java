package BusinessLayer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PatientTests {

	
	Patient patient;
	
	@Before
	public void setUp() {
		System.out.println("SetUp");
		patient = new Patient();
		
	}
	
	
	
	@Test
	public void testCoronaVirusStatusHasCorona() {
		patient.setCoronaVirusStatus("has corona");
		String expected = "has corona";
		assertSame("has corona", expected, patient.getCoronaVirusStatus());
	}
	
	@Test
	public void testNotesFromDoctor() {
		patient.setNotesFromDoctor("stay safe");
		String expected = "stay safe";
		assertSame("stay safe", expected, patient.getNotesFromDoctor());
	}
	
	@Test
	public void testSideEffectsHeadAche() {
		patient.setSideEffects("headache");
		String expected = "headache";
		assertSame("headache", expected, patient.getSideEffects());
	}
	
	@Test
	public void testDiseaseNameFlu() {
		patient.setDiseaseName("flu");
		String expected = "flu";
		assertSame("flu", expected, patient.getDiseaseName());
	}
	
	
	

}
