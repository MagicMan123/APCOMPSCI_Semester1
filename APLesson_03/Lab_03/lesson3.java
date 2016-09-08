import java.util.Scanner; //import scanner

public class lesson3
{
	public static void main(String[]args)
	{
		//instantiate a new scanner object 'keyboard'
		Scanner keyboard = new Scanner(System.in);
		
		//prompt for user input
		System.out.println("Who is your favorite teacher?");
		
		//search for the next integer that the user enters
		String teacher = keyboard.next();
		
		//print the results...
		System.out.println("Okay! " + teacher + " is very good!");
		
	} 
}