package enums;

enum Website {
	AMAZON,
	FILPKART,
	MESSHO
}

public class EnumAss {

	public static void main(String[] args) {
		LunchWebsite(Website.AMAZON);

	}

	public static void LunchWebsite(Website Websitename) {
		switch(Websitename) {
		case AMAZON:
			System.out.println("Lunching amazon wesite");
			break;
		case FILPKART:
			System.out.println("Lunching filpkart wesite");
			break;
		case MESSHO:
			System.out.println("Lunching messho wesite");
			break;
						
		}
		
	}

}
