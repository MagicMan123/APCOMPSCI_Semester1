import java.util.Arrays;
import java.util.ArrayList;

public class Toyota extends Car
{
	public Toyota(String input)
	{
		String[] coordinates = input.split(", ");
		
		location = new double[2];
		location[0] = Double.parseDouble(coordinates[0]);
		location[1] = Double.parseDouble(coordinates[1]);
		
	}
}