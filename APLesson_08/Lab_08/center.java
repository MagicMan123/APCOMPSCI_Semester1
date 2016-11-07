import java.util.Scanner;

public class center
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter a word ");
		String w1 = kb.nextLine();
		
		System.out.println("Please enter a word ");
		String w2 = kb.nextLine();
		
		System.out.println("Please enter a word ");
		String w3 = kb.nextLine();
		
		System.out.println(makeCenter(w1));
		System.out.println(makeCenter(w2));
		System.out.println(makeCenter(w3));
	}
	public static String makeCenter(String word)
	{
		if(word.length()>=20)
		{
			return word;
		}
		else
		{
			return makeCenter(" " + word + " ");
		}
	}
}