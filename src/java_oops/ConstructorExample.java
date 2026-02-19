package java_oops;

public class ConstructorExample {

	String name;
	int age;
	 
	//constructor - special method use to initialize the state of an object //constructor name
	ConstructorExample(){
		name = "Raj";
		age = 24;
		System.out.println(name + " " + age);
	}
	
	
	
	public static void main(String[] args) {
		ConstructorExample obj = new ConstructorExample();

	}

}
