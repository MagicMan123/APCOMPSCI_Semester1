import java.util.Scanner;

public class average 
{
	static double num1, num2, num3, avg;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the first number?");
		num1  = kb.nextDouble();
		
		System.out.println("What is the second number? ");
		num2 = kb.nextDouble();
		
		System.out.println("What is the third number? ");
		num3 = kb.nextDouble();
		
		avg = average(num1,num2,num3);
		print(num1, num2, num3, avg);
	}
		
	public static double average(double num1, double num2, double num3)
	{
		return ((num1 + num2 + num3)/3);
	}
	public static void print(double num1, double num2, double num3, double avg)
	{
		System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is " + avg + ".");
	}
}