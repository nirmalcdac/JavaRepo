public abstract class Account implements AccountInterface {
	int accountnumber;
	int balance;

	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(int ammount) {
		this.balance = this.balance + ammount;
	}

	public abstract void withdraw(int ammount);

	{
	}
}