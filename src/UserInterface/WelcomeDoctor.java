package UserInterface;

import java.io.IOException;
import java.util.Scanner;

import BusinessLayer.Doctor;
import BusinessLayer.DoctorController;
import BusinessLayer.LoginController;
import BusinessLayer.Patient;
import BusinessLayer.PatientController;
import BusinessLayer.RegisterController;

public class WelcomeDoctor {
	
	private LoginController loginController;
	private RegisterController registerController;
	private PatientController patientController;
	private DoctorController doctorController;
	private Scanner scanner;
	
	public WelcomeDoctor() {
		loginController=LoginController.getLoginController();
		registerController=RegisterController.getRegisterController();
		patientController=PatientController.getPatientController();
		doctorController=DoctorController.getDoctorController();
		scanner=new Scanner(System.in);
	}
	
	public void Welcome() {
		System.out.println("Welcome Doctor!");
		System.out.println("Please choose one of the following options:");
		System.out.println("1.Login");
		System.out.println("2.Register");
		System.out.println("Q.Exit");
		String command=scanner.nextLine();
		while(!command.equals("q")&&!command.equals("Q")) {
			if(!command.equals("1")&&!command.equals("2")) {
				System.out.println("This choice is not optional!");
			}
			try{
		switch(command) {
		case "1":
			this.Login();
			break;
		case "2":
			this.Register();
			break;
	       }
		}catch(Exception e) {
			if(e.getMessage()==null) {
				scanner.nextLine();
				System.out.println("This field cannot contain letters!");
			}
			else {
				System.out.println(e.getMessage());
			}
	    }
		System.out.println("Please choose one of the following options:");
		System.out.println("1.Login");
		System.out.println("2.Register");
		System.out.println("Q.Exit");
		command=scanner.nextLine();  		
    }
		System.out.println("bye bye");
		scanner.close();
		System.exit(0);
}
		
		
	public void Login()throws IllegalArgumentException,Exception {
			System.out.println("Please write your login details:");
			System.out.print("Username:");
			String Username=scanner.nextLine();
			System.out.print("Password:");
			String Password=scanner.nextLine();
			System.out.print("id:");
			String id=scanner.nextLine();
			Doctor doctor=loginController.Login(Username,Password,id);
			System.out.println("Login succeeded!");
			this.systemOperations(doctor);	
	}
		
	public void Register()throws IllegalArgumentException,IOException,ClassNotFoundException,Exception {
			System.out.println("Please fill the following details:");
			System.out.println("First name(should not contain numbers or spaces):");
			String firstName=scanner.nextLine();
			System.out.println("Last name(should not contain numbers or spaces):");
			String lastName=scanner.nextLine();
			System.out.println("Age(should not contain letters):");
			int age=scanner.nextInt();
			scanner.nextLine();
			System.out.println("id(should contain exactly 9 numbers):");
			String id=scanner.nextLine();
			System.out.println("Username(should contain 4-10 letters without numbers or spaces):");
			String username=scanner.nextLine();
			System.out.println("Password(should contain 6-20 letters or numbers without spaces):");
			String password=scanner.nextLine();
			System.out.println("Medical specialty(should not contain numbers):");
			String medicalSpecialty=scanner.nextLine();
			System.out.println("Years of experience(should not contain letters):");
			int yearsOfExperience=scanner.nextInt();
			scanner.nextLine();
			System.out.println("Medical license(should contain exactly 5 numbers):");
			String medicalLicense=scanner.nextLine();
			System.out.println("Hospital name(should not contain numbers):");
			String hospitalName=scanner.nextLine();
			registerController.Register(firstName,lastName,age,id,username,
					password,medicalSpecialty,medicalLicense,hospitalName,yearsOfExperience);
			System.out.println("Registration succeeded!");			
	}
	
	public void systemOperations(Doctor doctor)throws Exception {
		System.out.println("Welcome to the system!");
		System.out.println("Please choose one of the following options:");
		System.out.println("1.Add patient");
		System.out.println("2.View patient data");
		System.out.println("3.Update patient health condition");
		System.out.println("4.Delete patient");
		System.out.println("5.Remove account");
		System.out.println("Q.Logout");
		boolean flag_account_Removed=false;
		String command=scanner.nextLine();
		while(!command.equals("q")&&!command.equals("Q")) {
			if(!command.equals("1")&&!command.equals("2")&&!command.equals("3")&&
					!command.equals("4")&&!command.equals("5")) {
				System.out.println("This choice is not optional!");
			}
			try {
		switch(command) {
		case "1":
			this.addPatient(doctor);
			break;
		case "2":
			this.viewPatientData(doctor);
			break;
		case "3":
			this.Update_Patient_Health_Condition(doctor);
			break;
		case "4":
			this.deletePatient(doctor);
			break;
		case "5":
			flag_account_Removed=this.removeAccount(doctor);
			break;
		  }
		}catch(Exception e) {
			if(e.getMessage()==null) {
				scanner.nextLine();
				System.out.println("This field cannot contain letters!");
			}
			else {
				System.out.println(e.getMessage());
			}
		}
			if(flag_account_Removed) {
				break;
			}
		System.out.println("Please choose one of the following options:");
		System.out.println("1.Add patient");
		System.out.println("2.View patient data");
		System.out.println("3.Update patient health condition");
		System.out.println("4.Delete patient");
		System.out.println("5.Remove account");
		System.out.println("Q.Logout");
		command=scanner.nextLine();
		}	
   }
  
