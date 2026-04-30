package lambda;

import java.util.ArrayList;

public class LambdaExpExample {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
 
		System.out.println("Using for loop");
		for(int i=0; i<numbers.size(); i++) {
			System.out.println(" " + numbers.get(i));
		}
		System.out.println();
	
		System.out.println("Using for-each loop");
		for(Integer num: numbers) {
			System.out.println(" " + num);
		}
		System.out.println();
		
		System.out.println("Using lambda expression");
		numbers.forEach((num) -> System.out.println(" " + num));
	}

}
