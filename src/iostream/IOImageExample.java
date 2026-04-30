package iostream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOImageExample {

public static void main(String[] args) throws IOException {
		
		try {
		FileInputStream fis = new FileInputStream("C:\\Users\\Vivek\\eclipse-workspace\\java\\src\\ioExample\\Nitro1.png");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Vivek\\eclipse-workspace\\java\\src\\ioExample\\Nitro2.png");
		
		int data; //to read the data from the file and store it in this variable.
		while((data=fis.read())!=-1){
			fos.write(data);
			
		}
		System.out.println("image copied successfully.");
		fis.close();
		
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
		}
		

	}

}
