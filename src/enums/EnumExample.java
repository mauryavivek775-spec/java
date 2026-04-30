package enums;
enum Browser {
	CHROME,
	FIREFOX,
	EDGE
}


public class EnumExample {

	public static void main(String[] args) {
		launchBrowser(Browser.CHROME);
		launchBrowser(Browser.EDGE);
		launchBrowser(Browser.FIREFOX); 
		
	}

	public static void launchBrowser(Browser browserName) {
		switch(browserName) {
		case CHROME:
			System.out.println("Lunching Chrome browser");
			break;
		case FIREFOX:
			System.out.println("Lunching Firefox browser");
			break;
		case EDGE:
			System.out.println("Lunching Edge browser");
			break;
			default:
				System.out.println("Invalid browser name");
				
			
		}
		


	}

}
