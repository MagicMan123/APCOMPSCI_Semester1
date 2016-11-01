import java.util.Scanner;

public class replaceats
{	
	static String message;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your message? ");
		message = kb.nextLine();
		
		replace();
		
	}
	public static void replace()
	{
		while(message.indexOf("a")>=0)
		{
			message = message.substring(0, message.indexOf("a")) + "@" + message.substring(message.indexOf("a")+1);
		}
		System.out.println(message);
	}
}