package inheritanceConcept;

public class BMW extends Car{

	//Method overriding-when same method is present in both parent & childclass with same name and same number of arugments
		
		public void start() {//overridden method
			
			System.out.println("BMW CAR----Started");
		}
			
			public void safety() {
				
				System.out.println("BMW CAR----safety");
			
		}

	}


