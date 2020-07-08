package BusinessLayer;

import java.io.IOException;

public class PatientController extends DataValidation {
	private static PatientController patientController;
	private PatientService patientService;
	
	private PatientController() {
		
	}
	
	public static PatientController getPatientController() {
		if(patientController==null) {
			patientController=new PatientController();
		}
		return patientController;
	}
	public void Add(Doctor doctor,String firstName,String lastName,String id,String diseaseName,String MedicalState,
			String Medicines,String sideEffects,String symptoms,String historicalTreatments,String CoronaVirusStatus,
			String NotesFromDoctor,String patientCity,String patientStreet,int streetNumber,int age)
					throws IllegalArgumentException,IOException,ClassNotFoundException,Exception {
		
		if(patientController.isNameValid(firstName)==false || patientController.isNameValid(lastName)==false) {
			throw new IllegalArgumentException("First name or last name should not contain numbers or spaces!");	
		}
		if(patientController.isIdValid(id)==false) {
			throw new IllegalArgumentException("Invalid id! id should contain exactly 9 numbers without letters or spaces");
		}
		if(patientController.isMedicalStateValid(MedicalState)==false) {
			throw new IllegalArgumentException("Invalid medical state!");
		}if(patientController.is_Corona_Virus_Status_Valid(CoronaVirusStatus)==false) {
			throw new IllegalArgumentException("Corona virus status should be positive or negative!");
		}
		if(patientController.doesContainNumber(diseaseName)||patientController.doesContainNumber(Medicines)
				||patientController.doesContainNumber(sideEffects)||patientController.doesContainNumber(symptoms)
				||patientController.doesContainNumber(historicalTreatments)
			||patientController.doesContainNumber(patientCity)||patientController.doesContainNumber(patientStreet)) {
			throw new IllegalArgumentException("Disease name,medicines,side effects,symptoms"
					+ ",historical treatments,patient city and patient street should not contain numbers!");
		}
		patientService=PatientService.getPatientService();
		patientService.Add(doctor, firstName, lastName, id, diseaseName, MedicalState, Medicines, sideEffects,
				symptoms, historicalTreatments, CoronaVirusStatus, NotesFromDoctor, patientCity, patientStreet,
				streetNumber, age);	
	}
	
		
	public Patient findPatient(Doctor doctor,String id)
			throws IllegalArgumentException,IOException,ClassNotFoundException,Exception {
		if(patientController.isIdValid(id)==false) {
			throw new IllegalArgumentException("Invalid id! id should contain exactly 9 numbers without letters or spaces");
		}
		patientService=PatientService.getPatientService();
		Patient patient=patientService.findPatient(doctor,id);
		return patient;
		
	}
	
	public void Update_Patient_Field(Patient patient,String selectedField,String updatedField)
			throws IllegalArgumentException,IOException,ClassNotFoundException,Exception {
		patientService=PatientService.getPatientService();
		if(patientController.is_Selected_Field_Valid(selectedField)==false) {
			throw new IllegalArgumentException("Invalid field!");
		}
		if(selectedField.equalsIgnoreCase("Notes from doctor")) {
			patientService.Update_Patient_Field(patient,selectedField,updatedField);
		}
		else {
		 if(selectedField.equalsIgnoreCase("Corona virus status")) {
			if(patientController.is_Corona_Virus_Status_Valid(updatedField)==false) {
				throw new IllegalArgumentException("Corona virus status should be positive or negative!");
			}
		}
		else if(selectedField.equalsIgnoreCase("Medical state")) {
			if(patientController.isMedicalStateValid(updatedField)==false) {
				throw new IllegalArgumentException("Invalid medical state!");
			}
		}
		else {
			if(patientController.doesContainNumber(updatedField)) {
				throw new IllegalArgumentException("Disease name,medicines,side effects and symptoms cannot contain numbers!");
			}
		}
		patientService.Update_Patient_Field(patient,selectedField,updatedField);
		}
		
		
	}
	
	public void deletePatient(Doctor doctor,Patient patient)
			throws IllegalArgumentException,IOException,ClassNotFoundException,Exception {
		patientService=PatientService.getPatientService();
		patientService.deletePatient(doctor,patient);
		
		
		
		
	}
	
	
}
		
	

