import java.util.Scanner;

public class adventure
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Would you like to play a game?");
		String play = kb.nextLine();
		
		if(play.equals("y"))
		{
			System.out.println("Great!, let's get started then!");
			System.out.println("\nImagine you are inside a tour group going through the Caverns of Indian.\nYou get lost and there is a split in the cave, do you choose left or right?");
			String direction = kb.nextLine();
			if(direction.equals("r"))
			{
				System.out.println("You chose right.");
				System.out.println("I man appraoches you and gives you a choice, to have to walk through a mine field or to walk through a forest with tigers starved for one whole year.");
				String onright = kb.nextLine();
				if(onright.equals("mine field"))
				{
					System.out.println("You died. RIP");
				}
				if(onright.equals("forest") || onright.equals("tigers"))
				{
					System.out.println("Congrats, the tigers aren't alive because they were actually starved to death.");
				}
			}
			if(direction.equals("l"))
			{
				System.out.println("You chose left.");
				System.out.println("In the distance you see a clown and a pirate, the rocks close off the entrance behind you. Which do you go talk to?");
				String boss = kb.nextLine();
				if(boss.equals("clown"))
				{
					System.out.println("You die, with all the recent encounters with the clown across the United States you shouldn't have done that.");
				}
				if(boss.equals("pirate"))
				{
					System.out.println("You win, the pirate takes you to neverland, somewhere you've always wanted to go, even if you don't know it.");
				}
			}
		}
		else
		{
			System.out.println(play);
			System.out.println("Wow, okay then, be that way...");
		}
	}
}