
public class CardReader {
	ATMCard atmCard;

	public void insertCard(ATMCard card) {
		// TODO Auto-generated method stub
		atmCard=card;
		
	}

	public int getPIN() {
		// TODO Auto-generated method stub
		return atmCard.readPIN();
	}

}
