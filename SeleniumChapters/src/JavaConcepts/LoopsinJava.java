package JavaConcepts;

public class LoopsinJava {

	public static void main(String[] args) {
		
// 1.while loop: 
		int i=1;//initialization
		while(i<=10)//conditional
		{
			System.out.println(i);
			i=i+1;// disadvantage: incremental part it will generate infinite loop
			//i++;//incremental decremental
		}
		
		
		//2.for loop
		
		for(int j=1;j<=10;j++)//intialization;conditional;increment /decrement
		{
			System.out.println(j);
		}
		
		//print 10 to 1
		for(int k=10;k>=0;k--)
		{
			System.out.println(k);
		}
		
		
		
		
		

	}

}
