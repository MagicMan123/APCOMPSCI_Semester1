import java.util.Scanner;

public class health
{
	static String[] health;
	static int healthload = 6;
	static int healthcount;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		String turn = "";
		int dmg = 0;
		int amt = 0;
		
		healthcount = 6;
		health = new String[healthcount];
		
		while(!(turn.equals("q")) && healthcount > 0)
		{
			System.out.println("\nYour turn! Hit Enter when ready: ");
			turn = kb.nextLine();
			dmg = (int)(Math.random()*2 + 1);
			amt = (int)(Math.random()*6 + 1);
			takeDamage(dmg, amt);
			printClip();
		}
		System.out.println("\nYou died.");
	}
	public static void takeDamage(int dmg, int amt)
	{
		if(dmg == 1)
		{
			healthcount -= amt;
			System.out.println("Taking " + amt + " damage!");
		}
		else
		{
			if(healthcount+amt<healthload)
			{
				healthcount += amt;
			}
			else
			{
				healthcount = healthload;
			}
			System.out.println("Power up " + amt + "!");
		}
	}
	public static void printClip()
	{
		System.out.print("Clip: ");
		for(int i=0;i<healthload;i++)
		{
			if(i<healthcount)
			{
				health[i] = "@";
			}
			else
			{
				health[i] = "[]";
			}
			System.out.print(health[i] + " ");
		}
	}
}