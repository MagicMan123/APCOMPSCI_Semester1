import java.util.Scanner;

public class toyrunner
{
	public static void main(String[]args)
	{
		Afigure robot = new Afigure("Autobot");
		
		Car ferrari = new Car("Ferrari");
		
		System.out.println(robot.toString());
		
		System.out.println(ferrari.toString());
		
		toystore store = new toystore("Hotwheel, Car, G.I.Joe, AF, PennyRacer, Car, Matchbox, Car, Star Wars, AF, Pullback, Car, Star Wars, AF");
		
		System.out.println(store);
	}
}