

public class TrippleDice extends Dice {
private int m_total;

	@Override
	public void Roll () {
		int total = 0;
		super.Roll();
		total = total + Value();
		super.Roll();
		total = total + Value();
		super.Roll();
		total = total + Value();
		 m_total = (total/3);
	}
	@Override
	public String toString() {
		
		return "The value was "+ m_total + ".";
	}
	public int ReturnTotal()
	{
		return m_total;
	}
	
}


