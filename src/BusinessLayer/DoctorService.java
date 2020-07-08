package BusinessLayer;

import java.io.IOException;

import DataLayer.DataBase;

public class DoctorService {
	private static DoctorService doctorService;
	private DataBase dataBase;
	
	private DoctorService() {
		
	}
	
	public static DoctorService getDoctorService() {
		if(doctorService==null) {
			doctorService=new DoctorService();
		}
		return doctorService;
	}
	public void removeDoctor(Doctor doctor)throws IOException,ClassNotFoundException,Exception {
		dataBase=DataBase.getDataBase();
		dataBase.removeDoctor(doctor);
	}

}
