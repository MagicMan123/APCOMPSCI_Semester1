import java.util.Scanner;

public class tree60
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a word ");
		String word = kb.nextLine();
		
		int start = 1;
		int stop = word.length();
		
		tree(word, start, stop);
	}
	public static String tree(String word, int start, int stop)
	{
		if(start <= stop)
		{
			System.out.println(word.substring(0,start));
			start++;
			return tree(word, start, stop);
		}
		return"";
	}
}