package java_oops;

public class MethodExamples {

	void login() {
		System.out.println("Enter username: admin");
		System.out.println("Enter password: admin@123");
		System.out.println("Click on login button");
		System.out.println("Login successful");
	}

		
		void search( ) {
			System.out.println("Enter product name: iPhone 14");
			System.out.println("Click on a search button");
			System.out.println("Search result displayed");
	}
		
		void addToCart( ) {
			System.out.println("Select product name: iPhone 14");
			System.out.println("Click to search button");
			System.out.println("Product added to cart");
			
		}
		
		void logout( ) {
			System.out.println("Click on logiut button");
			System.out.println("Logout successful");
		}
		
		void login(String uid, String pwd, String captch) {
			System.out.println("Enter username: " + uid);
			System.out.println("Enter password: " + pwd);
			System.out.println("Click on login button");
			System.out.println("Login successful");
		}
		
		//void search(String watch) {
			//System.out.println("Enter product name: watch");
			//System.out.println("Click on a search button");
			//System.out.println("Search result displayed");
	//}
			
		void search(String pdt, int number) {
			System.out.println("Enter hotel name: " + pdt);
			System.out.println("Brand name: " + number);
			System.out.println("Click on a search button");
			System.out.println("Search result displayed");
		}
		
			public static void main(String[]args) {
				//Syntax to create object of class
				//<className> objectName = new <className>();
				MethodExamples obj = new MethodExamples();
				//obj.login();
				//obj.search();
				
				
				//obj.search("Rolex");
				
				obj.search("hotel", 12345);
				
				
				
			}	
			}
		


