package BusinessLayer;

import DataLayer.DataBase;

public class LoginService {
	private static LoginService loginService;
	private DataBase dataBase;
	
	private LoginService() {
		
	}
	
	public static LoginService getLoginService() {
		if(loginService==null) {
			loginService=new LoginService();
		}
		
		return loginService;
	}
	public Doctor Login(String Username,String Password,String id)throws Exception {
		dataBase=DataBase.getDataBase();
		Doctor doctor=dataBase.Validate_And_Find_Doctor(Username,Password,id);
		return doctor;
		
		
	}
	
	

}
