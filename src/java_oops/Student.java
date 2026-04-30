package java_oops;

public class Student {
	
	 String name;
	public Student (String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		

		Student S = new Student("vis");
		System.out.println(S.name);
	}

}
