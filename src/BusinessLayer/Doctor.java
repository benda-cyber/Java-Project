package BusinessLayer;

import java.io.Serializable;

public class Doctor extends MedicalStaffMember implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String MedicalSpecialty;
	private String userName;
	private String password;
	//private List<Patient> patients;
	
	public Doctor(String id_Or_MedicalLicense_Or_UserName) {
		if(id_Or_MedicalLicense_Or_UserName.charAt(0)>=48 && id_Or_MedicalLicense_Or_UserName.charAt(0)<=57) {
			if(id_Or_MedicalLicense_Or_UserName.length()==9) {
				this.id=id_Or_MedicalLicense_Or_UserName;
			}
			else {
				this.MedicalLicense=id_Or_MedicalLicense_Or_UserName;
			}
		}
		else {
			this.userName=id_Or_MedicalLicense_Or_UserName;
		}
			
	}
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
}

/*public String PrescribeMedication(Patient patient) {
		
	}*/
	


