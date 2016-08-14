
public class Moving implements State {
	public void applybreak(ApplyBreak wrapper) {
		wrapper.set_state(new Parked());
		System.out.println("Parked");
	}
}
