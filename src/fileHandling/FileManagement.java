package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class FileManagement {

	public static void main(String[] args) {
		// create this reference of the file name and path mentioned
		File objFile = new File("C:\\Users\\Vivek\\Execution.log");

		try {
			if(objFile.createNewFile()) {
				System.out.println("File created");
			}else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			}
		
		//create an object write content in the file which was created
		try {
			FileWriter objWrite = new FileWriter("EcecutionLog.log",true);
			
			//Write the content an close the file
			objWrite.write("Test ecuction started");
			objWrite.write("\nExecuting test case number 1");
			objWrite.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		//Read the content from the file
		try {
			Scanner objRead = new Scanner(objFile);
			
			while(objRead.hasNextLine()) {
				System.out.println(objRead.nextLine());
			}
			
		} catch (FileNotFoundEcception e) {
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("File content read completely");
		
		
		//delete the file
		if(objFile.delete() ) {
			System.out.println(objFile.getName() + " file has been duccessfully deleted");
			
		}
	}
}
