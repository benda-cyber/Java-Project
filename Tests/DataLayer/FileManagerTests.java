package DataLayer;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileManagerTests {

	FileManager fileManager=FileManager.getFileManager();
	
	@Test
	public void testDoesFileExist() {
		boolean doesFileExist=fileManager.doesFileExist("Doctors.txt");
		assertTrue(doesFileExist);
	}
	
	@Test
	public void isFileEmpty() {
		boolean isFileEmpty=fileManager.isFileEmpty("Doctors.txt");
		assertFalse(isFileEmpty);
	}
	
	
	

}
