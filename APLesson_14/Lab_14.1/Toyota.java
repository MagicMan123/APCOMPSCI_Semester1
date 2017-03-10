import java.util.Arrays;
import java.util.ArrayList;

public class Toyota extends Car
{
	private double[] location;
	private double x;
	private double y;
	
	public Toyota()
	{
		
	}
	
	public Toyota(String input)
	{
		String[] coordinates = input.split(", ");
		x = Double.parseDouble(coordinates[0]);
		y = Double.parseDouble(coordinates[1]);
	}
	
	public int getID()
	{
		return (int)(Math.random()*1000000);
	}
	
	public void move(double xmove, double ymove)
	{
		y += ymove;
		x += xmove;
	}
	
	public double[] getLoc()
	{
		double[] location = {x,y};
		return location;
	}
}