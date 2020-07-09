package BusinessLayer;

import java.io.IOException;

import DataLayer.DataBase;

public class PatientService {
	private static PatientService patientService;
	private DataBase dataBase;
	
	private PatientService() {
		
	}
	//using design pattern of singleton
	public static PatientService getPatientService() {
		if(patientService==null) {
			patientService=new PatientService();
		}
		return patientService;
	}
	//going to data base to add the patient
	public void Add(Doctor doctor,String firstName,String lastName,String id,String diseaseName,String MedicalState,
				String Medicines,String sideEffects,String symptoms,String historicalTreatments,String CoronaVirusStatus,
				String NotesFromDoctor,String patientCity,String patientStreet,int streetNumber,int age)
						throws IOException,ClassNotFoundException,Exception {
		dataBase=DataBase.getDataBase();
		dataBase.addPatient(doctor,firstName,lastName,id,diseaseName,MedicalState,
				Medicines,sideEffects,symptoms,historicalTreatments,CoronaVirusStatus,
				NotesFromDoctor,patientCity,patientStreet,streetNumber,age);
		
	}
	//going to data base to check if this doctor has patients
	public void Does_Doctor_Have_Patients(Doctor doctor)throws IOException,ClassNotFoundException,Exception {
		dataBase=DataBase.getDataBase();
		dataBase.Does_Doctor_Have_Patients(doctor);
	}
	//going to data base in order to find the patient by using the id of the patient
	public Patient findPatient(Doctor doctor,String id)throws IOException,ClassNotFoundException,Exception {
		dataBase=DataBase.getDataBase();
		Patient patient=dataBase.findPatient(doctor,id);
		return patient;
	}
	//going to data base to update the field that the doctor chose
	public void Update_Patient_Field(Patient patient,String selectedField,String updatedField)throws Exception {
		dataBase=DataBase.getDataBase();
		dataBase.Update_Patient_Field(patient,selectedField,updatedField);
		
	}
	//going to data base to delete the patient
	public void deletePatient(Doctor doctor,Patient patient)throws IOException,ClassNotFoundException,Exception {
		dataBase=DataBase.getDataBase();
		dataBase.deletePatient(doctor,patient);
	}

}
