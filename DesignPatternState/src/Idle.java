
public class Idle implements State
{
	public void applybreak(ApplyBreak wrapper)
    {
        wrapper.set_state(new Moving());
        System.out.println("Moving");
    }

}
