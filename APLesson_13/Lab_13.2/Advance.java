public class Advance extends Ticket
{
	private int daysLeft;
	public double price;
	
	public Advance(int days)
	{
		super();
		daysLeft = days;
		if(daysLeft >= 10)
		{
			price = 30.00;
		}
		else
		{
			price = 40.00;
		}
	}
	
	public double getPrice()
	{
		return price;
	}
}