package BusinessLayer;

import java.io.IOException;

import DataLayer.DataBase;

public class PatientService {
	private static PatientService patientService;
	private DataBase dataBase;
	
	private PatientService() {
		
	}
	public static PatientService getPatientService() {
		if(patientService==null) {
			patientService=new PatientService();
		}
		return patientService;
	}
	public void Add(Doctor doctor,String firstName,String lastName,String id,String diseaseName,String MedicalState,
				String Medicines,String sideEffects,String symptoms,String historicalTreatments,String CoronaVirusStatus,
				String NotesFromDoctor,String patientCity,String patientStreet,int streetNumber,int age)
						throws IOException,ClassNotFoundException,Exception {
		dataBase=DataBase.getDataBase();
		dataBase.addPatient(doctor,firstName,lastName,id,diseaseName,MedicalState,
				Medicines,sideEffects,symptoms,historicalTreatments,CoronaVirusStatus,
				NotesFromDoctor,patientCity,patientStreet,streetNumber,age);
		
	}

}
