package labAss3;

public class ClosedState implements AccountState {
	private Account account;
	
	public ClosedState(Account account) {
        this.account = account;
    }
	
	public void activate(Account account) {
		System.out.println("You cannot activate a closed account!");		
	}

	public void suspend(Account account) {
		System.out.println("You cannot suspend a closed account!");		
	}
	
	public void close(Account account) {
		System.out.println("Account is already closed!");	
	}
	public void deposit(Double depositBalance) {
		System.out.println("You cannot deposit on a closed account!");
		System.out.println(account.toString());	
	}

	public void withdraw(Double withdrawAmount) {
		System.out.println("You cannot withdraw on a closed account!");
		System.out.println(account.toString());
	}
}
