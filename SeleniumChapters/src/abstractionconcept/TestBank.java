package abstractionconcept;

public class TestBank {

	public static void main(String[] args) {
		
		HDFCBank b=new HDFCBank();
		//Bank b1=new Bank();
		b.creditcard();
		b.debitcard();
		b.hdfcDeposit();
		b.loan();

	}

}
