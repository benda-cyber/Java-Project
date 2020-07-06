package BusinessLayer;

public class LoginController extends DataValidation {
	private static LoginController loginController;
	private LoginService loginService;
	
	private LoginController() {
		
		
	}
	public static LoginController getLoginController() {
		if (loginController==null) {
			loginController=new LoginController();
		}
		return loginController;
	}
	
			
public Doctor Login(String Username,String Password,String id) throws IllegalArgumentException,Exception {
	
		if(loginController.isIdValid(id)==false) {
			throw new IllegalArgumentException("Invalid id! id should contain exactly 9 numbers without letters or spaces");
		}
		if(loginController.isUsernameValid(Username)==false) {
			throw new IllegalArgumentException("Invalid Username! username should contain 4-10 letters without numbers or spaces");
		}
		if(loginController.isPasswordValid(Password)==false) {
			throw new IllegalArgumentException("Invalid Password! password should contain 6-20 letters or numbers without spaces");
			
		}
		loginService=LoginService.getLoginService();
		Doctor doctor=loginService.Login(Username,Password,id);
		return doctor;
		
		
	}
}


