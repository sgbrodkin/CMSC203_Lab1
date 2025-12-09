
public class SavingsAccount extends BankAccount {
	private double rate = 2.5;
	private int savingsNumber = 0;
	private String accountNumber;
	public SavingsAccount(String name, double balance) {
		super(name, balance);
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;	
	}
	public SavingsAccount(SavingsAccount s1, double balance) {
		super(s1, balance);
		savingsNumber = s1.savingsNumber+1;
		accountNumber = super.getAccountNumber() + "-" + savingsNumber;
	}
	@Override
	public String getAccountNumber() {
		return accountNumber;
	}
	public void postInterest() {
		super.setBalance(super.getBalance()*(1+(rate/1200)));
	}
}
