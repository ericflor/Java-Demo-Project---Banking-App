package yourworkhere;

public class CheckingAccount extends Account {

	private double overdraftFee = 5.00;
	
	public CheckingAccount() {
		this.accountID = "1";
		this.firstName = "Eric";
		this.lastName = "Florence";
		this.accountType = "checking";
		this.balance = 0;
	}
	
	public CheckingAccount(String accountID, String firstName, String lastName) {
		this.accountID = accountID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountType = "checking";
	}

	public double getOverdraftFee() {
		return overdraftFee;
	}

	public void setOverdraftFee(double overdraftFee) {
		this.overdraftFee = overdraftFee;
	}

	@Override
	public String toString() {
		return "Account: " + this.accountType + " Account ID: " + this.accountID + " " +
				"Account Owner: " + this.firstName + " " + this.lastName + " " + 
				"Balance: " + this.balance + " [overdraftFee=" + this.overdraftFee + "]";
	}

	@Override
	public IAccountManager getAccountManager() {
		CheckingAccountManager c = new CheckingAccountManager(this);
		
		return c;
	}
	
	
	
}
