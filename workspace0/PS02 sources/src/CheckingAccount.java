public class CheckingAccount extends BankAccount {
	
	private int minBalance;
	private int monthlyFee;
	
	public CheckingAccount() {
		super.setAccountType("checking");
	}
	
	public void setMinBalance(int m) {
		minBalance = m;
	}

	public int getMinBalance() {
		return minBalance;
	}

	public void setMonthlyFee(int m) {
		monthlyFee = m;
	}

	public int getMonthlyFee() {
		return monthlyFee;
	}

	

	
	
	
	
	
	
	
	public String toString() {
		String returnStr = super.toString();
		returnStr += "minimum balance = " + minBalance + "\n";
		returnStr += "monthly fee = " + monthlyFee + "\n";
		return returnStr;
	} 
	
}
