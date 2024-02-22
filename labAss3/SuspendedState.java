package labAss3;

public class SuspendedState implements AccountState {
	private Account account;
	
	public SuspendedState(Account account) {
        this.account = account;
    }
	
	public void activate (Account account) {
		System.out.println("Account is activated!");
		account.setAccountState(new ActiveState(account));
	}
	
	public void suspend (Account account) {
		System.out.println("Account is already suspended!");	
	}
	
	public void close (Account account) {
		System.out.println("Account is closed!");
		account.setAccountState(new ClosedState(account));
	}
	
	public void deposit(Double depositBalance) {
		System.out.println("You cannot deposit on a suspended account!");
		System.out.println(account.toString());		
	}
	
	public void withdraw(Double withdrawAmount) {
		System.out.println("You cannot withdraw on a suspended account!");
		System.out.println(account.toString());
	}
}
