package BusinessLayer;

import java.io.IOException;

public class RegisterController extends DataValidation {
	private static RegisterController registerController;
	private RegisterService registerService;
	 
	
	private RegisterController() {
		
		
	}
	public static RegisterController getRegisterController() {
		if(registerController==null) {
			registerController=new RegisterController();
		}
		return registerController;
	}
	public void Register(String firstName,String lastName,int age,String id,String username,
			String password,String medicalSpecialty,String medicalLicense,
			String hospitalName,int yearsOfExperience) throws IllegalArgumentException,IOException,ClassNotFoundException,Exception {
		
	
		if(registerController.isNameValid(firstName)==false || registerController.isNameValid(lastName)==false) {
			throw new IllegalArgumentException("First name or last name should not contain numbers or spaces!");	
		}
		if(registerController.isIdValid(id)==false) {
			throw new IllegalArgumentException("Invalid id! id should contain exactly 9 numbers without letters or spaces");
		}
		if(registerController.isUsernameValid(username)==false) {
			throw new IllegalArgumentException("Invalid Username! Username should contain 4-10 letters without numbers or spaces");
		}
		if(registerController.isPasswordValid(password)==false) {
			throw new IllegalArgumentException("Invalid Password! password should contain 6-20 letters without spaces");
		}
		if(registerController.isMedicalLicenseValid(medicalLicense)) {
			throw new IllegalArgumentException("Medical license should contain exactly 5 numbers without letters or spaces");
		}
		registerService=RegisterService.getRegisterService();
		
		registerService.Register(firstName,lastName,age,id,username,
			password,medicalSpecialty,medicalLicense,
			hospitalName,yearsOfExperience);
		
		
		
		
	}
}



