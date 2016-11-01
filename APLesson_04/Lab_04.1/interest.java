import java.util.Scanner;

public class interest
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		interest calc = new interest();
		
		System.out.println("What is the principle amount of money?");
		double p = kb.nextDouble();
		
		System.out.println("What is the interest rate?");
		double r = kb.nextDouble();
		
		System.out.println("How much time is it going to be compounded for?");
		double t = kb.nextDouble();
		
		System.out.println("How many times per year is it interest calculated?");
		double n = kb.nextDouble();
		
		double intr = calc.calc(r,p, n,t);
		System.out.printf("Your monthly payment is $%.2f", intr);
	}
	public double calc(double r, double p, double n, double t)
	{
		return (p*(Math.pow((1+(r/n)),n*t)))/(t*12);
	}
}