package BusinessLayer;

import java.util.HashSet;

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
	private HashSet<Patient> patients;
	
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
	public DoctorBuilder patients(HashSet<Patient> patients) {
		this.patients=patients;
		return this;
	}
	
	public Doctor build() {
		Doctor doctor=new Doctor();
		doctor.setFirstName(this.firstName);
		doctor.setLastName(this.lastName);
		doctor.setAge(this.age);
		doctor.setId(this.id);
		doctor.setMedicalLicense(this.MedicalLicense);
		doctor.setHospitalName(this.HospitalName);
		doctor.setYearsOfExperience(this.yearsOfExperience);
		doctor.setMedicalSpecialty(this.MedicalSpecialty);
		doctor.setUserName(this.userName);
		doctor.setPassword(this.password);
		doctor.setPatients(this.patients);
		return doctor;
		
	}
	
	

}
