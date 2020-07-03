package BusinessLayer;

public class LoginController extends DataValidation {
	private static LoginController loginController;
	//private LoginService loginService;
	
	private LoginController() {
		
		
	}
	public static LoginController getLoginController() {
		if (loginController==null) {
			loginController=new LoginController();
		}
		return loginController;
	}
	
			
/*public boolean Login(String Username,String Password,String id) throws IllegalArgumentException {
	
		if(Username==null||Username==""||Password==null||Password==""||id==null||id=="") {
			throw new IllegalArgumentException("You have to fill all the empty fields!");
		}
		if(loginController.isIdValid(id)==false) {
			throw new IllegalArgumentException("Wrong id!");
		}
		if(loginController.isUsernameValid(Username)==false) {
			throw new IllegalArgumentException("Invalid Username! the Username should contain 4-10 letters without numbers or spaces");
		}
		if(loginController.isPasswordValid(Password)==false) {
			throw new IllegalArgumentException("Invalid Password! the password should contain 6-20 letters without spaces");
			
		}
		loginService=LoginService.getLoginService();
		boolean doesAccountExist=loginService.Login(Username,Password,id);
		if(doesAccountExist) {
			return true;
		}
		return false;
		
		
	}*/
}


