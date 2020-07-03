package BusinessLayer;

//import DataLayer.DataBase;

public class LoginService {
	private static LoginService loginService;
	//private DataBase dataBase;
	
	private LoginService() {
		
	}
	
	public static LoginService getLoginService() {
		if(loginService==null) {
			loginService=new LoginService();
		}
		
		return loginService;
	}
	/*public boolean Login(String Username,String Password,String id) {
		dataBase=DataBase.getDataBase();
		boolean doesDoctorExist=dataBase.ValidateDoctor(Username,Password,id);
		if(doesDoctorExist) {
			return true;
		}
		return false;
		
	}*/
	
	

}
