package DataLayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Set;


public class FileManager {
	private static FileManager fileManager;
	
	private FileManager() {
		
	}
	
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
	
	public Set<?> readFile(String filename) throws IOException,ClassNotFoundException{
		ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream(filename));
		Set<?> persons=(Set<?>)objectInputStream.readObject();
		objectInputStream.close();
		return persons;	
	}
	public void writeFile(String filename,Set<?> persons)throws IOException{
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(filename));
		objectOutputStream.writeObject(persons);
		objectOutputStream.close();
	}
		
	
}
