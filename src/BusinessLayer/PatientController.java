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
					throws IOException,ClassNotFoundException,Exception {
		
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

}
