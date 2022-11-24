package Problem4;

public class Account {
	private double balance;
	private int accNumber;
	private boolean accesibility = false;
	
	public Account(int a) {
		this.balance = 0.0;
		this.accNumber = a;
	}
	public Account(double balance, int a) {
		this.balance = balance;
		this.accNumber = a;
	}
	public Account(double balance, int a, boolean acc) {
		this.balance = balance;
		this.accNumber = a;
		this.accesibility = acc;
	}
	public void deposit(double cash) {
		this.balance+=cash;
	}
	
	public void withdraw(double cash) {
		this.balance-=cash;
	}
	public void setBalance(double cash) {
		this.balance = cash;
	}
	public double getBalance() {
		return balance;
	}
	public int getAccountNumber() {
		return accNumber;
	}
	public void transfer(double amount, Account other) {
		other.balance+=amount;
		this.balance-=amount;
	}
	public String toString() {
		return "This account has number: " + getAccountNumber() + '\n' + "and balance: " + getBalance();
	}
	public void print() {
		System.out.println(toString());
	}
	public boolean getAccess() {
		return accesibility;
	}
	public void setAccess(boolean access) {
		accesibility = access;
	}
}
