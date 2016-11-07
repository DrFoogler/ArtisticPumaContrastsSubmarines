public class BankAccount {
	
	private int balance;
	private String ownerSSN; 	//social security num of owner
	private String accountType; 	//may be "checking" or "savings"

	public BankAccount() { 
	}
	
	public void makeDeposit(int d) {
		balance = balance + d;
	}
	
	public void makeWithdrawal(int w) {
		balance = balance - w;
	}
	
	public void setBalance(int newBalance) {
		balance = newBalance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void setOwnerSSN(String o) {
		ownerSSN = o;
	}
	
	public String getOwnerSSN() {
		return ownerSSN;
	}
	
	public void setAccountType(String a) {
		accountType = a;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	public String toString() {
		String acctInfo = "Account type = " + accountType + "\n";
		acctInfo += "owner SSN = " + ownerSSN + "\n";
		acctInfo += "balance = " + balance + "\n";
		return acctInfo;
	}
	

	
	public void makeTransfer(BankAccount acct, int transferAmt) {
		this.makeWithdrawal(transferAmt);
		acct.makeDeposit(transferAmt);
	}
	
}
