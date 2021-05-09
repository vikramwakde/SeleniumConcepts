package JavaConcepts;

public class ArrayConcept {

	public static void main(String[] args) {
		// Array used to store same data type-to overcome this use object array
		//lowest bound is o and the highest bound is n-1
		
		//single dimensional array
		//size if fixed -to overcome this we will use collections
		//
			
		
		int a[] = new int[4];
		 a[0]=10;
		 a[1]=20;
		 a[2]=30;
		 a[3]=40;
		
		System.out.println(a[0]);
		//System.out.println(a[4]);//array out of boundary exception
		
		
		//to find the length of the array
		int length=a.length;
		System.out.println(length);

		// to print all the values o`f array
		
		for(int i=0;i<length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		
	}

}
