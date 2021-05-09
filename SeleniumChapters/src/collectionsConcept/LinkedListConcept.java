package collectionsConcept;

import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		LinkedList<Integer> ll=new LinkedList<Integer>();
		
		ll.add(100);
		ll.add(200);
		ll.add(300);
		ll.addFirst(222);
		ll.addLast(900);
		ll.set(0, 111);
		
		
 //using forloop
for(int i=0;i<ll.size();i++){
	System.out.println(ll.get(i));
}

System.out.println("***Advance for loop****");

//Advance forloop
for(int a:ll){
	System.out.println(a);
}
		




	}

}
