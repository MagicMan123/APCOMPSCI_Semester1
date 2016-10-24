public class song
{
	public static void main(String[]args)
	{
		sing("Na",4);
		sing("Na",4);
		sing("Hey",3);
		sing("Goodbye!",1);
	}
	public static void sing(String word,int times)
	{
		for(int i=times; i>0 ; i--)
		{
			System.out.print(word + " ");
		}
		System.out.println("\n");
	}
}