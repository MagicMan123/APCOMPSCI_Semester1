import java.util.Scanner;

public class rectangle
{
	static double l, w, perim;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the length of the box? ");
		l  = kb.nextDouble();
		
		System.out.println("What is the height of the box? ");
		w = kb.nextDouble();
		
		perim = calcPerim(l,w);
		print(perim);
	}
	public static double calcPerim(double l, double w)
	{
		return (2*l+2*w);
	}
	public static void print(double perim)
	{
		System.out.println("Your rectangle is " + perim + " sq ft around.");
	}
}