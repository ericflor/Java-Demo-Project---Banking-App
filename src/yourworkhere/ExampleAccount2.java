package yourworkhere;

public class ExampleAccount2 {

	public static void main(String[] args) {
		
		//TODO 	1.3.1 Define the data types below (balance, withdrawalAmount, depositAmount)
		double balance;
		double withdrawalAmount;
		double depositAmount;
		
		//TODO	1.3.2 Initialize values for the above variables
		//		balance should be 10000.00
		//		withdrawalAmount should be 50002.21
		//		depositAmount should be -40020.02
		balance = 10000.00;
		withdrawalAmount = 50002.21;
		depositAmount = -40020.01;
		
		//TODO	1.3.3 Write a conditional statement to check if withdrawalAmount is larger than balance
		//		If it is then, print "Withdrawal will result in an overdraft!"
		if (withdrawalAmount > balance) {
			System.out.println("Are you sure? Withdrawal will result in an overdraft!");
		} else {
			System.out.println("Thank you for banking with us, have a beautiful day!");
		}
		
		//TODO 	1.3.4 Write a conditional statement to check if depositAmount is less than or equal to 0
		//		If so, then print "Deposit amount cannot be negative!"
		//		Otherwise, then add the deposit amount to the balance and print the new balance value
		if (depositAmount <= 0) {
			System.out.println("Deposit Amount Can't Be Negative");
		} else {
			double newBalance = balance + depositAmount;
			System.out.println("Thank you for your deposit, your new balance is: " + newBalance);
		}
		
	}
}
