import java.util.Scanner;

public class digitadder
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your number? ");
		int number = kb.nextInt();
		
		int sum = 0;
		int num = number;
		
		sumDigits(num, number, sum);
		
	}
	public static void sumDigits(int num, int number, int sum)
	{
		while(num > 0 )
		{
			sum = sum + (number % 10);
			number = number/10;
			num--;
		}
		System.out.println("The sum of the digits in your number is "+ sum );
	}
}