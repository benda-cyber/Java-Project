package BusinessLayer;

import static org.junit.Assert.*;

import org.junit.Test;

public class LoginServiceTests {

    LoginService lc = LoginService.getLoginService();
   
    		
	
	@Test//(expected = Exception.class)
	public void testLoginServiceThrowsIllegalArgException()  {
		Doctor doctor1;
		try {
			doctor1 = lc.Login(null, null, null);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
