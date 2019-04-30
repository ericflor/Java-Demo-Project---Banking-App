package yourworkhere;

public class CheckingAccountManager implements IAccountManager {
	
	private CheckingAccount account;

	public CheckingAccountManager(CheckingAccount account) {
		this.account = account;
	}
	

	@Override
	public boolean deposit(double amount) {
		
		if (amount < 0) {
			return false;
		} else {
		double currentBalance = account.getBalance();
		double newBalance = currentBalance + amount;
		account.setBalance(newBalance);
		return true;
		}
	}

	@Override
	public boolean withdraw(double amount) {
		
		if (amount > account.getBalance()) {
			double overdraft = account.getOverdraftFee();
			double fee = account.getBalance() - overdraft;
			account.setBalance(fee);
			System.out.println("Attempted Withdrawal Resulted In Overdraft Charge of $5");
			throw new OverdraftException();
		} else {
			double currentBalance = account.getBalance();
			double newBalance = currentBalance - amount;
			account.setBalance(newBalance);
			return true;
		}
		
	}

	
}
