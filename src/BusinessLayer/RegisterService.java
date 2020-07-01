package BusinessLayer;

import DataLayer.DataBase;

public class RegisterService {
	private static RegisterService registerService;
	private DataBase dataBase;
	private RegisterService() {
		dataBase=DataBase.getDataBase();
		
	}
	
	public static RegisterService getRegisterService() {
		if(registerService==null) {
			registerService=new RegisterService();
		}
		return registerService;
	}
	
	public boolean Register(String firstName,String lastName,int age,String id,String username,
			String password,String medicalSpecialty,String medicalLicense,
			String hospitalName,int yearsOfExperience) {
		boolean isRegistrationSucceeded=dataBase.RegisterDoctor(firstName,lastName,age,id,username,
				password,medicalSpecialty,medicalLicense,
				hospitalName,yearsOfExperience);
		
	}

}
