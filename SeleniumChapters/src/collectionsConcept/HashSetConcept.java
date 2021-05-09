package collectionsConcept;

import java.util.HashSet;
import java.util.Set;

public class HashSetConcept {

	public static void main(String[] args) {

		/*
		 * doesnot maintain any order allow null value no duplicates are allowed
		 * insertion is easy
		 */

		Set<Integer> s = new HashSet<Integer>();// cannot create object for interface set
		
		/*s.add("Selenium");
		s.add("QTP");
		s.add("Appium");
		s.add("AutoIT");
		s.add("Sikuli");
		s.add(null);
		s.add(null);
		s.add("Selenium");*/
		
		s.add(112);
		s.add(10);
		s.add(23);
		s.add(1);
		
		
		

		for (int a : s) {
			System.out.println(a);
		}

		//System.out.println(s.contains("Sikuli"));
		
	}

}
