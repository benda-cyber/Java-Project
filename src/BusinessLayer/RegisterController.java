package BusinessLayer;

public class RegisterController extends DataValidation {
	private static RegisterController registerController;
	private RegisterService registerService;
	 
	
	private RegisterController() {
		RegisterService registerService=RegisterService.getRegisterService();
		
	}
	public static RegisterController getRegisterController() {
		if(registerController==null) {
			registerController=new RegisterController();
			
		}
		return registerController;
	}
	public boolean Register(String firstName,String lastName,int age,String id,String username,
			String password,String medicalSpecialty,String medicalLicense,
			String hospitalName,int yearsOfExperience) throws IllegalArgumentException {
		
	
		if(registerController.isNameValid(firstName)==false || registerController.isNameValid(lastName)==false) {
			throw new IllegalArgumentException("First name or last name should not contain numbers or spaces!");	
		}
		if(registerController.isIdValid(id)==false) {
			throw new IllegalArgumentException("Wrong id!");
		}
		if(registerController.isUsernameValid(username)==false) {
			throw new IllegalArgumentException("Invalid Username! the Username should contain 4-10 letters without numbers or spaces");
		}
		if(registerController.isPasswordValid(password)==false) {
			throw new IllegalArgumentException("Invalid Password! the password should contain 6-20 letters without spaces");
		}
		if(registerController.isMedicalLicenseValid(medicalLicense)) {
			throw new IllegalArgumentException("Medical license should contain 5-10 numbers without letters or spaces");
		}
		
		boolean isRegistrationSucceeded=Register(firstName,lastName,age,id,username,
			password,medicalSpecialty,medicalLicense,
			hospitalName,yearsOfExperience);
		
		
		
		
	}
}



