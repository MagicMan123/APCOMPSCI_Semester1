import java.util.Scanner;

public class average 
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		average calc = new average();
		
		System.out.println("What is the first number?");
		double num1  = kb.nextDouble();
		
		System.out.println("What is the second number? ");
		double num2 = kb.nextDouble();
		
		System.out.println("What is the third number? ");
		double num3 = kb.nextDouble();
		
		double aver = calc.average(num1,num2,num3);
		System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is " + aver + ".");
		
	}
	public double average(double num1, double num2, double num3)
	{
		return ((num1 + num2 + num3)/3);
	}
}