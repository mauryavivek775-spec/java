package java_basics;

public class ConditionStatements {

	public static void main(String[] args) {
		int age = 18;
		boolean citizen = true;
		
		if(age >= 18 && citizen) {
			System.out.println("You are eligible to Vote.");
		}else {
			System.out.println("You are not eligible to Vote.");
		}
		
		float marks = 15.5f;
		if(marks >=35 && marks < 60) {
			System.out.println("Grade: Pass Class");
		}else if(marks >=35 && marks < 75) {
			System.out.println("Grade: First Class");
			
		}
		
		//Nasted if-else
		int num1 = 155;
		int num2 = 20;
		int num3 = 30;
							
		if(num1 < num2) {
			System.out.println("Num1 is greater than Num2");
			if(num1 < num3) {
				System.out.println("Num1 is the greatest");
			}
			
		//Switch Case
				
				

				
		
			}
			
			
		}
	}

	


