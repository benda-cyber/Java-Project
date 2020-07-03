package DataLayer;

import java.io.IOException;
import java.util.Set;

import BusinessLayer.Doctor;

public class DataBase {
	private static DataBase dataBase;
	private Set<Doctor> doctors;
	private FileManager fileManager;
	private final String FILENAME="Doctors.txt";
	
	private DataBase() {
		
	}
	public static DataBase getDataBase() {
		if(dataBase==null) {
			dataBase=new DataBase();
		}
		return dataBase;
	}
	
	@SuppressWarnings("unchecked")
	public void RegisterDoctor(String firstName,String lastName,int age,String id,String username,
			String password,String medicalSpecialty,String medicalLicense,
			String hospitalName,int yearsOfExperience)throws IOException,ClassNotFoundException,Exception{
	
		fileManager=FileManager.getFileManager();
		if(fileManager.doesFileExist(FILENAME)) {
			fileManager.createFile(FILENAME);
		}
		doctors=(Set<Doctor>)fileManager.readFile(FILENAME);
		if(doctors.contains(new Doctor(id))) {
			throw new Exception("Id already exists!");
		}
		if(doctors.contains(new Doctor(medicalLicense))) {
			throw new Exception("Medical license already exists!");
		}
		if (doctors.contains(new Doctor(username))){
			throw new Exception("Username already exists!");
		}
		Doctor doctor=Doctor.builder()
				            .firstName(firstName)
				            .lastName(lastName)
				            .age(age)
				            .id(id)
				            .username(username)
				            .password(password)
				            .MedicalLicense(medicalLicense)
				            .MedicalSpecialty(medicalSpecialty)
				            .HospitalName(hospitalName)
				            .yearsOfExperience(yearsOfExperience)
				            .build();
		doctors.add(doctor);
		fileManager.writeFile(FILENAME,doctors);
				            
		
		
		
		
		
		
		
				
		
		
		
			
	}
	
/*public boolean ValidateDoctor(String Username,String Password,String id) {
		
	}*/
	
	


}
