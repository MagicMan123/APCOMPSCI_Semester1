import java.util.Scanner;

public class cube
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		cube calc = new cube();
		
		System.out.println("What is the side length?");
		double side = kb.nextDouble();
		
		double sa = calc.sa(side);
		System.out.println("The surface area of a cube with "+ side + " side length is " + s10a + ".");
	}
	public double sa(double side)
	{
		return 6*Math.pow(side,2);
	}
}