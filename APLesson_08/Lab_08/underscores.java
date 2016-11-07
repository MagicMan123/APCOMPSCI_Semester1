import java.util.Scanner;

public class underscores
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Input a sentence: ");
		String sentence = kb.nextLine();
		
		System.out.println(replace1(sentence));
	}
	public static String replace1(String sentence)
	{
		if(sentence.indexOf(" ")<0)
		{
			return sentence;
		}
		else
		{
			return replace1(sentence.substring(0, sentence.indexOf(" ")) + "_" + sentence.substring(sentence.indexOf(" ")+1));
		}
	}
}