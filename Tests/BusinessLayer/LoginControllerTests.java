package BusinessLayer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LoginControllerTests {

      //LoginController lcController;
      LoginController lc = LoginController.getLoginController();
   
    
    		
	
	
	
	
	
	
	
	@Test(expected = Exception.class)
	public void testLoginControllerThrowsIllegalArgException()  {
		
		Doctor doctor1;
		//doctor1 = new Doctor();
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
