
public class SavingsAccount extends BankAccount {
	
	private int interestRate;
	private int maxNumWithdrawals;
	
	/**
	 *
	 * @return value that is set in <code>interestRate</code>
	 */
	
	public int getInterestRate() {
		return interestRate;
	}
	
	/**
	 *
	 * @param number that the user wants to set for <code>interestRate</code>
	 */
	
	public void setInterestRate(int i) {
		interestRate = i;
	}
	
	/**
	 * 
	 * @return value that is set in <code>MaxNumWithdrawals</code>
	 */
	
	public int getMaxNumWithdrawals() {
		return maxNumWithdrawals;
	}
	
	/**
	 * 
	 * @param number that the user wants to set for <code>maxNumWithdrawals</code>
	 */
	
	public void setMaxNumWithdrawals(int w) {
		maxNumWithdrawals = w;
	}
	
	/**
	 * 
	 * @param sets string name savings to <code>SavingsAccount</code>
	 */
	
	public SavingsAccount() {
		setAccountType("savings");
	}
}
