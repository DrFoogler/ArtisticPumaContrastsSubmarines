public class SavingsAccount extends BankAccount {
	
	private int interestRate;
	private int maxNumWithdrawals;
	
	public SavingsAccount() {
		super.setAccountType("savings");
	}

	public void setInterestRate(int i) {
		interestRate = i;
	}

	public int getInterestRate() {
		return interestRate;
	}

	public void setMaxNumWithdrawals(int m) {
		maxNumWithdrawals = m;
	}

	public int getMaxNumWithdrawals() {
		return maxNumWithdrawals;
	}

}
