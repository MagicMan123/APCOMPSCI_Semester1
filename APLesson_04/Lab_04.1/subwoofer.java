import java.util.Scanner;

public class subwoofer
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		subwoofer calc = new subwoofer();
		
		System.out.println("What is the height of your box in inches?");
		double h = kb.nextDouble();
		
		System.out.println("What is the length of your box in inches?");
		double l = kb.nextDouble();
		
		System.out.println("What is the width of your box in inches?");
		double w = kb.nextDouble();
		
		double thing = calc.volume(h,l,w);
		System.out.println("The volume of your subwoofer is " + thing + " cubic feet.");
		
	}
	public double volume(double h, double l, double w)
	{
		return (l*w*h)/(Math.pow(12,3));
	}
}