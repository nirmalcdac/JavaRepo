public class Elevator {
	Building bl;
	ECP e1 = new ECP();
	Ebutton eb = new Ebutton();
	int currentstatus;
	int destination;
	boolean Estatus;// 1=moving, 0 stationary

	public Elevator() {
		currentstatus = 0;
	}

	public int getelstatus() {
		return currentstatus;
	}

	public void callelevator() {
		System.out.println("Evevator come");
	}

	public void Setchoice(int k) {
		this.destination = k;
	}

	public void opendoor() {
		System.out.println("Edoor opened");
	}

	public void doorclose() {
		System.out.println("Edoor closed");
	}

	public void moveelevator() {
		if (currentstatus < destination) {
			for (int i = currentstatus; i <= destination; i++) {
				System.out.println("Elevator is moving towards floor no." + destination + " current floor is " + i);
			}
		} else {
			for (int i = currentstatus; i >= destination; --i) {
				System.out.println("Elevator is moving towards floor no." + destination + " current floor is " + i);
			}
		}
	}
}