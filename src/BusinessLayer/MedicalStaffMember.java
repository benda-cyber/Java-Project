package BusinessLayer;

public class MedicalStaffMember extends Person {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String MedicalLicense;
	private String HospitalName;
	private int yearsOfExperience;
	
	
	public MedicalStaffMember() {
		
	}
	
	public String getMedicalLicense() {
		return MedicalLicense;
	}

	public void setMedicalLicense(String medicalLicense) {
		MedicalLicense = medicalLicense;
	}

	public String getHospitalName() {
		return HospitalName;
	}

	public void setHospitalName(String hospitalName) {
		HospitalName = hospitalName;
	}

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}






	public void UpdatePatientStatus(Patient patient) {
		
	}
	
	
	

}
