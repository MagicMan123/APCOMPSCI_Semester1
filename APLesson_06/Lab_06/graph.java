import java.util.Scanner;

public class graph
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter an integer:");
		int num = kb.nextInt();
		
		System.out.println("What is the size of the table? ");
		int size = kb.nextInt();
		
		System.out.println(" x   |   y\n ____|______");
		for(int i=1; i<=size; i++)
		{
			System.out.printf(" %3d |  %3d\n",i,i*num);
		}
	}
}
