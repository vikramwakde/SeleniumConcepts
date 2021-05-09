package collectionsConcept;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {

		/*
		 * Treeset maintains sorted order-ascending order Doesnot allow null object Does
		 * not allow duplicates
		 * 
		 */

		TreeSet<Integer> mySet = new TreeSet<Integer>();
		mySet.add(100);
		mySet.add(200);
		mySet.add(10);
		mySet.add(10);
		//mySet.add(null);
		

		System.out.println(mySet);

		TreeSet<String> s = new TreeSet<String>();// cannot create object for interface set
		s.add("Selenium");
		s.add("QTP");
		s.add("Appium");
		// s.add(null);
		// s.add(null);
		s.add("Selenium");

		System.out.println(s);
	}

}
