import java.util.Scanner;

public class BankAccount {
	
	private int balance;
	private String ownerSSN;
	private String accountType;
	
	
	public BankAccount() {
		
	}
		
	/**
	 * 
	 * @return value that is set in <code>balance</code>
	 */
	
	public int getBalance() {
		return balance;
	}
	
	/**
	 * 
	 * @param number that the user wants to set for <code>maxNumWithdrawals</code>
	 */
	
	public void setBalance(int newBalance) {
		balance = newBalance;	
	}

	/**
	 * 
	 * @return value that is set in <code>ownerSSN</code>
	 */
	
	public String getOwnerSSN() {
		return ownerSSN;
	}
	
	/**
	 * 
	 * @param number that the user wants to set for <code>ownerSSN</code>
	 */
	
	public void setOwnerSSN(String o) {
		ownerSSN = o;
	}
	
	/**
	 * 
	 * @return value that is set in <code>accountType</code>
	 */
	
	public String getAccountType() {
		return accountType;
	}
	
	/**
	 * 
	 * @param number that the user wants to set for <code>maxNumWithdrawals</code>
	 */
	
	public void setAccountType(String a) {
		accountType = a;
	}
	/**
	 * @return addition of <code>balance</code> and <code>d</code> 
	 * @param number that the user wants to set for <code>makeDeposit</code> and add to <code>balance</code>
	 */
	
	public void makeDeposit(int d) {
		balance = balance + d;
	}
	
	/**
	 * @return remainder of <code>balance</code> and <code>d</code>
	 * @param number that the user wants to set for <code>makeWithdrawal</code> to subtract from <code>balance</code>
	 */
	
	public void makeWithdrawal(int w) {
		balance = balance - w;
	}
	
	/**
	 * 
	 * @param number that the user wants to set for <code>maxNumWithdrawals</code>
	 */
	
	public void makeTransfer(BankAccount acct1,int t) { 
		makeWithdrawal(t);
		acct1.makeDeposit(t);
	}

}
