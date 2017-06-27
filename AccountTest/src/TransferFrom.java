
public class TransferFrom extends Transaction {

	private String name;

	public TransferFrom(int amount, String name) {
		super(amount);	
		this.name = name;
	}
	
	public void print( ){
		System.out.println(super.toString() + " transferred from " + name);
	}

}