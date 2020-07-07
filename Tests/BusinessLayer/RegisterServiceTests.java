package BusinessLayer;

import static org.junit.Assert.*;

import org.junit.Test;

public class RegisterServiceTests {

RegisterService rs = RegisterService.getRegisterService();
   
    		
	
	@Test//(expected = Exception.class)
	public void testRegisterServiceThrowsIllegalArgException()  {
		
		try {
		rs.Register("david", "B", 25, "f", "das", "dsa", null, null, "d", 10);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
