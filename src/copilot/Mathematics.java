package copilot;

public class Mathematics {
	
	int addition;
	int number1, number2;
	
	//method to perform addition of two numbers
	public int add(int a, int b) {
		this.number1 = a;
		this.number2 = b;
		this.addition = number1 + number2;
		return addition;
	}

	// Method to calculate the factorial of a number
	public static long factorial(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("Number must be non-negative.");
		}
		if (n == 0 || n == 1) {
			return 1;
		}
		long result = 1;
		for (int i = 2; i <= n; i++) {
			result *= i;
		}
		return result;
	}
	
	//method to calculate the square root of a number
	public static double squareRoot(double n) {
		if (n < 0) {
			throw new IllegalArgumentException("Number must be non-negative.");
		}
		return Math.sqrt(n);
	}
	
	
	//method to calculate the power of a number - suggested based on the comments
	public static double power(double base, double exponent) {
		return Math.pow(base, exponent);
	}

	public static void main(String[] args) {
		int number = 5;
		System.out.println("Factorial of " + number + " is: " + factorial(number));
		double squareRootNumber = 16.0;
		System.out.println("Square root of " + squareRootNumber + " is: " + squareRoot(squareRootNumber));
		
		System.out.println("Addition of 10 and 20 is: " + new Mathematics().add(10, 20));
		System.out.println("2 raised to the power of 3 is: " + power(2, 3));

	}

}
