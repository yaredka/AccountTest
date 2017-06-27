import java.util.Date;

public abstract class Transaction {
	private int id;
	private int amount;
	private Date timeStamp;
	
	private static int nTransactions = 0;
	
	public Transaction(int amount) {
		this.amount = amount;
		nTransactions++;
		id = nTransactions;
		timeStamp = new Date();
	}
	
	public String toString() {
		return timeStamp + " [" + id + "] " + amount;
	}
	
	public abstract void print();

}
