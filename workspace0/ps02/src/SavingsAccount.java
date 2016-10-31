
public class SavingsAccount extends BankAccount {
	
	private int interestRate;
	private int maxNumWithdrawals;
	
	public int getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(int i) {
		interestRate = i;
	}
	
	public int getMaxNumWithdrawals() {
		return maxNumWithdrawals;
	}
	
	public void setMaxNumWithdrawals(int w) {
		maxNumWithdrawals = w;
	}
	
	public SavingsAccount() {
		setAccountType("savings");
	}
}
