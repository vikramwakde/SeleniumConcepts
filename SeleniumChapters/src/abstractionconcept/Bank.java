package abstractionconcept;

//partial abstraction is achieved
//hidding the implementation logic
//abstract class has both abstract and non abstract method
//cannot create object of abstract type

public abstract class Bank {
	
	public abstract void loan();//abstract method
	
	public void debitcard()
	{
		System.out.println("Debit card information is called");
	}
	
	public void creditcard()//non abstract method
	{
		System.out.println("creditcard information is called");
	}
	

}
