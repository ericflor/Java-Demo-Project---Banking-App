package yourworkhere;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Ledger {
	
	private static final Ledger instance = new Ledger();

	private Ledger() {}
	
	public static Ledger getInstance() {
		return instance;
	}
	
	Map<String, Account> accounts = new HashMap<String, Account>();
	
	
	
	public boolean store(Account account) {
		
		if (accounts.containsKey(account.getAccountID()))
			return false;
		else {
		accounts.put(account.getAccountID(), account);
		return true;
		}
	}
	
	public Account retrieve(String accountId) {
		Account account = accounts.get(accountId);
		if (account == null) {
			return null;
		} else {
		return account;
		}
	}
	
	public Account createAccount(String accountType, String firstName, String lastName) {
		if (accountType == "checking") {
			Account newAccount = new CheckingAccount(getNextAccountId(), accountType, lastName);
			accounts.put(newAccount.getAccountID(), newAccount);
			return newAccount;
			
		} else {
			Account newAccount = new SavingsAccount(getNextAccountId(), accountType, lastName);
			accounts.put(newAccount.getAccountID(), newAccount);
			return newAccount;
		}
		
	}
	
	public String getNextAccountId() {
		
		String size = accounts.size() + 1 + "";
		
		return size;
	}
	
	public List<Account> getAllAccounts() {
		List<Account> allAccounts = new ArrayList<Account>(accounts.values());
		
		return allAccounts;
	}
	
	
}