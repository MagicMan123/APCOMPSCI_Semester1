import java.util.Scanner;

public class lefttri
{
	public static void main(String[]arg)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a string to display: ");
		String word = kb.next();
		
		for (int i=0; i<word.length() ; i++)
		{
			System.out.println(word.substring(i));
		}
	}
}