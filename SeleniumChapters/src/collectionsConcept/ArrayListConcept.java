package collectionsConcept;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		int a[]=new int[3];
		
		//dynamic aray -->ArrayList
		//donot define the size
		//maintains insertion order
		//non synchronised hence its slow
		
		
		//ArrayList al=new ArrayList();
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(null);
		al.add(null);
		
		
		//al.add("hello");
		//al.add(true);
		
		System.out.println(al.size());//size of arraylist
		
		System.out.println("*****************************");
		
		System.out.println(al.get(2));// to get the specific value
		System.out.println(al.get(1));
		
		System.out.println("*****************************");
		
		//to print the values from ArrayList use for loop 
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		
		

	}

}
