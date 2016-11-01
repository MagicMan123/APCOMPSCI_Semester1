import java.util.Scanner;

public class avgdigits
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner (System.in);
		
		System.out.println("What is your number? ");
		int number = kb.nextInt();
		
		int digits = String.valueOf(number).length();
		double average = 0;
		int num = number;
		
		avDigits(num, number, average, digits);
	}
	public static void avDigits(int num, int number, double average, int digits)
	{
		while(num > 0 )
		{
			average = average + (number % 10);
			number = number/10;
			num--;
		}
		System.out.println("The average of the digits in your number is "+ average/digits);
	}
}