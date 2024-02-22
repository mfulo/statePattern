package labAss3;

public class Account{
	
	private String accountNumber;
	private Double balance;
	private AccountState accountState;
	
	public Account (String accountNumber, Double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		accountState = new ActiveState(null);
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public Double getBalance() {
		return balance;
	}
	
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	public AccountState getAccountState() {
		return accountState;
	}
	
	public void setAccountState(AccountState accountState) {
		this.accountState = accountState;
	}

	public void activate() {
		accountState.activate(this);
	}

	public void suspend() {
		accountState.suspend(this);
	}

	public void close() {
		accountState.close(this);	
	}

	public void deposit(Double depositBalance) {
		 accountState.deposit(depositBalance);	
	}

	public void withdraw(Double withdrawAmount) {
		accountState.withdraw(withdrawAmount);
	}
	
	public String toString() {
        return "Account Number: " + accountNumber + "\nCurrent Balance: " + balance;
    }
}
