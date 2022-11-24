package Problem4;

public class CheckingAccount extends Account{
	private int charge;
	private final int FREE_TRANSACTION;
	private int counter;
	{
		FREE_TRANSACTION = 3;
	}
	public CheckingAccount(int a) {
		super(a);
	}
	public CheckingAccount(double balance, int a, int charge) {
		super(balance, a);
		this.charge = charge;
	}
	public CheckingAccount(double balance, int a, int charge, boolean acc) {
		super(balance, a, acc);
		this.charge = charge;
	}
	
	public void deposit(int sum) {
		if(counter <= FREE_TRANSACTION) {
			counter++;
			this.setBalance(getBalance() + sum);
		} else {
			counter++;
			deductFee();
			this.setBalance(getBalance() + sum);
		}
	}
	
	public void withdraw(int sum) {
		if(counter <= FREE_TRANSACTION) {
			counter++;
			this.setBalance(getBalance() - sum);
		} else {
			counter++;
			deductFee();
			this.setBalance(getBalance() - sum);
		}
	}
	
	public void deductFee() {
		if(counter > FREE_TRANSACTION) {
			counter = counter - FREE_TRANSACTION;
			super.setBalance(getBalance() - counter * charge);
			counter = 0;
		}
	}
	public String toString() {
		return super.toString() + "\n" +
			   "Free transactions left: " + counter + "\n";
	}
}

