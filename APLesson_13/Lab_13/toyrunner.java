import java.util.Scanner;

public class toyrunner
{
	public static void main(String[]args)
	{
		Afigure robot = new Afigure("Autobot");
		
		Car ferrari = new Car("Ferrari");
		
		System.out.println(robot.toString());
		
		System.out.println(ferrari.toString());
	
	}
}