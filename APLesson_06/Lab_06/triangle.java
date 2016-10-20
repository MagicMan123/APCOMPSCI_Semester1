import java.util.Scanner;

public class triangle
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
	
		System.out.println("Enter a string: ");
		String string = kb.nextLine();
		
		for(int i=string.length(); i>0; i--)
		{
			System.out.println(string.substring(0,i));
		}
	}
}