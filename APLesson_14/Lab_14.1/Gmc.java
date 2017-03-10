import java.util.Arrays;
import java.util.ArrayList;

public class Gmc extends Car
{
	private double x;
	private double y;
	
	public Gmc()
	{
		
	}
	
	public Gmc(double xcoor, double ycoor)
	{
		x = xcoor;
		y = ycoor;
		
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
		double[] location = {x,y};
		return location;
	}
}