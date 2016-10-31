
public class CheckingAccount extends BankAccount {
	
	private int minBalance;
	private int monthlyFee;
	
	public int getMinBalance() {
		return minBalance;
	}
	
	public void setMinBalance(int m) {
		minBalance = m;
	}
	
	public int getMonthlyFee() {
		return monthlyFee;
	}
	
	public void setMonthlyFee(int f) {
		monthlyFee = f;
	}
	
	public CheckingAccount() {
		setAccountType("checking");
	}

}
