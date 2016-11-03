import java.util.Scanner;

public class reverse 
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your number? ");
		int num = kb.nextInt();
		
		int rev = 0;
		
		getReverse(num, rev);
	}
	public static void getReverse(int num, int rev)
	{
		while(num > 0 )
		{
			rev = rev*10;
			rev = rev + (num%10);
			num = num/10;
		}
		System.out.println("The reverse of your number is " + rev);
	}
}