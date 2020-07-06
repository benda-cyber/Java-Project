package UserInterface;

import java.io.IOException;
import java.util.Scanner;

import BusinessLayer.Doctor;
import BusinessLayer.LoginController;
import BusinessLayer.PatientController;
import BusinessLayer.RegisterController;

public class WelcomeDoctor {
	
	private LoginController loginController;
	private RegisterController registerController;
	private PatientController patientController;
	
	public WelcomeDoctor() {
		loginController=LoginController.getLoginController();
		registerController=RegisterController.getRegisterController();
		patientController=PatientController.getPatientController();
		
		
	}
	
	public void Welcome() {
		System.out.println("Welcome Doctor");
		System.out.println("Please choose one of the following options:");
		System.out.println("1.Login");
		System.out.println("2.Register");
		System.out.println("Q.exit");
		
		try(Scanner scanner=new Scanner(System.in)) {
		String command=scanner.nextLine();
		switch(command) {
		case "1":
			this.Login();
			break;
		case "2":
			this.Register();
			break;
		case "q":
		case "Q":
		default:
			System.exit(0);
		}
		}
		catch(Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
	}
	public void Login()throws IllegalArgumentException,Exception {
		try(Scanner scanner=new Scanner(System.in)){
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
	}
		
	public void Register()throws IllegalArgumentException,IOException,ClassNotFoundException,Exception {
		try(Scanner scanner=new Scanner(System.in)){
			System.out.println("Please fill the following details:");
			System.out.println("First name:");
			String firstName=scanner.nextLine();
			System.out.println("Last name:");
			String lastName=scanner.nextLine();
			System.out.println("id:");
			String id=scanner.nextLine();
			System.out.println("Username(should contain 4-10 letters without numbers or spaces):");
			String username=scanner.nextLine();
			System.out.println("Password(should contain 6-20 letters without spaces):");
			String password=scanner.nextLine();
			System.out.println("Medical specialty:");
			String medicalSpecialty=scanner.nextLine();
			System.out.println("Medical license(should contain exactly 5 numbers):");
			String medicalLicense=scanner.nextLine();
			System.out.println("Hospital name:");
			String hospitalName=scanner.nextLine();
			System.out.println("Age:");
			int age=scanner.nextInt();
			System.out.println("Years of experience:");
			int yearsOfExperience=scanner.nextInt();
			registerController.Register(firstName,lastName,age,id,username,
					password,medicalSpecialty,medicalLicense,hospitalName,yearsOfExperience);
			System.out.println("Registration succeeded!");			
		}
	}
	
	public void systemOperations(Doctor doctor)throws Exception {
		try(Scanner scanner=new Scanner(System.in)){
		System.out.println("Welcome to the system!");
		System.out.println("Please choose one of the following options:");
		System.out.println("1.Add patient");
		System.out.println("2.View patient data");
		System.out.println("3.Update patient health condition");
		System.out.println("4.Delete patient");
		System.out.println("5.Find patient");
		System.out.println("Q.Logout");
		String command=scanner.nextLine();
		switch(command) {
		case "1":
			this.addPatient(doctor);
			break;
		case "2":
			
			break;
		case "3":
			
			break;
		case "q":
		case "Q":
		default:
		}	 
	}catch(Exception e) {
			e.printStackTrace();
			System.exit(1);
	    }

	}
	public void addPatient(Doctor doctor)throws IOException,ClassNotFoundException,Exception {
		try(Scanner scanner=new Scanner(System.in)){
		System.out.println("Please fill the following details on the patient:");
		System.out.println("First name:");
		String firstName=scanner.nextLine();
		System.out.println("Last name:");
		String lastName=scanner.nextLine();
		System.out.println("id:");
		String id=scanner.nextLine();
		System.out.println("Disease name:");
		String diseaseName=scanner.nextLine();
		System.out.println("Medical State(good,fair,serious,critical or dead):");
		String MedicalState=scanner.nextLine();
		System.out.println("Medicines:");
		String Medicines=scanner.nextLine();
		System.out.println("Side effects:");
		String sideEffects=scanner.nextLine();
		System.out.println("Symptoms:");
		String symptoms=scanner.nextLine();
		System.out.println("Historical treatments");
		String historicalTreatments=scanner.nextLine();
		System.out.println("Corona virus status(positive or negative):");
		String CoronaVirusStatus=scanner.nextLine();
		System.out.println("Notes on the patient:");
		String NotesFromDoctor=scanner.nextLine();
		System.out.println("Patient city:");
		String patientCity=scanner.nextLine();
		System.out.println("Patient street:");
		String patientStreet=scanner.nextLine();
		System.out.println("Street number:");
		int streetNumber=scanner.nextInt();
		System.out.println("Age:");
		int age=scanner.nextInt();
		patientController.Add(doctor,firstName,lastName,id,diseaseName,MedicalState,
				Medicines,sideEffects,symptoms,historicalTreatments,CoronaVirusStatus,
				NotesFromDoctor,patientCity,patientStreet,streetNumber,age);
		System.out.println("Patient added successfully!");
		
		
		
		
		}
		
	
	}
	

}
