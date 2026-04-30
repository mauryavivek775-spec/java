package iostream;

import java.io.*;

public class IOTExample {

	public static void main(String[] args) throws IOException {
		
		String str = "Automation text executed successfully.";
		try {
		FileOutputStream fos = new FileOutputStream("log.txt",true);
		fos.write(str.getBytes());
		System.out.println("File Created and content written successfully.");
		fos.close();
		
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		

	}

}