	public void addPatient(Doctor doctor)throws IOException,ClassNotFoundException,Exception {
		System.out.println("Please fill the following details on the patient:");
		System.out.println("First name(should not contain numbers or spaces):");
		String firstName=scanner.nextLine();
		System.out.println("Last name(should not contain numbers or spaces):");
		String lastName=scanner.nextLine();
		System.out.println("Age(should not contain letters):");
		int age=scanner.nextInt();
		scanner.nextLine();
		System.out.println("id(should contain exactly 9 numbers):");
		String id=scanner.nextLine();
		System.out.println("Patient city(should not contain numbers):");
		String patientCity=scanner.nextLine();
		System.out.println("Patient street(should not contain numbers):");
		String patientStreet=scanner.nextLine();
		System.out.println("Street number(should not contain letters):");
		int streetNumber=scanner.nextInt();
		scanner.nextLine();
		System.out.println("Disease name(should not contain numbers):");
		String diseaseName=scanner.nextLine();
		System.out.println("Medical State(good,fair,serious,critical or dead):");
		String MedicalState=scanner.nextLine();
		System.out.println("Medicines(should not contain numbers):");
		String Medicines=scanner.nextLine();
		System.out.println("Side effects(should not contain numbers):");
		String sideEffects=scanner.nextLine();
		System.out.println("Symptoms(should not contain numbers):");
		String symptoms=scanner.nextLine();
		System.out.println("Historical treatments(should not contain numbers)");
		String historicalTreatments=scanner.nextLine();
		System.out.println("Corona virus status(positive or negative):");
		String CoronaVirusStatus=scanner.nextLine();
		System.out.println("Notes on the patient(no limits):");
		String NotesFromDoctor=scanner.nextLine();
		patientController.Add(doctor,firstName,lastName,id,diseaseName,MedicalState,
				Medicines,sideEffects,symptoms,historicalTreatments,CoronaVirusStatus,
				NotesFromDoctor,patientCity,patientStreet,streetNumber,age);
		System.out.println("Patient added successfully!");
	}
	
	public void viewPatientData(Doctor doctor)throws IllegalArgumentException,Exception {
		patientController.Does_Doctor_Have_Patients(doctor);
		System.out.println("Please write one of the IDs below to see the data of this patient:");
		for(Patient patient:doctor.getPatients()) {
			System.out.print(patient.getId() + " | ");
		}
		System.out.println();
		String id=scanner.nextLine(); 
		Patient patient=patientController.findPatient(doctor,id);
		System.out.println("Here are the details of the patient:");
		System.out.println(patient);
	}
	
	public void Update_Patient_Health_Condition(Doctor doctor)throws IllegalArgumentException,Exception {
		patientController.Does_Doctor_Have_Patients(doctor);
		System.out.println("Please write the id of the patient that you want to update:");
		for(Patient patient:doctor.getPatients()) {
			System.out.print(patient.getId() + " | ");
		}
		System.out.println();
		String id=scanner.nextLine();
		Patient patient=patientController.findPatient(doctor,id);
		System.out.println("Please write the field that you want to update from the following fields:");
		System.out.println("symptoms | Corona virus status(Positive or negative) | Side effects | Medicines"
				+ " | Disease name | Medical State(good,fair,serious,critical or dead) | Notes from doctor");
		String selectedField=scanner.nextLine();
		patientController.validateField(selectedField);
		System.out.println("Now choose what you want to write in this field");
		String updatedField=scanner.nextLine();
		patientController.Update_Patient_Field(patient,selectedField,updatedField);
		System.out.println("The field of the patient updated successfully!");		
}
	
	public void deletePatient(Doctor doctor)throws IllegalArgumentException,Exception {
			patientController.Does_Doctor_Have_Patients(doctor);
			System.out.println("Please write one of the IDs below to delete this patient:");
			for(Patient patient:doctor.getPatients()) {
				System.out.print(patient.getId() + " | ");
			}
			System.out.println();
			String id=scanner.nextLine();
			Patient patient=patientController.findPatient(doctor,id);
			patientController.deletePatient(doctor,patient);
			System.out.println("The patient has deleted successfully");
	}
	//return true if the account was removed successfully else return false
	public boolean removeAccount(Doctor doctor)
			throws IllegalArgumentException,IOException,ClassNotFoundException,Exception {
		System.out.println("Are you sure you want to remove your account?(write yes or no)");
		String yes_or_no=scanner.nextLine();
		boolean doctor_Chose_Yes=doctorController.removeDoctor(doctor,yes_or_no);
		if(doctor_Chose_Yes) {
			System.out.println("Your account has deleted successfully!");
			return true;
		  }
		return false;
	}
}
