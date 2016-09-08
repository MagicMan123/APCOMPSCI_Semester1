import java.util.Scanner; //import scanner

public class userinput
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Pick a number: ");
		int num1 = keyboard.nextInt();
		System.out.println("Okay, I got that.");
		
		System.out.println("Pick another number: ");
		int num2 = keyboard.nextInt();
		System.out.println("Thanks, let me do the operation...");
		
		System.out.println("If you add your two numbers you get " + (num1+num2));
	}
	
}