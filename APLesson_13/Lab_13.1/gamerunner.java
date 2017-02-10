public class gamerunner
{
	public static void main(String[]args)
	{
		Xbox starwars = new Xbox("Star Wars");
		
		PC pvz = new PC("Plants vs. Zombies");
		
		Playstation madden = new Playstation("Madden 2k17");
		
		System.out.println(starwars.toString());
	
		System.out.println(pvz.toString());
	
		System.out.println(madden.toString());
	}
}