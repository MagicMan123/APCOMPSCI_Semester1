public abstract class Car implements Location
{
	public int ID;
	public double[] location;
	
	public Car()
	{
		
	}
	
	public int getID()
	{
		return (int)(Math.random()*1000000);
	}
	
	public void move(double xmove, double ymove)
	{
		location[0] = location[0] + xmove;
		location[1] = location[1] + ymove;
	}
	
	public double[] getLoc()
	{
		return location;
	}
}