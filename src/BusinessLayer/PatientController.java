package BusinessLayer;

import java.io.IOException;

public class PatientController extends DataValidation {
	private static PatientController patientController;
	private PatientService patientService;
	
	private PatientController() {
		
	}
	//using design pattern of singleton
	public static PatientController getPatientController() {
		if(patientController==null) {
			patientController=new PatientController();
		}
		return patientController;
	}
	public void Add(Doctor doctor,String firstName,String lastName,String id,String diseaseName,String MedicalState,
			String Medicines,String sideEffects,String symptoms,String historicalTreatments,String CoronaVirusStatus,
			String NotesFromDoctor,String patientCity,String patientStreet,int streetNumber,int age)
					throws IllegalArgumentException,Exception {
		//if first name or last name contains spaces or numbers then they are not valid
		if(patientController.isNameValid(firstName)==false || patientController.isNameValid(lastName)==false) {
			throw new IllegalArgumentException("First name or last name should not contain numbers or spaces!");	
		}
		//if the id contains more or less than 9 numbers or contains letters or spaces then it is not valid
		if(patientController.isIdValid(id)==false) {
			throw new IllegalArgumentException("Invalid id! id should contain exactly 9 numbers without letters or spaces");
		}
		//if medical state is not one of the options:good,fair,serious,critical or dead then it is not valid
		if(patientController.isMedicalStateValid(MedicalState)==false) {
			throw new IllegalArgumentException("Invalid medical state!");
			//if corona virus status is not one of the options:positive or negative then it is not valid
		}if(patientController.is_Corona_Virus_Status_Valid(CoronaVirusStatus)==false) {
			throw new IllegalArgumentException("Corona virus status should be positive or negative!");
		}
		//if one of the fields below(disease name,medicines,side effects...) contains numbers then they are not valid
		if(patientController.doesContainNumber(diseaseName)||patientController.doesContainNumber(Medicines)
				||patientController.doesContainNumber(sideEffects)||patientController.doesContainNumber(symptoms)
				||patientController.doesContainNumber(historicalTreatments)
			||patientController.doesContainNumber(patientCity)||patientController.doesContainNumber(patientStreet)) {
			throw new IllegalArgumentException("Disease name,medicines,side effects,symptoms"
					+ ",historical treatments,patient city and patient street should not contain numbers!");
		}
		//if we came to this part,it means that all the input of the doctor is valid and we can continue the process
		patientService=PatientService.getPatientService();
		patientService.Add(doctor, firstName, lastName, id, diseaseName, MedicalState, Medicines, sideEffects,
				symptoms, historicalTreatments, CoronaVirusStatus, NotesFromDoctor, patientCity, patientStreet,
				streetNumber, age);	
	}
	//checking if the current doctor has patients
	public void Does_Doctor_Have_Patients(Doctor doctor)throws IOException,ClassNotFoundException,Exception {
		patientService=PatientService.getPatientService();
		patientService.Does_Doctor_Have_Patients(doctor);
	}
	
	
	//finding the patient by the id of the patient
	public Patient findPatient(Doctor doctor,String id)
			throws IllegalArgumentException,IOException,ClassNotFoundException,Exception {
		if(patientController.isIdValid(id)==false) {
			throw new IllegalArgumentException("Invalid id! id should contain exactly 9 numbers without letters or spaces");
		}
		//if the id is valid then we continue the process
		patientService=PatientService.getPatientService();
		Patient patient=patientService.findPatient(doctor,id);
		return patient;
		
	}
	
	public void validateField(String selectedField) {
		if(patientController.is_Selected_Field_Valid(selectedField)==false) {
			throw new IllegalArgumentException("Invalid field!");
		}
	}
	
	//selectedField:the name of the field of the patient that the doctor chose to change
	//updatedField:this is what the doctor chose to write in the field he chose
	public void Update_Patient_Field(Patient patient,String selectedField,String updatedField)
			throws IllegalArgumentException,IOException,ClassNotFoundException,Exception {
		patientService=PatientService.getPatientService();
		//in the field of Notes FROM DOCTOR the doctor can write anything he wants without limitation
		//therefore,there is no need to check what the doctor wrote in this field
		//if the doctor chose this field then we can continue the process
		if(selectedField.equalsIgnoreCase("Notes from doctor")) {
			patientService.Update_Patient_Field(patient,selectedField,updatedField);
		}
		else {
			//if the doctor chose to change CORONA VIRUS STATUS
		 if(selectedField.equalsIgnoreCase("Corona virus status")) {
			 //if the doctor did not write positive or negative to this field then it is not valid
			if(patientController.is_Corona_Virus_Status_Valid(updatedField)==false) {
				throw new IllegalArgumentException("Corona virus status should be positive or negative!");
			}
		}
		 //if the doctor chose to change the field MEDICAL STATE
		else if(selectedField.equalsIgnoreCase("Medical state")) {
			//if the doctor did not choose one of the options:good,fair,serious,critical or dead then it is not valid
			if(patientController.isMedicalStateValid(updatedField)==false) {
				throw new IllegalArgumentException("Invalid medical state!");
			}
		}
		else {
			//if the doctor chose one of the other fields and it contains numbers then it is not valid
			if(patientController.doesContainNumber(updatedField)) {
				throw new IllegalArgumentException("Disease name,medicines,side effects and symptoms cannot contain numbers!");
			}
		}
		 //if the selected field and the updated field are valid then we can continue the process
		patientService.Update_Patient_Field(patient,selectedField,updatedField);
		}
	}
	//going to data base to delete the patient
	public void deletePatient(Doctor doctor,Patient patient)
			throws IllegalArgumentException,IOException,ClassNotFoundException,Exception {
		patientService=PatientService.getPatientService();
		patientService.deletePatient(doctor,patient);
	}
	
	
	
}
		
	

