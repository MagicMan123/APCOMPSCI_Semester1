import java.util.Scanner;

public class diceroll
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		int playerRoll = 1+(int)(Math.random()*6);
		int compRoll = 1+(int)(Math.random()*6);
	
		rollDice(playerRoll, compRoll);
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
	}
}