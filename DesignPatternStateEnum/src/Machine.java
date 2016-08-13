public class Machine 
{
	MachineState state;
	public void setState(MachineState state)
	{
		this.state = state;
	}
	public MachineState getState()
	{
		return this.state;
	}
}