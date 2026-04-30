package iostream;

import java.io.*;

public class BufferedWriterExample {

	public static void main(String[] args) {
		try {
		BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt",true));
		bw.write("Automation execution started.\n");
		bw.write("Test cases 1 passed.\n");
		bw.write("Test cases 2 failed.\n");
		bw.close();
		System.out.println("Content written to file successfully");
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
