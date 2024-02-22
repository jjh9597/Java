package ex04;

public class BankAccountcontroller {

	public static void main(String[] args) {

		BankAccount bank = new BankAccount(
				"001122",
				"김대철",
				10000);
		
		bank.displayBalance();
		bank.deposit(1000000);
		
		bank.displayBalance();
		
		bank.withdraw(500000);
		bank.displayBalance();
		
		bank.deposit(30000);
		bank.displayBalance();
				
	}

}
