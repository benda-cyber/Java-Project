package BusinessLayer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MedicalStaffMemberTests {

	MedicalStaffMember msm1;
	
	
	@Before
	public void setUp() {
		System.out.println("SetUp");
		msm1 = new MedicalStaffMember();
		
	}
	
	
	@Test
	public void testMedicalStaffMemberHasLicense() {
		msm1.setMedicalLicense("medicalLicense");
		
		assertNotNull(msm1.getMedicalLicense());;
	}

}
