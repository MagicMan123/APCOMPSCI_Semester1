import java.util.Scanner;

public class cube
{
	static double side;
	static double sa;
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the side length?");
		side = kb.nextDouble();
		
		sa = sa(side);
		print(sa,side);
	}
	public static double sa(double side)
	{
		return 6*Math.pow(side,2);
	}
	public static void print(double sa, double side)
	{
		System.out.println("The surface area of a cube with " + side + " side length is " + sa + ".");
	}
}