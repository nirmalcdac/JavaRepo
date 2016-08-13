public interface AccountInterface {

	public abstract int getAccountnumber();

	public abstract void setAccountnumber(int accountnumber);

	public abstract int getBalance();

	public abstract void setBalance(int balance);

	public abstract void deposit(int ammount);

	public abstract void withdraw(int ammount);

}