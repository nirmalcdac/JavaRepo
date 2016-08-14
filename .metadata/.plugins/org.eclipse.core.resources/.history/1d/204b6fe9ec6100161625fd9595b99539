
public class ApplyBreak 
{
	private State m_current_state;

    public ApplyBreak()
    {
        m_current_state = new Parked();
    }
    public void set_state(State s)
    {
        m_current_state = s;
    }
    public void applybreak()
    {
        m_current_state.applybreak(this);
    }
}
