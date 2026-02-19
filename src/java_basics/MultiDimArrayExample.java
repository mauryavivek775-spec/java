package java_basics;

public class MultiDimArrayExample {

	public static void main(String[] args) {

		int[] empIDs = new int[3];
		empIDs[0] = 12345;
		empIDs[1] = 12345;
		empIDs[2] = 12345;
		
		//Two-dimensional array to store employee credentials (username and password)
		String[][] empCredentials = new String[3][2];
		empCredentials[0][0]= "admin";
		empCredentials[0][1]= "admin123";
		empCredentials[1][0]= "use1";
		empCredentials[1][1]= "user@123";
		empCredentials[2][0]= "use2";
		empCredentials[2][1]= "user@456";
		
		//iterate the columns
		for(int i=0; i<empCredentials[0].length; i++) {
			//iterate the row
			for(int j=0; j<empCredentials.length; j++) {
				System.out.println("Employee Credential: row" + j + " column" + i + ":" + empCredentials[j][i]);

	}
		}

}
}
