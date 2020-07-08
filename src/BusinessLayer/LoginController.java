package BusinessLayer;

public class LoginController extends DataValidation {
	private static LoginController loginController;
	private LoginService loginService;
	
	private LoginController() {
		
		
	}
	//using design pattern of singleton
	public static LoginController getLoginController() {
		if (loginController==null) {
			loginController=new LoginController();
		}
		return loginController;
	}
	
			
public Doctor Login(String Username,String Password,String id) throws IllegalArgumentException,Exception {
	//if the id has more than 9 numbers or less than 9 numbers or contains letters or spaces then it is not valid
		if(loginController.isIdValid(id)==false) {
			throw new IllegalArgumentException("Invalid id! id should contain exactly 9 numbers without letters or spaces");
		}
		//if the username has more than 10 letters or less than 4 letters or spaces or numbers than it is not valid
		if(loginController.isUsernameValid(Username)==false) {
			throw new IllegalArgumentException("Invalid Username! username should contain 4-10 letters without numbers or spaces");
		}
		//if the size of the password is less than 6 or more than 20 then it is not valid
		if(loginController.isPasswordValid(Password)==false) {
			throw new IllegalArgumentException("Invalid Password! password should contain 6-20 letters or numbers without spaces");
			
		}
		//if we came to this part it means that the input of the doctor is valid and we can continue the pcrocess
		loginService=LoginService.getLoginService();
		Doctor doctor=loginService.Login(Username,Password,id);
		return doctor;
		
		
	}
}


