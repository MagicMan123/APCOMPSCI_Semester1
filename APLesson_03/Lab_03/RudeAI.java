import java.util.Scanner; //import scanner

public class RudeAI
{
	public static void main(String[]args)
	{
		//instantiate the object keyboard
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = keyboard.next();
		System.out.println("?!?!?!? Why would you ever name a baby that?");
		
		System.out.println("How old are you " + name +"?");
		int age = keyboard.nextInt();
		System.out.println("Ooooo!!! " + age + " is getting up there!");
		
		System.out.println("What do you do for fun, " + name + "?");
		String forFun = keyboard.next();
		System.out.println("What!?!?!? I would rather die then do that!");
		
		System.out.println("What kind of music do you like?");
		String music = keyboard.next();
		System.out.println("Boo!!! I wouldn't wish the sound of " + music + " on my worst enemy.");
		
		System.out.println("How many siblings do you have?");
		int sibs = keyboard.nextInt();
		System.out.println(sibs + "? Wow, i hope that the rest of your family is better looking.");
		
		System.out.println("What do you want to be when you grow up?");
		String growup = keyboard.next();
		System.out.println("I think you'd have to be smarter to be a " + growup + ".");
		System.out.println("So " +name+ ", you're " +age+"...");
		System.out.println("You'd like to be a " + growup + ".");
		System.out.println("Good luck becoming a " + growup + ".");
		System.out.println("I'm only kidding " + name + ".");
		
	}
}