package BusinessLayer;


import java.util.HashSet;

public class Doctor extends MedicalStaffMember {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String MedicalSpecialty;
	private String userName;
	private String password;
	private HashSet<Patient> patients;
	
	
	public Doctor() {
		
	}
	public Doctor(String id) {
		this.setId(id);
	}
	
	
	public String getMedicalSpecialty() {
		return MedicalSpecialty;
	}

	public void setMedicalSpecialty(String medicalSpecialty) {
		MedicalSpecialty = medicalSpecialty;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public static DoctorBuilder builder() {
		return new DoctorBuilder();
	}

	
	public HashSet<Patient> getPatients() {
		return patients;
	}

	public void setPatients(HashSet<Patient> patients) {
		this.patients = patients;
	}



	@Override
	public String toString() {
		return "Doctor [Medical Specialty=" + MedicalSpecialty + ", Username=" + userName + ", Password=" + password
				+ ", Patients=" + patients + ", Medical License=" + getMedicalLicense() + ", Hospital Name="
				+ getHospitalName() + ", Years of experience=" + getYearsOfExperience() + ", First name="
				+ getFirstName() + ", Last name=" + getLastName() + ", Age=" + getAge() + ", Id="
				+ getId() + "]";
	}
	


	
	
	
	
	
	
}

/*public String PrescribeMedication(Patient patient) {
		
	}*/
	


