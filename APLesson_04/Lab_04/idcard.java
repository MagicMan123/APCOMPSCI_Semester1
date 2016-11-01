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
		
		
		System.out.println("*************************************");
		form.format(school, year);
		form.format(firstname, lastname);
		form.format(title, subject);
		System.out.println("*************************************");
	}
	
	public void format(String a, String b)
	{
		System.out.printf("*  %12s         %12s*\n",a, b);
	}
}