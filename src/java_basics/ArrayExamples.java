package java_basics;

public class ArrayExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int empID1 =12345;
		int empID2 =67890;
		int empID3 =78945;
		
		System.out.println("Employee ID 1: " + empID3);
		
		//Syntax to declare an array
		//datatype>[] arrayName = new <datatype>[size];
		
		//declaring an array to store employee ID
		int[] empIDs = new int[3];
		
		empIDs[0] = 12345;
		empIDs[1] = 12345;
		empIDs[2] = 12345;
		
		//for-each loops to iterate through the array and print employee IDs
		for(int i: empIDs ) {
			System.out.println("Employee ID: " + i);
		}
		
		
		System.out.println("Employee ID at index 2: " + empIDs[2]);
		
		//declaring and initializing an array in one line
		String[] empNames = {"Jhon Doe", "Jane Smith", "Alice Johnson"};
		
		
		for(int i=0; i<3; i++  ) {
			System.out.println("Employee ID at index " + i + ": " + empIDs[i]);
			  
		}
		
		
	}
}
