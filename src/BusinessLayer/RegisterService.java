package BusinessLayer;

import java.io.IOException;

import DataLayer.DataBase;

public class RegisterService {
	private static RegisterService registerService;
	private DataBase dataBase;
	
	private RegisterService() {
		
		
	}
	//using design pattern of singleton
	public static RegisterService getRegisterService() {
		if(registerService==null) {
			registerService=new RegisterService();
		}
		return registerService;
	}
	//going to data base to add all the doctor details and complete the registration
	public void Register(String firstName,String lastName,int age,String id,String username,
			String password,String medicalSpecialty,String medicalLicense,
			String hospitalName,int yearsOfExperience)throws IOException,ClassNotFoundException,Exception {
		dataBase=DataBase.getDataBase();
		dataBase.RegisterDoctor(firstName,lastName,age,id,username,
				password,medicalSpecialty,medicalLicense,
				hospitalName,yearsOfExperience);
		
	}

}
