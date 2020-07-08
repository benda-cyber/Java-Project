package DataLayer;

import java.io.IOException;
import java.util.HashSet;
import BusinessLayer.Doctor;
import BusinessLayer.Patient;




public class DataBase {
	private static DataBase dataBase;
	private HashSet<Doctor> doctors;
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
	
	
	
	public void RegisterDoctor(String firstName,String lastName,int age,String id,String username,
			String password,String medicalSpecialty,String medicalLicense,
			String hospitalName,int yearsOfExperience)throws IOException,ClassNotFoundException,Exception{
	
		fileManager=FileManager.getFileManager();
		if(fileManager.doesFileExist(FILENAME)==false) {
			fileManager.createFile(FILENAME);
		}
		if(fileManager.isFileEmpty(FILENAME)) {
			doctors=new HashSet<>();	
		}
		
		else {
		doctors=fileManager.readFile(FILENAME);
		for(Doctor doctor : doctors) {
			if(doctor.getId().equals(id)) {
				throw new Exception("Id already exists!");
			}
		}
		
		for(Doctor doctor : doctors) {
			if(doctor.getMedicalLicense().equals(medicalLicense)) { 
			throw new Exception("Medical license already exists!");
		}
	}
				
		for(Doctor doctor : doctors) {
			if(doctor.getUserName().equals(username)) {
			throw new Exception("Username already exists!");
		}
	}
	
		
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
				            .patients(new HashSet<Patient>())
				            .build();
		
		doctors.add(doctor);
		fileManager.writeFile(FILENAME,doctors);
		
	}		
	
	
	
	public Doctor Validate_And_Find_Doctor(String username,String password,String id)throws Exception {
		
		fileManager=FileManager.getFileManager();
		if(fileManager.doesFileExist(FILENAME)==false || fileManager.isFileEmpty(FILENAME)) {
			throw new Exception("This doctor does not exist in the system");	
		}
		doctors=fileManager.readFile(FILENAME);
		for(Doctor doctor:doctors) {
			if(doctor.getUserName().equals(username) && doctor.getPassword().equals(password) &&
					doctor.getId().equals(id)) {
				return doctor;
			}
		}
		throw new Exception("This doctor does not exist in the system");
	}
	
	
	public void addPatient(Doctor doctor,String firstName,String lastName,String id,String diseaseName,String MedicalState,
				String Medicines,String sideEffects,String symptoms,String historicalTreatments,String CoronaVirusStatus,
				String NotesFromDoctor,String patientCity,String patientStreet,int streetNumber,int age)
						throws IOException,ClassNotFoundException,Exception {
		fileManager=FileManager.getFileManager();
		//doctors=fileManager.readFile(FILENAME); 
			if(doctors.contains(new Doctor(id))) {
				throw new Exception("One of the doctors already have this id!");
			}
			for(Doctor d:doctors) {
				if(d.getPatients().contains(new Patient(id))) {
					throw new Exception("This patient already exists!");
				}
			}
		
		Patient patient=Patient.builder()
				               .firstName(firstName)
				               .lastName(lastName)
				               .id(id)
				               .diseaseName(diseaseName)
				               .MedicalState(MedicalState)
				               .Medicines(Medicines)
				               .sideEffects(sideEffects)
				               .symptoms(symptoms)
				               .historicalTreatments(historicalTreatments)
				               .CoronaVirusStatus(CoronaVirusStatus)
				               .NotesFromDoctor(NotesFromDoctor)
				               .patientCity(patientCity)
				               .patientStreet(patientStreet)
				               .streetNumber(streetNumber)
				               .age(age)
				               .build();
		
		doctor.getPatients().add(patient);
		/*for(Doctor d:doctors) {
			if(d.getId().equals(doctor.getId())) {
				d.setPatients(doctor.getPatients());
				break;
			}	
		}*/
		fileManager.writeFile(FILENAME,doctors);			
	}
	
	public Patient findPatient(Doctor doctor,String id)throws IOException,ClassNotFoundException,Exception {
		if(doctor.getPatients().isEmpty()) {
			throw new Exception("There are no patients!");
		}
		if(doctor.getPatients().contains(new Patient(id))==false) {
			throw new Exception("This patient does not exist!");
		}
		for(Patient patient:doctor.getPatients()) {
			if(patient.getId().equals(id)) {
				return patient;
			}
		}
		return null;
	}
	
	public void Update_Patient_Field(Patient patient,String selectedField,String updatedField)
			throws IOException,ClassNotFoundException,Exception {
		fileManager=FileManager.getFileManager();
		
		if(selectedField.equalsIgnoreCase("Corona virus status")) {
			patient.setCoronaVirusStatus(updatedField);
		}
		else if(selectedField.equalsIgnoreCase("Disease name")) {
			patient.setDiseaseName(updatedField);
		}
		else if(selectedField.equalsIgnoreCase("Medical state")) {
			patient.setMedicalState(updatedField);
		}
		else if(selectedField.equalsIgnoreCase("Medicines")) {
			patient.setMedicines(updatedField);
		}
		else if(selectedField.equalsIgnoreCase("Notes from doctor")) {
			patient.setNotesFromDoctor(updatedField);
		}
		else if(selectedField.equalsIgnoreCase("Side effects")){
			patient.setSideEffects(updatedField);
		}
		else {
			patient.setSymptoms(updatedField);
		}
		fileManager.writeFile(FILENAME, doctors);
			
		}
	
	public void deletePatient(Doctor doctor,Patient patient)throws IOException,ClassNotFoundException,Exception {
		fileManager=FileManager.getFileManager();
		doctor.getPatients().remove(patient);
		fileManager.writeFile(FILENAME, doctors);
	}
	public void removeDoctor(Doctor doctor)throws IOException,ClassNotFoundException,Exception {
		fileManager=FileManager.getFileManager();
		doctors.remove(doctor);
		fileManager.writeFile(FILENAME, doctors);
		
	}
	
		
}


				
	


		
		
			
	

	

	
	



