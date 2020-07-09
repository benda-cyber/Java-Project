package BusinessLayer;

import java.io.IOException;

public class RegisterController extends DataValidation {
	private static RegisterController registerController;
	private RegisterService registerService;
	 
	
	private RegisterController() {
		
		
	}
	//using design pattern of singleton
	public static RegisterController getRegisterController() {
		if(registerController==null) {
			registerController=new RegisterController();
		}
		return registerController;
	}
	//doing validation to the input before the registration of the doctor
	public void Register(String firstName,String lastName,int age,String id,String username,
			String password,String medicalSpecialty,String medicalLicense,
			String hospitalName,int yearsOfExperience) throws IllegalArgumentException,IOException,ClassNotFoundException,Exception {
		//if first name or last name contains numbers or spaces then they are not valid
		if(registerController.isNameValid(firstName)==false || registerController.isNameValid(lastName)==false) {
			throw new IllegalArgumentException("First name or last name should not contain numbers or spaces!");	
		}//if the id does not contain exactly 9 numbers then it is not valid
		if(registerController.isIdValid(id)==false) {
			throw new IllegalArgumentException("Invalid id! id should contain exactly 9 numbers without letters or spaces");
		}
		//if the username contains spaces or numbers or has less than 4 letters or more than 10 letters than it is not valid
		if(registerController.isUsernameValid(username)==false) {
			throw new IllegalArgumentException("Invalid Username! Username should contain 4-10 letters without numbers or spaces");
		}
		//if the size of the password is less than 6 or more than 20 or contains spaces then it is not valid
		if(registerController.isPasswordValid(password)==false) {
			throw new IllegalArgumentException("Invalid Password! password should contain 6-20 letters or numbers without spaces");
		}
		//if medical license does not have exactly 5 numbers then it is not valid
		if(registerController.isMedicalLicenseValid(medicalLicense)==false) {
			throw new IllegalArgumentException("Medical license should contain exactly 5 numbers without letters or spaces");
		}
		//if hospital name or medical specialty contain numbers then they are not valid
		if(registerController.is_Hospital_Or_Specialty_Valid(hospitalName)==false 
				|| registerController.is_Hospital_Or_Specialty_Valid(medicalSpecialty)==false) {
			throw new IllegalArgumentException("Medical Specialty or hospital name should not contain numbers!");
		}
		//if we came to this part,it means that all the input is valid and we can continue the registration process
		registerService=RegisterService.getRegisterService();
		//going to register service to continue the registration
		registerService.Register(firstName,lastName,age,id,username,
			password,medicalSpecialty,medicalLicense,
			hospitalName,yearsOfExperience);
		
		
		
		
	}
}



