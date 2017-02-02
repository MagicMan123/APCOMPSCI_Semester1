import java.util.Scanner;

public class toyrunner
{
	public static void main(String[]args)
	{
		Afigure_class robot = new Afigure_class("Autobot");
		
		car_class ferrari = new car_class("Ferrari");
		
		System.out.println(robot.toString());
		
		System.out.println(ferrari.toString());
	}
}