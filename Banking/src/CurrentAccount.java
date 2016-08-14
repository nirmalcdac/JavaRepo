public class CurrentAccount extends Account {
	int overdraftlimit = 2000;
	int overdraft = 0;

	public void withdraw(int ammount) {
		// TODO Auto-generated method stub
		if (balance < ammount) {
			if ((balance + overdraftlimit) >= ammount) {
				overdraft = balance - ammount + overdraftlimit;
				balance = balance + overdraftlimit - ammount;

				System.out.println("overdraft amount " + overdraft);

			} else {
				System.out.println("balance is insufficient");
			}
		}
	}
}