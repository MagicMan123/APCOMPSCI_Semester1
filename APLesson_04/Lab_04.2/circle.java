import java.util.Scanner;

public class circle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		circle calc = new circle();
		
		System.out.println("What is the radius of your circle?");
		double radius = kb.nextDouble();
		
		double area = calc.area(radius);
		System.out.println("The area of a circle with " + radius + " radius is " + area + ".");
	}
	public double area(double radius)
	{
		return 3.1415926535*Math.pow(radius,2);
	}
}