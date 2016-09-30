import java.util.Scanner;

public class circle
{
	static double radius, area;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the radius of your circle?");
		radius = kb.nextDouble();
		
		area = area(radius);
		print(radius, area);
	}
	public static double area(double radius)
	{
		return 3.1415926535*Math.pow(radius,2);
	}
	public static void print(double radius, double area)
	{
		System.out.println("The area of a circle with " + radius + " radius is " + area + ".");
	}
}