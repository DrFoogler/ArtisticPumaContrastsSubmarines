public class BankAccountDriver {

	public static void main(String[] args) {
		
		
		BankAccount acct1 = new BankAccount();

		acct1.setBalance(2305);
		acct1.setOwnerSSN("228-82-1105");	
		acct1.setAccountType("checking");
		
		String outputStr;
		
		outputStr = "Currently, there is a balance of ";
		outputStr += acct1.getBalance() + " in the ";
		outputStr += acct1.getAccountType() + " account belonging to ";
		outputStr += "person with SSN " + acct1.getOwnerSSN();
		
		System.out.println(outputStr);
		
		
		CheckingAccount chkgAcct1 = new CheckingAccount();
		chkgAcct1.setBalance(3200);
		chkgAcct1.setOwnerSSN("882-61-2486");
		chkgAcct1.setMinBalance(100);
		chkgAcct1.setMonthlyFee(5);
        
		SavingsAccount svgsAcct1 = new SavingsAccount();
		svgsAcct1.setBalance(15980);
		svgsAcct1.setOwnerSSN("882-61-2486");
		svgsAcct1.setInterestRate(4);
		svgsAcct1.setMaxNumWithdrawals(6);
		
		System.out.println("Account chkgAcct1 is a " +
				chkgAcct1.getAccountType() + " account with a balance of " +
				chkgAcct1.getBalance() + ".");
		
		System.out.println("Account svgsAcct1 is a " +
				svgsAcct1.getAccountType() + " account with a balance of " +
				svgsAcct1.getBalance() + ".");
		
		
		
		
		
		
		
		
		chkgAcct1.makeTransfer(svgsAcct1, 1000);
		System.out.println("\n\nAfter transferring $1000 from chkgAcct1 to svgsAcct1...");
		System.out.println(chkgAcct1);
		System.out.println(svgsAcct1);
		
			
	}

}