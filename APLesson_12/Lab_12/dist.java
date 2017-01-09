import java.util.Scanner;

public class dist
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Coordinates for the first point? ");
		int x1 = kb.nextInt();
		int y1 = kb.nextInt();
		
		System.out.println("Coordinates for the second point? ");
		int x2 = kb.nextInt();
		int y2 = kb.nextInt();
		
		dist_class object1 = new dist_class(x1,y1,x2,y2);
		
		System.out.println("\nThe distance between your two points is " + object1.calcdist());
		
		object1.setall(1,4,6,4);
		
		System.out.println("\nThe distance between two random points is " + object1.calcdist());
	}
}