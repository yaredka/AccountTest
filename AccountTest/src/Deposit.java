
public class Deposit extends Transaction {
	
	public Deposit(int amount) {
		super(amount);		
	}

	public void print() {
		System.out.println(super.toString() + " deposit");
	}

}
