import java.util.Scanner;

public class password
{
	static String user = "email";
	static String pass = "fightme";

	public static void main(String[]args)
	{
		check(user, pass);
	}
	public static void check(String user, String pass)
	{
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("What is the correct username?");
		user = kb.nextLine();
		
		System.out.println("What is the correct password?");
		pass = kb.nextLine();
			
		if(user.equals("email")){	}
		else
		{
			System.out.println("You entered the wrong usnername.");
			check(user, pass);
		}
		if(pass.equals("fightme")){	}
		else
		{
			System.out.println("You entered the wrong password.");
			check(user, pass);
		}
		if(user.equals("email") && pass.equals("fightme"))
		{
			System.out.println("You have successfully logged in.");
		}
	}
}