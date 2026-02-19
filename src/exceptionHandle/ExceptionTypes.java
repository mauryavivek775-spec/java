package exceptionHandle;

public class ExceptionTypes {

	public static void main(String[] args) {
		// compile time error - Syntax error
		
		//int a = 100;
		//System.out.println(a);

		//Runtime error
		
		//int[] participantID = {1,2,3,4};
		//for(int i=0;i>=participantID.length;i++) {
			//System.out.println(participantID[i]);
		//}
		
		
		//Logical error
		//for(int i=0;i<=5;i--); {
		//System.out.println(i);
		//}

		//try {
		//Runtime error
		
		//int[] participantID = {1,2,3,4};
		//for(int i=0;i>=participantID.length;i++) {
			//System.out.println(participantID[i]);
		
		int a = 10;
		int balance = -1;
		
		try {
			if (balance<0) {
				throw new RuntimeException("invalid balance");
				
			}
		}
		
		}
}

}