import java.util.Scanner;

public class human
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What color hair? ");
		String hair = kb.nextLine();
		
		System.out.println("What color are your eyes? ");
		String eyes = kb.nextLine();
		
		System.out.println("What is your ethnicity? ");
		String ethni = kb.nextLine();
		
		human_class person = new human_class(hair, eyes, ethni);
		
		System.out.println("\n\nHere you are... ");
		System.out.println("Hair color:     " + person.gethair());
		System.out.println("Eye Color:     " + person.geteyes());
		System.out.println("Ethnicity:     " + person.getethni() + "\n");
		
		person.sethair("blonde");
		person.seteyes("blue");
		person.setethni("White");
		
		System.out.println("\nHere is your friend...  ");
		System.out.println("Hair color:     " + person.gethair());
		System.out.println("Eye Color:     " + person.geteyes());
		System.out.println("Ethnicity:     " + person.getethni() + "\n");
	}
}