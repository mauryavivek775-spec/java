
public class DatatypeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 30;
		
		//Primitive Data Type
		//Numerical Data Type - Primitive
		byte smallNumber =127; // Range: -128 to 127
		short mediumNumber = 32767; 
		int largeNumber = 5;
		long biggerNumber = 10000000000000000L;
		
		float price = 19.99f;
		double precisePrice = 19.9999999999;
		
		//Non Numerical Data Types - Primitives
		
		char grade = 'A';
		boolean execPass = false;
		
		//Non-Primitive Data Type
		String name = "John Doe";
		
		//Wide Casting - Automatic Type Conversion
		
		int num1 = 100;
		System.out.println(num1);
		
		double num2 = num1;
		System.out.println(num2);
		
		System.out.println(smallNumber);
		float num3 = smallNumber;
		System.out.println(num3);
		
		//Narrow Casting - Automatic Type Conversion
		
		System.out.println("Narrow Casting Example:");
		System.out.println(precisePrice);
		byte num4 = (byte) precisePrice;
		System.out.println(num4);
		System.out.println(num3);
		
		
		
	}

}
