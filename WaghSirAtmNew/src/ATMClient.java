public class ATMClient {
	public static void main(String[] args) {
		BankingSystem bank = new BankingSystem();
		ATM sbiATM = new ATM(bank);
		ATMCard card = new ATMCard(100);
		sbiATM.insertCard(card);
	}
}