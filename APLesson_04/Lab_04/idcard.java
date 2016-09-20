import java.util.Scanner;

public class idcard
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		idcard form = new idcard();
		
		System.out.println("Enter your first name: ");
		String firstname = kb.nextLine();
		
		System.out.println("Enter your last name: ");
		String lastname = kb.nextLine();
		
		System.out.println("Enter your title: ");
		String title = kb.nextLine();
		
		System.out.println("Enter your school site: ");
		String school = kb.nextLine();
		
		System.out.println("Enter your school year: ");
		String year = kb.nextLine();
		
		System.out.println("What is your subject? ");
		String subject = kb.nextLine();
		
		form.format(firstname, lastname, title, school, year, subject);
	}
	public void format(String firstname, String lastname, String title, String school, String year, String subject)
	{
		System.out.printf("***********************************\n*  %10s           %10s *\n*       %10s         %10s *\n*       %10s  %10s *\n***********************************",school, year, firstname, lastname, title, subject);
	}
}