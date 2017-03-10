public abstract class Car implements Location
{
	private double x,y;
	
	public Car()
	{
		
	}
	
	public int getID()
	{
		return (int)(Math.random()*1000000);
	}
	
	public void move(double xmove, double ymove)
	{
		x += xmove;
		y += ymove;
	}
	
	public abstract double[] getLoc();
}