import java.lang.Math.*;

public class mph_class
{
	private int dist, hours, mins;
	private double mph;
	
	public mph_class()
	{
		dist = 0;
		hours = 0;
		mins = 0;
		mph = 0;
	}
	
	public mph_class(int distance, int hour, int minutes)
	{
		dist = distance;
		hours = hour;
		mins = minutes;
		mph = 0;
	}
	
	public void setdist(int distance)
	{
		dist = distance;
	}
	
	public void sethours(int hour)
	{
		hours = hour;
	}
	
	public void setmins(int minutes)
	{
		mins = minutes;
	}
	
	public int getdist()
	{
		return dist;
	}
	
	public int gethours()
	{
		return hours;
	}
	
	public int getmins()
	{
		return mins;
	}
	
	public double calcmph()
	{
		mph = Math.round(dist/(hours+(mins/60.0)));
		return mph;
	}
}