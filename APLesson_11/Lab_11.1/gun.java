import java.util.Scanner;

public class gun
{
	static int bulletCount;
	static int clipsize = 16;
	static int shotCount;
	static String[] clip;
	static int hasbullets = 0;
	
	public static void main(String[]args)
	{
		bulletCount = 27;
		shotCount = 0;
		clip = new String[clipsize];
		Scanner kb = new Scanner(System.in);
		
		resetClip();
		while(bulletCount > 0)
		{
			System.out.println("Action: ");
			String act = kb.nextLine();
			if(act.equals("R"))
			{
				reload();
			}
			if(act.equals("S"))
			{
				hasbullets = 0;
				for(int i=0;i<clipsize;i++)
				{
					if(clip[i].equals("*"))
					{
						hasbullets += 1;
					}
				}
				if(hasbullets==0)
				{
					System.out.println("You have no bullets loaded, you have to reload.");
				}
				else
				{
					shoot();
				}
			}
			printClip();
		}
		printClip();
	}
	public static void resetClip()
	{
		for(int i = 0; i < clipsize;i++)
		{
			clip[i]="[]";
		}
	}
	public static void reload()
	{
		shotCount = 0;
		if(bulletCount > 0)
		{
			int empty = 0;
			for(int i=0; i<clipsize;i++)
			{
				if(clip[i].equals("[]"))
				{
					empty += 1;
				}
			}
			bulletCount = bulletCount - empty;
			if(bulletCount<0)
			{
				for(int i=clipsize+bulletCount;i<clipsize;i++)
				{
					clip[i]="[]";
				}
				for(int i=0;i<clipsize+bulletCount;i++)
				{
					clip[i]="*";
				}
				bulletCount = 0;
			}
			else if(bulletCount>=0)
			{
				for(int i=0; i<clipsize;i++)
				{
					clip[i] = "*";
				}
			}
		}
	}
	public static void printClip()
	{
		System.out.println("Bullets: " + bulletCount);
		System.out.print("Clip: ");
		for(int i=0; i < clipsize;i++)
		{
			System.out.print(clip[i] + " ");
		}
		System.out.print("\n\n");
	}
	public static void shoot()
	{
		bulletCount -= 1;
		shotCount += 1;
		System.out.println("\nBAM!");
		clip[clipsize-shotCount]="[]";
	}
}