package dataStructure;

import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
		//creating an object of HashSet
		HashSet<String> objBrowsers = new HashSet<String>();
		objBrowsers.add("Edge");
		objBrowsers.add("Chrome");
		objBrowsers.add("Firefox");
		objBrowsers.add("Chorme"); //duplicate values
		
		System.out.println("======Displaying value in HashSet=====");
		System.out.println(objBrowsers);
		//objBrowsersHS.remove("Firefox");
		System.out.println("======Displaying the updated list of value in HashSet=====");
		//System.out.println(objBrowsersHS);
		
		//create an object of TreeSet
		TreeSet<String> objBrowsersTS = new TreeSet<String>();
		objBrowsersTS.add("Edge");
		objBrowsersTS.add("Chrome");
		objBrowsersTS.add("Firefox");
		System.out.println("======Displaying value in TreeSet=====");
		System.out.println(objBrowsersTS);
		
		
		
		
	}

}
