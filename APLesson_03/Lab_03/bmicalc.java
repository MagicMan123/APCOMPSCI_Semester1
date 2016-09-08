import java.util.Scanner; //import

public class bmicalc
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How tall are you in inches?");
		double h = keyboard.nextDouble();
		System.out.println("Okay, I got that down.");
		
		System.out.println("Next, what is your weight, in pounds?");
		double w = keyboard.nextDouble();
		System.out.println("Okay, one moment please...");
		
		double bmi = (w * 703)/(h*h);
		
		System.out.println("Your BMI is " + bmi + ".");
		
	}
}