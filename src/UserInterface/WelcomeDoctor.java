package UserInterface;

import java.io.IOException;
import java.util.Scanner;

//import BusinessLayer.LoginController;
import BusinessLayer.RegisterController;

public class WelcomeDoctor {
	
	//private LoginController loginController;
	private RegisterController registerController;
	
	public WelcomeDoctor() {
		//loginController=LoginController.getLoginController();
		registerController=RegisterController.getRegisterController();
		
		
	}
	
	public void Welcome() {
		System.out.println("Welcome Doctor");
		System.out.println("Please choose one of the following options:");
		//System.out.println("1.Login");
		System.out.println("2.Register");
		System.out.println("Q.exit");
		
		try(Scanner scanner=new Scanner(System.in)) {
		String command=scanner.nextLine();
		switch(command) {
		//case "1":
		//	this.Login();
		//	break;
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
	/*public void Login() {
		try(Scanner scanner=new Scanner(System.in)){
			System.out.print("Username:");
			String Username=scanner.nextLine();
			System.out.print("Password:");
			String Password=scanner.nextLine();
			System.out.print("id:");
			String id=scanner.nextLine();
			boolean isLoginSucceeded=loginController.Login(Username,Password,id);
		}*/
		
		
		
	
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
	
}
