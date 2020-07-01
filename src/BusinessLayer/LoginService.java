package BusinessLayer;

import DataLayer.DataBase;

public class LoginService {
	private static LoginService loginService;
	private DataBase dataBase;
	
	private LoginService() {
		dataBase=DataBase.getDataBase();
	}
	
	public static LoginService getLoginService() {
		if(loginService==null) {
			loginService=new LoginService();
		}
		return loginService;
	}
	public boolean Login(String Username,String Password,String id) {
		boolean doesDoctorExist=dataBase.ValidateDoctor(Username,Password,id);
		if(doesDoctorExist) {
			return true;
		}
		return false;
		
	}
	
	

}
