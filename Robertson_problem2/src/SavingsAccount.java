
public class SavingsAccount {
	private static double annualInterestRate;
	public double savingsBalance;
	public SavingsAccount (double accountbalance)
	{
		savingsBalance=accountbalance;
	}
	public void calculateMonthlyInterest()
	{
	     double monthlyInt;
	     System.out.printf("The balance before adding the monthly interest is:\n" + savingsBalance);
	     System.out.printf("\n");
	     monthlyInt = (savingsBalance * annualInterestRate)/12;
	     savingsBalance += monthlyInt;
	     System.out.printf("The balance after adding the monthly interest is:\n" + savingsBalance);
	     System.out.printf("\n");
	}
	public static void modifyInterestRate(double interestRate)
	{
		annualInterestRate= interestRate;
	}
}
