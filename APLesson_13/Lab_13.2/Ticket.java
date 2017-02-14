public abstract class Ticket
{
	int serialNo;
	
	public Ticket()
	{
		this.serialNo = (int)(Math.random() * 10000000);
	}
	
	public int getSerialNo()
	{
		return this.serialNo;
	}
	
	public abstract double getPrice();
	
	public String toString()
	{
		return "Serial #: " + this.serialNo + "\nPrice: " + getPrice() + "\n\n";
	}
}
