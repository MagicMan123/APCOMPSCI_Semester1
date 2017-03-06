import java.util.Arrays;
import java.util.ArrayList;

public class Honda implements Location
{
	private double[] location;
	private double x;
	private double y;
	
	public Honda()
	{
		
	}
	
	public Honda(double[] locate)
	{
		location = locate;
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
	
	public double[] getLoc()
	{
		return location;
	}
}