
public class CheckingAccount extends BankAccount {
	static final double FEE = .15;
	
	public CheckingAccount(String name, double amt) {
		super(name, amt);
		setAccountNumber(getAccountNumber()+"-10");
	}
	@Override
	public boolean withdraw(double amount) {
		return super.withdraw(amount+FEE);
	}
	
}
