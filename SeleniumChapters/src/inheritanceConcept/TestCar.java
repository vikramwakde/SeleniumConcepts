package inheritanceConcept;

public class TestCar {

	public static void main(String[] args) {
		
		//static polymorphism-compile time polymorphism
		BMW b=new BMW();
		b.start();//child methods
		b.stop();//from parent
		b.safety();//own bmw method
		
		System.out.println("*************");
		Car c=new Car();
		c.start();
		

	}

}
