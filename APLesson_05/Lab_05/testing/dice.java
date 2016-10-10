import java.util.Scanner;

public class dice
{
	static boolean playagain = true;
	static String request;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		while(playagain)
		{
			int playerRoll = 1+(int)(Math.random()*6);
			int compRoll = 1+(int)(Math.random()*6);
			rollDice(playerRoll, compRoll);
		}
		
	}
	public static void rollDice(int playerRoll, int compRoll)
	{
		System.out.println("You rolled a " + playerRoll + ".\nThe computer rolled a " + compRoll + ".");
		if(playerRoll > compRoll)
		{
			System.out.println("You are the winner.");
		}
		if(playerRoll < compRoll)
		{
			System.out.println("You lose.");
		}
		if(playerRoll == compRoll)
		{	
			System.out.println("Looks like a tie.");
		}
		System.out.println("Would you like to play again?");
		String request = kb.nextLine();
		
		if(request == "yes")
		{
			playagain = true;
		}
		else
		{
			playagain = false;
		}
	}
}