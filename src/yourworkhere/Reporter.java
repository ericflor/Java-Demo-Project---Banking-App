package yourworkhere;


import java.util.ArrayList;
import java.util.List;


public class Reporter {

	private Ledger ledger;

	public Reporter(Ledger ledger) {
		this.ledger = ledger;
	}
	
	public int getNumAccounts() {
		
		int accountNum = ledger.accounts.size();
		
		return accountNum;
	}
	
	
	
	public void printAllAccounts() {
		
		List<Account> allAccounts = ledger.getAllAccounts();
		for(Account account : allAccounts) {
			System.out.println("Account Type: " + account.getAccountType() + " " +
					"Account Holder: " + account.getFirstName() + " " +
					account.getLastName() + " " +
					"Current Balance: " + account.getBalance());
		}
		
	}

	
	
	public int getNumAccountsByType(String accountType) {
		
		List<Account> accounts = new ArrayList<>();

		for (Account account : ledger.getAllAccounts()) {
			String currType = account.getAccountType();
			if (accountType == currType) {
				accounts.add(account);
			} 
			
		} return accounts.size();
		
	}
	
	
	public List<Account> getAccountsWithMinimum(double minBalance){
		
		List<Account> accountList = new ArrayList<>();
		
		for (Account account : ledger.getAllAccounts()) {
			double balance = account.getBalance();
			if (balance >= minBalance) {
				accountList.add(account);
				
			} 
			
		} return accountList;
			
	}
	
}
