package BusinessLayer;

public class DoctorBuilder {
	
	private String firstName;
	private String lastName;
	private int age;
	private String id;
	private String MedicalLicense;
	private String HospitalName;
	private int yearsOfExperience;
	private String MedicalSpecialty;
	private String userName;
	private String password;
	
	public DoctorBuilder firstName(String firstName) {
		this.firstName=firstName;
		return this;
	}
	public DoctorBuilder lastName(String lastName) {
		this.lastName=lastName;
		return this;
	}
	public DoctorBuilder age(int age) {
		this.age=age;
		return this;
	}
	public DoctorBuilder id(String id) {
		this.id=id;
		return this;
	}
	public DoctorBuilder MedicalLicense(String medicalLicense) {
		this.MedicalLicense=medicalLicense;
		return this;
	}
	public DoctorBuilder HospitalName(String hospitalName) {
		this.HospitalName=hospitalName;
		return this;
	}
	public DoctorBuilder yearsOfExperience(int years) {
		this.yearsOfExperience=years;
		return this;
	}
	public DoctorBuilder MedicalSpecialty(String medicalSpecialty) {
		this.MedicalSpecialty=medicalSpecialty;
		return this;
	}
	public DoctorBuilder username(String username) {
		this.userName=username;
		return this;
	}
	public DoctorBuilder password(String Password) {
		this.password=Password;
		return this;
	}
	public Doctor build() {
		Doctor doctor=new Doctor();
		doctor.firstName=this.firstName;
		doctor.lastName=this.lastName;
		doctor.age=this.age;
		doctor.id=this.id;
		doctor.MedicalLicense=this.MedicalLicense;
		doctor.HospitalName=this.HospitalName;
		doctor.yearsOfExperience=this.yearsOfExperience;
		doctor.setMedicalSpecialty(this.MedicalSpecialty);
		doctor.setUserName(this.userName);
		doctor.setPassword(this.password);
		return doctor;
		
	}
	
	

}
