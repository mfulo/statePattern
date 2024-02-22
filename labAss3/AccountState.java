package labAss3;

public interface AccountState {
	public void activate (Account account);
	public void suspend (Account account);
	public void close (Account account);
	public void deposit (Double depositBalance);
	public void withdraw (Double withdrawAmount);
}
