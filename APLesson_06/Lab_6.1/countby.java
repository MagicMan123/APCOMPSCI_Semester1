import java.util.Scanner;

public class countby
{
	public static void main(String[]args)
	{
		Scanner kb  = new Scanner(System.in);
		
		System.out.println("Enter a number to count to: ");
		int counto = kb.nextInt();
		
		System.out.println("Enter a number to count to: ");
		int countby = kb.nextInt();
		
		for(int i=0; i<=counto ; i+=countby)
		{
			System.out.print(i+" ");
		}
	}
}