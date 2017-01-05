import java.lang.Math.*;

public class dist_class
{
	private int xOne, yOne, xTwo, yTwo;
	private double distance;
	
	public dist_class()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
		distance = 0;
	}
	
	public dist_class(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}
	
	public void reset()
	{
		xOne = 0;
		yOne = 0;
		xTwo = 0;
		yTwo = 0;
	}
	
	public int getxOne()
	{
		return xOne;
	}
	public int getyOne()
	{
		return yOne;
	}
	public int getxTwo()
	{
		return xTwo;
	}
	public int getyTwo()
	{
		return yTwo;
	}
	
	public double calcdist()
	{
		distance = Math.sqrt((xTwo-xOne)*(xTwo-xOne)+(yTwo-yOne)*(yTwo-yOne));
		return distance;
	}
}