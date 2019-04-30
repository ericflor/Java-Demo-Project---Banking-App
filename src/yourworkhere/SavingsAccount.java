package yourworkhere;

public class SavingsAccount extends Account {
	
	private double minBalance = 20;
	private int currentMontlyWithdrawals = 0;
	private int maxMonthlyWithdrawals = 3;
	
	public SavingsAccount() {
		this.accountID = "1";
		this.firstName = "Eric";
		this.lastName = "Florence";
		this.accountType = "savings";
		this.balance = 20;
	}
	
	public SavingsAccount(String accountID, String firstName, String lastName) {
		this.accountID = accountID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountType = "savings";
		this.balance = 20;
	}
	
	public double getMinBalance() {
		return minBalance;
	}
	public void setMinBalance(double minBalance) {
		this.minBalance = minBalance;
	}
	public int getCurrentMontlyWithdrawals() {
		return currentMontlyWithdrawals;
	}
	public void setCurrentMontlyWithdrawals(int currentMontlyWithdrawals) {
		this.currentMontlyWithdrawals = currentMontlyWithdrawals;
	}
	public int getMaxMonthlyWithdrawals() {
		return maxMonthlyWithdrawals;
	}
	public void setMaxMonthlyWithdrawals(int maxMonthlyWithdrawals) {
		this.maxMonthlyWithdrawals = maxMonthlyWithdrawals;
	}
	
	@Override
	public String toString() {
		return "Account: " + this.accountType + " Account ID: " + this.accountID + " Account Owner: " + this.firstName + " " + 
				this.lastName + " " + "Balance: " + this.balance + " " + "SavingsAccount [minBalance=" + this.minBalance + 	
				", currentMontlyWithdrawals=" + this.currentMontlyWithdrawals
				+ ", maxMonthlyWithdrawals=" + this.maxMonthlyWithdrawals + "]";
	}

	@Override
	public IAccountManager getAccountManager() {
		SavingsAccountManager s = new SavingsAccountManager(this);
		
		return s;
	}
	
	

}
