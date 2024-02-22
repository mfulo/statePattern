package labAss3;

public class ActiveState implements AccountState {
	private Account account;
	
    public ActiveState(Account account) {
        this.account = account;
    }
	 
	public void activate (Account account) {
		System.out.println("Account is already activated!");	
	}
	
	public void suspend (Account account) {
		System.out.println("Account is suspended!");
		account.setAccountState(new SuspendedState(account));
		
	}
	public void close (Account account) {
		System.out.println("Account is closed!");
		account.setAccountState(new ClosedState(account));
	}
	
	public void deposit(Double depositBalance) {
		account.setBalance(account.getBalance() + depositBalance);
		System.out.println("You've deposited: " + depositBalance);
		System.out.println(account.toString());
	}

	public void withdraw(Double withdrawAmount) {
		account.setBalance(account.getBalance() - withdrawAmount);
		System.out.println("You've withdrawn: " + withdrawAmount);
		System.out.println(account.toString());
	}
}
