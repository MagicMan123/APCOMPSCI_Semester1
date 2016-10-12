import java.util.Scanner;

public class bmi
{
	static double bmi;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("How tall are you in inches?");
		double h = kb.nextDouble();
		
		System.out.println("Okay, what is your weight, in pounds?");
		double w = kb.nextDouble();
		
		bmi = (w * 703)/(h*h);
		
		System.out.println("Your bmi is " + bmi + ". The numbers say that you are " + condition(bmi) + ".");
	}
	public static String condition(double bmi)
	{
		if(bmi<=18.5)
		{
			return "underweight";
		}
		if(bmi>=18.5 && bmi<25)
		{
			return "normal";
		}
		if(bmi>=25 && bmi<30)
		{
			return "overweight";
		}
		if(bmi>=30 && bmi<35)
		{
			return "obese";
		}
		if((bmi>=35 && bmi<40))
		{
			return "very obese";
		}
		if((bmi>=40))
		{
			return "morbidly obese";
		}
		return "unknown";
	}
}