
public class TransferTo extends Transaction {
	
	private String name;

	public TransferTo(int amount, String name) {
		super(amount);
		this.name = name;
	}

	public void print() {
		System.out.println(super.toString() + " transfered to " + name);

	}

}
