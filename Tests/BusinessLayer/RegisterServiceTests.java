package BusinessLayer;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class RegisterServiceTests {

RegisterService rs = RegisterService.getRegisterService();
LoginService ls=LoginService.getLoginService();
   
    		
	
	@Test
	public void testRegisterThrowsIdAlreadyExists()  {
		
		try {
		rs.Register("david", "tzuker", 35, "111111111", "billi", "123456","heart surgery","12345", "belinson", 10);
		fail();
		} catch (Exception e) {
			assertEquals("Id already exists!",e.getMessage());
		}
	}

}
