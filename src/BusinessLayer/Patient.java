package BusinessLayer;


public class Patient extends Person {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	
	public Patient() {
		
	}
	
	public Patient(String id) {
		this.setId(id);
	}
	
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getCoronaVirusStatus() {
		return CoronaVirusStatus;
	}
	public void setCoronaVirusStatus(String coronaVirusStatus) {
		CoronaVirusStatus = coronaVirusStatus;
	}
	public String getSideEffects() {
		return sideEffects;
	}
	public void setSideEffects(String sideEffects) {
		this.sideEffects = sideEffects;
	}
	public String getHistoricalTreatments() {
		return historicalTreatments;
	}
	public void setHistoricalTreatments(String historicalTreatments) {
		this.historicalTreatments = historicalTreatments;
	}
	public String getMedicines() {
		return Medicines;
	}
	public void setMedicines(String medicines) {
		Medicines = medicines;
	}
	public String getDiseaseName() {
		return diseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		this.diseaseName = diseaseName;
	}
	public String getMedicalState() {
		return MedicalState;
	}
	public void setMedicalState(String medicalState) {
		MedicalState = medicalState;
	}
	public String getPatientStreet() {
		return patientStreet;
	}
	public void setPatientStreet(String patientStreet) {
		this.patientStreet = patientStreet;
	}
	public int getStreetNumber() {
		return streetNumber;
	}
	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}
	public String getPatientCity() {
		return patientCity;
	}
	public void setPatientCity(String patientCity) {
		this.patientCity = patientCity;
	}
	public String getNotesFromDoctor() {
		return NotesFromDoctor;
	}
	public void setNotesFromDoctor(String notesFromDoctor) {
		NotesFromDoctor = notesFromDoctor;
	}
	public static PatientBuilder builder() {
		return new PatientBuilder();
	}

	@Override
	public String toString() {
		return "Patient:\nSymptoms:" + symptoms + "\n" + "Corona virus status:" + CoronaVirusStatus + "\n" + "Side effects:"
				+ sideEffects + "\n" + "Historical treatments:" + historicalTreatments + "\n" + "Medicines:" + Medicines
				+ "\n" + "Disease name:" + diseaseName + "\n" + "Medical state:" + MedicalState + "\n" + "Patient street:" + patientStreet
				+ "\n" + "Street number:" + streetNumber + "\n" + "patient city:" + patientCity + "\n" + "Notes from doctor:"
				+ NotesFromDoctor + "\n" + "First name:" + getFirstName() + "\n" + "Last name:" + getLastName()
				+ "\n" + "Age:" + getAge() + "\n" + "Id:" + getId();
	}
	
	
	
	
	
	
	
	
	
	
	
}
