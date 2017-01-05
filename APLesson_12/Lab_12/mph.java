import java.util.Scanner;

public class mph
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the distance? ");
		int dist = kb.nextInt();
		
		System.out.println("How much time did it take?(in hours) ");
		int hours = kb.nextInt();
		
		System.out.println("How many minutes on top of that? ");
		int mins = kb.nextInt();
		
		mph_class object1 = new mph_class(dist, hours, mins);
		
		System.out.println(object1.getdist() + " miles in " + object1.gethours() + " hours and " + object1.getmins() + " minutes = " + object1.calcmph());
		
		object1.setdist(dist);
		object1.sethours(hours);
		object1.setmins(mins);
		
		System.out.println(object1.getdist() + " miles in " + object1.gethours() + " hours and " + object1.getmins() + " minutes = " + object1.calcmph());
	}
}
