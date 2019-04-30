package yourworkhere;

public class SavingsAccountManager implements IAccountManager {
	
	private SavingsAccount account;

	public SavingsAccountManager(SavingsAccount account) {
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
		
		if (account.getCurrentMontlyWithdrawals() >= account.getMaxMonthlyWithdrawals()) {
			System.out.println("You Cannot Have More Than 3 Savings Withdrawals Per Month");
			return false;
		} else {
			int currentMontlyWithdrawals = account.getCurrentMontlyWithdrawals();
			currentMontlyWithdrawals++;
			account.setCurrentMontlyWithdrawals(currentMontlyWithdrawals);
		}
		
		if((account.getBalance() - amount) < account.getMinBalance()) {
			System.out.println("Savings Account Balance Cannot Be Below $20.00");
			return false;
			
		} else {
		
			double currentBalance = account.getBalance();
			double newBalance = currentBalance - amount;
			account.setBalance(newBalance);
			return true;
		}
		
	}

}
