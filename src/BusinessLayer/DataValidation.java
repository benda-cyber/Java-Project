package BusinessLayer;

public class DataValidation {
	
	public boolean isNameValid(String name)throws IllegalArgumentException {
		
		if(name.isBlank()) {
			throw new IllegalArgumentException("All the fields must have a value!");
		}
		if(name.contains(" ")) {
			return false;
		}
		for(int i=0;i<name.length();i++) {
			if((name.charAt(i)>=48 && name.charAt(i)<=57)) {
				return false;
			}
	}
		return true;
	}

	
	public  boolean isIdValid(String id)throws IllegalArgumentException {
		if(id.isBlank()) {
			throw new IllegalArgumentException("All the fields must have a value!");
		}
		if(id.contains(" ")) {
			return false;
		}
		if(id.length()!=9) {
			return false;
		}
		
		for(int i=0;i<id.length();i++) {
			if(id.charAt(i)<=47||id.charAt(i)>=58) {
				return false;
			}
		}
		return true;
	}
	public boolean isUsernameValid(String username)throws IllegalArgumentException {
		if(username.isBlank()) {
			throw new IllegalArgumentException("All the fields must have a value!");
		}
		if(username.contains(" ")) {
			return false;
		}
		if(username.length()<4 || username.length()>10) {
			return false;
		}
		for(int i=0;i<username.length();i++) {
			if((username.charAt(i)>=48 && username.charAt(i)<=57)) {
				return false;
			}
		}
		return true;
		
	}
	public boolean isPasswordValid(String password)throws IllegalArgumentException {
		if(password.isBlank()) {
			throw new IllegalArgumentException("All the fields must have a value!");
		}
		if(password.contains(" ")) {
			return false;
		}
		if(password.length()<6 || password.length()>20) {
			return false;
		}
		
		return true;
	}
	
	public boolean isMedicalLicenseValid(String license)throws IllegalArgumentException {
		if(license.isBlank()) {
			throw new IllegalArgumentException("All the fields must have a value!");
		}
		if(license.contains(" ")) {
			return false;
		}
		if(license.length()!=5) {
			return false;
		}
		for(int i=0;i<license.length();i++) {
			if(license.charAt(i)<=47||license.charAt(i)>=58) {
				return false;
			}
		}
		
		return true;
	}
	
	public boolean is_Hospital_Or_Specialty_Valid(String hospital_Or_Specialty)throws IllegalArgumentException {
		if(hospital_Or_Specialty.isBlank()) {
			throw new IllegalArgumentException("All the fields must have a value!");
		}
		for(int i=0;i<hospital_Or_Specialty.length();i++) {
			if((hospital_Or_Specialty.charAt(i)>=48 && hospital_Or_Specialty.charAt(i)<=57)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean doesContainNumber(String string)throws IllegalArgumentException {
		if(string.isBlank()) {
			throw new IllegalArgumentException("All the fields must have a value!");							
		}
		
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i)>=48 && string.charAt(i)<=57) {
				return true;
			}
		}
		return false;
		
	}
	
	public boolean isMedicalStateValid(String MedicalState)throws IllegalArgumentException {
		
		if(MedicalState.isBlank()) {
			throw new IllegalArgumentException("All the fields must have a value!");
		}
		if(MedicalState.equalsIgnoreCase("good")||MedicalState.equalsIgnoreCase("fair")||
				MedicalState.equalsIgnoreCase("serious")||MedicalState.equalsIgnoreCase("critical")||
				MedicalState.equalsIgnoreCase("dead")) {
				 
			return true;
		}
		return false;
		
	}
	
	public boolean is_Corona_Virus_Status_Valid(String CoronaVirusStatus)throws IllegalArgumentException {
		if(CoronaVirusStatus.isBlank()) {
			throw new IllegalArgumentException("All the fields must have a value!");
		}
		if(CoronaVirusStatus.equalsIgnoreCase("positive")||CoronaVirusStatus.equalsIgnoreCase("negative")) {
			return true;
		}
		return false;
	}
	
}
