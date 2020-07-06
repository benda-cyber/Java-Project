package BusinessLayer;

public class PatientBuilder {
	private String firstName;
	private String lastName;
	private int age;
	private String id;
	private String symptoms;
	private String CoronaVirusStatus;
	private String sideEffects;
	private String historicalTreatments;
	private String Medicines;
	private String diseaseName;
	private String MedicalState;
	private String patientStreet;
	private int streetNumber;
	private String patientCity;
	private String NotesFromDoctor;
	
	public PatientBuilder firstName(String firstName) {
		this.firstName=firstName;
		return this;
	}
	public PatientBuilder lastName(String lastName) {
		this.lastName=lastName;
		return this;
	}
	public PatientBuilder age(int age) {
		this.age=age;
		return this;
	}
	public PatientBuilder id(String id) {
		this.id=id;
		return this;
	}
	public PatientBuilder symptoms(String symptoms) {
		this.symptoms=symptoms;
		return this;
	}
	public PatientBuilder CoronaVirusStatus(String CoronaVirusStatus) {
		this.CoronaVirusStatus=CoronaVirusStatus;
		return this;
	}
	public PatientBuilder sideEffects(String sideEffects) {
		this.sideEffects=sideEffects;
		return this;
	}
	public PatientBuilder historicalTreatments(String historicalTreatments) {
		this.historicalTreatments=historicalTreatments;
		return this;
	}
	public PatientBuilder Medicines(String Medicines) {
		this.Medicines=Medicines;
		return this;
	}
	public PatientBuilder diseaseName(String diseaseName) {
		this.diseaseName=diseaseName;
		return this;
	}
	public PatientBuilder MedicalState(String MedicalState) {
		this.MedicalState=MedicalState;
		return this;
	}
	public PatientBuilder patientStreet(String patientStreet) {
		this.patientStreet=patientStreet;
		return this;
	}
	public PatientBuilder streetNumber(int streetNumber) {
		this.streetNumber=streetNumber;
		return this;			
	}
	public PatientBuilder patientCity(String patientCity) {
		this.patientCity=patientCity;
		return this;
	}
	public PatientBuilder NotesFromDoctor(String NotesFromDoctor) {
		this.NotesFromDoctor=NotesFromDoctor;
		return this;
	}
	public Patient build() {
		Patient patient=new Patient();
		 patient.setFirstName(this.firstName);
		 patient.setLastName(this.lastName);
		 patient.setAge(this.age);
		 patient.setId(this.id);
		 patient.setSymptoms(this.symptoms);
		 patient.setCoronaVirusStatus(this.CoronaVirusStatus);
		 patient.setSideEffects(this.sideEffects);
		 patient.setHistoricalTreatments(this.historicalTreatments);
		 patient.setMedicines(this.Medicines);
		 patient.setDiseaseName(this.diseaseName);
		 patient.setMedicalState(this.MedicalState);
		 patient.setPatientStreet(this.patientStreet);
		 patient.setStreetNumber(this.streetNumber);
		 patient.setPatientCity(this.patientCity);
		 patient.setNotesFromDoctor(this.NotesFromDoctor);
		 return patient;
	}
	
	
	
	
	
	
	
	
	
	
	
	

	

}
