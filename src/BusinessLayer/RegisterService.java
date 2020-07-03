package BusinessLayer;

import java.io.IOException;

import DataLayer.DataBase;

public class RegisterService {
	private static RegisterService registerService;
	private DataBase dataBase;
	
	private RegisterService() {
		
		
	}
	
	public static RegisterService getRegisterService() {
		if(registerService==null) {
			registerService=new RegisterService();
		}
		return registerService;
	}
	
	public void Register(String firstName,String lastName,int age,String id,String username,
			String password,String medicalSpecialty,String medicalLicense,
			String hospitalName,int yearsOfExperience)throws IOException,ClassNotFoundException,Exception {
		dataBase=DataBase.getDataBase();
		dataBase.RegisterDoctor(firstName,lastName,age,id,username,
				password,medicalSpecialty,medicalLicense,
				hospitalName,yearsOfExperience);
		
	}

}
