public class Accountclient {
	public static void main(String[] args) {
		AccountInterface myAccount = new SavingsAccount();
		myAccount.setAccountnumber(100);
		myAccount.setBalance(1000);
		System.out.println("account number is " + myAccount.getAccountnumber());
		System.out.println("account balance is " + myAccount.getBalance());
		myAccount.deposit(400);
		System.out.println("account balance is " + myAccount.getBalance());
		myAccount.withdraw(4000);
		System.out.println("account balance is " + myAccount.getBalance());
	}
}