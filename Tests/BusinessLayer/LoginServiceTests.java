package BusinessLayer;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class LoginServiceTests {

    LoginService lc = LoginService.getLoginService();
   
    		
	
	@Test
	public void testLoginServiceThrowsDoctorDoesNotExist()  {
		try {
			Doctor doctor = lc.Login("batman","123456","125458653");
			System.out.println(doctor);
			fail();	
		} catch (Exception e) {
			assertEquals("This doctor does not exist in the system!",e.getMessage());
		}
	}

}
