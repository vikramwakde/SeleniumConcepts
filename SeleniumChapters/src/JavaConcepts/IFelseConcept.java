package JavaConcepts;

public class IFelseConcept {

	public static void main(String[] args) {
		int a =100;
		int b=20;
		
		if(a>b) {
			System.out.println("a is greater than b");
		}
			else {
				System.out.println("b is greater");
			}
		

	//comparison operator < <= >= == !=
		
		//= ->
	int c=100;
	int d =200;
	
	if(c==d) {
		System.out.println("c and d are equal");
	}else {
		System.out.println("Both c and d are not equal");
	}
	
	
	
//	nested if
	//conditional operator=AND / OR
	
int a1=100;
int b1=20;
int c1=300;

if(a1>b1 && a1>c1) //true&true=true
{ 
	System.out.println("a1 is greater");
}
else if(b1>c1) {
	System.out.println("b1 is greater");
}

else {
	System.out.println("c1 is greater");
}
	}
}


