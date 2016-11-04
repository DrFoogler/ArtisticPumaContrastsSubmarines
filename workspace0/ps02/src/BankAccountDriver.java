
public class BankAccountDriver {

	public static void main(String[] args) {
		
		
		BankAccount acct1 = new BankAccount();
		CheckingAccount chkgAcct1 = new CheckingAccount();
		SavingsAccount svgsAcct1 = new SavingsAccount();
		CheckingAccount chkgAcct2 = new CheckingAccount();
		SavingsAccount svgsAcct2 = new SavingsAccount();
		
		acct1.setBalance(2305);
		acct1.setOwnerSSN("228-82-1105");
		acct1.setAccountType("checking");
		
		chkgAcct1.setBalance(3200);
		chkgAcct1.setOwnerSSN("882-61-2486");
		chkgAcct1.setMinBalance(100);
		chkgAcct1.setMonthlyFee(5);
		
		svgsAcct1.setBalance(15980);
		svgsAcct1.setOwnerSSN("882-61-2486");
		svgsAcct1.setInterestRate(4);
		svgsAcct1.setMaxNumWithdrawals(6);
		
		chkgAcct2.setBalance(1800);
		
		svgsAcct2.setBalance(42);
		
		
	}

}
