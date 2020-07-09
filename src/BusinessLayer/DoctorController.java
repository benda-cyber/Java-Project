package BusinessLayer;

import java.io.IOException;

public class DoctorController {
	private static DoctorController doctorController;
	private DoctorService doctorService;
	
	private DoctorController() {
		
	}
	//using design pattern of singleton
	public static DoctorController getDoctorController() {
		if(doctorController==null) {
			doctorController=new DoctorController();
		}
		return doctorController;
	}
	public boolean removeDoctor(Doctor doctor,String yes_or_no)
			throws IllegalArgumentException,IOException,ClassNotFoundException,Exception {
		//if doctor chose yes then go to database in order to delete the doctor
		if(yes_or_no.equalsIgnoreCase("yes")) {
			doctorService=DoctorService.getDoctorService();
			doctorService.removeDoctor(doctor);
			return true;
		}
		//if the doctor chose no then dont do anything
		if(yes_or_no.equalsIgnoreCase("no")) {
			return false;
		}//if doctor chose something else then it is not valid
		throw new IllegalArgumentException("The only options are yes or no!");
	}
	

}
