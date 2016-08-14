
public class SavingsAccount extends Account {
	int balanceLimit = 500;

	public void withdraw(int ammount) {
		// TODO Auto-generated method stub
		if ((balance - ammount) >= balanceLimit) {
			balance = balance - ammount;
		}

	}

}
