package BusinessLayer;

public class DataValidation {
	
	public boolean isNameValid(String name)throws IllegalArgumentException {
		
		if(name.length()==0) {
			throw new IllegalArgumentException("Name cannot be empty! ");
		}
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==32||(name.charAt(i)>=48 && name.charAt(i)<=57)) {
				return false;
			}
	}
		return true;
	}

	
	public  boolean isIdValid(String id)throws IllegalArgumentException {
		if(id.length()==0) {
			throw new IllegalArgumentException("id cannot be empty!");
		}
		if(id.length()!=9) {
			return false;
		}
		for(int i=0;i<id.length();i++) {
			if(id.charAt(i)==32||id.charAt(i)<=47||id.charAt(i)>=58) {
				return false;
			}
		}
		return true;
	}
	public boolean isUsernameValid(String username)throws IllegalArgumentException {
		if(username.length()==0) {
			throw new IllegalArgumentException("Username cannot be empty!");
		}
		if(username.length()<4 || username.length()>10) {
			return false;
		}
		for(int i=0;i<username.length();i++) {
			if(username.charAt(i)==32||(username.charAt(i)>=48 && username.charAt(i)<=57)) {
				return false;
			}
		}
		return true;
		
	}
	public boolean isPasswordValid(String password)throws IllegalArgumentException {
		if(password.length()==0) {
			throw new IllegalArgumentException("Password cannot be empty!");
		}
		if(password.length()<6 || password.length()>20) {
			return false;
		}
		for(int i=0;i<password.length();i++) {
			if(password.charAt(i)==32) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isMedicalLicenseValid(String license)throws IllegalArgumentException {
		if(license.length()==0) {
			throw new IllegalArgumentException("Medical license cannot be empty!");
		}
		if(license.length()!=5) {
			return false;
		}
		for(int i=0;i<license.length();i++) {
			if(license.charAt(i)==32||license.charAt(i)<=47||license.charAt(i)>=58) {
				return false;
			}
		}
		
		return true;
	}
	
	public boolean is_Hospital_Or_Specialty_Valid(String hospital_Or_Specialty)throws IllegalArgumentException {
		if(hospital_Or_Specialty.length()==0) {
			throw new IllegalArgumentException("Hospital name or medical specialty cannot be empty!");
		}
		for(int i=0;i<hospital_Or_Specialty.length();i++) {
			if((hospital_Or_Specialty.charAt(i)>=48 && hospital_Or_Specialty.charAt(i)<=57)) {
				return false;
			}
		}
		return true;
	}

}
