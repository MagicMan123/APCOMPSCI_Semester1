import java.util.Scanner;

public class rectangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		rectangle calc = new rectangle();
		
		System.out.println("What is the length of the box? ");
		double l  = kb.nextDouble();
		
		System.out.println("What is the height of the box? ");
		double w = kb.nextDouble();
		
		double perim = calc.calcPerim(l,w);
		System.out.println("Your rectangle is " + perim + " sq ft around.");
	}
	public double calcPerim(double l, double w)
	{
		return (2*l+2*w);
	}
}