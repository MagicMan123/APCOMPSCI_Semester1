import java.util.Scanner;

public class car
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What color is the outside of your car? ");
		String color = kb.nextLine();
		
		System.out.println("What color is the interior? ");
		String interior = kb.nextLine();
		
		System.out.println("What type of engine do you want? ");
		String engine = kb.nextLine();
		
		System.out.println("What type of tires do you prefer? ");
		String tires = kb.nextLine();
		
		car_class volvo = new car_class(color, interior, engine, tires);
		
		System.out.println("\n\nYour vehicle is ready for you... ");
		System.out.println("Paint:     " + volvo.getcolor());
		System.out.println("Interior:     " + volvo.getinterior());
		System.out.println("Engine:     " + volvo.getengine());
		System.out.println("Tires:     " + volvo.gettires() + "\n");
	}
}