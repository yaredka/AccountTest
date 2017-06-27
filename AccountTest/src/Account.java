
public class Account {
	
	private int balance;
	private String owner;
	private int number;
	
	private Transaction[] transactionList;
	private int nTransactions; 
	
	private static int numberOfAccounts = 0;
	
	public Account(String name) {
		owner = name;
		numberOfAccounts++;
		number = numberOfAccounts;
		balance = 0;
		nTransactions = 0;
		transactionList = new Transaction[1000];
		transactionList[nTransactions++] = new Create(0);
	}
	
	public void deposit(int amount) {
		transactionList[nTransactions++] = new Deposit(amount);
		balance += amount;
	}
	
	public void withdraw(int amount) {
		transactionList[nTransactions++] = new Withdrawal(amount);
		balance -= amount;
	}
	
	public void transferTo(Account other, int amount) {
		balance -= amount;
		transactionList[nTransactions++] = new TransferTo(amount, other.owner);
		other.balance += amount;
		other.transactionList[other.nTransactions++] = new TransferFrom(amount, owner);
	}
	
	public void printAll() {
		System.out.println(number +"/" + owner + ": " + balance);
		System.out.println("Transactions: ");
		for(int i = 0; i < nTransactions; i++) {
			transactionList[i].print();
		}
	}

}
