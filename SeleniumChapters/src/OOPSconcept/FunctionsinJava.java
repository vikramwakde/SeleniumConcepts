package OOPSconcept;

public class FunctionsinJava {

	public static void main(String[] args) {//static methods and its always void never return anything
		
	
	
	FunctionsinJava obj=new FunctionsinJava();
	
	
	//after creating object copy of all non static methods will be given to this object
	obj.test();
	int result=obj.test2();
	System.out.println(result);
	
	
	}
	
	/*non static methods
	 * we need create object for non static methods
	/ functions and methods both are same*/
	
	//method1:no input no output and void does not return anything
		public void test() {
			System.out.println("My first method without return type");
			
		}
		
		//method 2 : no input some output
		public int test2() {
			System.out.println("My second method with return type");
			int a=10;//local variables
			int b=20;
			int c=a+b;
			return c;
			
		}
		
		 
		public String test3() {//same as above
			System.out.println();
			String s="selenium";//lv
			return s;
		}
		
		
		public int test4(int x, int y)
		{
			int z=x+y;
			return z;
		}

	}


