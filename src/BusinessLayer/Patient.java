package BusinessLayer;

import java.util.Arrays;

public class Patient extends Person {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] Symptoms;
	private boolean CoronaVirusStatus;
	private String[] SideEffects;
	private String[] HistoricalTreatments;
	private String[] MedicalTreatments;
	private String DiseaseName;
	private String MedicalState;
	private String LastVisiting;
	private String NextVisiting;
	private String HomeAdress;
	public String[] getSymptoms() {
		return Symptoms;
	}
	public void setSymptoms(String[] symptoms) {
		Symptoms = symptoms;
	}
	public boolean isCoronaVirusStatus() {
		return CoronaVirusStatus;
	}
	public void setCoronaVirusStatus(boolean coronaVirusStatus) {
		CoronaVirusStatus = coronaVirusStatus;
	}
	public String[] getSideEffects() {
		return SideEffects;
	}
	public void setSideEffects(String[] sideEffects) {
		SideEffects = sideEffects;
	}
	public String[] getHistoricalTreatments() {
		return HistoricalTreatments;
	}
	public void setHistoricalTreatments(String[] historicalTreatments) {
		HistoricalTreatments = historicalTreatments;
	}
	public String[] getMedicalTreatments() {
		return MedicalTreatments;
	}
	public void setMedicalTreatments(String[] medicalTreatments) {
		MedicalTreatments = medicalTreatments;
	}
	public String getDiseaseName() {
		return DiseaseName;
	}
	public void setDiseaseName(String diseaseName) {
		DiseaseName = diseaseName;
	}
	public String getMedicalState() {
		return MedicalState;
	}
	public void setMedicalState(String medicalState) {
		MedicalState = medicalState;
	}
	public String getLastVisiting() {
		return LastVisiting;
	}
	public void setLastVisiting(String lastVisiting) {
		LastVisiting = lastVisiting;
	}
	public String getNextVisiting() {
		return NextVisiting;
	}
	public void setNextVisiting(String nextVisiting) {
		NextVisiting = nextVisiting;
	}
	public String getHomeAdress() {
		return HomeAdress;
	}
	public void setHomeAdress(String homeAdress) {
		HomeAdress = homeAdress;
	}
	public String toString() {
		return "Patient [Symptoms=" + Arrays.toString(Symptoms) + ", CoronaVirusStatus=" + CoronaVirusStatus
				+ ", SideEffects=" + Arrays.toString(SideEffects) + ", HistoricalTreatments="
				+ Arrays.toString(HistoricalTreatments) + ", MedicalTreatments=" + Arrays.toString(MedicalTreatments)
				+ ", DiseaseName=" + DiseaseName + ", MedicalState=" + MedicalState + ", LastVisiting=" + LastVisiting
				+ ", NextVisiting=" + NextVisiting + ", HomeAdress=" + HomeAdress + "]";
	}
}
