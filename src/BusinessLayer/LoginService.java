package BusinessLayer;

import DataLayer.DataBase;

public class LoginService {
	private static LoginService loginService;
	private DataBase dataBase;
	
	private LoginService() {
		
	}
	//using design pattern of singleton
	public static LoginService getLoginService() {
		if(loginService==null) {
			loginService=new LoginService();
		}
		
		return loginService;
	}
	//going to data base to check if this doctor exists in the system
	public Doctor Login(String Username,String Password,String id)throws Exception {
		dataBase=DataBase.getDataBase();
		Doctor doctor=dataBase.Validate_And_Find_Doctor(Username,Password,id);
		return doctor;
		
		
	}
	
	

}
