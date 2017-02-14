public class StudentAdvance extends Advance
{
	public StudentAdvance(int days)
	{
		super(days);
	}
	
	public double getPrice()
	{
		return price/2;
	}
	
	public String toString()
	{
		return "Serial #: " + this.serialNo + "\nPrice: " + getPrice() + "\nSTUDENT ID REQUIRED\n";
	}
}