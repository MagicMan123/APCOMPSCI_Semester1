import java.util.Scanner;

public class box
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your string?");
		String string = kb.nextLine();
		
		for(int i=string.length(); i>0; i--)
		{
			System.out.println(string);
		}
	}
}