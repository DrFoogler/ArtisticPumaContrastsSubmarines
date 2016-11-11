
public class CheckingAccount extends BankAccount {
	
	private int minBalance;
	private int monthlyFee;
	
	/**
	 * 
	 * @return value that is set in <code>minBalance</code>
	 */
	
	public int getMinBalance() {
		return minBalance;
	}
	
	/**
	 * 
	 * @param number that the user wants to set for <code>minBalance</code>
	 */
	
	public void setMinBalance(int m) {
		minBalance = m;
	}
	
	/**
	 * 
	 * @return value that is set in <code>monthlyFee</code>
	 */
	
	public int getMonthlyFee() {
		return monthlyFee;
	}
	
	/**
	 * 
	 * @param number that the user wants to set for <code>monthlyFee</code>
	 */
	
	public void setMonthlyFee(int f) {
		monthlyFee = f;
	}
	
	/**
	 * 
	 * @param sets string name checking to <code>CheckingAccount</code>
	 */
	
	public CheckingAccount() {
		setAccountType("checking");
	}

}
