
public class ATM {
	ATMCard card;
	CardReader cardReader = new CardReader();
	KeyBoard keyBoard = new KeyBoard();
	CashDispenser cashDispenser = new CashDispenser();
	DisplayUnit displayUnit = new DisplayUnit();
	ReceiptPrinter receiptPrinter = new ReceiptPrinter();
	BankingSystem bankingSystem;

	public ATM(BankingSystem bank) {
		// TODO Auto-generated constructor stub
		this.bankingSystem = bank;
	}

	public void insertCard(ATMCard card) {
		// TODO Auto-generated method stub
		this.card = card;
		cardReader.insertCard(card);
		verifyPin();

	}

	private void verifyPin() {
		// TODO Auto-generated method stub
		int PIN = keyBoard.getPIN();
		if (PIN == cardReader.getPIN()) {
			displayUnit.displayMenu();
			char option = keyBoard.getOption();
			if (option == 'W') {
				int amount = keyBoard.getAmountToBeWithdrawn();
				withdraw(amount);

			} else {
				System.out.println("invalid option");
			}

		} else {
			System.out.println("PIN not matching");
		}

	}

	private void withdraw(int amount) {
		// TODO Auto-generated method stub
		if (cashDispenser.getBalance() >= amount) {
			if (bankingSystem.withdraw(amount)) {
				cashDispenser.dispenseCash(amount);
				receiptPrinter.printReceipt(card, amount);

			}

		} else {
			System.out.println("No cash in ATM");
		}

	}

}
