package interfaceConcept;

public class BMWCar implements Car {

	

	@Override
	public void carInsurance() {
		System.out.println("BMWcarInsurance is called!");
	}

	@Override
	public void carFuelType() {
		System.out.println("BMWcarFuelType is called!");
		
	}

	@Override
	
	public void carRC() {
		System.out.println("BMWcarRC is called!");
		
	}
	
	public void BMWSafety()
	{
		System.out.println("BMWSafety is called ");
	}
	
	
	

}
