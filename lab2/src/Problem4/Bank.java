package Problem4;

import java.util.Vector;

public class Bank {
	public static Vector<Account> accounts = new Vector<Account>();
	

	public Bank() {}

	public void add(Account acc) {
		accounts.add(acc);	
		System.out.println("Success");
	}
	
	public void update() {
		for(Account a : accounts) {
			if(a instanceof SavingsAccount) {
				SavingsAccount sa = (SavingsAccount)a;
//				sa.addInterest();
				System.out.println(sa.toString());
				sa.addInterest();
				sa.addInterest();
				System.out.println(sa.getBalance());
			}else if(a instanceof CheckingAccount) {
				CheckingAccount ca = (CheckingAccount)a;
				ca.deductFee();
				System.out.println(ca.toString());
			}
		}
	}
	
	public void open(Account acc) {
		accounts.add(acc);
		for(Account a : accounts) {
			if (a.getAccess() == true) {
				System.out.println("Account is opened!");
			} else {
				a.setAccess(true);
				System.out.print("Account succesfully opened!");
			}
		}
	}
	
	public void close(Account acc) {
		for(Account a : accounts) {
			if (a.getAccess() == false) {
				System.out.println("Account is closed");
			} else {
				a.setAccess(false);
				System.out.print("Account succesfully closed");
				deleteAcc(a);
			}
		}
	}
	
	public void deleteAcc(Account acc) {
		accounts.remove(acc);
	}
	
	
}
