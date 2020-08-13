package BusinessLayer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class LoginControllerTests {
	
	
		 //LoginController lcController;
	      LoginController lc = LoginController.getLoginController();
	      Doctor doctor;
	      
	      public void setUp() {
	    	  doctor=new Doctor();
	      }
		
   
	@Test
	public void testLoginControllerThrowsIllegalId()  {
		try {
			doctor = lc.Login("batman","123456","2315");
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals("Invalid id! id should contain exactly 9 numbers without letters or spaces",e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testLoginControllerThrowsIllegalPassword() {
		try {
			doctor = lc.Login("batman","12","125243652");
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals("Invalid Password! password should contain 6-20 letters or numbers without spaces",e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testLoginControllerThrowsIllegalUsername() {
		try {
			doctor = lc.Login("cool boy 52","123456","125243652");
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals("Invalid Username! username should contain 4-10 letters without numbers or spaces",e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
