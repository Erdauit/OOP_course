package Problem4;

public class SavingsAccount extends Account{
	int interestRate;
	
	public SavingsAccount(int a) {
		super(a);
	}
	
	public SavingsAccount(double balance, int a, int interestRate) {
		super(balance, a);
		this.interestRate = interestRate;
	}
	public SavingsAccount(double balance, int a, int interestRate, boolean acc) {
		super(balance, a, acc);
		this.interestRate = interestRate;
	}
	public double interest() {
		return interestRate/100; 
	}
	public void addInterest() {
		deposit(super.getBalance()*interest());
	}
	
	public void deposit(int sum) {
		super.setBalance(super.getBalance() + sum);
	}
	
	public void withdraw(int sum) {
		super.setBalance(super.getBalance() - sum);
	}
	
	public int getInterest() {
		return interestRate;
	}
	public void transfer(double amount, Account other) {
		other.setBalance(other.getBalance() + amount);
		this.setBalance(this.getBalance() - amount);;
	}
	
	public String toString() {
		return super.toString() + "\n" + "interest rate: "+ getInterest() + '\n';
	}
	
	public double getBalance() {
		return super.getBalance();
	}
	
	
}
