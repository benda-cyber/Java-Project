package BusinessLayer;

public class DataValidation {
	
	public boolean isNameValid(String name)throws IllegalArgumentException {
		//if the name is empty or contain only spaces then the name is not valid
		if(name.isBlank()) {
			throw new IllegalArgumentException("All the fields must have a value!");
		}
		//if the name contains spaces then the name is not valid
		if(name.contains(" ")) {
			return false;
		}
		//if the name contains numbers then the name is not valid
		for(int i=0;i<name.length();i++) {
			if((name.charAt(i)>=48 && name.charAt(i)<=57)) {
				return false;
			}
	}
		return true;
	}

	
	public  boolean isIdValid(String id)throws IllegalArgumentException {
		//if the id is empty or contains only spaces then the id is not valid
		if(id.isBlank()) {
			throw new IllegalArgumentException("All the fields must have a value!");
		}
		//if the id contains spaces then the id is not valid
		if(id.contains(" ")) {
			return false;
		}
		//if the id is more or less than 9 numbers then the id is not valid
		if(id.length()!=9) {
			return false;
		}
		//if the id contains letters then the id is not valid
		for(int i=0;i<id.length();i++) {
			if(id.charAt(i)<=47||id.charAt(i)>=58) {
				return false;
			}
		}
		return true;
	}
	public boolean isUsernameValid(String username)throws IllegalArgumentException {
		//if the username is empty then it is not valid
		if(username.isBlank()) {
			throw new IllegalArgumentException("All the fields must have a value!");
		}
		//if the username contains spaces then it is not valid
		if(username.contains(" ")) {
			return false;
		}
		//if there are less than 4 letters or more than 10 letters in the username then it is not valid
		if(username.length()<4 || username.length()>10) {
			return false;
		}
		//if the username contains numbers than it is not valid
		for(int i=0;i<username.length();i++) {
			if((username.charAt(i)>=48 && username.charAt(i)<=57)) {
				return false;
			}
		}
		return true;
		
	}
	public boolean isPasswordValid(String password)throws IllegalArgumentException {
		//if the password is empty then it is not valid
		if(password.isBlank()) {
			throw new IllegalArgumentException("All the fields must have a value!");
		}
		//if the password contains spaces then it is not valid
		if(password.contains(" ")) {
			return false;
		}
		//if the size of the password is less than 6 or more than 20 then it is not valid
		if(password.length()<6 || password.length()>20) {
			return false;
		}
		
		return true;
	}
	
	public boolean isMedicalLicenseValid(String license)throws IllegalArgumentException {
		//if the license is empty then it is not valid
		if(license.isBlank()) {
			throw new IllegalArgumentException("All the fields must have a value!");
		}
		//if the license contains spaces than it is not valid
		if(license.contains(" ")) {
			return false;
		}
		//the size of the license must be exactly 5 or else it is not valid
		if(license.length()!=5) {
			return false;
		}
		//the license must contain only numbers in order to be valid
		for(int i=0;i<license.length();i++) {
			if(license.charAt(i)<=47||license.charAt(i)>=58) {
				return false;
			}
		}
		
		return true;
	}
	
	public boolean is_Hospital_Or_Specialty_Valid(String hospital_Or_Specialty)throws IllegalArgumentException {
		//if hospital name or medical specialty are empty than they are not valid
		if(hospital_Or_Specialty.isBlank()) {
			throw new IllegalArgumentException("All the fields must have a value!");
		}
		//if hospital name or medical specialty contain numbers than they are not valid
		for(int i=0;i<hospital_Or_Specialty.length();i++) {
			if((hospital_Or_Specialty.charAt(i)>=48 && hospital_Or_Specialty.charAt(i)<=57)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean doesContainNumber(String string)throws IllegalArgumentException {
		//if the field is empty then it is not valid
		if(string.isBlank()) {
			throw new IllegalArgumentException("All the fields must have a value!");							
		}
		//if the field contains numbers then return true
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)>=48 && string.charAt(i)<=57) {
				return true;
			}
		}
		return false;
		
	}
	
	public boolean isMedicalStateValid(String MedicalState)throws IllegalArgumentException {
		//if medical state is empty then it is not valid
		if(MedicalState.isBlank()) {
			throw new IllegalArgumentException("All the fields must have a value!");
		}
		//the medical state must be one of the options below in order to be valid
		if(MedicalState.equalsIgnoreCase("good")||MedicalState.equalsIgnoreCase("fair")||
				MedicalState.equalsIgnoreCase("serious")||MedicalState.equalsIgnoreCase("critical")||
				MedicalState.equalsIgnoreCase("dead")) {
				 
			return true;
		}
		return false;//if medical state is not one of the options above then it is not valid
		
	}
	
	public boolean is_Corona_Virus_Status_Valid(String CoronaVirusStatus)throws IllegalArgumentException {
		//if the field corona virus status is empty then it is not valid
		if(CoronaVirusStatus.isBlank()) {
			throw new IllegalArgumentException("All the fields must have a value!");
		}
		//the field corona virus status must be positive or negative in order to be valid
		if(CoronaVirusStatus.equalsIgnoreCase("positive")||CoronaVirusStatus.equalsIgnoreCase("negative")) {
			return true;
		}
		return false;
	}
	
	public boolean is_Selected_Field_Valid(String selectedField) {
		//if the field the doctor entered is empty then it is not valid
		if(selectedField.isBlank()) {
			throw new IllegalArgumentException("");
		}
		//the doctor must write the name of one of the fields below or else it is not valid
		if(selectedField.equalsIgnoreCase("Symptoms")||selectedField.equalsIgnoreCase("Corona virus status")||
				selectedField.equalsIgnoreCase("Side effects")||selectedField.equalsIgnoreCase("Medicines")||
				selectedField.equalsIgnoreCase("Disease name")||selectedField.equalsIgnoreCase("Medical state")||
				selectedField.equalsIgnoreCase("Notes from doctor")) {
			return true;
			
		}
		return false;
		
	}
	
}
