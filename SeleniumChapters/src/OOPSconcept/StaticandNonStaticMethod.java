package OOPSconcept;

public class StaticandNonStaticMethod {

	//Global variable -scope of global variable is available across all the functions
	
	
	static int empno=1001;//static global variable
	String name="Subha";//non static global variables
	
	
public static void main(String[] args) {
		
		StaticandNonStaticMethod obj=new StaticandNonStaticMethod();
		
		obj.sketchers();//calling non static method
		nike();//calling static
		StaticandNonStaticMethod.nike();//calling static
		//obj.nike();
		

		System.out.println(empno);//calling static variable
		System.out.println(StaticandNonStaticMethod.empno);//calling static variable
		
		System.out.println(obj.name);
		
		
	}
	
	public static void nike() {//static function
		System.out.println("NIKE is called!");
	}

	
	public void sketchers()//non static function
	{
		System.out.println("Sketchers is called!");
	}
	
	

}
