import java.util.Arrays;
import java.util.ArrayList;

public class Gmc extends Car
{
	public Gmc()
	{
		
	}
	
	public Gmc(double xcoor, double ycoor)
	{
		location = new double[2];
		location[0] = xcoor;
		location[1] = ycoor;
	}
}