import java.util.Scanner;

public class dice
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		boolean playagain = true;
		while(playagain)
		{
			int playerRoll = 1+(int)(Math.random()*6);
			int compRoll = 1+(int)(Math.random()*6);
		
			rollDice(playerRoll, compRoll, playagain);
		}
		
	}
	public static void rollDice(int playerRoll, int compRoll, boolean playagain)
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
		System.out.println("Do you want to play again?");
		String request = kb.next();
		
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