package ex04;

public class BankAccount {
	private String accountNumber;
	private String accountHolder;
	private int balance;
	
	BankAccount(){}
	BankAccount(String n1, String n2, int n3){
		accountNumber = n1;
		accountHolder = n2;
		balance = n3;
	}
	
	void deposit(int amount) {
		balance += amount;
		
	}
	
	void withdraw(int amount) {
		balance -= amount;
	}
	
	void displayBalance() {
		System.out.println("잔고 : " + balance);
	}


}
