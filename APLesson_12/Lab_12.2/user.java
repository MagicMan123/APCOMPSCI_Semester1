import java.util.Scanner;

public class user
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is your first name? ");
		String first = kb.next();
		
		System.out.println("What is your last name? ");
		String last  = kb.next();
		
		System.out.println("Would like to create an avatar?(y or n)");
		String avatar = kb.next();
		
		if(avatar.equals("y"))
		{
			user_class object1 = new user_class("Rohith", "Kodukula", "testAvatar");
			System.out.println(object1);
		}
		else
		{
			user_class object1 = new user_class("Rohith", "Kodukula");
			System.out.println(object1 + "\n");
		}
	}
}