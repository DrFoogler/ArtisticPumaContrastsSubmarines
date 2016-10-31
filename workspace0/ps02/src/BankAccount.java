import java.util.Scanner;

public class BankAccount {
	
	private int balance;
	private String ownerSSN;
	private String accountType;
	
	
	public BankAccount() {
		
	}
		
	public int getBalance() {
		return balance;
	}
	
	public void setBalance(int newBalance) {
		balance = newBalance;	
	}

	public String getOwnerSSN() {
		return ownerSSN;
	}
	
	public void setOwnerSSN(String o) {
		ownerSSN = o;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	public void setAccountType(String a) {
		accountType = a;
	}
	
	public void makeDeposit(int d) {
		balance = balance + d;
	}
	
	public void makeWithdrawal(int w) {
		balance = balance - w;
	}
}
