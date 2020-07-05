package BusinessLayer;



public class Doctor extends MedicalStaffMember {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String MedicalSpecialty;
	private String userName;
	private String password;
	//private List<Patient> patients;
	
	
	public Doctor() {
		
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

	
	

	@Override
	public String toString() {
		return "Doctor [MedicalSpecialty=" + MedicalSpecialty + ", userName=" + userName + ", password=" + password
				+ ", MedicalLicense=" + getMedicalLicense() + ", HospitalName=" + getHospitalName() + ", yearsOfExperience="
				+ getYearsOfExperience() + ", firstName=" + getFirstName() + ", lastName=" + getLastName() + ", age=" + getAge() + ", id="
				+ getId() + "]";
	}

	
	
	
	
	
	
}

/*public String PrescribeMedication(Patient patient) {
		
	}*/
	


