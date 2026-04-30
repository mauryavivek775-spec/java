package regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Find out if there are any occurrences of the world "java" in a sentence.

public class RegexExample {

	public static void main(String[] args) {
		String sentence = "I am learning java programming language.";
		Pattern pat = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
		Matcher mat = pat.matcher(sentence);
		boolean found = mat.find();
		
		if(found) {
			System.out.println("The word 'java' is in the sentence.");
		
		}else {
			System.out.println("The word 'java' is not found int the sentence.");
		}

	}

}
