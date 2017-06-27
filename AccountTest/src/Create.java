
public class Create extends Transaction {

	public Create(int amount) {
		super(amount);
	}
	
	public void print() {
		System.out.println(super.toString() + " created");
	}

}
