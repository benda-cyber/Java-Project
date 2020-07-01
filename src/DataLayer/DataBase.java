package DataLayer;


public class DataBase {
	private static DataBase dataBase;
	
	private DataBase() {
		
	}
	public static DataBase getDataBase() {
		if(dataBase==null) {
			dataBase=new DataBase();
		}
		return dataBase;
	}
	public boolean ValidateDoctor(String Username,String Password,String id) {
		
	}
	public boolean RegisterDoctor(String firstName,String lastName,int age,String id,String username,
			String password,String medicalSpecialty,String medicalLicense,
			String hospitalName,int yearsOfExperience) {
		
		
		
		
	}
	
	


}
