package BusinessLayer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PatientTests {

	
	Patient patient1;
	
	@Before
	public void setUp() {
		System.out.println("SetUp");
		patient1 = new Patient();
		
	}
	
	
	
	@Test
	public void testCoronaVirusStatusHasCorona() {
		patient1.setCoronaVirusStatus("has corona");
		String expected = "has corona";
		assertSame("has corona", expected, patient1.getCoronaVirusStatus());
	}
	
	@Test
	public void testNotesFromDoctor() {
		patient1.setNotesFromDoctor("stay safe");
		String expected = "stay safe";
		assertSame("stay safe", expected, patient1.getNotesFromDoctor());
	}
	
	@Test
	public void testSideEffectsHeadAche() {
		patient1.setSideEffects("headache");
		String expected = "headache";
		assertSame("headache", expected, patient1.getSideEffects());
	}
	
	@Test
	public void testDiseaseNameFlu() {
		patient1.setDiseaseName("flu");
		String expected = "flu";
		assertSame("flu", expected, patient1.getDiseaseName());
	}
	
	
	

}
