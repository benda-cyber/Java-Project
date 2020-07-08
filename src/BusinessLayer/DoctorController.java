package BusinessLayer;

import java.io.IOException;

public class DoctorController {
	private static DoctorController doctorController;
	private DoctorService doctorService;
	
	private DoctorController() {
		
	}
	public static DoctorController getDoctorController() {
		if(doctorController==null) {
			doctorController=new DoctorController();
		}
		return doctorController;
	}
	public boolean removeDoctor(Doctor doctor,String yes_or_no)
			throws IllegalArgumentException,IOException,ClassNotFoundException,Exception {
		if(yes_or_no.equalsIgnoreCase("yes")) {
			doctorService=DoctorService.getDoctorService();
			doctorService.removeDoctor(doctor);
			return true;
		}
		if(yes_or_no.equalsIgnoreCase("no")) {
			return false;
		}
		throw new IllegalArgumentException("The only options are yes or no!");
	}
	

}
