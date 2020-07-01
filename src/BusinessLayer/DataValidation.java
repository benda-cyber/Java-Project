package BusinessLayer;

public class DataValidation {
	
	public boolean isNameValid(String name) {
		
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)==32||(name.charAt(i)>=48 && name.charAt(i)<=57)) {
				return false;
			}
	}
		return true;
	}

	
	public  boolean isIdValid(String id) {
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
	public boolean isUsernameValid(String Username) {
		if(Username.length()<4 || Username.length()>10) {
			return false;
		}
		for(int i=0;i<Username.length();i++) {
			if(Username.charAt(i)==32||(Username.charAt(i)>=48 && Username.charAt(i)<=57)) {
				return false;
			}
		}
		return true;
		
	}
	public boolean isPasswordValid(String Password) {
		if(Password.length()<6 || Password.length()>20) {
			return false;
		}
		for(int i=0;i<Password.length();i++) {
			if(Password.charAt(i)==32) {
				return false;
			}
		}
		return true;
	}
	
	public boolean isMedicalLicenseValid(String license) {
		if(license.length()<5 ||license.length()>10) {
			return false;
		}
		for(int i=0;i<license.length();i++) {
			if(license.charAt(i)==32||license.charAt(i)<=47||license.charAt(i)>=58) {
				return false;
			}
		}
		
		return true;
	}

}
