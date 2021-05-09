package OOPSconcept;

public class MethodOverloading {
	
	/*Overloading--> method with same name with different arguments or input paramaters
	 * Dupicate method with same name and same number arguments are not allowed in the same class
	 * you cannot create a method inside another method
	 * we can overload main() method also
	 */
	

	public static void main(String[] args) {
		
		MethodOverloading ob=new MethodOverloading();
		ob.sum(100);
		ob.sum("Hello", 20);
		
	}
	
	public void sum() {
		System.out.println("Sum method-Zero Parameter");
	}
	
	
	public void sum(int a) {// single parameter
		System.out.println();
		System.out.println(a);
	}


	
	public void sum(String x,int y) {//double parameter with different data type
		System.out.println(x+y);
	}

}
 