package Problem4;

public class test {
	public static void main(String[] args) {
		Bank bank = new Bank();
		
		Account a = new SavingsAccount(1000, 1, 10, true);
		Account b = new CheckingAccount(10000, 2, 150, true);
		Account c = new SavingsAccount(9900, 3, 13, true);
		bank.add(a);
		bank.add(b);	
		bank.add(c);
		bank.update();
	}

}
