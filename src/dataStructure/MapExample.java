package dataStructure;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;


public class MapExample {

	public static void main(String[] args) {
		//Map is an interface - stores elements in key-value pair format
		//Classes that inherits map interface - HashMap, TreeMap, LinkedHasMap
		//HashMap - Store elements in random order
		//TreeMap - Stores the key in sorted order
		//LinkedHasMap - Stores the keys in the order of insertion
		
		HashMap<Integer,String> empDtlsHM = new HashMap<Integer,String>();
		empDtlsHM.put(1, "Parth");
		empDtlsHM.put(2, "Vivek");
		empDtlsHM.put(3, "Sarita");
		empDtlsHM.put(1, "Vanita"); //duplicate key
		
		System.out.println("======Printing the list of all keys========");
		for(int i: empDtlsHM.keySet()) {
			System.out.println(i);	
		}

		System.out.println("======Printing the list of all Values========");
		for(String i: empDtlsHM.values()) {
			System.out.println(i);	
		}
		
		System.out.println("======Printing the list of all keys and their Values========");
		for(int i: empDtlsHM.keySet()) {
			System.out.println("For key: " + i + " the value is " +  empDtlsHM.get(i));	
		}
		
		System.out.println(empDtlsHM.containsKey(4));
		System.out.println(empDtlsHM.containsValue("Vivek"));
		
		System.out.println("Removing key 2");
		empDtlsHM.remove(2);
		
		System.out.println("======Printing the updated list of all keys and their Values========");
		for(int i: empDtlsHM.keySet()) {
			System.out.println("For key: " + i + " the value is " +  empDtlsHM.get(i));	
		}
		
		
		
		TreeMap<Integer,String> empDtlsTM = new TreeMap<Integer,String>();
		empDtlsTM.put(6, "Ashish");
		empDtlsTM.put(5, "Amit");
		empDtlsTM.put(1, "Amit");
		
		System.out.println("======Printing the list of all keys========");
		for(int a: empDtlsTM.keySet()) {
			System.out.println(a);	
	}
		System.out.println("======Printing the list of all keys========");
		for(int a: empDtlsTM.keySet()) {
			System.out.println("For key: " + a + " the value is " + empDtlsTM.get(a));	

		}
		
		LinkedHashMap<Integer,String> empDtlsLHM = new LinkedHashMap<Integer,String>();
		empDtlsTM.put(10, "Viraj");
		empDtlsTM.put(8, "Virendra");
		empDtlsTM.put(11, "Shruti");
		for(int x: empDtlsLHM.keySet()) {
			System.out.println(x);	
	}
	}

}
