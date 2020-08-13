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
	//using design pattern of singleton
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
		//if the file does not exist then we will create a new file
		if(fileManager.doesFileExist(FILENAME)==false) {
			fileManager.createFile(FILENAME);
		}
		//if the file is empty then we will create a new data structure
		if(fileManager.isFileEmpty(FILENAME)) {
			doctors=new HashSet<>();	
		}
		
		else {//if the file exists and not empty then we will read the data from the file to Data Structure
		doctors=fileManager.readFile(FILENAME);
		//if the data base already has this id it meants that this doctor already exists in the system
		//because id is considered to be unique for each person
		for(Doctor doctor : doctors) {
			if(doctor.getId().equals(id)||doctor.getPatients().contains(new Patient(id))) {
				throw new Exception("Id already exists!");
			}
		}
		//if the data base already has this medical license it means that this doctor already exists in the system
		//because medical license is considered to be unique for each doctor
		for(Doctor doctor : doctors) {
			if(doctor.getMedicalLicense().equals(medicalLicense)) { 
			throw new Exception("Medical license already exists!");
		}
	}
		//if the data base already has this username then it is not valid 
		//because username is considered to be unique for each user
		for(Doctor doctor : doctors) {
			if(doctor.getUserName().equals(username)) {
			throw new Exception("Username already exists!");
		}
	}
		
		}	
		//if we came to this part it means that everything is valid and we can add this doctor to the system
		//using design pattern of building to build the doctor
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
		//add this doctor to data structure
		doctors.add(doctor);
		//write all the data from data structure to data base
		fileManager.writeFile(FILENAME,doctors);	
	}		
	
	//checking if this doctor exists in the system and find him
	public Doctor Validate_And_Find_Doctor(String username,String password,String id)
			throws IOException,ClassNotFoundException,Exception {
		
		fileManager=FileManager.getFileManager();
		//if the file does not exist or empty then there are no doctors in the system
		if(fileManager.doesFileExist(FILENAME)==false || fileManager.isFileEmpty(FILENAME)) {
			throw new Exception("This doctor does not exist in the system");	
		}
		//if the file exists and not empty then put all the data from the file to data structure
		doctors=fileManager.readFile(FILENAME);
		//finding the doctor who has the username,password and id of the input
		for(Doctor doctor:doctors) {
			if(doctor.getUserName().equals(username) && doctor.getPassword().equals(password) &&
					doctor.getId().equals(id)) {
				return doctor;
			}
		}
		//if we didn't find a doctor who has this username,password and id then this doctor does not exist in the system
		throw new Exception("This doctor does not exist in the system!");
	}
	
	public void addPatient(Doctor doctor,String firstName,String lastName,String id,String diseaseName,String MedicalState,
				String Medicines,String sideEffects,String symptoms,String historicalTreatments,String CoronaVirusStatus,
				String NotesFromDoctor,String patientCity,String patientStreet,int streetNumber,int age)
						throws IOException,Exception {
		fileManager=FileManager.getFileManager(); 
		//if one of the doctors has this id so it is not valid to add a new patient with this id
		//because id is considered to be unique for each person
			if(doctors.contains(new Doctor(id))) {
				throw new Exception("One of the doctors already have this id!");
			}
			//if one of the doctors' patients have this id so it is not valid to add a new patient with this id
			for(Doctor d:doctors) {
				if(d.getPatients().contains(new Patient(id))) {
					throw new Exception("This patient already exists!");
				}
			}
			//if we came to this part it means that everything is valid and we can add the new patient
			//using design pattern of building to build the patient
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
		//add the new patient to data structure of the current doctor
		doctor.getPatients().add(patient);
		//update the data base after adding a new person
		fileManager.writeFile(FILENAME,doctors);			
	}
	//finding the patient by using the id of the patient
	public Patient findPatient(Doctor doctor,String id)throws Exception {
		//checking if the doctor has patients,if not then throw exception
		this.Does_Doctor_Have_Patients(doctor);
		//checking if this patient exists in data structure of the doctor
		if(doctor.getPatients().contains(new Patient(id))==false) {
			throw new Exception("This patient does not exist!");
		}
		//finding the patient in data structure of the doctor
		for(Patient patient:doctor.getPatients()) {
			if(patient.getId().equals(id)) {
				return patient;
			}
		}
		return null;
	}
	//checking if the doctor has patients
	public void Does_Doctor_Have_Patients(Doctor doctor)throws Exception {
		//if the doctor doesn't have patients then we can't do the operations below:
		//VIEW PATIENT DATA,DELETE PATIENT,UPDATE PATIENT HEALTH CONDITION
		//therefore we need to throw exception
		if(doctor.getPatients().isEmpty()) {
			throw new Exception("There are no patients!");
		}
		
	}
	//selectedField:the name of the field of the patient that the doctor chose to change
	//updatedField:this is what the doctor chose to write in the field he chose
	public void Update_Patient_Field(Patient patient,String selectedField,String updatedField)
			throws IOException,Exception {
		fileManager=FileManager.getFileManager();
		//finding what is the field that needs to be updated
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
		//update the data base after the new change
		fileManager.writeFile(FILENAME, doctors);
			
		}
	
	public void deletePatient(Doctor doctor,Patient patient)throws IOException,Exception {
		fileManager=FileManager.getFileManager();
		//removing the patient from the data structure of the doctor
		doctor.getPatients().remove(patient);
		//update the data base after removing the patient
		fileManager.writeFile(FILENAME, doctors);
	}
	public void removeDoctor(Doctor doctor)throws IOException,Exception {
		fileManager=FileManager.getFileManager();{
		//removing the dotor	
		doctors.remove(doctor);
		//update the file
		fileManager.writeFile(FILENAME, doctors);
		
	  }
	}	
}


				
	


		
		
			
	

	

	
	



