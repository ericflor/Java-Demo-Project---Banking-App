package yourworkhere;

public class ExampleAccount {
	
	
	public static void main(String[] args) {
		
		//TODO 	1.2.2 Define the data types below (balance, withdrawalAmount, depositAmount, accountName, accountType)
		double balance = 2000;
		double withdrawalAmount = 500.25;
		double depositAmount = 645.18;
		String accountName = "Eric's Monies";
		String accountType = "Checking";
		
		//TODO	1.2.3 Print the value of balance below
		System.out.println("Account Balance: " + balance);
		System.out.println("Withdrawal Amount: " + withdrawalAmount);
		System.out.println("Deposit Amount: " + depositAmount);
		System.out.println("Account Name: " + accountName);
		System.out.println("Account Type: " + accountType);
		
		//TODO 	1.2.4 Write a short bit of code to execute a withdrawal of 500.25 from the value of balance
		//		Print the result
		double remainingBalance = balance - withdrawalAmount;
		System.out.println("Your remaining balance is: " + (remainingBalance));
		
		//TODO	1.2.5 Write a short snippet of code to deposit 645.18 to the current value of balance
		//		Print the result
		double newBalance = remainingBalance + depositAmount;  
		System.out.println("Your new balance is: " + newBalance);
		
		
		
		/*
		 * TODO 1.2.6 Write the lines to check the balance if you added compound interest for a year
		 * 
		 * Step 1: Define the variables Use A, P, r, n, t You must decide what datatypes
		 * to make each according to their purpose: 
		 * A - Accrued Amount; this is the amount you're solving for 
		 * P - Principle; set this to the current balance. 
		 * r - rate of interest; set this to 0.15 
		 * n - number of times the amount is compounded; set this to 12 
		 * t - number of years; set this to 1 to represent 1 year
		 * 
		 * 
		 * Step 2: Calculate the Accrued Amount Use the formula: A = P(1 + r/n)nt
		 * 
		 * Step 3: Print the result to the console
		 */
		double P = newBalance;
		double r = 0.15;
		int n = 12;
		int t = 1;
		
		double A = P * (1 + (r / n)) * (n * t);
		System.out.println("Your accrued interest amount for this year is: " + A);
		
	}
}
