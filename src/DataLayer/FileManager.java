package DataLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;

import BusinessLayer.Doctor;





public class FileManager {
	private static FileManager fileManager;
	
	private FileManager() {
		
	}
	
	//using design pattern of singleton
	public static FileManager getFileManager() {
		if(fileManager==null) {
			fileManager=new FileManager();
		}
		return fileManager;
	}
	
	public boolean doesFileExist(String filename) {
		File file=new File(filename);
		return file.exists();
		
	}
	public void createFile(String filename)throws IOException {
		File file=new File(filename);
		file.createNewFile();
	}
	
	public boolean isFileEmpty(String filename) {
		File file=new File(filename);
		if(file.length()==0) {
			return true;
		}
		return false;
	}
	
	//reading the data from the file to data structure 
	@SuppressWarnings("unchecked")
	public HashSet<Doctor> readFile(String filename) throws IOException,ClassNotFoundException{
		ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(filename));
		HashSet<Doctor> doctors=(HashSet<Doctor>)objectInputStream.readObject();
		objectInputStream.close();
		return doctors;	
	}
	//writing the data from data structure to the file
	public void writeFile(String filename,HashSet<Doctor> doctors)throws IOException{
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(filename));
		objectOutputStream.writeObject(doctors);
		objectOutputStream.close();
	}
		
	
}
