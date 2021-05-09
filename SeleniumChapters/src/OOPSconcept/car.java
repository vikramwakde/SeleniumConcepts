package OOPSconcept;

public class car {

	//class variables/glbl
	int carno;
	int modlno;
	
	public static void main(String[] args) {
		
		
		car obj1=new car();
		car obj2=new car();
		car obj3=new car();
		
		//new car --> Object of the class
		//obj1,obj2,obj3---> object reference variables
		//new---> used to create object 
		
		obj2.carno=3400;
		obj2.modlno=2349;
		
		obj1.carno=3400;
		obj1.modlno=9945;
		
		obj3.carno=8900;
		obj3.modlno=2345;
		
		System.out.println(obj2.carno);
		
		
		
		 

	}

}
